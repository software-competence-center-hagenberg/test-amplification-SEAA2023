package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashMapTest_939145594_256_s {

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
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test002");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = hashMapTestDriver0.put(obj1, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test003");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test004");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set4 = hashMapTestDriver3.keySet();
        java.lang.Object obj7 = hashMapTestDriver3.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = hashMapTestDriver0.get(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test005");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = hashMapTestDriver0.put(obj2, (java.lang.Object) (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test006");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test007");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        int int2 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass4 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test008");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.keySet();
        java.lang.Object obj14 = hashMapTestDriver10.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj16 = hashMapTestDriver10.get((java.lang.Object) 0.0d);
        boolean boolean18 = hashMapTestDriver10.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection19 = hashMapTestDriver10.values();
        hashMapTestDriver10.clear();
        java.lang.Object obj23 = hashMapTestDriver10.put((java.lang.Object) (-1.0f), (java.lang.Object) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = hashMapTestDriver0.put(obj23, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test009");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set4 = hashMapTestDriver3.keySet();
        java.lang.Object obj7 = hashMapTestDriver3.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj9 = hashMapTestDriver3.get((java.lang.Object) 0.0d);
        boolean boolean11 = hashMapTestDriver3.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection12 = hashMapTestDriver3.values();
        java.lang.Object obj14 = hashMapTestDriver3.remove((java.lang.Object) false);
        experiment.util.Set set15 = hashMapTestDriver3.entrySet();
        boolean boolean16 = hashMapTestDriver3.isEmpty();
        java.lang.Object obj18 = hashMapTestDriver3.get((java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = hashMapTestDriver0.put((java.lang.Object) 10.0f, obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test010");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        boolean boolean4 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test011");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass9 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test012");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Set set9 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj12 = hashMapTestDriver10.remove((java.lang.Object) 0);
        hashMapTestDriver10.clear();
        java.lang.Object obj15 = hashMapTestDriver10.remove((java.lang.Object) 100.0f);
        java.lang.Object obj17 = hashMapTestDriver10.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.keySet();
        java.lang.Object obj22 = hashMapTestDriver18.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection23 = hashMapTestDriver18.values();
        java.lang.Object obj24 = hashMapTestDriver10.get((java.lang.Object) collection23);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.keySet();
        int int27 = hashMapTestDriver25.size();
        hashMapTestDriver25.clear();
        java.lang.Object obj30 = hashMapTestDriver10.put((java.lang.Object) hashMapTestDriver25, (java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = hashMapTestDriver0.containsKey(obj30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test013");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        boolean boolean7 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver8.clear();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        java.lang.Class<?> wildcardClass11 = set10.getClass();
        boolean boolean12 = hashMapTestDriver0.containsKey((java.lang.Object) set10);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test014");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        int int17 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) (-1L));
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set22 = hashMapTestDriver21.keySet();
        java.lang.Object obj25 = hashMapTestDriver21.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj27 = hashMapTestDriver21.get((java.lang.Object) 0.0d);
        boolean boolean29 = hashMapTestDriver21.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection30 = hashMapTestDriver21.values();
        hashMapTestDriver21.clear();
        experiment.util.Collection collection32 = hashMapTestDriver21.values();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj35 = hashMapTestDriver33.remove((java.lang.Object) 0);
        experiment.util.Collection collection36 = hashMapTestDriver33.values();
        java.lang.Object obj38 = hashMapTestDriver33.get((java.lang.Object) 1L);
        java.lang.Object obj39 = hashMapTestDriver21.get((java.lang.Object) hashMapTestDriver33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = hashMapTestDriver15.remove(obj39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test015");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        int int6 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test016");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        java.lang.Object obj13 = hashMapTestDriver0.put((java.lang.Object) (-1.0f), (java.lang.Object) 1.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver14.clear();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver17.clear();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver17.isEmpty();
        boolean boolean21 = hashMapTestDriver17.isEmpty();
        experiment.util.Collection collection22 = hashMapTestDriver17.values();
        java.lang.Object obj23 = hashMapTestDriver14.get((java.lang.Object) hashMapTestDriver17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj25 = hashMapTestDriver0.put(obj23, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test017");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        boolean boolean10 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test018");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        int int2 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        boolean boolean5 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set7 = hashMapTestDriver6.keySet();
        java.lang.Object obj10 = hashMapTestDriver6.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj12 = hashMapTestDriver6.get((java.lang.Object) 0.0d);
        boolean boolean14 = hashMapTestDriver6.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection15 = hashMapTestDriver6.values();
        hashMapTestDriver6.clear();
        experiment.util.Collection collection17 = hashMapTestDriver6.values();
        boolean boolean18 = hashMapTestDriver6.isEmpty();
        experiment.util.Collection collection19 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        int int35 = hashMapTestDriver20.size();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set37 = hashMapTestDriver36.keySet();
        java.lang.Object obj40 = hashMapTestDriver36.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj42 = hashMapTestDriver36.get((java.lang.Object) 0.0d);
        boolean boolean44 = hashMapTestDriver36.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection45 = hashMapTestDriver36.values();
        java.lang.Object obj47 = hashMapTestDriver36.remove((java.lang.Object) false);
        experiment.util.Set set48 = hashMapTestDriver36.entrySet();
        boolean boolean49 = hashMapTestDriver36.isEmpty();
        boolean boolean50 = hashMapTestDriver36.isEmpty();
        java.lang.Object obj51 = hashMapTestDriver20.get((java.lang.Object) hashMapTestDriver36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = hashMapTestDriver0.put((java.lang.Object) collection19, obj51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test019");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        boolean boolean10 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set12 = hashMapTestDriver11.keySet();
        java.lang.Object obj15 = hashMapTestDriver11.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj17 = hashMapTestDriver11.get((java.lang.Object) 0.0d);
        boolean boolean19 = hashMapTestDriver11.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection20 = hashMapTestDriver11.values();
        java.lang.Object obj22 = hashMapTestDriver11.remove((java.lang.Object) false);
        experiment.util.Set set23 = hashMapTestDriver11.entrySet();
        java.lang.Class<?> wildcardClass24 = hashMapTestDriver11.getClass();
        boolean boolean25 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver11);
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set27 = hashMapTestDriver26.keySet();
        java.lang.Object obj30 = hashMapTestDriver26.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj32 = hashMapTestDriver26.get((java.lang.Object) 0.0d);
        boolean boolean34 = hashMapTestDriver26.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection35 = hashMapTestDriver26.values();
        hashMapTestDriver26.clear();
        experiment.util.Collection collection37 = hashMapTestDriver26.values();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj40 = hashMapTestDriver38.remove((java.lang.Object) 0);
        experiment.util.Collection collection41 = hashMapTestDriver38.values();
        java.lang.Object obj43 = hashMapTestDriver38.get((java.lang.Object) 1L);
        java.lang.Object obj44 = hashMapTestDriver26.get((java.lang.Object) hashMapTestDriver38);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set46 = hashMapTestDriver45.keySet();
        java.lang.Object obj49 = hashMapTestDriver45.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set50 = hashMapTestDriver45.entrySet();
        experiment.util.Set set51 = hashMapTestDriver45.entrySet();
        boolean boolean53 = hashMapTestDriver45.containsKey((java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj54 = hashMapTestDriver0.put(obj44, (java.lang.Object) boolean53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test020");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        boolean boolean14 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) 0);
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver21.clear();
        experiment.util.Set set23 = hashMapTestDriver21.entrySet();
        boolean boolean24 = hashMapTestDriver21.isEmpty();
        boolean boolean25 = hashMapTestDriver21.isEmpty();
        experiment.util.Collection collection26 = hashMapTestDriver21.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) 0);
        hashMapTestDriver27.clear();
        java.lang.Object obj32 = hashMapTestDriver27.remove((java.lang.Object) 100.0f);
        java.lang.Object obj34 = hashMapTestDriver27.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection35 = hashMapTestDriver27.values();
        java.lang.Object obj36 = hashMapTestDriver21.remove((java.lang.Object) hashMapTestDriver27);
        boolean boolean37 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver21);
        boolean boolean38 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver21);
        int int39 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test021");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        hashMapTestDriver0.clear();
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass7 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test022");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver6.clear();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        boolean boolean9 = hashMapTestDriver6.isEmpty();
        boolean boolean10 = hashMapTestDriver6.isEmpty();
        experiment.util.Collection collection11 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.remove((java.lang.Object) 0);
        hashMapTestDriver12.clear();
        java.lang.Object obj17 = hashMapTestDriver12.remove((java.lang.Object) 100.0f);
        java.lang.Object obj19 = hashMapTestDriver12.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection20 = hashMapTestDriver12.values();
        java.lang.Object obj21 = hashMapTestDriver6.remove((java.lang.Object) hashMapTestDriver12);
        boolean boolean22 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver6);
        java.lang.Object obj24 = hashMapTestDriver0.remove((java.lang.Object) 100);
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test023");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        int int2 = hashMapTestDriver0.size();
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = hashMapTestDriver0.put(obj3, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test024");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test025");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        boolean boolean14 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) 0);
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver21.clear();
        experiment.util.Set set23 = hashMapTestDriver21.entrySet();
        boolean boolean24 = hashMapTestDriver21.isEmpty();
        boolean boolean25 = hashMapTestDriver21.isEmpty();
        experiment.util.Collection collection26 = hashMapTestDriver21.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) 0);
        hashMapTestDriver27.clear();
        java.lang.Object obj32 = hashMapTestDriver27.remove((java.lang.Object) 100.0f);
        java.lang.Object obj34 = hashMapTestDriver27.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection35 = hashMapTestDriver27.values();
        java.lang.Object obj36 = hashMapTestDriver21.remove((java.lang.Object) hashMapTestDriver27);
        boolean boolean37 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver21);
        boolean boolean38 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver21);
        java.lang.Object obj39 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = hashMapTestDriver21.containsKey(obj39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test026");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        boolean boolean14 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) 0);
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver21.clear();
        experiment.util.Set set23 = hashMapTestDriver21.entrySet();
        boolean boolean24 = hashMapTestDriver21.isEmpty();
        boolean boolean25 = hashMapTestDriver21.isEmpty();
        experiment.util.Collection collection26 = hashMapTestDriver21.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) 0);
        hashMapTestDriver27.clear();
        java.lang.Object obj32 = hashMapTestDriver27.remove((java.lang.Object) 100.0f);
        java.lang.Object obj34 = hashMapTestDriver27.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection35 = hashMapTestDriver27.values();
        java.lang.Object obj36 = hashMapTestDriver21.remove((java.lang.Object) hashMapTestDriver27);
        boolean boolean37 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver21);
        boolean boolean38 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver21);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj41 = hashMapTestDriver39.remove((java.lang.Object) 0);
        hashMapTestDriver39.clear();
        java.lang.Object obj44 = hashMapTestDriver39.remove((java.lang.Object) 100.0f);
        java.lang.Object obj46 = hashMapTestDriver39.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection47 = hashMapTestDriver39.values();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set49 = hashMapTestDriver48.keySet();
        java.lang.Object obj52 = hashMapTestDriver48.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj54 = hashMapTestDriver48.get((java.lang.Object) 0.0d);
        boolean boolean56 = hashMapTestDriver48.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection57 = hashMapTestDriver48.values();
        hashMapTestDriver48.clear();
        java.lang.Object obj60 = hashMapTestDriver48.get((java.lang.Object) '4');
        java.lang.Object obj61 = hashMapTestDriver21.put((java.lang.Object) collection47, (java.lang.Object) hashMapTestDriver48);
        java.lang.Object obj63 = hashMapTestDriver21.remove((java.lang.Object) '4');
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test027");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.keySet();
        java.lang.Object obj13 = hashMapTestDriver9.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver14.clear();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        boolean boolean17 = hashMapTestDriver14.isEmpty();
        boolean boolean18 = hashMapTestDriver14.isEmpty();
        experiment.util.Collection collection19 = hashMapTestDriver14.values();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver14);
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = hashMapTestDriver9.containsKey(obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test028");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) 10.0f);
        boolean boolean9 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test029");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.keySet();
        java.lang.Object obj11 = hashMapTestDriver7.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj13 = hashMapTestDriver7.get((java.lang.Object) 0.0d);
        boolean boolean15 = hashMapTestDriver7.containsKey((java.lang.Object) (short) 10);
        experiment.util.Set set16 = hashMapTestDriver7.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj19 = hashMapTestDriver17.remove((java.lang.Object) 0);
        hashMapTestDriver17.clear();
        java.lang.Object obj22 = hashMapTestDriver17.remove((java.lang.Object) 100.0f);
        java.lang.Object obj24 = hashMapTestDriver17.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.keySet();
        java.lang.Object obj29 = hashMapTestDriver25.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection30 = hashMapTestDriver25.values();
        java.lang.Object obj31 = hashMapTestDriver17.get((java.lang.Object) collection30);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set33 = hashMapTestDriver32.keySet();
        int int34 = hashMapTestDriver32.size();
        hashMapTestDriver32.clear();
        java.lang.Object obj37 = hashMapTestDriver17.put((java.lang.Object) hashMapTestDriver32, (java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver7, obj37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test030");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        int int37 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        java.lang.Object obj40 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) (-1L));
        int int41 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver35);
        boolean boolean43 = hashMapTestDriver16.isEmpty();
        java.lang.Class<?> wildcardClass44 = hashMapTestDriver16.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test031");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj3 = hashMapTestDriver0.get((java.lang.Object) (byte) 0);
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = hashMapTestDriver0.containsKey(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test032");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.keySet();
        int int9 = hashMapTestDriver7.size();
        experiment.util.Set set10 = hashMapTestDriver7.keySet();
        java.lang.Object obj11 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver7);
        hashMapTestDriver7.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.remove((java.lang.Object) 0);
        hashMapTestDriver13.clear();
        java.lang.Object obj18 = hashMapTestDriver13.remove((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = hashMapTestDriver7.containsKey(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test033");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) false);
        experiment.util.Set set16 = hashMapTestDriver4.entrySet();
        boolean boolean17 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        experiment.util.Set set21 = hashMapTestDriver4.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.keySet();
        java.lang.Object obj26 = hashMapTestDriver22.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set27 = hashMapTestDriver22.entrySet();
        experiment.util.Set set28 = hashMapTestDriver22.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.keySet();
        int int31 = hashMapTestDriver29.size();
        experiment.util.Set set32 = hashMapTestDriver29.keySet();
        java.lang.Object obj33 = hashMapTestDriver22.get((java.lang.Object) hashMapTestDriver29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = hashMapTestDriver4.get(obj33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test034");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass7 = set6.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test035");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver6.clear();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        boolean boolean9 = hashMapTestDriver6.isEmpty();
        boolean boolean10 = hashMapTestDriver6.isEmpty();
        experiment.util.Collection collection11 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.remove((java.lang.Object) 0);
        hashMapTestDriver12.clear();
        java.lang.Object obj17 = hashMapTestDriver12.remove((java.lang.Object) 100.0f);
        java.lang.Object obj19 = hashMapTestDriver12.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection20 = hashMapTestDriver12.values();
        java.lang.Object obj21 = hashMapTestDriver6.remove((java.lang.Object) hashMapTestDriver12);
        boolean boolean22 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver6);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.keySet();
        java.lang.Object obj26 = hashMapTestDriver23.get((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set28 = hashMapTestDriver27.keySet();
        java.lang.Object obj31 = hashMapTestDriver27.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj33 = hashMapTestDriver27.get((java.lang.Object) 0.0d);
        boolean boolean35 = hashMapTestDriver27.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection36 = hashMapTestDriver27.values();
        java.lang.Object obj38 = hashMapTestDriver27.remove((java.lang.Object) false);
        experiment.util.Set set39 = hashMapTestDriver27.entrySet();
        boolean boolean40 = hashMapTestDriver27.isEmpty();
        boolean boolean41 = hashMapTestDriver27.isEmpty();
        boolean boolean42 = hashMapTestDriver23.containsKey((java.lang.Object) hashMapTestDriver27);
        java.lang.Object obj43 = hashMapTestDriver0.get((java.lang.Object) boolean42);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test036");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.keySet();
        int int9 = hashMapTestDriver7.size();
        experiment.util.Set set10 = hashMapTestDriver7.keySet();
        java.lang.Object obj11 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver7);
        hashMapTestDriver7.clear();
        boolean boolean13 = hashMapTestDriver7.isEmpty();
        java.lang.Class<?> wildcardClass14 = hashMapTestDriver7.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test037");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass3 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test038");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test039");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.Collection collection11 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.remove((java.lang.Object) 0);
        experiment.util.Collection collection15 = hashMapTestDriver12.values();
        java.lang.Object obj17 = hashMapTestDriver12.get((java.lang.Object) 1L);
        java.lang.Object obj18 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        int int19 = hashMapTestDriver12.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test040");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        boolean boolean12 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test041");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver0.get((java.lang.Object) 'a');
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.keySet();
        java.lang.Object obj20 = hashMapTestDriver16.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set21 = hashMapTestDriver16.entrySet();
        experiment.util.Set set22 = hashMapTestDriver16.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.keySet();
        java.lang.Object obj27 = hashMapTestDriver23.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        int int28 = hashMapTestDriver23.size();
        java.lang.Object obj29 = hashMapTestDriver16.remove((java.lang.Object) int28);
        java.lang.Object obj30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, obj30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test042");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        int int13 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test043");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        int int37 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        java.lang.Object obj40 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) (-1L));
        int int41 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver35);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.keySet();
        java.lang.Object obj47 = hashMapTestDriver43.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj49 = hashMapTestDriver43.get((java.lang.Object) 0.0d);
        boolean boolean51 = hashMapTestDriver43.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection52 = hashMapTestDriver43.values();
        hashMapTestDriver43.clear();
        experiment.util.Collection collection54 = hashMapTestDriver43.values();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj57 = hashMapTestDriver55.remove((java.lang.Object) 0);
        experiment.util.Collection collection58 = hashMapTestDriver55.values();
        java.lang.Object obj60 = hashMapTestDriver55.get((java.lang.Object) 1L);
        java.lang.Object obj61 = hashMapTestDriver43.get((java.lang.Object) hashMapTestDriver55);
        java.lang.Object obj62 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver55);
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver63.clear();
        experiment.util.Set set65 = hashMapTestDriver63.entrySet();
        boolean boolean66 = hashMapTestDriver63.isEmpty();
        experiment.util.Set set67 = hashMapTestDriver63.keySet();
        boolean boolean68 = hashMapTestDriver63.isEmpty();
        experiment.util.Collection collection69 = hashMapTestDriver63.values();
        java.lang.Object obj70 = hashMapTestDriver16.get((java.lang.Object) collection69);
        int int71 = hashMapTestDriver16.size();
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj74 = hashMapTestDriver72.remove((java.lang.Object) 0);
        hashMapTestDriver72.clear();
        int int76 = hashMapTestDriver72.size();
        int int77 = hashMapTestDriver72.size();
        java.lang.Object obj79 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver72, (java.lang.Object) (short) 10);
        int int80 = hashMapTestDriver72.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test044");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        int int9 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set12 = hashMapTestDriver11.keySet();
        java.lang.Object obj15 = hashMapTestDriver11.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj17 = hashMapTestDriver11.get((java.lang.Object) 0.0d);
        boolean boolean19 = hashMapTestDriver11.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection20 = hashMapTestDriver11.values();
        java.lang.Object obj22 = hashMapTestDriver11.remove((java.lang.Object) false);
        experiment.util.Set set23 = hashMapTestDriver11.entrySet();
        boolean boolean24 = hashMapTestDriver11.isEmpty();
        boolean boolean25 = hashMapTestDriver11.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.remove((java.lang.Object) 0);
        java.lang.Object obj31 = hashMapTestDriver26.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver32.clear();
        experiment.util.Set set34 = hashMapTestDriver32.entrySet();
        boolean boolean35 = hashMapTestDriver32.isEmpty();
        boolean boolean36 = hashMapTestDriver32.isEmpty();
        experiment.util.Collection collection37 = hashMapTestDriver32.values();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj40 = hashMapTestDriver38.remove((java.lang.Object) 0);
        hashMapTestDriver38.clear();
        java.lang.Object obj43 = hashMapTestDriver38.remove((java.lang.Object) 100.0f);
        java.lang.Object obj45 = hashMapTestDriver38.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection46 = hashMapTestDriver38.values();
        java.lang.Object obj47 = hashMapTestDriver32.remove((java.lang.Object) hashMapTestDriver38);
        boolean boolean48 = hashMapTestDriver26.containsKey((java.lang.Object) hashMapTestDriver32);
        boolean boolean49 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver32);
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj52 = hashMapTestDriver50.remove((java.lang.Object) 0);
        hashMapTestDriver50.clear();
        java.lang.Object obj55 = hashMapTestDriver50.remove((java.lang.Object) 100.0f);
        java.lang.Object obj57 = hashMapTestDriver50.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection58 = hashMapTestDriver50.values();
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set60 = hashMapTestDriver59.keySet();
        java.lang.Object obj63 = hashMapTestDriver59.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj65 = hashMapTestDriver59.get((java.lang.Object) 0.0d);
        boolean boolean67 = hashMapTestDriver59.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection68 = hashMapTestDriver59.values();
        hashMapTestDriver59.clear();
        java.lang.Object obj71 = hashMapTestDriver59.get((java.lang.Object) '4');
        java.lang.Object obj72 = hashMapTestDriver32.put((java.lang.Object) collection58, (java.lang.Object) hashMapTestDriver59);
        experiment.util.HashMapTestDriver hashMapTestDriver73 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj74 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver59, (java.lang.Object) hashMapTestDriver73);
        experiment.util.HashMapTestDriver hashMapTestDriver75 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj77 = hashMapTestDriver75.remove((java.lang.Object) 0);
        hashMapTestDriver75.clear();
        int int79 = hashMapTestDriver75.size();
        int int80 = hashMapTestDriver75.size();
        java.lang.Class<?> wildcardClass81 = hashMapTestDriver75.getClass();
        java.lang.Object obj82 = hashMapTestDriver0.remove((java.lang.Object) wildcardClass81);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test045");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        experiment.util.Set set13 = hashMapTestDriver0.keySet();
        experiment.util.Set set14 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test046");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj14 = hashMapTestDriver8.get((java.lang.Object) 0.0d);
        boolean boolean16 = hashMapTestDriver8.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection17 = hashMapTestDriver8.values();
        java.lang.Object obj19 = hashMapTestDriver8.remove((java.lang.Object) false);
        experiment.util.Set set20 = hashMapTestDriver8.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) 0);
        hashMapTestDriver21.clear();
        java.lang.Object obj26 = hashMapTestDriver21.remove((java.lang.Object) 100.0f);
        java.lang.Object obj28 = hashMapTestDriver21.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.keySet();
        java.lang.Object obj33 = hashMapTestDriver29.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection34 = hashMapTestDriver29.values();
        java.lang.Object obj35 = hashMapTestDriver21.get((java.lang.Object) collection34);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set37 = hashMapTestDriver36.keySet();
        int int38 = hashMapTestDriver36.size();
        hashMapTestDriver36.clear();
        java.lang.Object obj41 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver36, (java.lang.Object) (-1L));
        experiment.util.Collection collection42 = hashMapTestDriver21.values();
        boolean boolean43 = hashMapTestDriver8.containsKey((java.lang.Object) collection42);
        java.lang.Object obj44 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.remove((java.lang.Object) 0);
        java.lang.Object obj50 = hashMapTestDriver45.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        boolean boolean52 = hashMapTestDriver45.containsKey((java.lang.Object) true);
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver53.clear();
        experiment.util.Set set55 = hashMapTestDriver53.entrySet();
        boolean boolean56 = hashMapTestDriver53.isEmpty();
        boolean boolean57 = hashMapTestDriver53.isEmpty();
        java.lang.Object obj58 = hashMapTestDriver8.put((java.lang.Object) true, (java.lang.Object) hashMapTestDriver53);
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj61 = hashMapTestDriver59.remove((java.lang.Object) 0);
        hashMapTestDriver59.clear();
        java.lang.Object obj64 = hashMapTestDriver59.remove((java.lang.Object) 100.0f);
        java.lang.Object obj66 = hashMapTestDriver59.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection67 = hashMapTestDriver59.values();
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set69 = hashMapTestDriver68.keySet();
        java.lang.Object obj72 = hashMapTestDriver68.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver73 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver73.clear();
        experiment.util.Set set75 = hashMapTestDriver73.entrySet();
        boolean boolean76 = hashMapTestDriver73.isEmpty();
        boolean boolean77 = hashMapTestDriver73.isEmpty();
        experiment.util.Collection collection78 = hashMapTestDriver73.values();
        java.lang.Object obj79 = hashMapTestDriver59.put((java.lang.Object) hashMapTestDriver68, (java.lang.Object) hashMapTestDriver73);
        hashMapTestDriver59.clear();
        boolean boolean81 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver59);
        java.lang.Object obj82 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj83 = hashMapTestDriver8.remove(obj82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test047");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        boolean boolean10 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set11 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test048");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        int int17 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) (-1L));
        java.lang.Object obj21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = hashMapTestDriver0.put(obj21, (java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test049");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) false);
        experiment.util.Set set16 = hashMapTestDriver4.entrySet();
        boolean boolean17 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        int int21 = hashMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test050");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        boolean boolean14 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) 0);
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver21.clear();
        experiment.util.Set set23 = hashMapTestDriver21.entrySet();
        boolean boolean24 = hashMapTestDriver21.isEmpty();
        boolean boolean25 = hashMapTestDriver21.isEmpty();
        experiment.util.Collection collection26 = hashMapTestDriver21.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) 0);
        hashMapTestDriver27.clear();
        java.lang.Object obj32 = hashMapTestDriver27.remove((java.lang.Object) 100.0f);
        java.lang.Object obj34 = hashMapTestDriver27.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection35 = hashMapTestDriver27.values();
        java.lang.Object obj36 = hashMapTestDriver21.remove((java.lang.Object) hashMapTestDriver27);
        boolean boolean37 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver21);
        boolean boolean38 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver21);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj41 = hashMapTestDriver39.remove((java.lang.Object) 0);
        hashMapTestDriver39.clear();
        java.lang.Object obj44 = hashMapTestDriver39.remove((java.lang.Object) 100.0f);
        java.lang.Object obj46 = hashMapTestDriver39.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection47 = hashMapTestDriver39.values();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set49 = hashMapTestDriver48.keySet();
        java.lang.Object obj52 = hashMapTestDriver48.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj54 = hashMapTestDriver48.get((java.lang.Object) 0.0d);
        boolean boolean56 = hashMapTestDriver48.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection57 = hashMapTestDriver48.values();
        hashMapTestDriver48.clear();
        java.lang.Object obj60 = hashMapTestDriver48.get((java.lang.Object) '4');
        java.lang.Object obj61 = hashMapTestDriver21.put((java.lang.Object) collection47, (java.lang.Object) hashMapTestDriver48);
        java.lang.Object obj62 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj63 = hashMapTestDriver21.get(obj62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test051");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        experiment.util.Collection collection14 = hashMapTestDriver0.values();
        experiment.util.Collection collection15 = hashMapTestDriver0.values();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test052");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver7.remove((java.lang.Object) 0);
        hashMapTestDriver7.clear();
        java.lang.Object obj12 = hashMapTestDriver7.remove((java.lang.Object) 100.0f);
        java.lang.Object obj14 = hashMapTestDriver7.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        java.lang.Object obj19 = hashMapTestDriver15.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection20 = hashMapTestDriver15.values();
        java.lang.Object obj21 = hashMapTestDriver7.get((java.lang.Object) collection20);
        hashMapTestDriver7.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) 0);
        experiment.util.Collection collection26 = hashMapTestDriver23.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) 0);
        hashMapTestDriver27.clear();
        java.lang.Object obj32 = hashMapTestDriver27.remove((java.lang.Object) 100.0f);
        java.lang.Object obj34 = hashMapTestDriver27.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        java.lang.Object obj39 = hashMapTestDriver35.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection40 = hashMapTestDriver35.values();
        java.lang.Object obj41 = hashMapTestDriver27.get((java.lang.Object) collection40);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set43 = hashMapTestDriver42.keySet();
        int int44 = hashMapTestDriver42.size();
        hashMapTestDriver42.clear();
        java.lang.Object obj47 = hashMapTestDriver27.put((java.lang.Object) hashMapTestDriver42, (java.lang.Object) (-1L));
        int int48 = hashMapTestDriver42.size();
        java.lang.Object obj49 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver23, (java.lang.Object) hashMapTestDriver42);
        boolean boolean50 = hashMapTestDriver23.isEmpty();
        experiment.util.Set set51 = hashMapTestDriver23.keySet();
        experiment.util.Collection collection52 = hashMapTestDriver23.values();
        java.lang.Object obj53 = hashMapTestDriver0.remove((java.lang.Object) collection52);
        java.lang.Class<?> wildcardClass54 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test053");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        hashMapTestDriver4.clear();
        experiment.util.Collection collection15 = hashMapTestDriver4.values();
        java.lang.Object obj16 = hashMapTestDriver0.remove((java.lang.Object) collection15);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver17.clear();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver17.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set22 = hashMapTestDriver21.keySet();
        java.lang.Object obj25 = hashMapTestDriver21.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj27 = hashMapTestDriver21.get((java.lang.Object) 0.0d);
        boolean boolean29 = hashMapTestDriver21.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection30 = hashMapTestDriver21.values();
        hashMapTestDriver21.clear();
        experiment.util.Collection collection32 = hashMapTestDriver21.values();
        java.lang.Object obj33 = hashMapTestDriver17.remove((java.lang.Object) collection32);
        java.lang.Object obj34 = hashMapTestDriver0.get((java.lang.Object) collection32);
        java.lang.Object obj35 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = hashMapTestDriver0.containsKey(obj35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test054");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver6.clear();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        boolean boolean9 = hashMapTestDriver6.isEmpty();
        boolean boolean10 = hashMapTestDriver6.isEmpty();
        experiment.util.Collection collection11 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.remove((java.lang.Object) 0);
        hashMapTestDriver12.clear();
        java.lang.Object obj17 = hashMapTestDriver12.remove((java.lang.Object) 100.0f);
        java.lang.Object obj19 = hashMapTestDriver12.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection20 = hashMapTestDriver12.values();
        java.lang.Object obj21 = hashMapTestDriver6.remove((java.lang.Object) hashMapTestDriver12);
        boolean boolean22 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver6);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.keySet();
        java.lang.Object obj27 = hashMapTestDriver23.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set28 = hashMapTestDriver23.entrySet();
        experiment.util.Set set29 = hashMapTestDriver23.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.remove((java.lang.Object) 0);
        hashMapTestDriver30.clear();
        java.lang.Object obj35 = hashMapTestDriver30.remove((java.lang.Object) 100.0f);
        java.lang.Object obj37 = hashMapTestDriver30.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.keySet();
        java.lang.Object obj42 = hashMapTestDriver38.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection43 = hashMapTestDriver38.values();
        java.lang.Object obj44 = hashMapTestDriver30.get((java.lang.Object) collection43);
        hashMapTestDriver30.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj48 = hashMapTestDriver46.remove((java.lang.Object) 0);
        experiment.util.Collection collection49 = hashMapTestDriver46.values();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj52 = hashMapTestDriver50.remove((java.lang.Object) 0);
        hashMapTestDriver50.clear();
        java.lang.Object obj55 = hashMapTestDriver50.remove((java.lang.Object) 100.0f);
        java.lang.Object obj57 = hashMapTestDriver50.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set59 = hashMapTestDriver58.keySet();
        java.lang.Object obj62 = hashMapTestDriver58.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection63 = hashMapTestDriver58.values();
        java.lang.Object obj64 = hashMapTestDriver50.get((java.lang.Object) collection63);
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set66 = hashMapTestDriver65.keySet();
        int int67 = hashMapTestDriver65.size();
        hashMapTestDriver65.clear();
        java.lang.Object obj70 = hashMapTestDriver50.put((java.lang.Object) hashMapTestDriver65, (java.lang.Object) (-1L));
        int int71 = hashMapTestDriver65.size();
        java.lang.Object obj72 = hashMapTestDriver30.put((java.lang.Object) hashMapTestDriver46, (java.lang.Object) hashMapTestDriver65);
        boolean boolean73 = hashMapTestDriver46.isEmpty();
        experiment.util.Set set74 = hashMapTestDriver46.keySet();
        experiment.util.Collection collection75 = hashMapTestDriver46.values();
        java.lang.Object obj76 = hashMapTestDriver23.remove((java.lang.Object) collection75);
        java.lang.Object obj77 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj78 = hashMapTestDriver0.put(obj76, obj77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test055");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        boolean boolean7 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj14 = hashMapTestDriver8.get((java.lang.Object) 0.0d);
        boolean boolean16 = hashMapTestDriver8.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection17 = hashMapTestDriver8.values();
        java.lang.Object obj19 = hashMapTestDriver8.remove((java.lang.Object) false);
        experiment.util.Set set20 = hashMapTestDriver8.entrySet();
        java.lang.Object obj21 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = obj21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test056");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        int int9 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test057");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        boolean boolean14 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) 0);
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver21.clear();
        experiment.util.Set set23 = hashMapTestDriver21.entrySet();
        boolean boolean24 = hashMapTestDriver21.isEmpty();
        boolean boolean25 = hashMapTestDriver21.isEmpty();
        experiment.util.Collection collection26 = hashMapTestDriver21.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) 0);
        hashMapTestDriver27.clear();
        java.lang.Object obj32 = hashMapTestDriver27.remove((java.lang.Object) 100.0f);
        java.lang.Object obj34 = hashMapTestDriver27.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection35 = hashMapTestDriver27.values();
        java.lang.Object obj36 = hashMapTestDriver21.remove((java.lang.Object) hashMapTestDriver27);
        boolean boolean37 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver21);
        boolean boolean38 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver21);
        java.lang.Object obj39 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = hashMapTestDriver0.containsKey(obj39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test058");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        hashMapTestDriver0.clear();
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        int int10 = hashMapTestDriver8.size();
        experiment.util.Set set11 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.keySet();
        java.lang.Object obj16 = hashMapTestDriver12.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj18 = hashMapTestDriver12.get((java.lang.Object) 0.0d);
        boolean boolean20 = hashMapTestDriver12.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection21 = hashMapTestDriver12.values();
        hashMapTestDriver12.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) 0);
        hashMapTestDriver23.clear();
        java.lang.Object obj28 = hashMapTestDriver23.remove((java.lang.Object) 100.0f);
        java.lang.Object obj30 = hashMapTestDriver23.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.keySet();
        java.lang.Object obj35 = hashMapTestDriver31.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection36 = hashMapTestDriver31.values();
        java.lang.Object obj37 = hashMapTestDriver23.get((java.lang.Object) collection36);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.keySet();
        int int40 = hashMapTestDriver38.size();
        hashMapTestDriver38.clear();
        java.lang.Object obj43 = hashMapTestDriver23.put((java.lang.Object) hashMapTestDriver38, (java.lang.Object) (-1L));
        java.lang.Object obj44 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver12, (java.lang.Object) (-1L));
        hashMapTestDriver8.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set47 = hashMapTestDriver46.keySet();
        java.lang.Object obj50 = hashMapTestDriver46.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj52 = hashMapTestDriver46.get((java.lang.Object) 0.0d);
        boolean boolean54 = hashMapTestDriver46.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection55 = hashMapTestDriver46.values();
        hashMapTestDriver46.clear();
        java.lang.Object obj58 = hashMapTestDriver46.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set60 = hashMapTestDriver59.keySet();
        java.lang.Object obj63 = hashMapTestDriver59.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj65 = hashMapTestDriver59.get((java.lang.Object) 0.0d);
        boolean boolean67 = hashMapTestDriver59.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection68 = hashMapTestDriver59.values();
        hashMapTestDriver59.clear();
        java.lang.Object obj72 = hashMapTestDriver59.put((java.lang.Object) (-1.0f), (java.lang.Object) 1.0f);
        boolean boolean73 = hashMapTestDriver46.containsKey((java.lang.Object) 1.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver74 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver74.clear();
        java.lang.Object obj76 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver46, (java.lang.Object) hashMapTestDriver74);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj77 = hashMapTestDriver0.put((java.lang.Object) (-1L), obj76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test059");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.keySet();
        java.lang.Object obj16 = hashMapTestDriver12.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj18 = hashMapTestDriver12.get((java.lang.Object) 0.0d);
        boolean boolean20 = hashMapTestDriver12.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection21 = hashMapTestDriver12.values();
        java.lang.Object obj23 = hashMapTestDriver12.remove((java.lang.Object) false);
        experiment.util.Set set24 = hashMapTestDriver12.entrySet();
        java.lang.Class<?> wildcardClass25 = hashMapTestDriver12.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set27 = hashMapTestDriver26.keySet();
        java.lang.Object obj30 = hashMapTestDriver26.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set31 = hashMapTestDriver26.entrySet();
        experiment.util.Set set32 = hashMapTestDriver26.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set34 = hashMapTestDriver33.keySet();
        int int35 = hashMapTestDriver33.size();
        experiment.util.Set set36 = hashMapTestDriver33.keySet();
        java.lang.Object obj37 = hashMapTestDriver26.get((java.lang.Object) hashMapTestDriver33);
        hashMapTestDriver33.clear();
        boolean boolean39 = hashMapTestDriver33.isEmpty();
        java.lang.Object obj40 = hashMapTestDriver0.put((java.lang.Object) wildcardClass25, (java.lang.Object) hashMapTestDriver33);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver41.clear();
        experiment.util.Set set43 = hashMapTestDriver41.entrySet();
        hashMapTestDriver41.clear();
        experiment.util.Set set45 = hashMapTestDriver41.entrySet();
        java.lang.Class<?> wildcardClass46 = hashMapTestDriver41.getClass();
        java.lang.Object obj47 = hashMapTestDriver33.get((java.lang.Object) hashMapTestDriver41);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test060");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) "hi!");
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.keySet();
        java.lang.Object obj13 = hashMapTestDriver9.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj15 = hashMapTestDriver9.get((java.lang.Object) 0.0d);
        boolean boolean17 = hashMapTestDriver9.containsKey((java.lang.Object) (short) 10);
        experiment.util.Set set18 = hashMapTestDriver9.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj21 = hashMapTestDriver19.remove((java.lang.Object) 0);
        hashMapTestDriver19.clear();
        java.lang.Object obj24 = hashMapTestDriver19.remove((java.lang.Object) 100.0f);
        java.lang.Object obj26 = hashMapTestDriver19.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set28 = hashMapTestDriver27.keySet();
        java.lang.Object obj31 = hashMapTestDriver27.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection32 = hashMapTestDriver27.values();
        java.lang.Object obj33 = hashMapTestDriver19.get((java.lang.Object) collection32);
        hashMapTestDriver19.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj37 = hashMapTestDriver35.remove((java.lang.Object) 0);
        experiment.util.Collection collection38 = hashMapTestDriver35.values();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj41 = hashMapTestDriver39.remove((java.lang.Object) 0);
        hashMapTestDriver39.clear();
        java.lang.Object obj44 = hashMapTestDriver39.remove((java.lang.Object) 100.0f);
        java.lang.Object obj46 = hashMapTestDriver39.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set48 = hashMapTestDriver47.keySet();
        java.lang.Object obj51 = hashMapTestDriver47.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection52 = hashMapTestDriver47.values();
        java.lang.Object obj53 = hashMapTestDriver39.get((java.lang.Object) collection52);
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set55 = hashMapTestDriver54.keySet();
        int int56 = hashMapTestDriver54.size();
        hashMapTestDriver54.clear();
        java.lang.Object obj59 = hashMapTestDriver39.put((java.lang.Object) hashMapTestDriver54, (java.lang.Object) (-1L));
        int int60 = hashMapTestDriver54.size();
        java.lang.Object obj61 = hashMapTestDriver19.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) hashMapTestDriver54);
        boolean boolean62 = hashMapTestDriver35.isEmpty();
        experiment.util.Set set63 = hashMapTestDriver35.keySet();
        experiment.util.Collection collection64 = hashMapTestDriver35.values();
        java.lang.Object obj65 = hashMapTestDriver9.get((java.lang.Object) hashMapTestDriver35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj67 = hashMapTestDriver0.put(obj65, (java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test061");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        experiment.util.Collection collection14 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass15 = collection14.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test062");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj14 = hashMapTestDriver8.get((java.lang.Object) 0.0d);
        boolean boolean16 = hashMapTestDriver8.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection17 = hashMapTestDriver8.values();
        java.lang.Object obj19 = hashMapTestDriver8.remove((java.lang.Object) false);
        experiment.util.Set set20 = hashMapTestDriver8.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) 0);
        hashMapTestDriver21.clear();
        java.lang.Object obj26 = hashMapTestDriver21.remove((java.lang.Object) 100.0f);
        java.lang.Object obj28 = hashMapTestDriver21.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.keySet();
        java.lang.Object obj33 = hashMapTestDriver29.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection34 = hashMapTestDriver29.values();
        java.lang.Object obj35 = hashMapTestDriver21.get((java.lang.Object) collection34);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set37 = hashMapTestDriver36.keySet();
        int int38 = hashMapTestDriver36.size();
        hashMapTestDriver36.clear();
        java.lang.Object obj41 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver36, (java.lang.Object) (-1L));
        experiment.util.Collection collection42 = hashMapTestDriver21.values();
        boolean boolean43 = hashMapTestDriver8.containsKey((java.lang.Object) collection42);
        java.lang.Object obj44 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.remove((java.lang.Object) 0);
        java.lang.Object obj50 = hashMapTestDriver45.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        boolean boolean52 = hashMapTestDriver45.containsKey((java.lang.Object) true);
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver53.clear();
        experiment.util.Set set55 = hashMapTestDriver53.entrySet();
        boolean boolean56 = hashMapTestDriver53.isEmpty();
        boolean boolean57 = hashMapTestDriver53.isEmpty();
        java.lang.Object obj58 = hashMapTestDriver8.put((java.lang.Object) true, (java.lang.Object) hashMapTestDriver53);
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj61 = hashMapTestDriver59.remove((java.lang.Object) 0);
        hashMapTestDriver59.clear();
        java.lang.Object obj64 = hashMapTestDriver59.remove((java.lang.Object) 100.0f);
        java.lang.Object obj66 = hashMapTestDriver59.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection67 = hashMapTestDriver59.values();
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set69 = hashMapTestDriver68.keySet();
        java.lang.Object obj72 = hashMapTestDriver68.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver73 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver73.clear();
        experiment.util.Set set75 = hashMapTestDriver73.entrySet();
        boolean boolean76 = hashMapTestDriver73.isEmpty();
        boolean boolean77 = hashMapTestDriver73.isEmpty();
        experiment.util.Collection collection78 = hashMapTestDriver73.values();
        java.lang.Object obj79 = hashMapTestDriver59.put((java.lang.Object) hashMapTestDriver68, (java.lang.Object) hashMapTestDriver73);
        hashMapTestDriver59.clear();
        boolean boolean81 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver59);
        experiment.util.HashMapTestDriver hashMapTestDriver82 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj84 = hashMapTestDriver82.remove((java.lang.Object) 0);
        hashMapTestDriver82.clear();
        java.lang.Object obj87 = hashMapTestDriver82.remove((java.lang.Object) 100.0f);
        java.lang.Object obj89 = hashMapTestDriver82.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection90 = hashMapTestDriver82.values();
        java.lang.Object obj91 = hashMapTestDriver8.remove((java.lang.Object) hashMapTestDriver82);
        java.lang.Class<?> wildcardClass92 = hashMapTestDriver82.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test063");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        int int9 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.Collection collection11 = hashMapTestDriver0.values();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test064");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj9 = hashMapTestDriver5.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj11 = hashMapTestDriver5.get((java.lang.Object) 0.0d);
        boolean boolean13 = hashMapTestDriver5.containsKey((java.lang.Object) (short) 10);
        experiment.util.Set set14 = hashMapTestDriver5.keySet();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver5);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.keySet();
        java.lang.Object obj20 = hashMapTestDriver16.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj22 = hashMapTestDriver16.get((java.lang.Object) 0.0d);
        boolean boolean24 = hashMapTestDriver16.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        java.lang.Object obj27 = hashMapTestDriver16.remove((java.lang.Object) false);
        experiment.util.Set set28 = hashMapTestDriver16.entrySet();
        java.lang.Object obj29 = hashMapTestDriver0.get((java.lang.Object) set28);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test065");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        int int5 = hashMapTestDriver0.size();
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass7 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test066");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) 0);
        hashMapTestDriver5.clear();
        java.lang.Object obj10 = hashMapTestDriver5.remove((java.lang.Object) 100.0f);
        java.lang.Object obj12 = hashMapTestDriver5.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.keySet();
        java.lang.Object obj17 = hashMapTestDriver13.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection18 = hashMapTestDriver13.values();
        java.lang.Object obj19 = hashMapTestDriver5.get((java.lang.Object) collection18);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set21 = hashMapTestDriver20.keySet();
        int int22 = hashMapTestDriver20.size();
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver5.put((java.lang.Object) hashMapTestDriver20, (java.lang.Object) (-1L));
        boolean boolean27 = hashMapTestDriver20.containsKey((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver28.remove((java.lang.Object) 0);
        experiment.util.Collection collection31 = hashMapTestDriver28.values();
        boolean boolean32 = hashMapTestDriver20.containsKey((java.lang.Object) hashMapTestDriver28);
        experiment.util.Collection collection33 = hashMapTestDriver20.values();
        java.lang.Object obj34 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) hashMapTestDriver20);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj38 = hashMapTestDriver36.remove((java.lang.Object) 0);
        experiment.util.Collection collection39 = hashMapTestDriver36.values();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.keySet();
        java.lang.Object obj44 = hashMapTestDriver40.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj46 = hashMapTestDriver40.get((java.lang.Object) 0.0d);
        boolean boolean48 = hashMapTestDriver40.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection49 = hashMapTestDriver40.values();
        java.lang.Object obj51 = hashMapTestDriver40.remove((java.lang.Object) false);
        experiment.util.Set set52 = hashMapTestDriver40.entrySet();
        boolean boolean53 = hashMapTestDriver40.isEmpty();
        java.lang.Object obj55 = hashMapTestDriver40.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj56 = hashMapTestDriver36.get((java.lang.Object) hashMapTestDriver40);
        boolean boolean57 = hashMapTestDriver40.isEmpty();
        java.lang.Object obj58 = hashMapTestDriver4.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMapTestDriver40);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test067");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        int int37 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        java.lang.Object obj40 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) (-1L));
        int int41 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass43 = obj42.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test068");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test069");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 1L);
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test070");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        boolean boolean10 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set12 = hashMapTestDriver11.keySet();
        java.lang.Object obj15 = hashMapTestDriver11.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj17 = hashMapTestDriver11.get((java.lang.Object) 0.0d);
        boolean boolean19 = hashMapTestDriver11.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection20 = hashMapTestDriver11.values();
        java.lang.Object obj22 = hashMapTestDriver11.remove((java.lang.Object) false);
        experiment.util.Set set23 = hashMapTestDriver11.entrySet();
        java.lang.Class<?> wildcardClass24 = hashMapTestDriver11.getClass();
        boolean boolean25 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver11);
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver26.clear();
        experiment.util.Set set28 = hashMapTestDriver26.entrySet();
        boolean boolean29 = hashMapTestDriver26.isEmpty();
        boolean boolean30 = hashMapTestDriver26.isEmpty();
        experiment.util.Collection collection31 = hashMapTestDriver26.values();
        java.lang.Class<?> wildcardClass32 = hashMapTestDriver26.getClass();
        java.lang.Object obj33 = hashMapTestDriver11.get((java.lang.Object) hashMapTestDriver26);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test071");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        int int4 = hashMapTestDriver0.size();
        int int5 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver8.clear();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver8.isEmpty();
        boolean boolean12 = hashMapTestDriver8.isEmpty();
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.remove((java.lang.Object) 0);
        hashMapTestDriver14.clear();
        java.lang.Object obj19 = hashMapTestDriver14.remove((java.lang.Object) 100.0f);
        java.lang.Object obj21 = hashMapTestDriver14.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection22 = hashMapTestDriver14.values();
        java.lang.Object obj23 = hashMapTestDriver8.remove((java.lang.Object) hashMapTestDriver14);
        java.lang.Object obj24 = hashMapTestDriver6.put((java.lang.Object) (-1.0f), (java.lang.Object) hashMapTestDriver14);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver25.clear();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver28.clear();
        experiment.util.Set set30 = hashMapTestDriver28.entrySet();
        boolean boolean31 = hashMapTestDriver28.isEmpty();
        boolean boolean32 = hashMapTestDriver28.isEmpty();
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver25.get((java.lang.Object) hashMapTestDriver28);
        boolean boolean35 = hashMapTestDriver14.containsKey((java.lang.Object) hashMapTestDriver28);
        boolean boolean37 = hashMapTestDriver14.containsKey((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj40 = hashMapTestDriver38.remove((java.lang.Object) 0);
        hashMapTestDriver38.clear();
        java.lang.Object obj43 = hashMapTestDriver38.remove((java.lang.Object) 100.0f);
        java.lang.Object obj44 = hashMapTestDriver0.put((java.lang.Object) (short) 10, (java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver45.clear();
        experiment.util.Set set47 = hashMapTestDriver45.entrySet();
        hashMapTestDriver45.clear();
        hashMapTestDriver45.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set51 = hashMapTestDriver50.keySet();
        java.lang.Object obj54 = hashMapTestDriver50.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj56 = hashMapTestDriver50.get((java.lang.Object) 0.0d);
        boolean boolean58 = hashMapTestDriver50.containsKey((java.lang.Object) (short) 10);
        experiment.util.Set set59 = hashMapTestDriver50.keySet();
        java.lang.Object obj60 = hashMapTestDriver45.remove((java.lang.Object) hashMapTestDriver50);
        boolean boolean61 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver50);
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj64 = hashMapTestDriver62.remove((java.lang.Object) 0);
        hashMapTestDriver62.clear();
        java.lang.Object obj67 = hashMapTestDriver62.remove((java.lang.Object) 100.0f);
        java.lang.Object obj69 = hashMapTestDriver62.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection70 = hashMapTestDriver62.values();
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set72 = hashMapTestDriver71.keySet();
        java.lang.Object obj75 = hashMapTestDriver71.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj77 = hashMapTestDriver71.get((java.lang.Object) 0.0d);
        boolean boolean79 = hashMapTestDriver71.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection80 = hashMapTestDriver71.values();
        java.lang.Object obj82 = hashMapTestDriver71.remove((java.lang.Object) false);
        experiment.util.Set set83 = hashMapTestDriver71.entrySet();
        boolean boolean84 = hashMapTestDriver71.isEmpty();
        java.lang.Object obj85 = hashMapTestDriver50.put((java.lang.Object) hashMapTestDriver62, (java.lang.Object) hashMapTestDriver71);
        experiment.util.Collection collection86 = hashMapTestDriver50.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(collection86);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test072");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        int int6 = hashMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test073");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        int int17 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) (-1L));
        experiment.util.Collection collection21 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj24 = hashMapTestDriver22.remove((java.lang.Object) 0);
        java.lang.Object obj27 = hashMapTestDriver22.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver28.clear();
        experiment.util.Set set30 = hashMapTestDriver28.entrySet();
        boolean boolean31 = hashMapTestDriver28.isEmpty();
        boolean boolean32 = hashMapTestDriver28.isEmpty();
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj36 = hashMapTestDriver34.remove((java.lang.Object) 0);
        hashMapTestDriver34.clear();
        java.lang.Object obj39 = hashMapTestDriver34.remove((java.lang.Object) 100.0f);
        java.lang.Object obj41 = hashMapTestDriver34.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection42 = hashMapTestDriver34.values();
        java.lang.Object obj43 = hashMapTestDriver28.remove((java.lang.Object) hashMapTestDriver34);
        boolean boolean44 = hashMapTestDriver22.containsKey((java.lang.Object) hashMapTestDriver28);
        boolean boolean45 = hashMapTestDriver0.containsKey((java.lang.Object) boolean44);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test074");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.Set set8 = hashMapTestDriver0.keySet();
        int int9 = hashMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test075");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        int int37 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        java.lang.Object obj40 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) (-1L));
        int int41 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver35);
        experiment.util.Set set43 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test076");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) false);
        experiment.util.Set set16 = hashMapTestDriver4.entrySet();
        boolean boolean17 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        boolean boolean21 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj24 = hashMapTestDriver22.remove((java.lang.Object) 0);
        hashMapTestDriver22.clear();
        java.lang.Object obj27 = hashMapTestDriver22.remove((java.lang.Object) 100.0f);
        java.lang.Object obj29 = hashMapTestDriver22.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set31 = hashMapTestDriver30.keySet();
        java.lang.Object obj34 = hashMapTestDriver30.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection35 = hashMapTestDriver30.values();
        java.lang.Object obj36 = hashMapTestDriver22.get((java.lang.Object) collection35);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set38 = hashMapTestDriver37.keySet();
        int int39 = hashMapTestDriver37.size();
        hashMapTestDriver37.clear();
        java.lang.Object obj42 = hashMapTestDriver22.put((java.lang.Object) hashMapTestDriver37, (java.lang.Object) (-1L));
        experiment.util.Collection collection43 = hashMapTestDriver22.values();
        experiment.util.Set set44 = hashMapTestDriver22.entrySet();
        java.lang.Object obj45 = hashMapTestDriver4.get((java.lang.Object) hashMapTestDriver22);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test077");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        int int9 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.Set set11 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test078");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass7 = collection6.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test079");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) false);
        experiment.util.Set set16 = hashMapTestDriver4.entrySet();
        boolean boolean17 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test080");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        int int37 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        java.lang.Object obj40 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) (-1L));
        int int41 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver35);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.keySet();
        java.lang.Object obj47 = hashMapTestDriver43.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj49 = hashMapTestDriver43.get((java.lang.Object) 0.0d);
        boolean boolean51 = hashMapTestDriver43.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection52 = hashMapTestDriver43.values();
        hashMapTestDriver43.clear();
        experiment.util.Collection collection54 = hashMapTestDriver43.values();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj57 = hashMapTestDriver55.remove((java.lang.Object) 0);
        experiment.util.Collection collection58 = hashMapTestDriver55.values();
        java.lang.Object obj60 = hashMapTestDriver55.get((java.lang.Object) 1L);
        java.lang.Object obj61 = hashMapTestDriver43.get((java.lang.Object) hashMapTestDriver55);
        java.lang.Object obj62 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver55);
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver63.clear();
        experiment.util.Set set65 = hashMapTestDriver63.entrySet();
        boolean boolean66 = hashMapTestDriver63.isEmpty();
        experiment.util.Set set67 = hashMapTestDriver63.keySet();
        boolean boolean68 = hashMapTestDriver63.isEmpty();
        experiment.util.Collection collection69 = hashMapTestDriver63.values();
        java.lang.Object obj70 = hashMapTestDriver16.get((java.lang.Object) collection69);
        int int71 = hashMapTestDriver16.size();
        hashMapTestDriver16.clear();
        int int73 = hashMapTestDriver16.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test081");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj9 = hashMapTestDriver5.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj11 = hashMapTestDriver5.get((java.lang.Object) 0.0d);
        boolean boolean13 = hashMapTestDriver5.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection14 = hashMapTestDriver5.values();
        hashMapTestDriver5.clear();
        experiment.util.Collection collection16 = hashMapTestDriver5.values();
        java.lang.Object obj17 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver5);
        boolean boolean18 = hashMapTestDriver5.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test082");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        java.lang.Object obj13 = hashMapTestDriver0.put((java.lang.Object) (-1.0f), (java.lang.Object) 1.0f);
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = hashMapTestDriver0.containsKey(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test083");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass6 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test084");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        int int17 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) (-1L));
        boolean boolean22 = hashMapTestDriver15.containsKey((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) 0);
        experiment.util.Collection collection26 = hashMapTestDriver23.values();
        boolean boolean27 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver23);
        experiment.util.Collection collection28 = hashMapTestDriver15.values();
        hashMapTestDriver15.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test085");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        int int15 = hashMapTestDriver0.size();
        experiment.util.Collection collection16 = hashMapTestDriver0.values();
        experiment.util.Collection collection17 = hashMapTestDriver0.values();
        int int18 = hashMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test086");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        boolean boolean7 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.keySet();
        java.lang.Object obj13 = hashMapTestDriver9.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj15 = hashMapTestDriver9.get((java.lang.Object) 0.0d);
        boolean boolean17 = hashMapTestDriver9.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection18 = hashMapTestDriver9.values();
        java.lang.Object obj20 = hashMapTestDriver9.remove((java.lang.Object) false);
        experiment.util.Set set21 = hashMapTestDriver9.entrySet();
        boolean boolean22 = hashMapTestDriver9.isEmpty();
        boolean boolean23 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj26 = hashMapTestDriver24.remove((java.lang.Object) 0);
        java.lang.Object obj29 = hashMapTestDriver24.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver30.clear();
        experiment.util.Set set32 = hashMapTestDriver30.entrySet();
        boolean boolean33 = hashMapTestDriver30.isEmpty();
        boolean boolean34 = hashMapTestDriver30.isEmpty();
        experiment.util.Collection collection35 = hashMapTestDriver30.values();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj38 = hashMapTestDriver36.remove((java.lang.Object) 0);
        hashMapTestDriver36.clear();
        java.lang.Object obj41 = hashMapTestDriver36.remove((java.lang.Object) 100.0f);
        java.lang.Object obj43 = hashMapTestDriver36.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection44 = hashMapTestDriver36.values();
        java.lang.Object obj45 = hashMapTestDriver30.remove((java.lang.Object) hashMapTestDriver36);
        boolean boolean46 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver30);
        boolean boolean47 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver30);
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj50 = hashMapTestDriver48.remove((java.lang.Object) 0);
        hashMapTestDriver48.clear();
        java.lang.Object obj53 = hashMapTestDriver48.remove((java.lang.Object) 100.0f);
        java.lang.Object obj55 = hashMapTestDriver48.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection56 = hashMapTestDriver48.values();
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set58 = hashMapTestDriver57.keySet();
        java.lang.Object obj61 = hashMapTestDriver57.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj63 = hashMapTestDriver57.get((java.lang.Object) 0.0d);
        boolean boolean65 = hashMapTestDriver57.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection66 = hashMapTestDriver57.values();
        hashMapTestDriver57.clear();
        java.lang.Object obj69 = hashMapTestDriver57.get((java.lang.Object) '4');
        java.lang.Object obj70 = hashMapTestDriver30.put((java.lang.Object) collection56, (java.lang.Object) hashMapTestDriver57);
        boolean boolean71 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver57);
        int int72 = hashMapTestDriver57.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test087");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver6.clear();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        boolean boolean9 = hashMapTestDriver6.isEmpty();
        boolean boolean10 = hashMapTestDriver6.isEmpty();
        experiment.util.Collection collection11 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.remove((java.lang.Object) 0);
        hashMapTestDriver12.clear();
        java.lang.Object obj17 = hashMapTestDriver12.remove((java.lang.Object) 100.0f);
        java.lang.Object obj19 = hashMapTestDriver12.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection20 = hashMapTestDriver12.values();
        java.lang.Object obj21 = hashMapTestDriver6.remove((java.lang.Object) hashMapTestDriver12);
        boolean boolean22 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver6);
        java.lang.Object obj24 = hashMapTestDriver0.remove((java.lang.Object) 100);
        experiment.util.Collection collection25 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass26 = collection25.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test088");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        int int4 = hashMapTestDriver0.size();
        int int5 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver8.clear();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver8.isEmpty();
        boolean boolean12 = hashMapTestDriver8.isEmpty();
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.remove((java.lang.Object) 0);
        hashMapTestDriver14.clear();
        java.lang.Object obj19 = hashMapTestDriver14.remove((java.lang.Object) 100.0f);
        java.lang.Object obj21 = hashMapTestDriver14.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection22 = hashMapTestDriver14.values();
        java.lang.Object obj23 = hashMapTestDriver8.remove((java.lang.Object) hashMapTestDriver14);
        java.lang.Object obj24 = hashMapTestDriver6.put((java.lang.Object) (-1.0f), (java.lang.Object) hashMapTestDriver14);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver25.clear();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver28.clear();
        experiment.util.Set set30 = hashMapTestDriver28.entrySet();
        boolean boolean31 = hashMapTestDriver28.isEmpty();
        boolean boolean32 = hashMapTestDriver28.isEmpty();
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver25.get((java.lang.Object) hashMapTestDriver28);
        boolean boolean35 = hashMapTestDriver14.containsKey((java.lang.Object) hashMapTestDriver28);
        boolean boolean37 = hashMapTestDriver14.containsKey((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj40 = hashMapTestDriver38.remove((java.lang.Object) 0);
        hashMapTestDriver38.clear();
        java.lang.Object obj43 = hashMapTestDriver38.remove((java.lang.Object) 100.0f);
        java.lang.Object obj44 = hashMapTestDriver0.put((java.lang.Object) (short) 10, (java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver45.clear();
        experiment.util.Set set47 = hashMapTestDriver45.entrySet();
        hashMapTestDriver45.clear();
        hashMapTestDriver45.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set51 = hashMapTestDriver50.keySet();
        java.lang.Object obj54 = hashMapTestDriver50.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj56 = hashMapTestDriver50.get((java.lang.Object) 0.0d);
        boolean boolean58 = hashMapTestDriver50.containsKey((java.lang.Object) (short) 10);
        experiment.util.Set set59 = hashMapTestDriver50.keySet();
        java.lang.Object obj60 = hashMapTestDriver45.remove((java.lang.Object) hashMapTestDriver50);
        boolean boolean61 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver50);
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set63 = hashMapTestDriver62.keySet();
        java.lang.Object obj66 = hashMapTestDriver62.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set67 = hashMapTestDriver62.entrySet();
        experiment.util.Set set68 = hashMapTestDriver62.entrySet();
        boolean boolean70 = hashMapTestDriver62.containsKey((java.lang.Object) 10.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set72 = hashMapTestDriver71.keySet();
        java.lang.Object obj75 = hashMapTestDriver71.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        hashMapTestDriver71.clear();
        boolean boolean77 = hashMapTestDriver71.isEmpty();
        experiment.util.Set set78 = hashMapTestDriver71.entrySet();
        java.lang.Object obj79 = hashMapTestDriver62.remove((java.lang.Object) hashMapTestDriver71);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj80 = hashMapTestDriver50.remove(obj79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNull(obj79);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test089");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.keySet();
        java.lang.Object obj13 = hashMapTestDriver9.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver14.clear();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        boolean boolean17 = hashMapTestDriver14.isEmpty();
        boolean boolean18 = hashMapTestDriver14.isEmpty();
        experiment.util.Collection collection19 = hashMapTestDriver14.values();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver14);
        experiment.util.Collection collection21 = hashMapTestDriver0.values();
        experiment.util.Set set22 = hashMapTestDriver0.keySet();
        experiment.util.Set set23 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test090");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Set set9 = hashMapTestDriver0.keySet();
        boolean boolean10 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test091");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.keySet();
        java.lang.Object obj20 = hashMapTestDriver16.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj22 = hashMapTestDriver16.get((java.lang.Object) 0.0d);
        boolean boolean24 = hashMapTestDriver16.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        java.lang.Object obj27 = hashMapTestDriver16.remove((java.lang.Object) false);
        experiment.util.Set set28 = hashMapTestDriver16.entrySet();
        boolean boolean29 = hashMapTestDriver16.isEmpty();
        boolean boolean30 = hashMapTestDriver16.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj33 = hashMapTestDriver31.remove((java.lang.Object) 0);
        java.lang.Object obj36 = hashMapTestDriver31.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver37.clear();
        experiment.util.Set set39 = hashMapTestDriver37.entrySet();
        boolean boolean40 = hashMapTestDriver37.isEmpty();
        boolean boolean41 = hashMapTestDriver37.isEmpty();
        experiment.util.Collection collection42 = hashMapTestDriver37.values();
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj45 = hashMapTestDriver43.remove((java.lang.Object) 0);
        hashMapTestDriver43.clear();
        java.lang.Object obj48 = hashMapTestDriver43.remove((java.lang.Object) 100.0f);
        java.lang.Object obj50 = hashMapTestDriver43.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection51 = hashMapTestDriver43.values();
        java.lang.Object obj52 = hashMapTestDriver37.remove((java.lang.Object) hashMapTestDriver43);
        boolean boolean53 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver37);
        boolean boolean54 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver37);
        int int55 = hashMapTestDriver16.size();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set57 = hashMapTestDriver56.keySet();
        java.lang.Object obj60 = hashMapTestDriver56.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        int int61 = hashMapTestDriver56.size();
        boolean boolean62 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver56);
        java.lang.Object obj63 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver56);
        boolean boolean64 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test092");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) "hi!");
        experiment.util.Set set9 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test093");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass4 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test094");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.keySet();
        java.lang.Object obj13 = hashMapTestDriver9.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver14.clear();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        boolean boolean17 = hashMapTestDriver14.isEmpty();
        boolean boolean18 = hashMapTestDriver14.isEmpty();
        experiment.util.Collection collection19 = hashMapTestDriver14.values();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver14);
        experiment.util.Set set21 = hashMapTestDriver9.keySet();
        java.lang.Class<?> wildcardClass22 = set21.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test095");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        boolean boolean4 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) 0);
        java.lang.Object obj10 = hashMapTestDriver5.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver11.clear();
        experiment.util.Set set13 = hashMapTestDriver11.entrySet();
        boolean boolean14 = hashMapTestDriver11.isEmpty();
        boolean boolean15 = hashMapTestDriver11.isEmpty();
        experiment.util.Collection collection16 = hashMapTestDriver11.values();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj19 = hashMapTestDriver17.remove((java.lang.Object) 0);
        hashMapTestDriver17.clear();
        java.lang.Object obj22 = hashMapTestDriver17.remove((java.lang.Object) 100.0f);
        java.lang.Object obj24 = hashMapTestDriver17.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection25 = hashMapTestDriver17.values();
        java.lang.Object obj26 = hashMapTestDriver11.remove((java.lang.Object) hashMapTestDriver17);
        boolean boolean27 = hashMapTestDriver5.containsKey((java.lang.Object) hashMapTestDriver11);
        experiment.util.Collection collection28 = hashMapTestDriver11.values();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver29.clear();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        java.lang.Class<?> wildcardClass32 = set31.getClass();
        java.lang.Object obj33 = hashMapTestDriver11.remove((java.lang.Object) set31);
        experiment.util.Set set34 = hashMapTestDriver11.keySet();
        boolean boolean35 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver11);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test096");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        int int4 = hashMapTestDriver0.size();
        java.lang.Class<?> wildcardClass5 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test097");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.keySet();
        java.lang.Object obj20 = hashMapTestDriver16.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj22 = hashMapTestDriver16.get((java.lang.Object) 0.0d);
        boolean boolean24 = hashMapTestDriver16.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        java.lang.Object obj27 = hashMapTestDriver16.remove((java.lang.Object) false);
        experiment.util.Set set28 = hashMapTestDriver16.entrySet();
        boolean boolean29 = hashMapTestDriver16.isEmpty();
        boolean boolean30 = hashMapTestDriver16.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj33 = hashMapTestDriver31.remove((java.lang.Object) 0);
        java.lang.Object obj36 = hashMapTestDriver31.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver37.clear();
        experiment.util.Set set39 = hashMapTestDriver37.entrySet();
        boolean boolean40 = hashMapTestDriver37.isEmpty();
        boolean boolean41 = hashMapTestDriver37.isEmpty();
        experiment.util.Collection collection42 = hashMapTestDriver37.values();
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj45 = hashMapTestDriver43.remove((java.lang.Object) 0);
        hashMapTestDriver43.clear();
        java.lang.Object obj48 = hashMapTestDriver43.remove((java.lang.Object) 100.0f);
        java.lang.Object obj50 = hashMapTestDriver43.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection51 = hashMapTestDriver43.values();
        java.lang.Object obj52 = hashMapTestDriver37.remove((java.lang.Object) hashMapTestDriver43);
        boolean boolean53 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver37);
        boolean boolean54 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver37);
        int int55 = hashMapTestDriver16.size();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set57 = hashMapTestDriver56.keySet();
        java.lang.Object obj60 = hashMapTestDriver56.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        int int61 = hashMapTestDriver56.size();
        boolean boolean62 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver56);
        java.lang.Object obj63 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver56);
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set65 = hashMapTestDriver64.keySet();
        java.lang.Object obj68 = hashMapTestDriver64.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj70 = hashMapTestDriver64.get((java.lang.Object) 0.0d);
        boolean boolean72 = hashMapTestDriver64.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection73 = hashMapTestDriver64.values();
        hashMapTestDriver64.clear();
        java.lang.Object obj75 = hashMapTestDriver56.get((java.lang.Object) hashMapTestDriver64);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test098");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj14 = hashMapTestDriver8.get((java.lang.Object) 0.0d);
        boolean boolean16 = hashMapTestDriver8.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection17 = hashMapTestDriver8.values();
        java.lang.Object obj19 = hashMapTestDriver8.remove((java.lang.Object) false);
        experiment.util.Set set20 = hashMapTestDriver8.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) 0);
        hashMapTestDriver21.clear();
        java.lang.Object obj26 = hashMapTestDriver21.remove((java.lang.Object) 100.0f);
        java.lang.Object obj28 = hashMapTestDriver21.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.keySet();
        java.lang.Object obj33 = hashMapTestDriver29.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection34 = hashMapTestDriver29.values();
        java.lang.Object obj35 = hashMapTestDriver21.get((java.lang.Object) collection34);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set37 = hashMapTestDriver36.keySet();
        int int38 = hashMapTestDriver36.size();
        hashMapTestDriver36.clear();
        java.lang.Object obj41 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver36, (java.lang.Object) (-1L));
        experiment.util.Collection collection42 = hashMapTestDriver21.values();
        boolean boolean43 = hashMapTestDriver8.containsKey((java.lang.Object) collection42);
        java.lang.Object obj44 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj45 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean46 = hashMapTestDriver8.containsKey(obj45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test099");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Set set9 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj12 = hashMapTestDriver10.remove((java.lang.Object) 0);
        hashMapTestDriver10.clear();
        java.lang.Object obj15 = hashMapTestDriver10.remove((java.lang.Object) 100.0f);
        java.lang.Object obj17 = hashMapTestDriver10.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.keySet();
        java.lang.Object obj22 = hashMapTestDriver18.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection23 = hashMapTestDriver18.values();
        java.lang.Object obj24 = hashMapTestDriver10.get((java.lang.Object) collection23);
        hashMapTestDriver10.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.remove((java.lang.Object) 0);
        experiment.util.Collection collection29 = hashMapTestDriver26.values();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.remove((java.lang.Object) 0);
        hashMapTestDriver30.clear();
        java.lang.Object obj35 = hashMapTestDriver30.remove((java.lang.Object) 100.0f);
        java.lang.Object obj37 = hashMapTestDriver30.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.keySet();
        java.lang.Object obj42 = hashMapTestDriver38.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection43 = hashMapTestDriver38.values();
        java.lang.Object obj44 = hashMapTestDriver30.get((java.lang.Object) collection43);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set46 = hashMapTestDriver45.keySet();
        int int47 = hashMapTestDriver45.size();
        hashMapTestDriver45.clear();
        java.lang.Object obj50 = hashMapTestDriver30.put((java.lang.Object) hashMapTestDriver45, (java.lang.Object) (-1L));
        int int51 = hashMapTestDriver45.size();
        java.lang.Object obj52 = hashMapTestDriver10.put((java.lang.Object) hashMapTestDriver26, (java.lang.Object) hashMapTestDriver45);
        boolean boolean53 = hashMapTestDriver26.isEmpty();
        experiment.util.Set set54 = hashMapTestDriver26.keySet();
        experiment.util.Collection collection55 = hashMapTestDriver26.values();
        java.lang.Object obj56 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver26);
        java.lang.Object obj59 = hashMapTestDriver26.put((java.lang.Object) (byte) 0, (java.lang.Object) "");
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test100");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) false);
        experiment.util.Set set16 = hashMapTestDriver4.entrySet();
        boolean boolean17 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        experiment.util.Set set21 = hashMapTestDriver4.keySet();
        int int22 = hashMapTestDriver4.size();
        experiment.util.Set set23 = hashMapTestDriver4.entrySet();
        hashMapTestDriver4.clear();
        int int25 = hashMapTestDriver4.size();
        experiment.util.Set set26 = hashMapTestDriver4.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test101");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver7.remove((java.lang.Object) 0);
        hashMapTestDriver7.clear();
        java.lang.Object obj12 = hashMapTestDriver7.remove((java.lang.Object) 100.0f);
        java.lang.Object obj14 = hashMapTestDriver7.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        java.lang.Object obj19 = hashMapTestDriver15.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection20 = hashMapTestDriver15.values();
        java.lang.Object obj21 = hashMapTestDriver7.get((java.lang.Object) collection20);
        hashMapTestDriver7.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) 0);
        experiment.util.Collection collection26 = hashMapTestDriver23.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) 0);
        hashMapTestDriver27.clear();
        java.lang.Object obj32 = hashMapTestDriver27.remove((java.lang.Object) 100.0f);
        java.lang.Object obj34 = hashMapTestDriver27.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        java.lang.Object obj39 = hashMapTestDriver35.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection40 = hashMapTestDriver35.values();
        java.lang.Object obj41 = hashMapTestDriver27.get((java.lang.Object) collection40);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set43 = hashMapTestDriver42.keySet();
        int int44 = hashMapTestDriver42.size();
        hashMapTestDriver42.clear();
        java.lang.Object obj47 = hashMapTestDriver27.put((java.lang.Object) hashMapTestDriver42, (java.lang.Object) (-1L));
        int int48 = hashMapTestDriver42.size();
        java.lang.Object obj49 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver23, (java.lang.Object) hashMapTestDriver42);
        boolean boolean50 = hashMapTestDriver23.isEmpty();
        experiment.util.Set set51 = hashMapTestDriver23.keySet();
        experiment.util.Collection collection52 = hashMapTestDriver23.values();
        java.lang.Object obj53 = hashMapTestDriver0.remove((java.lang.Object) collection52);
        java.lang.Object obj54 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = hashMapTestDriver0.containsKey(obj54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test102");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) false);
        experiment.util.Set set16 = hashMapTestDriver4.entrySet();
        boolean boolean17 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        experiment.util.Set set21 = hashMapTestDriver4.keySet();
        int int22 = hashMapTestDriver4.size();
        experiment.util.Set set23 = hashMapTestDriver4.entrySet();
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver25.clear();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        boolean boolean28 = hashMapTestDriver25.isEmpty();
        experiment.util.Set set29 = hashMapTestDriver25.entrySet();
        hashMapTestDriver25.clear();
        java.lang.Object obj32 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver25, (java.lang.Object) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass33 = obj32.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test103");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass9 = set8.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test104");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        int int37 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        java.lang.Object obj40 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) (-1L));
        int int41 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver35);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.keySet();
        java.lang.Object obj47 = hashMapTestDriver43.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj49 = hashMapTestDriver43.get((java.lang.Object) 0.0d);
        boolean boolean51 = hashMapTestDriver43.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection52 = hashMapTestDriver43.values();
        hashMapTestDriver43.clear();
        experiment.util.Collection collection54 = hashMapTestDriver43.values();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj57 = hashMapTestDriver55.remove((java.lang.Object) 0);
        experiment.util.Collection collection58 = hashMapTestDriver55.values();
        java.lang.Object obj60 = hashMapTestDriver55.get((java.lang.Object) 1L);
        java.lang.Object obj61 = hashMapTestDriver43.get((java.lang.Object) hashMapTestDriver55);
        java.lang.Object obj62 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver55);
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver63.clear();
        experiment.util.Set set65 = hashMapTestDriver63.entrySet();
        boolean boolean66 = hashMapTestDriver63.isEmpty();
        experiment.util.Set set67 = hashMapTestDriver63.keySet();
        boolean boolean68 = hashMapTestDriver63.isEmpty();
        experiment.util.Collection collection69 = hashMapTestDriver63.values();
        java.lang.Object obj70 = hashMapTestDriver16.get((java.lang.Object) collection69);
        int int71 = hashMapTestDriver16.size();
        boolean boolean72 = hashMapTestDriver16.isEmpty();
        boolean boolean73 = hashMapTestDriver16.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test105");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj3 = hashMapTestDriver0.get((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set9 = hashMapTestDriver4.entrySet();
        experiment.util.Set set10 = hashMapTestDriver4.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set12 = hashMapTestDriver11.keySet();
        int int13 = hashMapTestDriver11.size();
        experiment.util.Set set14 = hashMapTestDriver11.keySet();
        java.lang.Object obj15 = hashMapTestDriver4.get((java.lang.Object) hashMapTestDriver11);
        hashMapTestDriver11.clear();
        boolean boolean17 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj18 = hashMapTestDriver0.remove((java.lang.Object) boolean17);
        int int19 = hashMapTestDriver0.size();
        java.lang.Class<?> wildcardClass20 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test106");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        int int2 = hashMapTestDriver0.size();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) 0);
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver15.remove((java.lang.Object) 100.0f);
        java.lang.Object obj22 = hashMapTestDriver15.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.keySet();
        java.lang.Object obj27 = hashMapTestDriver23.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection28 = hashMapTestDriver23.values();
        java.lang.Object obj29 = hashMapTestDriver15.get((java.lang.Object) collection28);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set31 = hashMapTestDriver30.keySet();
        int int32 = hashMapTestDriver30.size();
        hashMapTestDriver30.clear();
        java.lang.Object obj35 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) (-1L));
        java.lang.Object obj36 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) (-1L));
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.keySet();
        java.lang.Object obj42 = hashMapTestDriver38.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj44 = hashMapTestDriver38.get((java.lang.Object) 0.0d);
        boolean boolean46 = hashMapTestDriver38.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection47 = hashMapTestDriver38.values();
        hashMapTestDriver38.clear();
        java.lang.Object obj50 = hashMapTestDriver38.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set52 = hashMapTestDriver51.keySet();
        java.lang.Object obj55 = hashMapTestDriver51.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj57 = hashMapTestDriver51.get((java.lang.Object) 0.0d);
        boolean boolean59 = hashMapTestDriver51.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection60 = hashMapTestDriver51.values();
        hashMapTestDriver51.clear();
        java.lang.Object obj64 = hashMapTestDriver51.put((java.lang.Object) (-1.0f), (java.lang.Object) 1.0f);
        boolean boolean65 = hashMapTestDriver38.containsKey((java.lang.Object) 1.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver66.clear();
        java.lang.Object obj68 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver38, (java.lang.Object) hashMapTestDriver66);
        int int69 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test107");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver22.clear();
        experiment.util.Set set24 = hashMapTestDriver22.entrySet();
        boolean boolean25 = hashMapTestDriver22.isEmpty();
        boolean boolean26 = hashMapTestDriver22.isEmpty();
        experiment.util.Collection collection27 = hashMapTestDriver22.values();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver28.remove((java.lang.Object) 0);
        hashMapTestDriver28.clear();
        java.lang.Object obj33 = hashMapTestDriver28.remove((java.lang.Object) 100.0f);
        java.lang.Object obj35 = hashMapTestDriver28.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection36 = hashMapTestDriver28.values();
        java.lang.Object obj37 = hashMapTestDriver22.remove((java.lang.Object) hashMapTestDriver28);
        boolean boolean38 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver22);
        java.lang.Object obj39 = hashMapTestDriver0.remove((java.lang.Object) boolean38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass40 = obj39.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test108");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.Set set7 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.remove((java.lang.Object) 0);
        experiment.util.Collection collection11 = hashMapTestDriver8.values();
        boolean boolean12 = hashMapTestDriver0.containsKey((java.lang.Object) collection11);
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test109");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Set set9 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj12 = hashMapTestDriver10.remove((java.lang.Object) 0);
        hashMapTestDriver10.clear();
        java.lang.Object obj15 = hashMapTestDriver10.remove((java.lang.Object) 100.0f);
        java.lang.Object obj17 = hashMapTestDriver10.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.keySet();
        java.lang.Object obj22 = hashMapTestDriver18.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection23 = hashMapTestDriver18.values();
        java.lang.Object obj24 = hashMapTestDriver10.get((java.lang.Object) collection23);
        hashMapTestDriver10.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.remove((java.lang.Object) 0);
        experiment.util.Collection collection29 = hashMapTestDriver26.values();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.remove((java.lang.Object) 0);
        hashMapTestDriver30.clear();
        java.lang.Object obj35 = hashMapTestDriver30.remove((java.lang.Object) 100.0f);
        java.lang.Object obj37 = hashMapTestDriver30.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.keySet();
        java.lang.Object obj42 = hashMapTestDriver38.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection43 = hashMapTestDriver38.values();
        java.lang.Object obj44 = hashMapTestDriver30.get((java.lang.Object) collection43);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set46 = hashMapTestDriver45.keySet();
        int int47 = hashMapTestDriver45.size();
        hashMapTestDriver45.clear();
        java.lang.Object obj50 = hashMapTestDriver30.put((java.lang.Object) hashMapTestDriver45, (java.lang.Object) (-1L));
        int int51 = hashMapTestDriver45.size();
        java.lang.Object obj52 = hashMapTestDriver10.put((java.lang.Object) hashMapTestDriver26, (java.lang.Object) hashMapTestDriver45);
        boolean boolean53 = hashMapTestDriver26.isEmpty();
        experiment.util.Set set54 = hashMapTestDriver26.keySet();
        experiment.util.Collection collection55 = hashMapTestDriver26.values();
        java.lang.Object obj56 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver26);
        experiment.util.Collection collection57 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver58.clear();
        experiment.util.Set set60 = hashMapTestDriver58.entrySet();
        boolean boolean61 = hashMapTestDriver58.isEmpty();
        experiment.util.Set set62 = hashMapTestDriver58.keySet();
        boolean boolean63 = hashMapTestDriver58.isEmpty();
        experiment.util.Set set64 = hashMapTestDriver58.entrySet();
        boolean boolean65 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver58);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test110");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj12 = hashMapTestDriver10.remove((java.lang.Object) 0);
        hashMapTestDriver10.clear();
        java.lang.Object obj15 = hashMapTestDriver10.remove((java.lang.Object) 100.0f);
        java.lang.Object obj17 = hashMapTestDriver10.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.keySet();
        java.lang.Object obj22 = hashMapTestDriver18.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection23 = hashMapTestDriver18.values();
        java.lang.Object obj24 = hashMapTestDriver10.get((java.lang.Object) collection23);
        int int25 = hashMapTestDriver10.size();
        experiment.util.Set set26 = hashMapTestDriver10.keySet();
        experiment.util.Set set27 = hashMapTestDriver10.entrySet();
        java.lang.Object obj29 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver10, (java.lang.Object) (byte) 0);
        experiment.util.Collection collection30 = hashMapTestDriver10.values();
        hashMapTestDriver10.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test111");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        int int2 = hashMapTestDriver0.size();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) 0);
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver15.remove((java.lang.Object) 100.0f);
        java.lang.Object obj22 = hashMapTestDriver15.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.keySet();
        java.lang.Object obj27 = hashMapTestDriver23.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection28 = hashMapTestDriver23.values();
        java.lang.Object obj29 = hashMapTestDriver15.get((java.lang.Object) collection28);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set31 = hashMapTestDriver30.keySet();
        int int32 = hashMapTestDriver30.size();
        hashMapTestDriver30.clear();
        java.lang.Object obj35 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) (-1L));
        java.lang.Object obj36 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) (-1L));
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.keySet();
        java.lang.Object obj42 = hashMapTestDriver38.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj44 = hashMapTestDriver38.get((java.lang.Object) 0.0d);
        boolean boolean46 = hashMapTestDriver38.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection47 = hashMapTestDriver38.values();
        hashMapTestDriver38.clear();
        java.lang.Object obj50 = hashMapTestDriver38.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set52 = hashMapTestDriver51.keySet();
        java.lang.Object obj55 = hashMapTestDriver51.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj57 = hashMapTestDriver51.get((java.lang.Object) 0.0d);
        boolean boolean59 = hashMapTestDriver51.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection60 = hashMapTestDriver51.values();
        hashMapTestDriver51.clear();
        java.lang.Object obj64 = hashMapTestDriver51.put((java.lang.Object) (-1.0f), (java.lang.Object) 1.0f);
        boolean boolean65 = hashMapTestDriver38.containsKey((java.lang.Object) 1.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver66.clear();
        java.lang.Object obj68 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver38, (java.lang.Object) hashMapTestDriver66);
        experiment.util.HashMapTestDriver hashMapTestDriver69 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj71 = hashMapTestDriver69.remove((java.lang.Object) 0);
        experiment.util.Collection collection72 = hashMapTestDriver69.values();
        java.lang.Object obj74 = hashMapTestDriver69.get((java.lang.Object) 1L);
        int int75 = hashMapTestDriver69.size();
        experiment.util.Set set76 = hashMapTestDriver69.entrySet();
        java.lang.Object obj77 = hashMapTestDriver66.get((java.lang.Object) set76);
        boolean boolean78 = hashMapTestDriver66.isEmpty();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test112");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj14 = hashMapTestDriver8.get((java.lang.Object) 0.0d);
        boolean boolean16 = hashMapTestDriver8.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection17 = hashMapTestDriver8.values();
        java.lang.Object obj19 = hashMapTestDriver8.remove((java.lang.Object) false);
        experiment.util.Set set20 = hashMapTestDriver8.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) 0);
        hashMapTestDriver21.clear();
        java.lang.Object obj26 = hashMapTestDriver21.remove((java.lang.Object) 100.0f);
        java.lang.Object obj28 = hashMapTestDriver21.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.keySet();
        java.lang.Object obj33 = hashMapTestDriver29.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection34 = hashMapTestDriver29.values();
        java.lang.Object obj35 = hashMapTestDriver21.get((java.lang.Object) collection34);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set37 = hashMapTestDriver36.keySet();
        int int38 = hashMapTestDriver36.size();
        hashMapTestDriver36.clear();
        java.lang.Object obj41 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver36, (java.lang.Object) (-1L));
        experiment.util.Collection collection42 = hashMapTestDriver21.values();
        boolean boolean43 = hashMapTestDriver8.containsKey((java.lang.Object) collection42);
        java.lang.Object obj44 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.remove((java.lang.Object) 0);
        java.lang.Object obj50 = hashMapTestDriver45.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        boolean boolean52 = hashMapTestDriver45.containsKey((java.lang.Object) true);
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver53.clear();
        experiment.util.Set set55 = hashMapTestDriver53.entrySet();
        boolean boolean56 = hashMapTestDriver53.isEmpty();
        boolean boolean57 = hashMapTestDriver53.isEmpty();
        java.lang.Object obj58 = hashMapTestDriver8.put((java.lang.Object) true, (java.lang.Object) hashMapTestDriver53);
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj61 = hashMapTestDriver59.remove((java.lang.Object) 0);
        hashMapTestDriver59.clear();
        java.lang.Object obj64 = hashMapTestDriver59.remove((java.lang.Object) 100.0f);
        java.lang.Object obj66 = hashMapTestDriver59.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection67 = hashMapTestDriver59.values();
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set69 = hashMapTestDriver68.keySet();
        java.lang.Object obj72 = hashMapTestDriver68.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver73 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver73.clear();
        experiment.util.Set set75 = hashMapTestDriver73.entrySet();
        boolean boolean76 = hashMapTestDriver73.isEmpty();
        boolean boolean77 = hashMapTestDriver73.isEmpty();
        experiment.util.Collection collection78 = hashMapTestDriver73.values();
        java.lang.Object obj79 = hashMapTestDriver59.put((java.lang.Object) hashMapTestDriver68, (java.lang.Object) hashMapTestDriver73);
        hashMapTestDriver59.clear();
        boolean boolean81 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver59);
        experiment.util.HashMapTestDriver hashMapTestDriver82 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj84 = hashMapTestDriver82.remove((java.lang.Object) 0);
        hashMapTestDriver82.clear();
        java.lang.Object obj87 = hashMapTestDriver82.remove((java.lang.Object) 100.0f);
        java.lang.Object obj89 = hashMapTestDriver82.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection90 = hashMapTestDriver82.values();
        java.lang.Object obj91 = hashMapTestDriver8.remove((java.lang.Object) hashMapTestDriver82);
        experiment.util.Collection collection92 = hashMapTestDriver82.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(collection92);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test113");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        boolean boolean4 = hashMapTestDriver0.isEmpty();
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass7 = set6.getClass();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test114");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        int int17 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) (-1L));
        boolean boolean22 = hashMapTestDriver15.containsKey((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) 0);
        experiment.util.Collection collection26 = hashMapTestDriver23.values();
        boolean boolean27 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver23);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver28.remove((java.lang.Object) 0);
        hashMapTestDriver28.clear();
        java.lang.Object obj33 = hashMapTestDriver28.remove((java.lang.Object) 100.0f);
        java.lang.Object obj35 = hashMapTestDriver28.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection36 = hashMapTestDriver28.values();
        boolean boolean37 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver28);
        hashMapTestDriver28.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test115");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        int int2 = hashMapTestDriver0.size();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) 0);
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver15.remove((java.lang.Object) 100.0f);
        java.lang.Object obj22 = hashMapTestDriver15.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.keySet();
        java.lang.Object obj27 = hashMapTestDriver23.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection28 = hashMapTestDriver23.values();
        java.lang.Object obj29 = hashMapTestDriver15.get((java.lang.Object) collection28);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set31 = hashMapTestDriver30.keySet();
        int int32 = hashMapTestDriver30.size();
        hashMapTestDriver30.clear();
        java.lang.Object obj35 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) (-1L));
        java.lang.Object obj36 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) (-1L));
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.keySet();
        java.lang.Object obj42 = hashMapTestDriver38.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj44 = hashMapTestDriver38.get((java.lang.Object) 0.0d);
        boolean boolean46 = hashMapTestDriver38.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection47 = hashMapTestDriver38.values();
        hashMapTestDriver38.clear();
        java.lang.Object obj50 = hashMapTestDriver38.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set52 = hashMapTestDriver51.keySet();
        java.lang.Object obj55 = hashMapTestDriver51.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj57 = hashMapTestDriver51.get((java.lang.Object) 0.0d);
        boolean boolean59 = hashMapTestDriver51.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection60 = hashMapTestDriver51.values();
        hashMapTestDriver51.clear();
        java.lang.Object obj64 = hashMapTestDriver51.put((java.lang.Object) (-1.0f), (java.lang.Object) 1.0f);
        boolean boolean65 = hashMapTestDriver38.containsKey((java.lang.Object) 1.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver66.clear();
        java.lang.Object obj68 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver38, (java.lang.Object) hashMapTestDriver66);
        experiment.util.HashMapTestDriver hashMapTestDriver69 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj71 = hashMapTestDriver69.remove((java.lang.Object) 0);
        experiment.util.Collection collection72 = hashMapTestDriver69.values();
        java.lang.Object obj74 = hashMapTestDriver69.get((java.lang.Object) 1L);
        int int75 = hashMapTestDriver69.size();
        experiment.util.Set set76 = hashMapTestDriver69.entrySet();
        java.lang.Object obj77 = hashMapTestDriver66.get((java.lang.Object) set76);
        java.lang.Class<?> wildcardClass78 = hashMapTestDriver66.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test116");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        int int15 = hashMapTestDriver0.size();
        boolean boolean16 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test117");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) false);
        experiment.util.Set set16 = hashMapTestDriver4.entrySet();
        boolean boolean17 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) 0);
        hashMapTestDriver21.clear();
        int int25 = hashMapTestDriver21.size();
        experiment.util.Set set26 = hashMapTestDriver21.keySet();
        int int27 = hashMapTestDriver21.size();
        java.lang.Object obj28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = hashMapTestDriver4.put((java.lang.Object) int27, obj28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test118");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver2.clear();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        boolean boolean5 = hashMapTestDriver2.isEmpty();
        boolean boolean6 = hashMapTestDriver2.isEmpty();
        experiment.util.Collection collection7 = hashMapTestDriver2.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.remove((java.lang.Object) 0);
        hashMapTestDriver8.clear();
        java.lang.Object obj13 = hashMapTestDriver8.remove((java.lang.Object) 100.0f);
        java.lang.Object obj15 = hashMapTestDriver8.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection16 = hashMapTestDriver8.values();
        java.lang.Object obj17 = hashMapTestDriver2.remove((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj18 = hashMapTestDriver0.put((java.lang.Object) (-1.0f), (java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver19.clear();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver22.clear();
        experiment.util.Set set24 = hashMapTestDriver22.entrySet();
        boolean boolean25 = hashMapTestDriver22.isEmpty();
        boolean boolean26 = hashMapTestDriver22.isEmpty();
        experiment.util.Collection collection27 = hashMapTestDriver22.values();
        java.lang.Object obj28 = hashMapTestDriver19.get((java.lang.Object) hashMapTestDriver22);
        boolean boolean29 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver22);
        boolean boolean31 = hashMapTestDriver8.containsKey((java.lang.Object) (short) 10);
        experiment.util.Set set32 = hashMapTestDriver8.entrySet();
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test119");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.keySet();
        java.lang.Object obj11 = hashMapTestDriver7.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        int int12 = hashMapTestDriver7.size();
        java.lang.Object obj13 = hashMapTestDriver0.remove((java.lang.Object) int12);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        java.lang.Object obj19 = hashMapTestDriver15.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj21 = hashMapTestDriver15.get((java.lang.Object) 0.0d);
        boolean boolean23 = hashMapTestDriver15.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection24 = hashMapTestDriver15.values();
        hashMapTestDriver15.clear();
        experiment.util.Collection collection26 = hashMapTestDriver15.values();
        boolean boolean27 = hashMapTestDriver15.isEmpty();
        experiment.util.Collection collection28 = hashMapTestDriver15.values();
        hashMapTestDriver15.clear();
        java.lang.Object obj30 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver15);
        hashMapTestDriver15.clear();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test120");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        experiment.util.Collection collection10 = hashMapTestDriver0.values();
        int int11 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test121");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass2 = set1.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test122");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver22.clear();
        experiment.util.Set set24 = hashMapTestDriver22.entrySet();
        boolean boolean25 = hashMapTestDriver22.isEmpty();
        boolean boolean26 = hashMapTestDriver22.isEmpty();
        experiment.util.Collection collection27 = hashMapTestDriver22.values();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver28.remove((java.lang.Object) 0);
        hashMapTestDriver28.clear();
        java.lang.Object obj33 = hashMapTestDriver28.remove((java.lang.Object) 100.0f);
        java.lang.Object obj35 = hashMapTestDriver28.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection36 = hashMapTestDriver28.values();
        java.lang.Object obj37 = hashMapTestDriver22.remove((java.lang.Object) hashMapTestDriver28);
        boolean boolean38 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver22);
        java.lang.Object obj39 = hashMapTestDriver0.remove((java.lang.Object) boolean38);
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj42 = hashMapTestDriver40.remove((java.lang.Object) 0);
        hashMapTestDriver40.clear();
        java.lang.Object obj45 = hashMapTestDriver40.remove((java.lang.Object) 100.0f);
        java.lang.Object obj47 = hashMapTestDriver40.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection48 = hashMapTestDriver40.values();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set50 = hashMapTestDriver49.keySet();
        java.lang.Object obj53 = hashMapTestDriver49.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver54.clear();
        experiment.util.Set set56 = hashMapTestDriver54.entrySet();
        boolean boolean57 = hashMapTestDriver54.isEmpty();
        boolean boolean58 = hashMapTestDriver54.isEmpty();
        experiment.util.Collection collection59 = hashMapTestDriver54.values();
        java.lang.Object obj60 = hashMapTestDriver40.put((java.lang.Object) hashMapTestDriver49, (java.lang.Object) hashMapTestDriver54);
        experiment.util.Set set61 = hashMapTestDriver54.entrySet();
        java.lang.Object obj62 = hashMapTestDriver0.get((java.lang.Object) set61);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test123");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj3 = hashMapTestDriver0.get((java.lang.Object) (byte) 0);
        boolean boolean5 = hashMapTestDriver0.containsKey((java.lang.Object) false);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set7 = hashMapTestDriver6.keySet();
        int int8 = hashMapTestDriver6.size();
        experiment.util.Set set9 = hashMapTestDriver6.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.keySet();
        java.lang.Object obj14 = hashMapTestDriver10.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj16 = hashMapTestDriver10.get((java.lang.Object) 0.0d);
        boolean boolean18 = hashMapTestDriver10.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection19 = hashMapTestDriver10.values();
        hashMapTestDriver10.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) 0);
        hashMapTestDriver21.clear();
        java.lang.Object obj26 = hashMapTestDriver21.remove((java.lang.Object) 100.0f);
        java.lang.Object obj28 = hashMapTestDriver21.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.keySet();
        java.lang.Object obj33 = hashMapTestDriver29.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection34 = hashMapTestDriver29.values();
        java.lang.Object obj35 = hashMapTestDriver21.get((java.lang.Object) collection34);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set37 = hashMapTestDriver36.keySet();
        int int38 = hashMapTestDriver36.size();
        hashMapTestDriver36.clear();
        java.lang.Object obj41 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver36, (java.lang.Object) (-1L));
        java.lang.Object obj42 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver10, (java.lang.Object) (-1L));
        hashMapTestDriver6.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set45 = hashMapTestDriver44.keySet();
        java.lang.Object obj48 = hashMapTestDriver44.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj50 = hashMapTestDriver44.get((java.lang.Object) 0.0d);
        boolean boolean52 = hashMapTestDriver44.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection53 = hashMapTestDriver44.values();
        hashMapTestDriver44.clear();
        java.lang.Object obj56 = hashMapTestDriver44.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set58 = hashMapTestDriver57.keySet();
        java.lang.Object obj61 = hashMapTestDriver57.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj63 = hashMapTestDriver57.get((java.lang.Object) 0.0d);
        boolean boolean65 = hashMapTestDriver57.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection66 = hashMapTestDriver57.values();
        hashMapTestDriver57.clear();
        java.lang.Object obj70 = hashMapTestDriver57.put((java.lang.Object) (-1.0f), (java.lang.Object) 1.0f);
        boolean boolean71 = hashMapTestDriver44.containsKey((java.lang.Object) 1.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver72.clear();
        java.lang.Object obj74 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver44, (java.lang.Object) hashMapTestDriver72);
        experiment.util.HashMapTestDriver hashMapTestDriver76 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set77 = hashMapTestDriver76.keySet();
        java.lang.Object obj80 = hashMapTestDriver76.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set81 = hashMapTestDriver76.entrySet();
        java.lang.Object obj82 = hashMapTestDriver44.put((java.lang.Object) '#', (java.lang.Object) set81);
        java.lang.Object obj84 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver44, (java.lang.Object) false);
        experiment.util.Set set85 = hashMapTestDriver44.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(set85);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test124");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        boolean boolean7 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver8.clear();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver11.clear();
        experiment.util.Set set13 = hashMapTestDriver11.entrySet();
        boolean boolean14 = hashMapTestDriver11.isEmpty();
        boolean boolean15 = hashMapTestDriver11.isEmpty();
        experiment.util.Collection collection16 = hashMapTestDriver11.values();
        java.lang.Object obj17 = hashMapTestDriver8.get((java.lang.Object) hashMapTestDriver11);
        java.lang.Class<?> wildcardClass18 = hashMapTestDriver8.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj21 = hashMapTestDriver19.remove((java.lang.Object) 0);
        hashMapTestDriver19.clear();
        java.lang.Object obj24 = hashMapTestDriver19.remove((java.lang.Object) 100.0f);
        java.lang.Object obj26 = hashMapTestDriver19.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set28 = hashMapTestDriver27.keySet();
        java.lang.Object obj31 = hashMapTestDriver27.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj33 = hashMapTestDriver27.get((java.lang.Object) 0.0d);
        boolean boolean35 = hashMapTestDriver27.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection36 = hashMapTestDriver27.values();
        java.lang.Object obj38 = hashMapTestDriver27.remove((java.lang.Object) false);
        experiment.util.Set set39 = hashMapTestDriver27.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj42 = hashMapTestDriver40.remove((java.lang.Object) 0);
        hashMapTestDriver40.clear();
        java.lang.Object obj45 = hashMapTestDriver40.remove((java.lang.Object) 100.0f);
        java.lang.Object obj47 = hashMapTestDriver40.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set49 = hashMapTestDriver48.keySet();
        java.lang.Object obj52 = hashMapTestDriver48.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection53 = hashMapTestDriver48.values();
        java.lang.Object obj54 = hashMapTestDriver40.get((java.lang.Object) collection53);
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set56 = hashMapTestDriver55.keySet();
        int int57 = hashMapTestDriver55.size();
        hashMapTestDriver55.clear();
        java.lang.Object obj60 = hashMapTestDriver40.put((java.lang.Object) hashMapTestDriver55, (java.lang.Object) (-1L));
        experiment.util.Collection collection61 = hashMapTestDriver40.values();
        boolean boolean62 = hashMapTestDriver27.containsKey((java.lang.Object) collection61);
        java.lang.Object obj63 = hashMapTestDriver19.remove((java.lang.Object) hashMapTestDriver27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver8, obj63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test125");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) false);
        experiment.util.Set set16 = hashMapTestDriver4.entrySet();
        boolean boolean17 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        experiment.util.Set set21 = hashMapTestDriver4.keySet();
        experiment.util.Collection collection22 = hashMapTestDriver4.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test126");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.keySet();
        java.lang.Object obj13 = hashMapTestDriver9.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver14.clear();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        boolean boolean17 = hashMapTestDriver14.isEmpty();
        boolean boolean18 = hashMapTestDriver14.isEmpty();
        experiment.util.Collection collection19 = hashMapTestDriver14.values();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver14);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver21.clear();
        experiment.util.Set set23 = hashMapTestDriver21.entrySet();
        boolean boolean24 = hashMapTestDriver21.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.keySet();
        java.lang.Object obj29 = hashMapTestDriver25.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj31 = hashMapTestDriver25.get((java.lang.Object) 0.0d);
        boolean boolean33 = hashMapTestDriver25.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection34 = hashMapTestDriver25.values();
        hashMapTestDriver25.clear();
        experiment.util.Collection collection36 = hashMapTestDriver25.values();
        java.lang.Object obj37 = hashMapTestDriver21.remove((java.lang.Object) collection36);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver38.clear();
        experiment.util.Set set40 = hashMapTestDriver38.entrySet();
        boolean boolean41 = hashMapTestDriver38.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set43 = hashMapTestDriver42.keySet();
        java.lang.Object obj46 = hashMapTestDriver42.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj48 = hashMapTestDriver42.get((java.lang.Object) 0.0d);
        boolean boolean50 = hashMapTestDriver42.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection51 = hashMapTestDriver42.values();
        hashMapTestDriver42.clear();
        experiment.util.Collection collection53 = hashMapTestDriver42.values();
        java.lang.Object obj54 = hashMapTestDriver38.remove((java.lang.Object) collection53);
        java.lang.Object obj55 = hashMapTestDriver21.get((java.lang.Object) collection53);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean56 = hashMapTestDriver0.containsKey(obj55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test127");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        int int2 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj7 = hashMapTestDriver4.get((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set13 = hashMapTestDriver8.entrySet();
        experiment.util.Set set14 = hashMapTestDriver8.entrySet();
        java.lang.Object obj15 = hashMapTestDriver0.put((java.lang.Object) (byte) 0, (java.lang.Object) hashMapTestDriver8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = obj15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test128");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        boolean boolean14 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) 0);
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver21.clear();
        experiment.util.Set set23 = hashMapTestDriver21.entrySet();
        boolean boolean24 = hashMapTestDriver21.isEmpty();
        boolean boolean25 = hashMapTestDriver21.isEmpty();
        experiment.util.Collection collection26 = hashMapTestDriver21.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) 0);
        hashMapTestDriver27.clear();
        java.lang.Object obj32 = hashMapTestDriver27.remove((java.lang.Object) 100.0f);
        java.lang.Object obj34 = hashMapTestDriver27.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection35 = hashMapTestDriver27.values();
        java.lang.Object obj36 = hashMapTestDriver21.remove((java.lang.Object) hashMapTestDriver27);
        boolean boolean37 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver21);
        boolean boolean38 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver21);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set40 = hashMapTestDriver39.keySet();
        java.lang.Object obj43 = hashMapTestDriver39.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj45 = hashMapTestDriver39.get((java.lang.Object) 0.0d);
        boolean boolean47 = hashMapTestDriver39.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection48 = hashMapTestDriver39.values();
        hashMapTestDriver39.clear();
        experiment.util.Collection collection50 = hashMapTestDriver39.values();
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj53 = hashMapTestDriver51.remove((java.lang.Object) 0);
        experiment.util.Collection collection54 = hashMapTestDriver51.values();
        java.lang.Object obj56 = hashMapTestDriver51.get((java.lang.Object) 1L);
        java.lang.Object obj57 = hashMapTestDriver39.get((java.lang.Object) hashMapTestDriver51);
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj60 = hashMapTestDriver58.remove((java.lang.Object) 0);
        java.lang.Object obj63 = hashMapTestDriver58.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        boolean boolean65 = hashMapTestDriver58.containsKey((java.lang.Object) true);
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set67 = hashMapTestDriver66.keySet();
        java.lang.Object obj70 = hashMapTestDriver66.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj72 = hashMapTestDriver66.get((java.lang.Object) 0.0d);
        boolean boolean74 = hashMapTestDriver66.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection75 = hashMapTestDriver66.values();
        java.lang.Object obj77 = hashMapTestDriver66.remove((java.lang.Object) false);
        experiment.util.Set set78 = hashMapTestDriver66.entrySet();
        java.lang.Object obj79 = hashMapTestDriver58.remove((java.lang.Object) hashMapTestDriver66);
        java.lang.Object obj80 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver51, (java.lang.Object) hashMapTestDriver58);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test129");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        boolean boolean10 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set12 = hashMapTestDriver11.keySet();
        java.lang.Object obj15 = hashMapTestDriver11.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj17 = hashMapTestDriver11.get((java.lang.Object) 0.0d);
        boolean boolean19 = hashMapTestDriver11.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection20 = hashMapTestDriver11.values();
        java.lang.Object obj22 = hashMapTestDriver11.remove((java.lang.Object) false);
        experiment.util.Set set23 = hashMapTestDriver11.entrySet();
        java.lang.Class<?> wildcardClass24 = hashMapTestDriver11.getClass();
        boolean boolean25 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver11);
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver26.clear();
        experiment.util.Set set28 = hashMapTestDriver26.entrySet();
        java.lang.Object obj29 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver26);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.remove((java.lang.Object) 0);
        java.lang.Object obj35 = hashMapTestDriver30.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver36.clear();
        experiment.util.Set set38 = hashMapTestDriver36.entrySet();
        boolean boolean39 = hashMapTestDriver36.isEmpty();
        boolean boolean40 = hashMapTestDriver36.isEmpty();
        experiment.util.Collection collection41 = hashMapTestDriver36.values();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj44 = hashMapTestDriver42.remove((java.lang.Object) 0);
        hashMapTestDriver42.clear();
        java.lang.Object obj47 = hashMapTestDriver42.remove((java.lang.Object) 100.0f);
        java.lang.Object obj49 = hashMapTestDriver42.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection50 = hashMapTestDriver42.values();
        java.lang.Object obj51 = hashMapTestDriver36.remove((java.lang.Object) hashMapTestDriver42);
        boolean boolean52 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver36);
        experiment.util.Collection collection53 = hashMapTestDriver36.values();
        experiment.util.Set set54 = hashMapTestDriver36.entrySet();
        boolean boolean55 = hashMapTestDriver0.containsKey((java.lang.Object) set54);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test130");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test131");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        boolean boolean14 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) 0);
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver21.clear();
        experiment.util.Set set23 = hashMapTestDriver21.entrySet();
        boolean boolean24 = hashMapTestDriver21.isEmpty();
        boolean boolean25 = hashMapTestDriver21.isEmpty();
        experiment.util.Collection collection26 = hashMapTestDriver21.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) 0);
        hashMapTestDriver27.clear();
        java.lang.Object obj32 = hashMapTestDriver27.remove((java.lang.Object) 100.0f);
        java.lang.Object obj34 = hashMapTestDriver27.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection35 = hashMapTestDriver27.values();
        java.lang.Object obj36 = hashMapTestDriver21.remove((java.lang.Object) hashMapTestDriver27);
        boolean boolean37 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver21);
        boolean boolean38 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver21);
        int int39 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.keySet();
        java.lang.Object obj44 = hashMapTestDriver40.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        int int45 = hashMapTestDriver40.size();
        boolean boolean46 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver40);
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set48 = hashMapTestDriver47.keySet();
        java.lang.Object obj51 = hashMapTestDriver47.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        int int52 = hashMapTestDriver47.size();
        java.lang.Object obj53 = hashMapTestDriver0.remove((java.lang.Object) int52);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test132");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test133");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 1L);
        int int6 = hashMapTestDriver0.size();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test134");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.Collection collection11 = hashMapTestDriver0.values();
        experiment.util.Collection collection12 = hashMapTestDriver0.values();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test135");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        int int17 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) (-1L));
        boolean boolean22 = hashMapTestDriver15.containsKey((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) 0);
        experiment.util.Collection collection26 = hashMapTestDriver23.values();
        boolean boolean27 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver23);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver28.remove((java.lang.Object) 0);
        hashMapTestDriver28.clear();
        java.lang.Object obj33 = hashMapTestDriver28.remove((java.lang.Object) 100.0f);
        java.lang.Object obj35 = hashMapTestDriver28.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection36 = hashMapTestDriver28.values();
        boolean boolean37 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver28);
        boolean boolean38 = hashMapTestDriver28.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test136");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass7 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test137");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.keySet();
        java.lang.Object obj13 = hashMapTestDriver9.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver14.clear();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        boolean boolean17 = hashMapTestDriver14.isEmpty();
        boolean boolean18 = hashMapTestDriver14.isEmpty();
        experiment.util.Collection collection19 = hashMapTestDriver14.values();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver14);
        hashMapTestDriver0.clear();
        boolean boolean22 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test138");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        int int17 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) (-1L));
        boolean boolean22 = hashMapTestDriver15.containsKey((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) 0);
        experiment.util.Collection collection26 = hashMapTestDriver23.values();
        boolean boolean27 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver23);
        experiment.util.Collection collection28 = hashMapTestDriver15.values();
        int int29 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test139");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        int int37 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        java.lang.Object obj40 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) (-1L));
        int int41 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver35);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.keySet();
        java.lang.Object obj47 = hashMapTestDriver43.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj49 = hashMapTestDriver43.get((java.lang.Object) 0.0d);
        boolean boolean51 = hashMapTestDriver43.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection52 = hashMapTestDriver43.values();
        hashMapTestDriver43.clear();
        experiment.util.Collection collection54 = hashMapTestDriver43.values();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj57 = hashMapTestDriver55.remove((java.lang.Object) 0);
        experiment.util.Collection collection58 = hashMapTestDriver55.values();
        java.lang.Object obj60 = hashMapTestDriver55.get((java.lang.Object) 1L);
        java.lang.Object obj61 = hashMapTestDriver43.get((java.lang.Object) hashMapTestDriver55);
        java.lang.Object obj62 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver55);
        int int63 = hashMapTestDriver16.size();
        int int64 = hashMapTestDriver16.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test140");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        int int5 = hashMapTestDriver0.size();
        int int6 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test141");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set3 = hashMapTestDriver2.keySet();
        java.lang.Object obj6 = hashMapTestDriver2.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj8 = hashMapTestDriver2.get((java.lang.Object) 0.0d);
        boolean boolean10 = hashMapTestDriver2.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection11 = hashMapTestDriver2.values();
        java.lang.Object obj13 = hashMapTestDriver2.remove((java.lang.Object) false);
        experiment.util.Set set14 = hashMapTestDriver2.entrySet();
        java.lang.Object obj16 = hashMapTestDriver2.get((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = hashMapTestDriver0.remove((java.lang.Object) wildcardClass17);
        experiment.util.Collection collection19 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass20 = collection19.getClass();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1) + "'", obj16, (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test142");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        int int37 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        java.lang.Object obj40 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) (-1L));
        int int41 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver35);
        boolean boolean43 = hashMapTestDriver16.isEmpty();
        experiment.util.Set set44 = hashMapTestDriver16.keySet();
        experiment.util.Collection collection45 = hashMapTestDriver16.values();
        int int46 = hashMapTestDriver16.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test143");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        int int37 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        java.lang.Object obj40 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) (-1L));
        int int41 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver35);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.keySet();
        java.lang.Object obj47 = hashMapTestDriver43.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj49 = hashMapTestDriver43.get((java.lang.Object) 0.0d);
        boolean boolean51 = hashMapTestDriver43.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection52 = hashMapTestDriver43.values();
        hashMapTestDriver43.clear();
        experiment.util.Collection collection54 = hashMapTestDriver43.values();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj57 = hashMapTestDriver55.remove((java.lang.Object) 0);
        experiment.util.Collection collection58 = hashMapTestDriver55.values();
        java.lang.Object obj60 = hashMapTestDriver55.get((java.lang.Object) 1L);
        java.lang.Object obj61 = hashMapTestDriver43.get((java.lang.Object) hashMapTestDriver55);
        java.lang.Object obj62 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver55);
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver63.clear();
        experiment.util.Set set65 = hashMapTestDriver63.entrySet();
        boolean boolean66 = hashMapTestDriver63.isEmpty();
        experiment.util.Set set67 = hashMapTestDriver63.keySet();
        boolean boolean68 = hashMapTestDriver63.isEmpty();
        experiment.util.Collection collection69 = hashMapTestDriver63.values();
        java.lang.Object obj70 = hashMapTestDriver16.get((java.lang.Object) collection69);
        int int71 = hashMapTestDriver16.size();
        hashMapTestDriver16.clear();
        experiment.util.Collection collection73 = hashMapTestDriver16.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(collection73);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test144");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj3 = hashMapTestDriver0.get((java.lang.Object) (byte) 0);
        boolean boolean5 = hashMapTestDriver0.containsKey((java.lang.Object) false);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set7 = hashMapTestDriver6.keySet();
        int int8 = hashMapTestDriver6.size();
        experiment.util.Set set9 = hashMapTestDriver6.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.keySet();
        java.lang.Object obj14 = hashMapTestDriver10.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj16 = hashMapTestDriver10.get((java.lang.Object) 0.0d);
        boolean boolean18 = hashMapTestDriver10.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection19 = hashMapTestDriver10.values();
        hashMapTestDriver10.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) 0);
        hashMapTestDriver21.clear();
        java.lang.Object obj26 = hashMapTestDriver21.remove((java.lang.Object) 100.0f);
        java.lang.Object obj28 = hashMapTestDriver21.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.keySet();
        java.lang.Object obj33 = hashMapTestDriver29.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection34 = hashMapTestDriver29.values();
        java.lang.Object obj35 = hashMapTestDriver21.get((java.lang.Object) collection34);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set37 = hashMapTestDriver36.keySet();
        int int38 = hashMapTestDriver36.size();
        hashMapTestDriver36.clear();
        java.lang.Object obj41 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver36, (java.lang.Object) (-1L));
        java.lang.Object obj42 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver10, (java.lang.Object) (-1L));
        hashMapTestDriver6.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set45 = hashMapTestDriver44.keySet();
        java.lang.Object obj48 = hashMapTestDriver44.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj50 = hashMapTestDriver44.get((java.lang.Object) 0.0d);
        boolean boolean52 = hashMapTestDriver44.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection53 = hashMapTestDriver44.values();
        hashMapTestDriver44.clear();
        java.lang.Object obj56 = hashMapTestDriver44.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set58 = hashMapTestDriver57.keySet();
        java.lang.Object obj61 = hashMapTestDriver57.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj63 = hashMapTestDriver57.get((java.lang.Object) 0.0d);
        boolean boolean65 = hashMapTestDriver57.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection66 = hashMapTestDriver57.values();
        hashMapTestDriver57.clear();
        java.lang.Object obj70 = hashMapTestDriver57.put((java.lang.Object) (-1.0f), (java.lang.Object) 1.0f);
        boolean boolean71 = hashMapTestDriver44.containsKey((java.lang.Object) 1.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver72.clear();
        java.lang.Object obj74 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver44, (java.lang.Object) hashMapTestDriver72);
        experiment.util.HashMapTestDriver hashMapTestDriver76 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set77 = hashMapTestDriver76.keySet();
        java.lang.Object obj80 = hashMapTestDriver76.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set81 = hashMapTestDriver76.entrySet();
        java.lang.Object obj82 = hashMapTestDriver44.put((java.lang.Object) '#', (java.lang.Object) set81);
        java.lang.Object obj84 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver44, (java.lang.Object) false);
        hashMapTestDriver44.clear();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test145");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        int int37 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        java.lang.Object obj40 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) (-1L));
        int int41 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver35);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.keySet();
        java.lang.Object obj47 = hashMapTestDriver43.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj49 = hashMapTestDriver43.get((java.lang.Object) 0.0d);
        boolean boolean51 = hashMapTestDriver43.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection52 = hashMapTestDriver43.values();
        hashMapTestDriver43.clear();
        experiment.util.Collection collection54 = hashMapTestDriver43.values();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj57 = hashMapTestDriver55.remove((java.lang.Object) 0);
        experiment.util.Collection collection58 = hashMapTestDriver55.values();
        java.lang.Object obj60 = hashMapTestDriver55.get((java.lang.Object) 1L);
        java.lang.Object obj61 = hashMapTestDriver43.get((java.lang.Object) hashMapTestDriver55);
        java.lang.Object obj62 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver55);
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver63.clear();
        experiment.util.Set set65 = hashMapTestDriver63.entrySet();
        boolean boolean66 = hashMapTestDriver63.isEmpty();
        experiment.util.Set set67 = hashMapTestDriver63.keySet();
        boolean boolean68 = hashMapTestDriver63.isEmpty();
        experiment.util.Collection collection69 = hashMapTestDriver63.values();
        java.lang.Object obj70 = hashMapTestDriver16.get((java.lang.Object) collection69);
        int int71 = hashMapTestDriver16.size();
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj74 = hashMapTestDriver72.remove((java.lang.Object) 0);
        hashMapTestDriver72.clear();
        int int76 = hashMapTestDriver72.size();
        int int77 = hashMapTestDriver72.size();
        java.lang.Object obj79 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver72, (java.lang.Object) (short) 10);
        experiment.util.Collection collection80 = hashMapTestDriver16.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(collection80);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test146");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver7.remove((java.lang.Object) 0);
        hashMapTestDriver7.clear();
        java.lang.Object obj12 = hashMapTestDriver7.remove((java.lang.Object) 100.0f);
        java.lang.Object obj14 = hashMapTestDriver7.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        java.lang.Object obj19 = hashMapTestDriver15.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection20 = hashMapTestDriver15.values();
        java.lang.Object obj21 = hashMapTestDriver7.get((java.lang.Object) collection20);
        hashMapTestDriver7.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) 0);
        experiment.util.Collection collection26 = hashMapTestDriver23.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) 0);
        hashMapTestDriver27.clear();
        java.lang.Object obj32 = hashMapTestDriver27.remove((java.lang.Object) 100.0f);
        java.lang.Object obj34 = hashMapTestDriver27.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        java.lang.Object obj39 = hashMapTestDriver35.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection40 = hashMapTestDriver35.values();
        java.lang.Object obj41 = hashMapTestDriver27.get((java.lang.Object) collection40);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set43 = hashMapTestDriver42.keySet();
        int int44 = hashMapTestDriver42.size();
        hashMapTestDriver42.clear();
        java.lang.Object obj47 = hashMapTestDriver27.put((java.lang.Object) hashMapTestDriver42, (java.lang.Object) (-1L));
        int int48 = hashMapTestDriver42.size();
        java.lang.Object obj49 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver23, (java.lang.Object) hashMapTestDriver42);
        boolean boolean50 = hashMapTestDriver23.isEmpty();
        experiment.util.Set set51 = hashMapTestDriver23.keySet();
        experiment.util.Collection collection52 = hashMapTestDriver23.values();
        java.lang.Object obj53 = hashMapTestDriver0.remove((java.lang.Object) collection52);
        experiment.util.Set set54 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test147");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver6.clear();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        boolean boolean9 = hashMapTestDriver6.isEmpty();
        boolean boolean10 = hashMapTestDriver6.isEmpty();
        experiment.util.Collection collection11 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.remove((java.lang.Object) 0);
        hashMapTestDriver12.clear();
        java.lang.Object obj17 = hashMapTestDriver12.remove((java.lang.Object) 100.0f);
        java.lang.Object obj19 = hashMapTestDriver12.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection20 = hashMapTestDriver12.values();
        java.lang.Object obj21 = hashMapTestDriver6.remove((java.lang.Object) hashMapTestDriver12);
        boolean boolean22 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver6);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) 0);
        experiment.util.Collection collection26 = hashMapTestDriver23.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set28 = hashMapTestDriver27.keySet();
        java.lang.Object obj31 = hashMapTestDriver27.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj33 = hashMapTestDriver27.get((java.lang.Object) 0.0d);
        boolean boolean35 = hashMapTestDriver27.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection36 = hashMapTestDriver27.values();
        java.lang.Object obj38 = hashMapTestDriver27.remove((java.lang.Object) false);
        experiment.util.Set set39 = hashMapTestDriver27.entrySet();
        boolean boolean40 = hashMapTestDriver27.isEmpty();
        java.lang.Object obj42 = hashMapTestDriver27.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj43 = hashMapTestDriver23.get((java.lang.Object) hashMapTestDriver27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = hashMapTestDriver0.get(obj43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test148");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass8 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test149");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        java.lang.Object obj10 = hashMapTestDriver0.remove((java.lang.Object) 10L);
        boolean boolean11 = hashMapTestDriver0.isEmpty();
        boolean boolean12 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test150");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.Collection collection7 = hashMapTestDriver0.values();
        experiment.util.Set set8 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test151");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        int int5 = hashMapTestDriver0.size();
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        int int8 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test152");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set8 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass9 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test153");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        int int9 = hashMapTestDriver0.size();
        experiment.util.Collection collection10 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass11 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test154");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj9 = hashMapTestDriver5.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj11 = hashMapTestDriver5.get((java.lang.Object) 0.0d);
        boolean boolean13 = hashMapTestDriver5.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection14 = hashMapTestDriver5.values();
        hashMapTestDriver5.clear();
        experiment.util.Collection collection16 = hashMapTestDriver5.values();
        java.lang.Object obj17 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = obj17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test155");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) false);
        experiment.util.Set set16 = hashMapTestDriver4.entrySet();
        boolean boolean17 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        experiment.util.Set set21 = hashMapTestDriver4.keySet();
        int int22 = hashMapTestDriver4.size();
        experiment.util.Set set23 = hashMapTestDriver4.entrySet();
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver25.clear();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        boolean boolean28 = hashMapTestDriver25.isEmpty();
        experiment.util.Set set29 = hashMapTestDriver25.entrySet();
        hashMapTestDriver25.clear();
        java.lang.Object obj32 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver25, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver33.clear();
        experiment.util.Set set35 = hashMapTestDriver33.entrySet();
        experiment.util.Set set36 = hashMapTestDriver33.keySet();
        java.lang.Object obj37 = hashMapTestDriver4.get((java.lang.Object) set36);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test156");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        int int37 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        java.lang.Object obj40 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) (-1L));
        int int41 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver35);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.keySet();
        java.lang.Object obj47 = hashMapTestDriver43.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj49 = hashMapTestDriver43.get((java.lang.Object) 0.0d);
        boolean boolean51 = hashMapTestDriver43.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection52 = hashMapTestDriver43.values();
        hashMapTestDriver43.clear();
        experiment.util.Collection collection54 = hashMapTestDriver43.values();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj57 = hashMapTestDriver55.remove((java.lang.Object) 0);
        experiment.util.Collection collection58 = hashMapTestDriver55.values();
        java.lang.Object obj60 = hashMapTestDriver55.get((java.lang.Object) 1L);
        java.lang.Object obj61 = hashMapTestDriver43.get((java.lang.Object) hashMapTestDriver55);
        java.lang.Object obj62 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver55);
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver63.clear();
        experiment.util.Set set65 = hashMapTestDriver63.entrySet();
        boolean boolean66 = hashMapTestDriver63.isEmpty();
        experiment.util.Set set67 = hashMapTestDriver63.keySet();
        boolean boolean68 = hashMapTestDriver63.isEmpty();
        experiment.util.Collection collection69 = hashMapTestDriver63.values();
        java.lang.Object obj70 = hashMapTestDriver16.get((java.lang.Object) collection69);
        int int71 = hashMapTestDriver16.size();
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj74 = hashMapTestDriver72.remove((java.lang.Object) 0);
        hashMapTestDriver72.clear();
        int int76 = hashMapTestDriver72.size();
        int int77 = hashMapTestDriver72.size();
        java.lang.Object obj79 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver72, (java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver80 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set81 = hashMapTestDriver80.keySet();
        java.lang.Object obj84 = hashMapTestDriver80.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj86 = hashMapTestDriver80.get((java.lang.Object) 0.0d);
        boolean boolean88 = hashMapTestDriver80.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection89 = hashMapTestDriver80.values();
        java.lang.Object obj90 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver80);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(collection89);
        org.junit.Assert.assertNull(obj90);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test157");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        java.lang.Object obj12 = hashMapTestDriver0.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.keySet();
        java.lang.Object obj17 = hashMapTestDriver13.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj19 = hashMapTestDriver13.get((java.lang.Object) 0.0d);
        boolean boolean21 = hashMapTestDriver13.containsKey((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj24 = hashMapTestDriver22.remove((java.lang.Object) 0);
        hashMapTestDriver22.clear();
        java.lang.Object obj27 = hashMapTestDriver22.remove((java.lang.Object) 100.0f);
        java.lang.Object obj29 = hashMapTestDriver22.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set31 = hashMapTestDriver30.keySet();
        java.lang.Object obj34 = hashMapTestDriver30.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection35 = hashMapTestDriver30.values();
        java.lang.Object obj36 = hashMapTestDriver22.get((java.lang.Object) collection35);
        int int37 = hashMapTestDriver22.size();
        experiment.util.Set set38 = hashMapTestDriver22.keySet();
        java.lang.Object obj39 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver13, (java.lang.Object) hashMapTestDriver22);
        experiment.util.Set set40 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test158");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set7 = hashMapTestDriver6.keySet();
        java.lang.Object obj10 = hashMapTestDriver6.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj12 = hashMapTestDriver6.get((java.lang.Object) 0.0d);
        boolean boolean14 = hashMapTestDriver6.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection15 = hashMapTestDriver6.values();
        java.lang.Object obj17 = hashMapTestDriver6.remove((java.lang.Object) false);
        experiment.util.Set set18 = hashMapTestDriver6.entrySet();
        boolean boolean19 = hashMapTestDriver6.isEmpty();
        java.lang.Object obj21 = hashMapTestDriver6.get((java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = hashMapTestDriver0.get(obj21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test159");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) false);
        experiment.util.Set set16 = hashMapTestDriver4.entrySet();
        boolean boolean17 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        experiment.util.Set set21 = hashMapTestDriver4.keySet();
        int int22 = hashMapTestDriver4.size();
        experiment.util.Set set23 = hashMapTestDriver4.entrySet();
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver25.clear();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        boolean boolean28 = hashMapTestDriver25.isEmpty();
        experiment.util.Set set29 = hashMapTestDriver25.entrySet();
        hashMapTestDriver25.clear();
        java.lang.Object obj32 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver25, (java.lang.Object) (short) 100);
        experiment.util.Set set33 = hashMapTestDriver25.entrySet();
        boolean boolean34 = hashMapTestDriver25.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test160");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        hashMapTestDriver0.clear();
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = hashMapTestDriver0.values();
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test161");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        int int2 = hashMapTestDriver0.size();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) 0);
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver15.remove((java.lang.Object) 100.0f);
        java.lang.Object obj22 = hashMapTestDriver15.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.keySet();
        java.lang.Object obj27 = hashMapTestDriver23.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection28 = hashMapTestDriver23.values();
        java.lang.Object obj29 = hashMapTestDriver15.get((java.lang.Object) collection28);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set31 = hashMapTestDriver30.keySet();
        int int32 = hashMapTestDriver30.size();
        hashMapTestDriver30.clear();
        java.lang.Object obj35 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) (-1L));
        java.lang.Object obj36 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) (-1L));
        experiment.util.Set set37 = hashMapTestDriver4.entrySet();
        hashMapTestDriver4.clear();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test162");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test163");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        int int37 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        java.lang.Object obj40 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) (-1L));
        int int41 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver35);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.keySet();
        java.lang.Object obj47 = hashMapTestDriver43.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj49 = hashMapTestDriver43.get((java.lang.Object) 0.0d);
        boolean boolean51 = hashMapTestDriver43.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection52 = hashMapTestDriver43.values();
        hashMapTestDriver43.clear();
        experiment.util.Collection collection54 = hashMapTestDriver43.values();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj57 = hashMapTestDriver55.remove((java.lang.Object) 0);
        experiment.util.Collection collection58 = hashMapTestDriver55.values();
        java.lang.Object obj60 = hashMapTestDriver55.get((java.lang.Object) 1L);
        java.lang.Object obj61 = hashMapTestDriver43.get((java.lang.Object) hashMapTestDriver55);
        java.lang.Object obj62 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver55);
        java.lang.Object obj64 = hashMapTestDriver55.get((java.lang.Object) false);
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver65.clear();
        experiment.util.Set set67 = hashMapTestDriver65.entrySet();
        boolean boolean68 = hashMapTestDriver65.isEmpty();
        experiment.util.Set set69 = hashMapTestDriver65.keySet();
        boolean boolean70 = hashMapTestDriver65.isEmpty();
        experiment.util.Collection collection71 = hashMapTestDriver65.values();
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set73 = hashMapTestDriver72.keySet();
        java.lang.Object obj76 = hashMapTestDriver72.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj78 = hashMapTestDriver72.get((java.lang.Object) 0.0d);
        boolean boolean80 = hashMapTestDriver72.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection81 = hashMapTestDriver72.values();
        java.lang.Object obj83 = hashMapTestDriver72.remove((java.lang.Object) false);
        experiment.util.Set set84 = hashMapTestDriver72.entrySet();
        boolean boolean85 = hashMapTestDriver72.isEmpty();
        java.lang.Object obj87 = hashMapTestDriver72.get((java.lang.Object) 'a');
        boolean boolean88 = hashMapTestDriver65.containsKey((java.lang.Object) hashMapTestDriver72);
        boolean boolean89 = hashMapTestDriver55.containsKey((java.lang.Object) hashMapTestDriver72);
        int int90 = hashMapTestDriver55.size();
        java.lang.Object obj92 = hashMapTestDriver55.remove((java.lang.Object) 10L);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNull(obj92);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test164");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj9 = hashMapTestDriver5.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        java.lang.Object obj10 = hashMapTestDriver0.remove((java.lang.Object) (byte) 100);
        hashMapTestDriver0.clear();
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass13 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test165");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver5.clear();
        experiment.util.Set set7 = hashMapTestDriver5.entrySet();
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        boolean boolean10 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver5);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set12 = hashMapTestDriver11.keySet();
        java.lang.Object obj15 = hashMapTestDriver11.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj17 = hashMapTestDriver11.get((java.lang.Object) 0.0d);
        boolean boolean19 = hashMapTestDriver11.containsKey((java.lang.Object) (short) 10);
        experiment.util.Set set20 = hashMapTestDriver11.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) 0);
        hashMapTestDriver21.clear();
        java.lang.Object obj26 = hashMapTestDriver21.remove((java.lang.Object) 100.0f);
        java.lang.Object obj28 = hashMapTestDriver21.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.keySet();
        java.lang.Object obj33 = hashMapTestDriver29.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection34 = hashMapTestDriver29.values();
        java.lang.Object obj35 = hashMapTestDriver21.get((java.lang.Object) collection34);
        hashMapTestDriver21.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj39 = hashMapTestDriver37.remove((java.lang.Object) 0);
        experiment.util.Collection collection40 = hashMapTestDriver37.values();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj43 = hashMapTestDriver41.remove((java.lang.Object) 0);
        hashMapTestDriver41.clear();
        java.lang.Object obj46 = hashMapTestDriver41.remove((java.lang.Object) 100.0f);
        java.lang.Object obj48 = hashMapTestDriver41.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set50 = hashMapTestDriver49.keySet();
        java.lang.Object obj53 = hashMapTestDriver49.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection54 = hashMapTestDriver49.values();
        java.lang.Object obj55 = hashMapTestDriver41.get((java.lang.Object) collection54);
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set57 = hashMapTestDriver56.keySet();
        int int58 = hashMapTestDriver56.size();
        hashMapTestDriver56.clear();
        java.lang.Object obj61 = hashMapTestDriver41.put((java.lang.Object) hashMapTestDriver56, (java.lang.Object) (-1L));
        int int62 = hashMapTestDriver56.size();
        java.lang.Object obj63 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver37, (java.lang.Object) hashMapTestDriver56);
        boolean boolean64 = hashMapTestDriver37.isEmpty();
        experiment.util.Set set65 = hashMapTestDriver37.keySet();
        experiment.util.Collection collection66 = hashMapTestDriver37.values();
        java.lang.Object obj67 = hashMapTestDriver11.get((java.lang.Object) hashMapTestDriver37);
        java.lang.Object obj68 = hashMapTestDriver5.get((java.lang.Object) hashMapTestDriver37);
        experiment.util.Set set69 = hashMapTestDriver37.keySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(set69);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test166");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj14 = hashMapTestDriver8.get((java.lang.Object) 0.0d);
        boolean boolean16 = hashMapTestDriver8.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection17 = hashMapTestDriver8.values();
        java.lang.Object obj19 = hashMapTestDriver8.remove((java.lang.Object) false);
        experiment.util.Set set20 = hashMapTestDriver8.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) 0);
        hashMapTestDriver21.clear();
        java.lang.Object obj26 = hashMapTestDriver21.remove((java.lang.Object) 100.0f);
        java.lang.Object obj28 = hashMapTestDriver21.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.keySet();
        java.lang.Object obj33 = hashMapTestDriver29.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection34 = hashMapTestDriver29.values();
        java.lang.Object obj35 = hashMapTestDriver21.get((java.lang.Object) collection34);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set37 = hashMapTestDriver36.keySet();
        int int38 = hashMapTestDriver36.size();
        hashMapTestDriver36.clear();
        java.lang.Object obj41 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver36, (java.lang.Object) (-1L));
        experiment.util.Collection collection42 = hashMapTestDriver21.values();
        boolean boolean43 = hashMapTestDriver8.containsKey((java.lang.Object) collection42);
        java.lang.Object obj44 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.remove((java.lang.Object) 0);
        java.lang.Object obj50 = hashMapTestDriver45.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        boolean boolean52 = hashMapTestDriver45.containsKey((java.lang.Object) true);
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver53.clear();
        experiment.util.Set set55 = hashMapTestDriver53.entrySet();
        boolean boolean56 = hashMapTestDriver53.isEmpty();
        boolean boolean57 = hashMapTestDriver53.isEmpty();
        java.lang.Object obj58 = hashMapTestDriver8.put((java.lang.Object) true, (java.lang.Object) hashMapTestDriver53);
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj61 = hashMapTestDriver59.remove((java.lang.Object) 0);
        hashMapTestDriver59.clear();
        java.lang.Object obj64 = hashMapTestDriver59.remove((java.lang.Object) 100.0f);
        java.lang.Object obj66 = hashMapTestDriver59.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection67 = hashMapTestDriver59.values();
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set69 = hashMapTestDriver68.keySet();
        java.lang.Object obj72 = hashMapTestDriver68.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver73 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver73.clear();
        experiment.util.Set set75 = hashMapTestDriver73.entrySet();
        boolean boolean76 = hashMapTestDriver73.isEmpty();
        boolean boolean77 = hashMapTestDriver73.isEmpty();
        experiment.util.Collection collection78 = hashMapTestDriver73.values();
        java.lang.Object obj79 = hashMapTestDriver59.put((java.lang.Object) hashMapTestDriver68, (java.lang.Object) hashMapTestDriver73);
        hashMapTestDriver59.clear();
        boolean boolean81 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver59);
        experiment.util.Set set82 = hashMapTestDriver8.entrySet();
        experiment.util.Set set83 = hashMapTestDriver8.entrySet();
        experiment.util.Collection collection84 = hashMapTestDriver8.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNotNull(collection84);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test167");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.remove((java.lang.Object) 0);
        hashMapTestDriver13.clear();
        java.lang.Object obj18 = hashMapTestDriver13.remove((java.lang.Object) 100.0f);
        java.lang.Object obj20 = hashMapTestDriver13.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set22 = hashMapTestDriver21.keySet();
        java.lang.Object obj25 = hashMapTestDriver21.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection26 = hashMapTestDriver21.values();
        java.lang.Object obj27 = hashMapTestDriver13.get((java.lang.Object) collection26);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        int int30 = hashMapTestDriver28.size();
        hashMapTestDriver28.clear();
        java.lang.Object obj33 = hashMapTestDriver13.put((java.lang.Object) hashMapTestDriver28, (java.lang.Object) (-1L));
        experiment.util.Collection collection34 = hashMapTestDriver13.values();
        boolean boolean35 = hashMapTestDriver0.containsKey((java.lang.Object) collection34);
        int int36 = hashMapTestDriver0.size();
        experiment.util.Set set37 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test168");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass15 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + (-1) + "'", obj14, (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test169");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj14 = hashMapTestDriver8.get((java.lang.Object) 0.0d);
        boolean boolean16 = hashMapTestDriver8.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection17 = hashMapTestDriver8.values();
        java.lang.Object obj19 = hashMapTestDriver8.remove((java.lang.Object) false);
        boolean boolean20 = hashMapTestDriver0.containsKey((java.lang.Object) false);
        boolean boolean21 = hashMapTestDriver0.isEmpty();
        experiment.util.Collection collection22 = hashMapTestDriver0.values();
        experiment.util.Set set23 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test170");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        int int37 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        java.lang.Object obj40 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) (-1L));
        int int41 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver35);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.keySet();
        java.lang.Object obj47 = hashMapTestDriver43.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj49 = hashMapTestDriver43.get((java.lang.Object) 0.0d);
        boolean boolean51 = hashMapTestDriver43.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection52 = hashMapTestDriver43.values();
        hashMapTestDriver43.clear();
        experiment.util.Collection collection54 = hashMapTestDriver43.values();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj57 = hashMapTestDriver55.remove((java.lang.Object) 0);
        experiment.util.Collection collection58 = hashMapTestDriver55.values();
        java.lang.Object obj60 = hashMapTestDriver55.get((java.lang.Object) 1L);
        java.lang.Object obj61 = hashMapTestDriver43.get((java.lang.Object) hashMapTestDriver55);
        java.lang.Object obj62 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver55);
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver63.clear();
        experiment.util.Set set65 = hashMapTestDriver63.entrySet();
        boolean boolean66 = hashMapTestDriver63.isEmpty();
        experiment.util.Set set67 = hashMapTestDriver63.keySet();
        boolean boolean68 = hashMapTestDriver63.isEmpty();
        experiment.util.Collection collection69 = hashMapTestDriver63.values();
        java.lang.Object obj70 = hashMapTestDriver16.get((java.lang.Object) collection69);
        int int71 = hashMapTestDriver16.size();
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj74 = hashMapTestDriver72.remove((java.lang.Object) 0);
        hashMapTestDriver72.clear();
        int int76 = hashMapTestDriver72.size();
        int int77 = hashMapTestDriver72.size();
        java.lang.Object obj79 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver72, (java.lang.Object) (short) 10);
        experiment.util.Set set80 = hashMapTestDriver16.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver81 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver81.clear();
        java.lang.Object obj83 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver81);
        experiment.util.Collection collection84 = hashMapTestDriver81.values();
        java.lang.Class<?> wildcardClass85 = hashMapTestDriver81.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test171");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) false);
        experiment.util.Set set16 = hashMapTestDriver4.entrySet();
        boolean boolean17 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        experiment.util.Collection collection21 = hashMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test172");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        int int37 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        java.lang.Object obj40 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) (-1L));
        int int41 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver35);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.keySet();
        java.lang.Object obj47 = hashMapTestDriver43.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj49 = hashMapTestDriver43.get((java.lang.Object) 0.0d);
        boolean boolean51 = hashMapTestDriver43.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection52 = hashMapTestDriver43.values();
        hashMapTestDriver43.clear();
        experiment.util.Collection collection54 = hashMapTestDriver43.values();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj57 = hashMapTestDriver55.remove((java.lang.Object) 0);
        experiment.util.Collection collection58 = hashMapTestDriver55.values();
        java.lang.Object obj60 = hashMapTestDriver55.get((java.lang.Object) 1L);
        java.lang.Object obj61 = hashMapTestDriver43.get((java.lang.Object) hashMapTestDriver55);
        java.lang.Object obj62 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver55);
        int int63 = hashMapTestDriver16.size();
        experiment.util.Set set64 = hashMapTestDriver16.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(set64);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test173");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test174");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        java.lang.Object obj12 = hashMapTestDriver0.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.keySet();
        java.lang.Object obj17 = hashMapTestDriver13.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj19 = hashMapTestDriver13.get((java.lang.Object) 0.0d);
        boolean boolean21 = hashMapTestDriver13.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection22 = hashMapTestDriver13.values();
        hashMapTestDriver13.clear();
        java.lang.Object obj26 = hashMapTestDriver13.put((java.lang.Object) (-1.0f), (java.lang.Object) 1.0f);
        boolean boolean27 = hashMapTestDriver0.containsKey((java.lang.Object) 1.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver28.clear();
        experiment.util.Set set30 = hashMapTestDriver28.entrySet();
        hashMapTestDriver28.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj35 = hashMapTestDriver33.remove((java.lang.Object) 0);
        hashMapTestDriver33.clear();
        java.lang.Object obj38 = hashMapTestDriver33.remove((java.lang.Object) 100.0f);
        java.lang.Object obj40 = hashMapTestDriver33.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set42 = hashMapTestDriver41.keySet();
        java.lang.Object obj45 = hashMapTestDriver41.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection46 = hashMapTestDriver41.values();
        java.lang.Object obj47 = hashMapTestDriver33.get((java.lang.Object) collection46);
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set49 = hashMapTestDriver48.keySet();
        int int50 = hashMapTestDriver48.size();
        hashMapTestDriver48.clear();
        java.lang.Object obj53 = hashMapTestDriver33.put((java.lang.Object) hashMapTestDriver48, (java.lang.Object) (-1L));
        boolean boolean55 = hashMapTestDriver48.containsKey((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj58 = hashMapTestDriver56.remove((java.lang.Object) 0);
        experiment.util.Collection collection59 = hashMapTestDriver56.values();
        boolean boolean60 = hashMapTestDriver48.containsKey((java.lang.Object) hashMapTestDriver56);
        experiment.util.Collection collection61 = hashMapTestDriver48.values();
        java.lang.Object obj62 = hashMapTestDriver28.put((java.lang.Object) hashMapTestDriver32, (java.lang.Object) hashMapTestDriver48);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj63 = hashMapTestDriver0.get(obj62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test175");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        java.lang.Object obj13 = hashMapTestDriver0.put((java.lang.Object) (-1.0f), (java.lang.Object) 1.0f);
        boolean boolean14 = hashMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass15 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test176");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        int int17 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) (-1L));
        experiment.util.Collection collection21 = hashMapTestDriver0.values();
        experiment.util.Set set22 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver23.clear();
        experiment.util.Set set25 = hashMapTestDriver23.entrySet();
        boolean boolean26 = hashMapTestDriver23.isEmpty();
        experiment.util.Set set27 = hashMapTestDriver23.keySet();
        boolean boolean28 = hashMapTestDriver23.isEmpty();
        boolean boolean29 = hashMapTestDriver0.containsKey((java.lang.Object) boolean28);
        experiment.util.Collection collection30 = hashMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection30);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test177");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        int int17 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) (-1L));
        experiment.util.Collection collection21 = hashMapTestDriver0.values();
        experiment.util.Set set22 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.keySet();
        int int25 = hashMapTestDriver23.size();
        java.lang.Object obj26 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver23);
        boolean boolean27 = hashMapTestDriver23.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver28.clear();
        experiment.util.Set set30 = hashMapTestDriver28.entrySet();
        boolean boolean31 = hashMapTestDriver28.isEmpty();
        experiment.util.Set set32 = hashMapTestDriver28.entrySet();
        boolean boolean33 = hashMapTestDriver28.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj36 = hashMapTestDriver34.remove((java.lang.Object) 0);
        experiment.util.Collection collection37 = hashMapTestDriver34.values();
        boolean boolean38 = hashMapTestDriver28.containsKey((java.lang.Object) collection37);
        java.lang.Object obj39 = hashMapTestDriver23.get((java.lang.Object) collection37);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test178");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) false);
        experiment.util.Set set16 = hashMapTestDriver4.entrySet();
        boolean boolean17 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        boolean boolean22 = hashMapTestDriver0.containsKey((java.lang.Object) ' ');
        experiment.util.Set set23 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test179");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver0.get((java.lang.Object) 'a');
        boolean boolean16 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj19 = hashMapTestDriver17.remove((java.lang.Object) 0);
        experiment.util.Collection collection20 = hashMapTestDriver17.values();
        java.lang.Object obj22 = hashMapTestDriver17.get((java.lang.Object) 1L);
        int int23 = hashMapTestDriver17.size();
        experiment.util.Set set24 = hashMapTestDriver17.entrySet();
        java.lang.Object obj25 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver17);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test180");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        java.lang.Object obj10 = hashMapTestDriver0.remove((java.lang.Object) 10L);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set12 = hashMapTestDriver11.keySet();
        java.lang.Object obj15 = hashMapTestDriver11.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        hashMapTestDriver11.clear();
        boolean boolean17 = hashMapTestDriver11.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.keySet();
        java.lang.Object obj22 = hashMapTestDriver18.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj24 = hashMapTestDriver18.get((java.lang.Object) 0.0d);
        boolean boolean26 = hashMapTestDriver18.containsKey((java.lang.Object) (short) 10);
        int int27 = hashMapTestDriver18.size();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver28.remove((java.lang.Object) 0);
        hashMapTestDriver28.clear();
        java.lang.Object obj33 = hashMapTestDriver28.remove((java.lang.Object) 100.0f);
        java.lang.Object obj35 = hashMapTestDriver28.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection36 = hashMapTestDriver28.values();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set38 = hashMapTestDriver37.keySet();
        java.lang.Object obj41 = hashMapTestDriver37.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver42.clear();
        experiment.util.Set set44 = hashMapTestDriver42.entrySet();
        boolean boolean45 = hashMapTestDriver42.isEmpty();
        boolean boolean46 = hashMapTestDriver42.isEmpty();
        experiment.util.Collection collection47 = hashMapTestDriver42.values();
        java.lang.Object obj48 = hashMapTestDriver28.put((java.lang.Object) hashMapTestDriver37, (java.lang.Object) hashMapTestDriver42);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj51 = hashMapTestDriver49.remove((java.lang.Object) 0);
        hashMapTestDriver49.clear();
        java.lang.Object obj54 = hashMapTestDriver49.remove((java.lang.Object) 100.0f);
        java.lang.Object obj56 = hashMapTestDriver49.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set58 = hashMapTestDriver57.keySet();
        java.lang.Object obj61 = hashMapTestDriver57.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection62 = hashMapTestDriver57.values();
        java.lang.Object obj63 = hashMapTestDriver49.get((java.lang.Object) collection62);
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set65 = hashMapTestDriver64.keySet();
        int int66 = hashMapTestDriver64.size();
        hashMapTestDriver64.clear();
        java.lang.Object obj69 = hashMapTestDriver49.put((java.lang.Object) hashMapTestDriver64, (java.lang.Object) (-1L));
        boolean boolean71 = hashMapTestDriver64.containsKey((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj74 = hashMapTestDriver72.remove((java.lang.Object) 0);
        experiment.util.Collection collection75 = hashMapTestDriver72.values();
        boolean boolean76 = hashMapTestDriver64.containsKey((java.lang.Object) hashMapTestDriver72);
        experiment.util.Collection collection77 = hashMapTestDriver64.values();
        boolean boolean78 = hashMapTestDriver42.containsKey((java.lang.Object) hashMapTestDriver64);
        experiment.util.Set set79 = hashMapTestDriver42.entrySet();
        boolean boolean80 = hashMapTestDriver18.containsKey((java.lang.Object) set79);
        hashMapTestDriver18.clear();
        java.lang.Object obj82 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver11, (java.lang.Object) hashMapTestDriver18);
        boolean boolean83 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test181");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test182");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) 1.0f);
        int int8 = hashMapTestDriver0.size();
        boolean boolean9 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.keySet();
        int int14 = hashMapTestDriver12.size();
        experiment.util.Set set15 = hashMapTestDriver12.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.keySet();
        java.lang.Object obj20 = hashMapTestDriver16.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj22 = hashMapTestDriver16.get((java.lang.Object) 0.0d);
        boolean boolean24 = hashMapTestDriver16.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        hashMapTestDriver16.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) 0);
        hashMapTestDriver27.clear();
        java.lang.Object obj32 = hashMapTestDriver27.remove((java.lang.Object) 100.0f);
        java.lang.Object obj34 = hashMapTestDriver27.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        java.lang.Object obj39 = hashMapTestDriver35.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection40 = hashMapTestDriver35.values();
        java.lang.Object obj41 = hashMapTestDriver27.get((java.lang.Object) collection40);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set43 = hashMapTestDriver42.keySet();
        int int44 = hashMapTestDriver42.size();
        hashMapTestDriver42.clear();
        java.lang.Object obj47 = hashMapTestDriver27.put((java.lang.Object) hashMapTestDriver42, (java.lang.Object) (-1L));
        java.lang.Object obj48 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) (-1L));
        hashMapTestDriver12.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set51 = hashMapTestDriver50.keySet();
        java.lang.Object obj54 = hashMapTestDriver50.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj56 = hashMapTestDriver50.get((java.lang.Object) 0.0d);
        boolean boolean58 = hashMapTestDriver50.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection59 = hashMapTestDriver50.values();
        hashMapTestDriver50.clear();
        java.lang.Object obj62 = hashMapTestDriver50.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set64 = hashMapTestDriver63.keySet();
        java.lang.Object obj67 = hashMapTestDriver63.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj69 = hashMapTestDriver63.get((java.lang.Object) 0.0d);
        boolean boolean71 = hashMapTestDriver63.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection72 = hashMapTestDriver63.values();
        hashMapTestDriver63.clear();
        java.lang.Object obj76 = hashMapTestDriver63.put((java.lang.Object) (-1.0f), (java.lang.Object) 1.0f);
        boolean boolean77 = hashMapTestDriver50.containsKey((java.lang.Object) 1.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver78 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver78.clear();
        java.lang.Object obj80 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver50, (java.lang.Object) hashMapTestDriver78);
        java.lang.Object obj81 = hashMapTestDriver0.put((java.lang.Object) 1L, (java.lang.Object) hashMapTestDriver50);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test183");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        int int37 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        java.lang.Object obj40 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) (-1L));
        int int41 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver35);
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test184");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj5 = hashMapTestDriver3.remove((java.lang.Object) 0);
        java.lang.Object obj8 = hashMapTestDriver3.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver9.clear();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver9.isEmpty();
        boolean boolean13 = hashMapTestDriver9.isEmpty();
        experiment.util.Collection collection14 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) 0);
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver15.remove((java.lang.Object) 100.0f);
        java.lang.Object obj22 = hashMapTestDriver15.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection23 = hashMapTestDriver15.values();
        java.lang.Object obj24 = hashMapTestDriver9.remove((java.lang.Object) hashMapTestDriver15);
        boolean boolean25 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Collection collection26 = hashMapTestDriver9.values();
        java.lang.Object obj27 = hashMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) collection26);
        java.lang.Class<?> wildcardClass28 = collection26.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test185");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        int int4 = hashMapTestDriver0.size();
        int int5 = hashMapTestDriver0.size();
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.keySet();
        java.lang.Object obj11 = hashMapTestDriver7.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj13 = hashMapTestDriver7.get((java.lang.Object) 0.0d);
        boolean boolean15 = hashMapTestDriver7.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection16 = hashMapTestDriver7.values();
        java.lang.Object obj18 = hashMapTestDriver7.remove((java.lang.Object) false);
        experiment.util.Set set19 = hashMapTestDriver7.entrySet();
        java.lang.Class<?> wildcardClass20 = hashMapTestDriver7.getClass();
        boolean boolean21 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver7);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test186");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        int int17 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) (-1L));
        boolean boolean22 = hashMapTestDriver15.containsKey((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) 0);
        experiment.util.Collection collection26 = hashMapTestDriver23.values();
        boolean boolean27 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver23);
        experiment.util.Collection collection28 = hashMapTestDriver15.values();
        java.lang.Class<?> wildcardClass29 = collection28.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test187");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver3.clear();
        experiment.util.Set set5 = hashMapTestDriver3.entrySet();
        boolean boolean6 = hashMapTestDriver3.isEmpty();
        boolean boolean7 = hashMapTestDriver3.isEmpty();
        experiment.util.Collection collection8 = hashMapTestDriver3.values();
        java.lang.Object obj9 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver3);
        boolean boolean10 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.keySet();
        java.lang.Object obj16 = hashMapTestDriver12.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set17 = hashMapTestDriver12.entrySet();
        experiment.util.Set set18 = hashMapTestDriver12.entrySet();
        boolean boolean20 = hashMapTestDriver12.containsKey((java.lang.Object) 10.0f);
        experiment.util.Set set21 = hashMapTestDriver12.entrySet();
        boolean boolean22 = hashMapTestDriver0.containsKey((java.lang.Object) set21);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test188");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set3 = hashMapTestDriver2.keySet();
        java.lang.Object obj6 = hashMapTestDriver2.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj8 = hashMapTestDriver2.get((java.lang.Object) 0.0d);
        boolean boolean10 = hashMapTestDriver2.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection11 = hashMapTestDriver2.values();
        java.lang.Object obj13 = hashMapTestDriver2.remove((java.lang.Object) false);
        experiment.util.Set set14 = hashMapTestDriver2.entrySet();
        java.lang.Object obj16 = hashMapTestDriver2.get((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = hashMapTestDriver0.remove((java.lang.Object) wildcardClass17);
        experiment.util.Collection collection19 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set21 = hashMapTestDriver20.keySet();
        java.lang.Object obj24 = hashMapTestDriver20.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set25 = hashMapTestDriver20.entrySet();
        experiment.util.Set set26 = hashMapTestDriver20.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set28 = hashMapTestDriver27.keySet();
        int int29 = hashMapTestDriver27.size();
        experiment.util.Set set30 = hashMapTestDriver27.keySet();
        java.lang.Object obj31 = hashMapTestDriver20.get((java.lang.Object) hashMapTestDriver27);
        hashMapTestDriver27.clear();
        boolean boolean33 = hashMapTestDriver27.isEmpty();
        experiment.util.Set set34 = hashMapTestDriver27.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        java.lang.Object obj39 = hashMapTestDriver35.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set40 = hashMapTestDriver35.entrySet();
        experiment.util.Set set41 = hashMapTestDriver35.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set43 = hashMapTestDriver42.keySet();
        int int44 = hashMapTestDriver42.size();
        experiment.util.Set set45 = hashMapTestDriver42.keySet();
        java.lang.Object obj46 = hashMapTestDriver35.get((java.lang.Object) hashMapTestDriver42);
        hashMapTestDriver42.clear();
        boolean boolean48 = hashMapTestDriver42.isEmpty();
        experiment.util.Set set49 = hashMapTestDriver42.entrySet();
        java.lang.Object obj50 = hashMapTestDriver27.remove((java.lang.Object) set49);
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj53 = hashMapTestDriver51.remove((java.lang.Object) 0);
        hashMapTestDriver51.clear();
        java.lang.Object obj56 = hashMapTestDriver51.remove((java.lang.Object) 100.0f);
        java.lang.Object obj58 = hashMapTestDriver51.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set60 = hashMapTestDriver59.keySet();
        java.lang.Object obj63 = hashMapTestDriver59.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection64 = hashMapTestDriver59.values();
        java.lang.Object obj65 = hashMapTestDriver51.get((java.lang.Object) collection64);
        int int66 = hashMapTestDriver51.size();
        experiment.util.Collection collection67 = hashMapTestDriver51.values();
        java.lang.Object obj68 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver27, (java.lang.Object) hashMapTestDriver51);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1) + "'", obj16, (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test189");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver7.remove((java.lang.Object) 0);
        hashMapTestDriver7.clear();
        java.lang.Object obj12 = hashMapTestDriver7.remove((java.lang.Object) 100.0f);
        java.lang.Object obj14 = hashMapTestDriver7.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        java.lang.Object obj19 = hashMapTestDriver15.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection20 = hashMapTestDriver15.values();
        java.lang.Object obj21 = hashMapTestDriver7.get((java.lang.Object) collection20);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.keySet();
        int int24 = hashMapTestDriver22.size();
        hashMapTestDriver22.clear();
        java.lang.Object obj27 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver22, (java.lang.Object) (-1L));
        experiment.util.Collection collection28 = hashMapTestDriver7.values();
        experiment.util.Set set29 = hashMapTestDriver7.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver30.clear();
        experiment.util.Set set32 = hashMapTestDriver30.entrySet();
        boolean boolean33 = hashMapTestDriver30.isEmpty();
        experiment.util.Set set34 = hashMapTestDriver30.keySet();
        boolean boolean35 = hashMapTestDriver30.isEmpty();
        boolean boolean36 = hashMapTestDriver7.containsKey((java.lang.Object) boolean35);
        hashMapTestDriver7.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver38.clear();
        experiment.util.Set set40 = hashMapTestDriver38.entrySet();
        boolean boolean41 = hashMapTestDriver38.isEmpty();
        experiment.util.Set set42 = hashMapTestDriver38.keySet();
        boolean boolean43 = hashMapTestDriver38.isEmpty();
        experiment.util.Collection collection44 = hashMapTestDriver38.values();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set46 = hashMapTestDriver45.keySet();
        java.lang.Object obj49 = hashMapTestDriver45.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj51 = hashMapTestDriver45.get((java.lang.Object) 0.0d);
        boolean boolean53 = hashMapTestDriver45.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection54 = hashMapTestDriver45.values();
        java.lang.Object obj56 = hashMapTestDriver45.remove((java.lang.Object) false);
        experiment.util.Set set57 = hashMapTestDriver45.entrySet();
        boolean boolean58 = hashMapTestDriver45.isEmpty();
        java.lang.Object obj60 = hashMapTestDriver45.get((java.lang.Object) 'a');
        boolean boolean61 = hashMapTestDriver38.containsKey((java.lang.Object) hashMapTestDriver45);
        java.lang.Object obj62 = hashMapTestDriver7.remove((java.lang.Object) boolean61);
        java.lang.Object obj63 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj66 = hashMapTestDriver64.remove((java.lang.Object) 0);
        experiment.util.Collection collection67 = hashMapTestDriver64.values();
        java.lang.Object obj69 = hashMapTestDriver64.get((java.lang.Object) 1L);
        java.lang.Object obj70 = hashMapTestDriver7.get((java.lang.Object) hashMapTestDriver64);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj70);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test190");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.remove((java.lang.Object) 0);
        hashMapTestDriver13.clear();
        java.lang.Object obj18 = hashMapTestDriver13.remove((java.lang.Object) 100.0f);
        java.lang.Object obj20 = hashMapTestDriver13.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set22 = hashMapTestDriver21.keySet();
        java.lang.Object obj25 = hashMapTestDriver21.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection26 = hashMapTestDriver21.values();
        java.lang.Object obj27 = hashMapTestDriver13.get((java.lang.Object) collection26);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        int int30 = hashMapTestDriver28.size();
        hashMapTestDriver28.clear();
        java.lang.Object obj33 = hashMapTestDriver13.put((java.lang.Object) hashMapTestDriver28, (java.lang.Object) (-1L));
        experiment.util.Collection collection34 = hashMapTestDriver13.values();
        boolean boolean35 = hashMapTestDriver0.containsKey((java.lang.Object) collection34);
        int int36 = hashMapTestDriver0.size();
        java.lang.Class<?> wildcardClass37 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test191");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set8 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.remove((java.lang.Object) 0);
        hashMapTestDriver9.clear();
        java.lang.Object obj14 = hashMapTestDriver9.remove((java.lang.Object) 100.0f);
        java.lang.Object obj16 = hashMapTestDriver9.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.keySet();
        java.lang.Object obj21 = hashMapTestDriver17.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection22 = hashMapTestDriver17.values();
        java.lang.Object obj23 = hashMapTestDriver9.get((java.lang.Object) collection22);
        int int24 = hashMapTestDriver9.size();
        experiment.util.Collection collection25 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.remove((java.lang.Object) 0);
        hashMapTestDriver26.clear();
        java.lang.Object obj31 = hashMapTestDriver26.remove((java.lang.Object) 100.0f);
        java.lang.Object obj33 = hashMapTestDriver26.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set35 = hashMapTestDriver34.keySet();
        java.lang.Object obj38 = hashMapTestDriver34.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection39 = hashMapTestDriver34.values();
        java.lang.Object obj40 = hashMapTestDriver26.get((java.lang.Object) collection39);
        hashMapTestDriver26.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj44 = hashMapTestDriver42.remove((java.lang.Object) 0);
        experiment.util.Collection collection45 = hashMapTestDriver42.values();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj48 = hashMapTestDriver46.remove((java.lang.Object) 0);
        hashMapTestDriver46.clear();
        java.lang.Object obj51 = hashMapTestDriver46.remove((java.lang.Object) 100.0f);
        java.lang.Object obj53 = hashMapTestDriver46.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set55 = hashMapTestDriver54.keySet();
        java.lang.Object obj58 = hashMapTestDriver54.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection59 = hashMapTestDriver54.values();
        java.lang.Object obj60 = hashMapTestDriver46.get((java.lang.Object) collection59);
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set62 = hashMapTestDriver61.keySet();
        int int63 = hashMapTestDriver61.size();
        hashMapTestDriver61.clear();
        java.lang.Object obj66 = hashMapTestDriver46.put((java.lang.Object) hashMapTestDriver61, (java.lang.Object) (-1L));
        int int67 = hashMapTestDriver61.size();
        java.lang.Object obj68 = hashMapTestDriver26.put((java.lang.Object) hashMapTestDriver42, (java.lang.Object) hashMapTestDriver61);
        experiment.util.HashMapTestDriver hashMapTestDriver69 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set70 = hashMapTestDriver69.keySet();
        java.lang.Object obj73 = hashMapTestDriver69.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj75 = hashMapTestDriver69.get((java.lang.Object) 0.0d);
        boolean boolean77 = hashMapTestDriver69.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection78 = hashMapTestDriver69.values();
        hashMapTestDriver69.clear();
        experiment.util.Collection collection80 = hashMapTestDriver69.values();
        experiment.util.HashMapTestDriver hashMapTestDriver81 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj83 = hashMapTestDriver81.remove((java.lang.Object) 0);
        experiment.util.Collection collection84 = hashMapTestDriver81.values();
        java.lang.Object obj86 = hashMapTestDriver81.get((java.lang.Object) 1L);
        java.lang.Object obj87 = hashMapTestDriver69.get((java.lang.Object) hashMapTestDriver81);
        java.lang.Object obj88 = hashMapTestDriver42.remove((java.lang.Object) hashMapTestDriver81);
        experiment.util.HashMapTestDriver hashMapTestDriver89 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver89.clear();
        experiment.util.Set set91 = hashMapTestDriver89.entrySet();
        boolean boolean92 = hashMapTestDriver89.isEmpty();
        experiment.util.Set set93 = hashMapTestDriver89.keySet();
        boolean boolean94 = hashMapTestDriver89.isEmpty();
        experiment.util.Collection collection95 = hashMapTestDriver89.values();
        java.lang.Object obj96 = hashMapTestDriver42.get((java.lang.Object) collection95);
        int int97 = hashMapTestDriver42.size();
        boolean boolean98 = hashMapTestDriver42.isEmpty();
        java.lang.Object obj99 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver42);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(set91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(set93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(collection95);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test192");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        java.lang.Object obj11 = null;
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.remove((java.lang.Object) 0);
        hashMapTestDriver12.clear();
        java.lang.Object obj17 = hashMapTestDriver12.remove((java.lang.Object) 100.0f);
        java.lang.Object obj19 = hashMapTestDriver12.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set21 = hashMapTestDriver20.keySet();
        java.lang.Object obj24 = hashMapTestDriver20.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj26 = hashMapTestDriver20.get((java.lang.Object) 0.0d);
        boolean boolean28 = hashMapTestDriver20.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection29 = hashMapTestDriver20.values();
        java.lang.Object obj31 = hashMapTestDriver20.remove((java.lang.Object) false);
        experiment.util.Set set32 = hashMapTestDriver20.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj35 = hashMapTestDriver33.remove((java.lang.Object) 0);
        hashMapTestDriver33.clear();
        java.lang.Object obj38 = hashMapTestDriver33.remove((java.lang.Object) 100.0f);
        java.lang.Object obj40 = hashMapTestDriver33.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set42 = hashMapTestDriver41.keySet();
        java.lang.Object obj45 = hashMapTestDriver41.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection46 = hashMapTestDriver41.values();
        java.lang.Object obj47 = hashMapTestDriver33.get((java.lang.Object) collection46);
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set49 = hashMapTestDriver48.keySet();
        int int50 = hashMapTestDriver48.size();
        hashMapTestDriver48.clear();
        java.lang.Object obj53 = hashMapTestDriver33.put((java.lang.Object) hashMapTestDriver48, (java.lang.Object) (-1L));
        experiment.util.Collection collection54 = hashMapTestDriver33.values();
        boolean boolean55 = hashMapTestDriver20.containsKey((java.lang.Object) collection54);
        java.lang.Object obj56 = hashMapTestDriver12.remove((java.lang.Object) hashMapTestDriver20);
        int int57 = hashMapTestDriver20.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj58 = hashMapTestDriver0.put(obj11, (java.lang.Object) int57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test193");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        boolean boolean7 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver13.clear();
        experiment.util.Set set15 = hashMapTestDriver13.entrySet();
        boolean boolean16 = hashMapTestDriver13.isEmpty();
        experiment.util.Set set17 = hashMapTestDriver13.entrySet();
        boolean boolean18 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver13);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.keySet();
        java.lang.Object obj23 = hashMapTestDriver19.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj25 = hashMapTestDriver19.get((java.lang.Object) 0.0d);
        boolean boolean27 = hashMapTestDriver19.containsKey((java.lang.Object) (short) 10);
        experiment.util.Set set28 = hashMapTestDriver19.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj31 = hashMapTestDriver29.remove((java.lang.Object) 0);
        hashMapTestDriver29.clear();
        java.lang.Object obj34 = hashMapTestDriver29.remove((java.lang.Object) 100.0f);
        java.lang.Object obj36 = hashMapTestDriver29.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set38 = hashMapTestDriver37.keySet();
        java.lang.Object obj41 = hashMapTestDriver37.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection42 = hashMapTestDriver37.values();
        java.lang.Object obj43 = hashMapTestDriver29.get((java.lang.Object) collection42);
        hashMapTestDriver29.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.remove((java.lang.Object) 0);
        experiment.util.Collection collection48 = hashMapTestDriver45.values();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj51 = hashMapTestDriver49.remove((java.lang.Object) 0);
        hashMapTestDriver49.clear();
        java.lang.Object obj54 = hashMapTestDriver49.remove((java.lang.Object) 100.0f);
        java.lang.Object obj56 = hashMapTestDriver49.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set58 = hashMapTestDriver57.keySet();
        java.lang.Object obj61 = hashMapTestDriver57.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection62 = hashMapTestDriver57.values();
        java.lang.Object obj63 = hashMapTestDriver49.get((java.lang.Object) collection62);
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set65 = hashMapTestDriver64.keySet();
        int int66 = hashMapTestDriver64.size();
        hashMapTestDriver64.clear();
        java.lang.Object obj69 = hashMapTestDriver49.put((java.lang.Object) hashMapTestDriver64, (java.lang.Object) (-1L));
        int int70 = hashMapTestDriver64.size();
        java.lang.Object obj71 = hashMapTestDriver29.put((java.lang.Object) hashMapTestDriver45, (java.lang.Object) hashMapTestDriver64);
        boolean boolean72 = hashMapTestDriver45.isEmpty();
        experiment.util.Set set73 = hashMapTestDriver45.keySet();
        experiment.util.Collection collection74 = hashMapTestDriver45.values();
        java.lang.Object obj75 = hashMapTestDriver19.get((java.lang.Object) hashMapTestDriver45);
        java.lang.Object obj76 = hashMapTestDriver13.get((java.lang.Object) hashMapTestDriver45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj77 = hashMapTestDriver0.remove(obj76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test194");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        int int2 = hashMapTestDriver0.size();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) 0);
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver15.remove((java.lang.Object) 100.0f);
        java.lang.Object obj22 = hashMapTestDriver15.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.keySet();
        java.lang.Object obj27 = hashMapTestDriver23.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection28 = hashMapTestDriver23.values();
        java.lang.Object obj29 = hashMapTestDriver15.get((java.lang.Object) collection28);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set31 = hashMapTestDriver30.keySet();
        int int32 = hashMapTestDriver30.size();
        hashMapTestDriver30.clear();
        java.lang.Object obj35 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) (-1L));
        java.lang.Object obj36 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) (-1L));
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.keySet();
        java.lang.Object obj42 = hashMapTestDriver38.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj44 = hashMapTestDriver38.get((java.lang.Object) 0.0d);
        boolean boolean46 = hashMapTestDriver38.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection47 = hashMapTestDriver38.values();
        hashMapTestDriver38.clear();
        java.lang.Object obj50 = hashMapTestDriver38.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set52 = hashMapTestDriver51.keySet();
        java.lang.Object obj55 = hashMapTestDriver51.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj57 = hashMapTestDriver51.get((java.lang.Object) 0.0d);
        boolean boolean59 = hashMapTestDriver51.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection60 = hashMapTestDriver51.values();
        hashMapTestDriver51.clear();
        java.lang.Object obj64 = hashMapTestDriver51.put((java.lang.Object) (-1.0f), (java.lang.Object) 1.0f);
        boolean boolean65 = hashMapTestDriver38.containsKey((java.lang.Object) 1.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver66.clear();
        java.lang.Object obj68 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver38, (java.lang.Object) hashMapTestDriver66);
        experiment.util.HashMapTestDriver hashMapTestDriver69 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj71 = hashMapTestDriver69.remove((java.lang.Object) 0);
        experiment.util.Collection collection72 = hashMapTestDriver69.values();
        java.lang.Object obj74 = hashMapTestDriver69.get((java.lang.Object) 1L);
        int int75 = hashMapTestDriver69.size();
        experiment.util.Set set76 = hashMapTestDriver69.entrySet();
        java.lang.Object obj77 = hashMapTestDriver66.get((java.lang.Object) set76);
        experiment.util.Set set78 = hashMapTestDriver66.keySet();
        boolean boolean79 = hashMapTestDriver66.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver80 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver80.clear();
        experiment.util.Set set82 = hashMapTestDriver80.entrySet();
        boolean boolean83 = hashMapTestDriver80.isEmpty();
        experiment.util.Set set84 = hashMapTestDriver80.entrySet();
        boolean boolean85 = hashMapTestDriver80.isEmpty();
        experiment.util.Set set86 = hashMapTestDriver80.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver87 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj89 = hashMapTestDriver87.remove((java.lang.Object) 0);
        hashMapTestDriver87.clear();
        java.lang.Object obj92 = hashMapTestDriver87.remove((java.lang.Object) 100.0f);
        java.lang.Object obj94 = hashMapTestDriver87.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection95 = hashMapTestDriver87.values();
        java.lang.Object obj97 = hashMapTestDriver87.remove((java.lang.Object) 10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj98 = hashMapTestDriver66.put((java.lang.Object) hashMapTestDriver80, obj97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNotNull(collection95);
        org.junit.Assert.assertNull(obj97);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test195");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        experiment.util.Set set13 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection14 = hashMapTestDriver0.values();
        experiment.util.Collection collection15 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test196");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        int int17 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) (-1L));
        experiment.util.Collection collection21 = hashMapTestDriver0.values();
        experiment.util.Set set22 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver23.clear();
        experiment.util.Set set25 = hashMapTestDriver23.entrySet();
        boolean boolean26 = hashMapTestDriver23.isEmpty();
        experiment.util.Set set27 = hashMapTestDriver23.keySet();
        boolean boolean28 = hashMapTestDriver23.isEmpty();
        boolean boolean29 = hashMapTestDriver0.containsKey((java.lang.Object) boolean28);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.keySet();
        java.lang.Object obj35 = hashMapTestDriver31.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set36 = hashMapTestDriver31.entrySet();
        boolean boolean37 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver31);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test197");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver7.remove((java.lang.Object) 0);
        hashMapTestDriver7.clear();
        java.lang.Object obj12 = hashMapTestDriver7.remove((java.lang.Object) 100.0f);
        java.lang.Object obj14 = hashMapTestDriver7.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        java.lang.Object obj19 = hashMapTestDriver15.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection20 = hashMapTestDriver15.values();
        java.lang.Object obj21 = hashMapTestDriver7.get((java.lang.Object) collection20);
        hashMapTestDriver7.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) 0);
        experiment.util.Collection collection26 = hashMapTestDriver23.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) 0);
        hashMapTestDriver27.clear();
        java.lang.Object obj32 = hashMapTestDriver27.remove((java.lang.Object) 100.0f);
        java.lang.Object obj34 = hashMapTestDriver27.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        java.lang.Object obj39 = hashMapTestDriver35.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection40 = hashMapTestDriver35.values();
        java.lang.Object obj41 = hashMapTestDriver27.get((java.lang.Object) collection40);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set43 = hashMapTestDriver42.keySet();
        int int44 = hashMapTestDriver42.size();
        hashMapTestDriver42.clear();
        java.lang.Object obj47 = hashMapTestDriver27.put((java.lang.Object) hashMapTestDriver42, (java.lang.Object) (-1L));
        int int48 = hashMapTestDriver42.size();
        java.lang.Object obj49 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver23, (java.lang.Object) hashMapTestDriver42);
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set51 = hashMapTestDriver50.keySet();
        java.lang.Object obj54 = hashMapTestDriver50.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj56 = hashMapTestDriver50.get((java.lang.Object) 0.0d);
        boolean boolean58 = hashMapTestDriver50.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection59 = hashMapTestDriver50.values();
        hashMapTestDriver50.clear();
        experiment.util.Collection collection61 = hashMapTestDriver50.values();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj64 = hashMapTestDriver62.remove((java.lang.Object) 0);
        experiment.util.Collection collection65 = hashMapTestDriver62.values();
        java.lang.Object obj67 = hashMapTestDriver62.get((java.lang.Object) 1L);
        java.lang.Object obj68 = hashMapTestDriver50.get((java.lang.Object) hashMapTestDriver62);
        java.lang.Object obj69 = hashMapTestDriver23.remove((java.lang.Object) hashMapTestDriver62);
        experiment.util.HashMapTestDriver hashMapTestDriver70 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver70.clear();
        experiment.util.Set set72 = hashMapTestDriver70.entrySet();
        boolean boolean73 = hashMapTestDriver70.isEmpty();
        experiment.util.Set set74 = hashMapTestDriver70.keySet();
        boolean boolean75 = hashMapTestDriver70.isEmpty();
        experiment.util.Collection collection76 = hashMapTestDriver70.values();
        java.lang.Object obj77 = hashMapTestDriver23.get((java.lang.Object) collection76);
        int int78 = hashMapTestDriver23.size();
        experiment.util.HashMapTestDriver hashMapTestDriver79 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj81 = hashMapTestDriver79.remove((java.lang.Object) 0);
        hashMapTestDriver79.clear();
        int int83 = hashMapTestDriver79.size();
        int int84 = hashMapTestDriver79.size();
        java.lang.Object obj86 = hashMapTestDriver23.put((java.lang.Object) hashMapTestDriver79, (java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver87 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver87.clear();
        experiment.util.Set set89 = hashMapTestDriver87.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj90 = hashMapTestDriver0.put(obj86, (java.lang.Object) set89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(set89);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test198");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        int int2 = hashMapTestDriver0.size();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) 0);
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver15.remove((java.lang.Object) 100.0f);
        java.lang.Object obj22 = hashMapTestDriver15.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.keySet();
        java.lang.Object obj27 = hashMapTestDriver23.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection28 = hashMapTestDriver23.values();
        java.lang.Object obj29 = hashMapTestDriver15.get((java.lang.Object) collection28);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set31 = hashMapTestDriver30.keySet();
        int int32 = hashMapTestDriver30.size();
        hashMapTestDriver30.clear();
        java.lang.Object obj35 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) (-1L));
        java.lang.Object obj36 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) (-1L));
        experiment.util.Set set37 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test199");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        int int6 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test200");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test201");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        int int9 = hashMapTestDriver0.size();
        java.lang.Class<?> wildcardClass10 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test202");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.remove((java.lang.Object) 0);
        hashMapTestDriver8.clear();
        java.lang.Object obj13 = hashMapTestDriver8.remove((java.lang.Object) 100.0f);
        java.lang.Object obj15 = hashMapTestDriver8.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.keySet();
        java.lang.Object obj20 = hashMapTestDriver16.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection21 = hashMapTestDriver16.values();
        java.lang.Object obj22 = hashMapTestDriver8.get((java.lang.Object) collection21);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.keySet();
        int int25 = hashMapTestDriver23.size();
        hashMapTestDriver23.clear();
        java.lang.Object obj28 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver23, (java.lang.Object) (-1L));
        experiment.util.Collection collection29 = hashMapTestDriver8.values();
        experiment.util.Set set30 = hashMapTestDriver8.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.keySet();
        int int33 = hashMapTestDriver31.size();
        java.lang.Object obj34 = hashMapTestDriver8.get((java.lang.Object) hashMapTestDriver31);
        boolean boolean35 = hashMapTestDriver31.isEmpty();
        java.lang.Object obj36 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver31);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test203");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        int int37 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        java.lang.Object obj40 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) (-1L));
        int int41 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver35);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.keySet();
        java.lang.Object obj47 = hashMapTestDriver43.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj49 = hashMapTestDriver43.get((java.lang.Object) 0.0d);
        boolean boolean51 = hashMapTestDriver43.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection52 = hashMapTestDriver43.values();
        hashMapTestDriver43.clear();
        experiment.util.Collection collection54 = hashMapTestDriver43.values();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj57 = hashMapTestDriver55.remove((java.lang.Object) 0);
        experiment.util.Collection collection58 = hashMapTestDriver55.values();
        java.lang.Object obj60 = hashMapTestDriver55.get((java.lang.Object) 1L);
        java.lang.Object obj61 = hashMapTestDriver43.get((java.lang.Object) hashMapTestDriver55);
        java.lang.Object obj62 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver55);
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver63.clear();
        experiment.util.Set set65 = hashMapTestDriver63.entrySet();
        boolean boolean66 = hashMapTestDriver63.isEmpty();
        experiment.util.Set set67 = hashMapTestDriver63.keySet();
        boolean boolean68 = hashMapTestDriver63.isEmpty();
        experiment.util.Collection collection69 = hashMapTestDriver63.values();
        java.lang.Object obj70 = hashMapTestDriver16.get((java.lang.Object) collection69);
        int int71 = hashMapTestDriver16.size();
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj74 = hashMapTestDriver72.remove((java.lang.Object) 0);
        hashMapTestDriver72.clear();
        int int76 = hashMapTestDriver72.size();
        int int77 = hashMapTestDriver72.size();
        java.lang.Object obj79 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver72, (java.lang.Object) (short) 10);
        experiment.util.Set set80 = hashMapTestDriver16.entrySet();
        experiment.util.Set set81 = hashMapTestDriver16.entrySet();
        experiment.util.Set set82 = hashMapTestDriver16.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNotNull(set82);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test204");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        int int5 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test205");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        experiment.util.Set set13 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver14.remove((java.lang.Object) 0);
        experiment.util.Collection collection17 = hashMapTestDriver14.values();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.keySet();
        java.lang.Object obj22 = hashMapTestDriver18.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj24 = hashMapTestDriver18.get((java.lang.Object) 0.0d);
        boolean boolean26 = hashMapTestDriver18.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection27 = hashMapTestDriver18.values();
        java.lang.Object obj29 = hashMapTestDriver18.remove((java.lang.Object) false);
        experiment.util.Set set30 = hashMapTestDriver18.entrySet();
        boolean boolean31 = hashMapTestDriver18.isEmpty();
        java.lang.Object obj33 = hashMapTestDriver18.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj34 = hashMapTestDriver14.get((java.lang.Object) hashMapTestDriver18);
        experiment.util.Set set35 = hashMapTestDriver18.keySet();
        int int36 = hashMapTestDriver18.size();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj39 = hashMapTestDriver37.remove((java.lang.Object) 0);
        hashMapTestDriver37.clear();
        java.lang.Object obj42 = hashMapTestDriver37.remove((java.lang.Object) 100.0f);
        java.lang.Object obj44 = hashMapTestDriver37.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set46 = hashMapTestDriver45.keySet();
        java.lang.Object obj49 = hashMapTestDriver45.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj51 = hashMapTestDriver45.get((java.lang.Object) 0.0d);
        boolean boolean53 = hashMapTestDriver45.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection54 = hashMapTestDriver45.values();
        java.lang.Object obj56 = hashMapTestDriver45.remove((java.lang.Object) false);
        experiment.util.Set set57 = hashMapTestDriver45.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj60 = hashMapTestDriver58.remove((java.lang.Object) 0);
        hashMapTestDriver58.clear();
        java.lang.Object obj63 = hashMapTestDriver58.remove((java.lang.Object) 100.0f);
        java.lang.Object obj65 = hashMapTestDriver58.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set67 = hashMapTestDriver66.keySet();
        java.lang.Object obj70 = hashMapTestDriver66.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection71 = hashMapTestDriver66.values();
        java.lang.Object obj72 = hashMapTestDriver58.get((java.lang.Object) collection71);
        experiment.util.HashMapTestDriver hashMapTestDriver73 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set74 = hashMapTestDriver73.keySet();
        int int75 = hashMapTestDriver73.size();
        hashMapTestDriver73.clear();
        java.lang.Object obj78 = hashMapTestDriver58.put((java.lang.Object) hashMapTestDriver73, (java.lang.Object) (-1L));
        experiment.util.Collection collection79 = hashMapTestDriver58.values();
        boolean boolean80 = hashMapTestDriver45.containsKey((java.lang.Object) collection79);
        java.lang.Object obj81 = hashMapTestDriver37.remove((java.lang.Object) hashMapTestDriver45);
        experiment.util.Set set82 = hashMapTestDriver45.keySet();
        java.lang.Object obj83 = hashMapTestDriver18.remove((java.lang.Object) hashMapTestDriver45);
        experiment.util.Collection collection84 = hashMapTestDriver45.values();
        java.lang.Object obj85 = hashMapTestDriver0.remove((java.lang.Object) collection84);
        experiment.util.HashMapTestDriver hashMapTestDriver86 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set87 = hashMapTestDriver86.keySet();
        java.lang.Object obj90 = hashMapTestDriver86.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj92 = hashMapTestDriver86.get((java.lang.Object) 0.0d);
        boolean boolean94 = hashMapTestDriver86.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection95 = hashMapTestDriver86.values();
        java.lang.Object obj97 = hashMapTestDriver86.remove((java.lang.Object) false);
        experiment.util.Set set98 = hashMapTestDriver86.entrySet();
        java.lang.Object obj99 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver86);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(collection95);
        org.junit.Assert.assertNull(obj97);
        org.junit.Assert.assertNotNull(set98);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test206");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver6.clear();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        boolean boolean9 = hashMapTestDriver6.isEmpty();
        boolean boolean10 = hashMapTestDriver6.isEmpty();
        experiment.util.Collection collection11 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.remove((java.lang.Object) 0);
        hashMapTestDriver12.clear();
        java.lang.Object obj17 = hashMapTestDriver12.remove((java.lang.Object) 100.0f);
        java.lang.Object obj19 = hashMapTestDriver12.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection20 = hashMapTestDriver12.values();
        java.lang.Object obj21 = hashMapTestDriver6.remove((java.lang.Object) hashMapTestDriver12);
        boolean boolean22 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver6);
        java.lang.Class<?> wildcardClass23 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test207");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.keySet();
        int int9 = hashMapTestDriver7.size();
        experiment.util.Set set10 = hashMapTestDriver7.keySet();
        java.lang.Object obj11 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test208");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        int int9 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set12 = hashMapTestDriver11.keySet();
        java.lang.Object obj15 = hashMapTestDriver11.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj17 = hashMapTestDriver11.get((java.lang.Object) 0.0d);
        boolean boolean19 = hashMapTestDriver11.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection20 = hashMapTestDriver11.values();
        java.lang.Object obj22 = hashMapTestDriver11.remove((java.lang.Object) false);
        experiment.util.Set set23 = hashMapTestDriver11.entrySet();
        boolean boolean24 = hashMapTestDriver11.isEmpty();
        boolean boolean25 = hashMapTestDriver11.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.remove((java.lang.Object) 0);
        java.lang.Object obj31 = hashMapTestDriver26.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver32.clear();
        experiment.util.Set set34 = hashMapTestDriver32.entrySet();
        boolean boolean35 = hashMapTestDriver32.isEmpty();
        boolean boolean36 = hashMapTestDriver32.isEmpty();
        experiment.util.Collection collection37 = hashMapTestDriver32.values();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj40 = hashMapTestDriver38.remove((java.lang.Object) 0);
        hashMapTestDriver38.clear();
        java.lang.Object obj43 = hashMapTestDriver38.remove((java.lang.Object) 100.0f);
        java.lang.Object obj45 = hashMapTestDriver38.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection46 = hashMapTestDriver38.values();
        java.lang.Object obj47 = hashMapTestDriver32.remove((java.lang.Object) hashMapTestDriver38);
        boolean boolean48 = hashMapTestDriver26.containsKey((java.lang.Object) hashMapTestDriver32);
        boolean boolean49 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver32);
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj52 = hashMapTestDriver50.remove((java.lang.Object) 0);
        hashMapTestDriver50.clear();
        java.lang.Object obj55 = hashMapTestDriver50.remove((java.lang.Object) 100.0f);
        java.lang.Object obj57 = hashMapTestDriver50.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection58 = hashMapTestDriver50.values();
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set60 = hashMapTestDriver59.keySet();
        java.lang.Object obj63 = hashMapTestDriver59.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj65 = hashMapTestDriver59.get((java.lang.Object) 0.0d);
        boolean boolean67 = hashMapTestDriver59.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection68 = hashMapTestDriver59.values();
        hashMapTestDriver59.clear();
        java.lang.Object obj71 = hashMapTestDriver59.get((java.lang.Object) '4');
        java.lang.Object obj72 = hashMapTestDriver32.put((java.lang.Object) collection58, (java.lang.Object) hashMapTestDriver59);
        experiment.util.HashMapTestDriver hashMapTestDriver73 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj74 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver59, (java.lang.Object) hashMapTestDriver73);
        experiment.util.HashMapTestDriver hashMapTestDriver75 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj77 = hashMapTestDriver75.remove((java.lang.Object) 0);
        hashMapTestDriver75.clear();
        java.lang.Object obj80 = hashMapTestDriver75.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver81 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set82 = hashMapTestDriver81.keySet();
        java.lang.Object obj85 = hashMapTestDriver81.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set86 = hashMapTestDriver81.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver87 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj89 = hashMapTestDriver87.remove((java.lang.Object) 0);
        experiment.util.Collection collection90 = hashMapTestDriver87.values();
        java.lang.Object obj92 = hashMapTestDriver87.get((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass93 = hashMapTestDriver87.getClass();
        java.lang.Object obj94 = hashMapTestDriver75.put((java.lang.Object) set86, (java.lang.Object) wildcardClass93);
        java.lang.Object obj95 = hashMapTestDriver73.remove((java.lang.Object) wildcardClass93);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNull(obj95);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test209");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.Collection collection11 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.remove((java.lang.Object) 0);
        experiment.util.Collection collection15 = hashMapTestDriver12.values();
        java.lang.Object obj17 = hashMapTestDriver12.get((java.lang.Object) 1L);
        java.lang.Object obj18 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        experiment.util.Set set19 = hashMapTestDriver12.keySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test210");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        int int15 = hashMapTestDriver0.size();
        experiment.util.Set set16 = hashMapTestDriver0.keySet();
        experiment.util.Set set17 = hashMapTestDriver0.entrySet();
        boolean boolean19 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 0);
        java.lang.Object obj21 = hashMapTestDriver0.get((java.lang.Object) 'a');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test211");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj14 = hashMapTestDriver8.get((java.lang.Object) 0.0d);
        boolean boolean16 = hashMapTestDriver8.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection17 = hashMapTestDriver8.values();
        java.lang.Object obj19 = hashMapTestDriver8.remove((java.lang.Object) false);
        experiment.util.Set set20 = hashMapTestDriver8.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) 0);
        hashMapTestDriver21.clear();
        java.lang.Object obj26 = hashMapTestDriver21.remove((java.lang.Object) 100.0f);
        java.lang.Object obj28 = hashMapTestDriver21.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.keySet();
        java.lang.Object obj33 = hashMapTestDriver29.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection34 = hashMapTestDriver29.values();
        java.lang.Object obj35 = hashMapTestDriver21.get((java.lang.Object) collection34);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set37 = hashMapTestDriver36.keySet();
        int int38 = hashMapTestDriver36.size();
        hashMapTestDriver36.clear();
        java.lang.Object obj41 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver36, (java.lang.Object) (-1L));
        experiment.util.Collection collection42 = hashMapTestDriver21.values();
        boolean boolean43 = hashMapTestDriver8.containsKey((java.lang.Object) collection42);
        java.lang.Object obj44 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.remove((java.lang.Object) 0);
        java.lang.Object obj50 = hashMapTestDriver45.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        boolean boolean52 = hashMapTestDriver45.containsKey((java.lang.Object) true);
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver53.clear();
        experiment.util.Set set55 = hashMapTestDriver53.entrySet();
        boolean boolean56 = hashMapTestDriver53.isEmpty();
        boolean boolean57 = hashMapTestDriver53.isEmpty();
        java.lang.Object obj58 = hashMapTestDriver8.put((java.lang.Object) true, (java.lang.Object) hashMapTestDriver53);
        experiment.util.Set set59 = hashMapTestDriver53.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set61 = hashMapTestDriver60.keySet();
        java.lang.Object obj63 = hashMapTestDriver60.get((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set65 = hashMapTestDriver64.keySet();
        java.lang.Object obj68 = hashMapTestDriver64.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set69 = hashMapTestDriver64.entrySet();
        experiment.util.Set set70 = hashMapTestDriver64.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set72 = hashMapTestDriver71.keySet();
        int int73 = hashMapTestDriver71.size();
        experiment.util.Set set74 = hashMapTestDriver71.keySet();
        java.lang.Object obj75 = hashMapTestDriver64.get((java.lang.Object) hashMapTestDriver71);
        hashMapTestDriver71.clear();
        boolean boolean77 = hashMapTestDriver71.isEmpty();
        java.lang.Object obj78 = hashMapTestDriver60.remove((java.lang.Object) boolean77);
        int int79 = hashMapTestDriver60.size();
        experiment.util.HashMapTestDriver hashMapTestDriver80 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set81 = hashMapTestDriver80.keySet();
        java.lang.Object obj84 = hashMapTestDriver80.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj86 = hashMapTestDriver80.get((java.lang.Object) 0.0d);
        boolean boolean88 = hashMapTestDriver80.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection89 = hashMapTestDriver80.values();
        java.lang.Object obj91 = hashMapTestDriver80.remove((java.lang.Object) false);
        experiment.util.Set set92 = hashMapTestDriver80.entrySet();
        boolean boolean93 = hashMapTestDriver80.isEmpty();
        java.lang.Object obj94 = hashMapTestDriver53.put((java.lang.Object) hashMapTestDriver60, (java.lang.Object) boolean93);
        experiment.util.Set set95 = hashMapTestDriver60.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(collection89);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(set92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNotNull(set95);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test212");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test213");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        hashMapTestDriver0.clear();
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        java.lang.Object obj9 = hashMapTestDriver0.get((java.lang.Object) (-1.0f));
        int int10 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test214");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) false);
        experiment.util.Set set16 = hashMapTestDriver4.entrySet();
        boolean boolean17 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        hashMapTestDriver4.clear();
        boolean boolean22 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.keySet();
        java.lang.Object obj27 = hashMapTestDriver23.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj29 = hashMapTestDriver23.get((java.lang.Object) 0.0d);
        boolean boolean31 = hashMapTestDriver23.containsKey((java.lang.Object) (short) 10);
        int int32 = hashMapTestDriver23.size();
        hashMapTestDriver23.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set35 = hashMapTestDriver34.keySet();
        java.lang.Object obj38 = hashMapTestDriver34.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj40 = hashMapTestDriver34.get((java.lang.Object) 0.0d);
        boolean boolean42 = hashMapTestDriver34.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection43 = hashMapTestDriver34.values();
        java.lang.Object obj45 = hashMapTestDriver34.remove((java.lang.Object) false);
        experiment.util.Set set46 = hashMapTestDriver34.entrySet();
        boolean boolean47 = hashMapTestDriver34.isEmpty();
        boolean boolean48 = hashMapTestDriver34.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj51 = hashMapTestDriver49.remove((java.lang.Object) 0);
        java.lang.Object obj54 = hashMapTestDriver49.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver55.clear();
        experiment.util.Set set57 = hashMapTestDriver55.entrySet();
        boolean boolean58 = hashMapTestDriver55.isEmpty();
        boolean boolean59 = hashMapTestDriver55.isEmpty();
        experiment.util.Collection collection60 = hashMapTestDriver55.values();
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj63 = hashMapTestDriver61.remove((java.lang.Object) 0);
        hashMapTestDriver61.clear();
        java.lang.Object obj66 = hashMapTestDriver61.remove((java.lang.Object) 100.0f);
        java.lang.Object obj68 = hashMapTestDriver61.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection69 = hashMapTestDriver61.values();
        java.lang.Object obj70 = hashMapTestDriver55.remove((java.lang.Object) hashMapTestDriver61);
        boolean boolean71 = hashMapTestDriver49.containsKey((java.lang.Object) hashMapTestDriver55);
        boolean boolean72 = hashMapTestDriver34.containsKey((java.lang.Object) hashMapTestDriver55);
        experiment.util.HashMapTestDriver hashMapTestDriver73 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj75 = hashMapTestDriver73.remove((java.lang.Object) 0);
        hashMapTestDriver73.clear();
        java.lang.Object obj78 = hashMapTestDriver73.remove((java.lang.Object) 100.0f);
        java.lang.Object obj80 = hashMapTestDriver73.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection81 = hashMapTestDriver73.values();
        experiment.util.HashMapTestDriver hashMapTestDriver82 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set83 = hashMapTestDriver82.keySet();
        java.lang.Object obj86 = hashMapTestDriver82.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj88 = hashMapTestDriver82.get((java.lang.Object) 0.0d);
        boolean boolean90 = hashMapTestDriver82.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection91 = hashMapTestDriver82.values();
        hashMapTestDriver82.clear();
        java.lang.Object obj94 = hashMapTestDriver82.get((java.lang.Object) '4');
        java.lang.Object obj95 = hashMapTestDriver55.put((java.lang.Object) collection81, (java.lang.Object) hashMapTestDriver82);
        experiment.util.HashMapTestDriver hashMapTestDriver96 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj97 = hashMapTestDriver23.put((java.lang.Object) hashMapTestDriver82, (java.lang.Object) hashMapTestDriver96);
        boolean boolean98 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver96);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(collection91);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNull(obj97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test215");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.keySet();
        int int9 = hashMapTestDriver7.size();
        experiment.util.Set set10 = hashMapTestDriver7.keySet();
        java.lang.Object obj11 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.keySet();
        java.lang.Object obj16 = hashMapTestDriver12.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set17 = hashMapTestDriver12.entrySet();
        experiment.util.Set set18 = hashMapTestDriver12.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.keySet();
        java.lang.Object obj23 = hashMapTestDriver19.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        int int24 = hashMapTestDriver19.size();
        java.lang.Object obj25 = hashMapTestDriver12.remove((java.lang.Object) int24);
        hashMapTestDriver12.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set28 = hashMapTestDriver27.keySet();
        java.lang.Object obj31 = hashMapTestDriver27.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj33 = hashMapTestDriver27.get((java.lang.Object) 0.0d);
        boolean boolean35 = hashMapTestDriver27.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection36 = hashMapTestDriver27.values();
        hashMapTestDriver27.clear();
        experiment.util.Collection collection38 = hashMapTestDriver27.values();
        boolean boolean39 = hashMapTestDriver27.isEmpty();
        experiment.util.Collection collection40 = hashMapTestDriver27.values();
        hashMapTestDriver27.clear();
        java.lang.Object obj42 = hashMapTestDriver12.get((java.lang.Object) hashMapTestDriver27);
        boolean boolean43 = hashMapTestDriver12.isEmpty();
        java.lang.Object obj44 = hashMapTestDriver7.get((java.lang.Object) hashMapTestDriver12);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test216");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj5 = hashMapTestDriver3.remove((java.lang.Object) 0);
        java.lang.Object obj8 = hashMapTestDriver3.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver9.clear();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver9.isEmpty();
        boolean boolean13 = hashMapTestDriver9.isEmpty();
        experiment.util.Collection collection14 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) 0);
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver15.remove((java.lang.Object) 100.0f);
        java.lang.Object obj22 = hashMapTestDriver15.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection23 = hashMapTestDriver15.values();
        java.lang.Object obj24 = hashMapTestDriver9.remove((java.lang.Object) hashMapTestDriver15);
        boolean boolean25 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Collection collection26 = hashMapTestDriver9.values();
        java.lang.Object obj27 = hashMapTestDriver0.put((java.lang.Object) (-1), (java.lang.Object) collection26);
        experiment.util.Collection collection28 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass29 = collection28.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test217");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) false);
        experiment.util.Set set16 = hashMapTestDriver4.entrySet();
        boolean boolean17 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        experiment.util.Set set21 = hashMapTestDriver4.keySet();
        int int22 = hashMapTestDriver4.size();
        experiment.util.Set set23 = hashMapTestDriver4.entrySet();
        boolean boolean24 = hashMapTestDriver4.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test218");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.remove((java.lang.Object) 0);
        hashMapTestDriver13.clear();
        java.lang.Object obj18 = hashMapTestDriver13.remove((java.lang.Object) 100.0f);
        java.lang.Object obj20 = hashMapTestDriver13.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set22 = hashMapTestDriver21.keySet();
        java.lang.Object obj25 = hashMapTestDriver21.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection26 = hashMapTestDriver21.values();
        java.lang.Object obj27 = hashMapTestDriver13.get((java.lang.Object) collection26);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        int int30 = hashMapTestDriver28.size();
        hashMapTestDriver28.clear();
        java.lang.Object obj33 = hashMapTestDriver13.put((java.lang.Object) hashMapTestDriver28, (java.lang.Object) (-1L));
        experiment.util.Collection collection34 = hashMapTestDriver13.values();
        boolean boolean35 = hashMapTestDriver0.containsKey((java.lang.Object) collection34);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj38 = hashMapTestDriver36.remove((java.lang.Object) 0);
        java.lang.Object obj41 = hashMapTestDriver36.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver42.clear();
        experiment.util.Set set44 = hashMapTestDriver42.entrySet();
        boolean boolean45 = hashMapTestDriver42.isEmpty();
        boolean boolean46 = hashMapTestDriver42.isEmpty();
        experiment.util.Collection collection47 = hashMapTestDriver42.values();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj50 = hashMapTestDriver48.remove((java.lang.Object) 0);
        hashMapTestDriver48.clear();
        java.lang.Object obj53 = hashMapTestDriver48.remove((java.lang.Object) 100.0f);
        java.lang.Object obj55 = hashMapTestDriver48.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection56 = hashMapTestDriver48.values();
        java.lang.Object obj57 = hashMapTestDriver42.remove((java.lang.Object) hashMapTestDriver48);
        boolean boolean58 = hashMapTestDriver36.containsKey((java.lang.Object) hashMapTestDriver42);
        hashMapTestDriver42.clear();
        boolean boolean60 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver42);
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver61.clear();
        experiment.util.Collection collection63 = hashMapTestDriver61.values();
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver64.clear();
        boolean boolean66 = hashMapTestDriver64.isEmpty();
        experiment.util.Collection collection67 = hashMapTestDriver64.values();
        java.lang.Class<?> wildcardClass68 = collection67.getClass();
        java.lang.Object obj69 = hashMapTestDriver42.put((java.lang.Object) hashMapTestDriver61, (java.lang.Object) wildcardClass68);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test219");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.keySet();
        java.lang.Object obj13 = hashMapTestDriver9.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver14.clear();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        boolean boolean17 = hashMapTestDriver14.isEmpty();
        boolean boolean18 = hashMapTestDriver14.isEmpty();
        experiment.util.Collection collection19 = hashMapTestDriver14.values();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver14);
        experiment.util.Set set21 = hashMapTestDriver14.entrySet();
        java.lang.Class<?> wildcardClass22 = hashMapTestDriver14.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test220");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj14 = hashMapTestDriver8.get((java.lang.Object) 0.0d);
        boolean boolean15 = hashMapTestDriver0.containsKey((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.keySet();
        java.lang.Object obj18 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver16);
        boolean boolean19 = hashMapTestDriver16.isEmpty();
        experiment.util.Collection collection20 = hashMapTestDriver16.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection20);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test221");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test222");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.remove((java.lang.Object) 0);
        hashMapTestDriver13.clear();
        java.lang.Object obj18 = hashMapTestDriver13.remove((java.lang.Object) 100.0f);
        java.lang.Object obj20 = hashMapTestDriver13.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set22 = hashMapTestDriver21.keySet();
        java.lang.Object obj25 = hashMapTestDriver21.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection26 = hashMapTestDriver21.values();
        java.lang.Object obj27 = hashMapTestDriver13.get((java.lang.Object) collection26);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        int int30 = hashMapTestDriver28.size();
        hashMapTestDriver28.clear();
        java.lang.Object obj33 = hashMapTestDriver13.put((java.lang.Object) hashMapTestDriver28, (java.lang.Object) (-1L));
        experiment.util.Collection collection34 = hashMapTestDriver13.values();
        boolean boolean35 = hashMapTestDriver0.containsKey((java.lang.Object) collection34);
        java.lang.Object obj36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = hashMapTestDriver0.get(obj36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test223");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver6.clear();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        boolean boolean9 = hashMapTestDriver6.isEmpty();
        boolean boolean10 = hashMapTestDriver6.isEmpty();
        experiment.util.Collection collection11 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.remove((java.lang.Object) 0);
        hashMapTestDriver12.clear();
        java.lang.Object obj17 = hashMapTestDriver12.remove((java.lang.Object) 100.0f);
        java.lang.Object obj19 = hashMapTestDriver12.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection20 = hashMapTestDriver12.values();
        java.lang.Object obj21 = hashMapTestDriver6.remove((java.lang.Object) hashMapTestDriver12);
        boolean boolean22 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver6);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.keySet();
        java.lang.Object obj27 = hashMapTestDriver23.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        hashMapTestDriver23.clear();
        boolean boolean29 = hashMapTestDriver23.isEmpty();
        experiment.util.Set set30 = hashMapTestDriver23.entrySet();
        java.lang.Object obj31 = hashMapTestDriver6.get((java.lang.Object) set30);
        hashMapTestDriver6.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set34 = hashMapTestDriver33.keySet();
        java.lang.Object obj37 = hashMapTestDriver33.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj39 = hashMapTestDriver33.get((java.lang.Object) 0.0d);
        boolean boolean41 = hashMapTestDriver33.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection42 = hashMapTestDriver33.values();
        java.lang.Object obj44 = hashMapTestDriver33.remove((java.lang.Object) false);
        experiment.util.Set set45 = hashMapTestDriver33.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj48 = hashMapTestDriver46.remove((java.lang.Object) 0);
        hashMapTestDriver46.clear();
        java.lang.Object obj51 = hashMapTestDriver46.remove((java.lang.Object) 100.0f);
        java.lang.Object obj53 = hashMapTestDriver46.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set55 = hashMapTestDriver54.keySet();
        java.lang.Object obj58 = hashMapTestDriver54.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection59 = hashMapTestDriver54.values();
        java.lang.Object obj60 = hashMapTestDriver46.get((java.lang.Object) collection59);
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set62 = hashMapTestDriver61.keySet();
        int int63 = hashMapTestDriver61.size();
        hashMapTestDriver61.clear();
        java.lang.Object obj66 = hashMapTestDriver46.put((java.lang.Object) hashMapTestDriver61, (java.lang.Object) (-1L));
        experiment.util.Collection collection67 = hashMapTestDriver46.values();
        boolean boolean68 = hashMapTestDriver33.containsKey((java.lang.Object) collection67);
        experiment.util.Collection collection69 = hashMapTestDriver33.values();
        java.lang.Object obj70 = hashMapTestDriver6.remove((java.lang.Object) collection69);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj70);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test224");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.keySet();
        java.lang.Object obj13 = hashMapTestDriver9.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver14.clear();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        boolean boolean17 = hashMapTestDriver14.isEmpty();
        boolean boolean18 = hashMapTestDriver14.isEmpty();
        experiment.util.Collection collection19 = hashMapTestDriver14.values();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver14);
        experiment.util.Set set21 = hashMapTestDriver14.keySet();
        int int22 = hashMapTestDriver14.size();
        experiment.util.Set set23 = hashMapTestDriver14.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test225");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver6.clear();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        boolean boolean9 = hashMapTestDriver6.isEmpty();
        boolean boolean10 = hashMapTestDriver6.isEmpty();
        experiment.util.Collection collection11 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.remove((java.lang.Object) 0);
        hashMapTestDriver12.clear();
        java.lang.Object obj17 = hashMapTestDriver12.remove((java.lang.Object) 100.0f);
        java.lang.Object obj19 = hashMapTestDriver12.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection20 = hashMapTestDriver12.values();
        java.lang.Object obj21 = hashMapTestDriver6.remove((java.lang.Object) hashMapTestDriver12);
        boolean boolean22 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver6);
        experiment.util.Collection collection23 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver24.clear();
        experiment.util.Set set26 = hashMapTestDriver24.entrySet();
        java.lang.Class<?> wildcardClass27 = set26.getClass();
        java.lang.Object obj28 = hashMapTestDriver6.remove((java.lang.Object) set26);
        java.lang.Class<?> wildcardClass29 = hashMapTestDriver6.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test226");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        int int15 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.keySet();
        java.lang.Object obj20 = hashMapTestDriver16.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj22 = hashMapTestDriver16.get((java.lang.Object) 0.0d);
        boolean boolean24 = hashMapTestDriver16.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        java.lang.Object obj27 = hashMapTestDriver16.remove((java.lang.Object) false);
        experiment.util.Set set28 = hashMapTestDriver16.entrySet();
        boolean boolean29 = hashMapTestDriver16.isEmpty();
        boolean boolean30 = hashMapTestDriver16.isEmpty();
        java.lang.Object obj31 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver16);
        experiment.util.Set set32 = hashMapTestDriver16.keySet();
        experiment.util.Collection collection33 = hashMapTestDriver16.values();
        hashMapTestDriver16.clear();
        hashMapTestDriver16.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test227");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) 1.0f);
        int int8 = hashMapTestDriver0.size();
        boolean boolean9 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver11.remove((java.lang.Object) 0);
        hashMapTestDriver11.clear();
        java.lang.Object obj16 = hashMapTestDriver11.remove((java.lang.Object) 100.0f);
        java.lang.Object obj18 = hashMapTestDriver11.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.keySet();
        java.lang.Object obj23 = hashMapTestDriver19.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection24 = hashMapTestDriver19.values();
        java.lang.Object obj25 = hashMapTestDriver11.get((java.lang.Object) collection24);
        int int26 = hashMapTestDriver11.size();
        experiment.util.Collection collection27 = hashMapTestDriver11.values();
        boolean boolean28 = hashMapTestDriver0.containsKey((java.lang.Object) collection27);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test228");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.keySet();
        java.lang.Object obj20 = hashMapTestDriver16.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj22 = hashMapTestDriver16.get((java.lang.Object) 0.0d);
        boolean boolean24 = hashMapTestDriver16.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        java.lang.Object obj27 = hashMapTestDriver16.remove((java.lang.Object) false);
        experiment.util.Set set28 = hashMapTestDriver16.entrySet();
        boolean boolean29 = hashMapTestDriver16.isEmpty();
        boolean boolean30 = hashMapTestDriver16.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj33 = hashMapTestDriver31.remove((java.lang.Object) 0);
        java.lang.Object obj36 = hashMapTestDriver31.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver37.clear();
        experiment.util.Set set39 = hashMapTestDriver37.entrySet();
        boolean boolean40 = hashMapTestDriver37.isEmpty();
        boolean boolean41 = hashMapTestDriver37.isEmpty();
        experiment.util.Collection collection42 = hashMapTestDriver37.values();
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj45 = hashMapTestDriver43.remove((java.lang.Object) 0);
        hashMapTestDriver43.clear();
        java.lang.Object obj48 = hashMapTestDriver43.remove((java.lang.Object) 100.0f);
        java.lang.Object obj50 = hashMapTestDriver43.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection51 = hashMapTestDriver43.values();
        java.lang.Object obj52 = hashMapTestDriver37.remove((java.lang.Object) hashMapTestDriver43);
        boolean boolean53 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver37);
        boolean boolean54 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver37);
        int int55 = hashMapTestDriver16.size();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set57 = hashMapTestDriver56.keySet();
        java.lang.Object obj60 = hashMapTestDriver56.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        int int61 = hashMapTestDriver56.size();
        boolean boolean62 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver56);
        java.lang.Object obj63 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver56);
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj66 = hashMapTestDriver64.remove((java.lang.Object) 0);
        java.lang.Object obj69 = hashMapTestDriver64.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver70 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver70.clear();
        experiment.util.Set set72 = hashMapTestDriver70.entrySet();
        boolean boolean73 = hashMapTestDriver70.isEmpty();
        boolean boolean74 = hashMapTestDriver70.isEmpty();
        experiment.util.Collection collection75 = hashMapTestDriver70.values();
        experiment.util.HashMapTestDriver hashMapTestDriver76 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj78 = hashMapTestDriver76.remove((java.lang.Object) 0);
        hashMapTestDriver76.clear();
        java.lang.Object obj81 = hashMapTestDriver76.remove((java.lang.Object) 100.0f);
        java.lang.Object obj83 = hashMapTestDriver76.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection84 = hashMapTestDriver76.values();
        java.lang.Object obj85 = hashMapTestDriver70.remove((java.lang.Object) hashMapTestDriver76);
        boolean boolean86 = hashMapTestDriver64.containsKey((java.lang.Object) hashMapTestDriver70);
        experiment.util.Collection collection87 = hashMapTestDriver70.values();
        experiment.util.Set set88 = hashMapTestDriver70.entrySet();
        boolean boolean89 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver70);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test229");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        boolean boolean10 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set12 = hashMapTestDriver11.keySet();
        java.lang.Object obj15 = hashMapTestDriver11.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj17 = hashMapTestDriver11.get((java.lang.Object) 0.0d);
        boolean boolean19 = hashMapTestDriver11.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection20 = hashMapTestDriver11.values();
        java.lang.Object obj22 = hashMapTestDriver11.remove((java.lang.Object) false);
        experiment.util.Set set23 = hashMapTestDriver11.entrySet();
        java.lang.Class<?> wildcardClass24 = hashMapTestDriver11.getClass();
        boolean boolean25 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver11);
        int int26 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver27);
        boolean boolean29 = hashMapTestDriver27.isEmpty();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test230");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.remove((java.lang.Object) 0);
        experiment.util.Collection collection7 = hashMapTestDriver4.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj14 = hashMapTestDriver8.get((java.lang.Object) 0.0d);
        boolean boolean16 = hashMapTestDriver8.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection17 = hashMapTestDriver8.values();
        java.lang.Object obj19 = hashMapTestDriver8.remove((java.lang.Object) false);
        experiment.util.Set set20 = hashMapTestDriver8.entrySet();
        boolean boolean21 = hashMapTestDriver8.isEmpty();
        java.lang.Object obj23 = hashMapTestDriver8.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj24 = hashMapTestDriver4.get((java.lang.Object) hashMapTestDriver8);
        boolean boolean26 = hashMapTestDriver4.containsKey((java.lang.Object) ' ');
        java.lang.Object obj27 = hashMapTestDriver0.get((java.lang.Object) boolean26);
        experiment.util.Set set28 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test231");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        int int17 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) (-1L));
        boolean boolean22 = hashMapTestDriver15.containsKey((java.lang.Object) '4');
        experiment.util.Set set23 = hashMapTestDriver15.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test232");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) false);
        experiment.util.Set set16 = hashMapTestDriver4.entrySet();
        boolean boolean17 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        experiment.util.Set set21 = hashMapTestDriver4.keySet();
        int int22 = hashMapTestDriver4.size();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) 0);
        hashMapTestDriver23.clear();
        java.lang.Object obj28 = hashMapTestDriver23.remove((java.lang.Object) 100.0f);
        java.lang.Object obj30 = hashMapTestDriver23.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.keySet();
        java.lang.Object obj35 = hashMapTestDriver31.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj37 = hashMapTestDriver31.get((java.lang.Object) 0.0d);
        boolean boolean39 = hashMapTestDriver31.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection40 = hashMapTestDriver31.values();
        java.lang.Object obj42 = hashMapTestDriver31.remove((java.lang.Object) false);
        experiment.util.Set set43 = hashMapTestDriver31.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj46 = hashMapTestDriver44.remove((java.lang.Object) 0);
        hashMapTestDriver44.clear();
        java.lang.Object obj49 = hashMapTestDriver44.remove((java.lang.Object) 100.0f);
        java.lang.Object obj51 = hashMapTestDriver44.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set53 = hashMapTestDriver52.keySet();
        java.lang.Object obj56 = hashMapTestDriver52.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection57 = hashMapTestDriver52.values();
        java.lang.Object obj58 = hashMapTestDriver44.get((java.lang.Object) collection57);
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set60 = hashMapTestDriver59.keySet();
        int int61 = hashMapTestDriver59.size();
        hashMapTestDriver59.clear();
        java.lang.Object obj64 = hashMapTestDriver44.put((java.lang.Object) hashMapTestDriver59, (java.lang.Object) (-1L));
        experiment.util.Collection collection65 = hashMapTestDriver44.values();
        boolean boolean66 = hashMapTestDriver31.containsKey((java.lang.Object) collection65);
        java.lang.Object obj67 = hashMapTestDriver23.remove((java.lang.Object) hashMapTestDriver31);
        experiment.util.Set set68 = hashMapTestDriver31.keySet();
        java.lang.Object obj69 = hashMapTestDriver4.remove((java.lang.Object) hashMapTestDriver31);
        experiment.util.Collection collection70 = hashMapTestDriver31.values();
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set72 = hashMapTestDriver71.keySet();
        java.lang.Object obj75 = hashMapTestDriver71.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj77 = hashMapTestDriver71.get((java.lang.Object) 0.0d);
        boolean boolean79 = hashMapTestDriver71.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection80 = hashMapTestDriver71.values();
        java.lang.Object obj82 = hashMapTestDriver71.remove((java.lang.Object) false);
        experiment.util.Set set83 = hashMapTestDriver71.entrySet();
        java.lang.Object obj85 = hashMapTestDriver71.get((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass86 = obj85.getClass();
        boolean boolean87 = hashMapTestDriver31.containsKey(obj85);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + (-1) + "'", obj85, (-1));
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test233");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        int int4 = hashMapTestDriver0.size();
        int int5 = hashMapTestDriver0.size();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test234");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) false);
        experiment.util.Set set16 = hashMapTestDriver4.entrySet();
        boolean boolean17 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        experiment.util.Set set21 = hashMapTestDriver4.keySet();
        int int22 = hashMapTestDriver4.size();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) 0);
        hashMapTestDriver23.clear();
        java.lang.Object obj28 = hashMapTestDriver23.remove((java.lang.Object) 100.0f);
        java.lang.Object obj30 = hashMapTestDriver23.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.keySet();
        java.lang.Object obj35 = hashMapTestDriver31.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj37 = hashMapTestDriver31.get((java.lang.Object) 0.0d);
        boolean boolean39 = hashMapTestDriver31.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection40 = hashMapTestDriver31.values();
        java.lang.Object obj42 = hashMapTestDriver31.remove((java.lang.Object) false);
        experiment.util.Set set43 = hashMapTestDriver31.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj46 = hashMapTestDriver44.remove((java.lang.Object) 0);
        hashMapTestDriver44.clear();
        java.lang.Object obj49 = hashMapTestDriver44.remove((java.lang.Object) 100.0f);
        java.lang.Object obj51 = hashMapTestDriver44.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set53 = hashMapTestDriver52.keySet();
        java.lang.Object obj56 = hashMapTestDriver52.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection57 = hashMapTestDriver52.values();
        java.lang.Object obj58 = hashMapTestDriver44.get((java.lang.Object) collection57);
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set60 = hashMapTestDriver59.keySet();
        int int61 = hashMapTestDriver59.size();
        hashMapTestDriver59.clear();
        java.lang.Object obj64 = hashMapTestDriver44.put((java.lang.Object) hashMapTestDriver59, (java.lang.Object) (-1L));
        experiment.util.Collection collection65 = hashMapTestDriver44.values();
        boolean boolean66 = hashMapTestDriver31.containsKey((java.lang.Object) collection65);
        java.lang.Object obj67 = hashMapTestDriver23.remove((java.lang.Object) hashMapTestDriver31);
        experiment.util.Set set68 = hashMapTestDriver31.keySet();
        java.lang.Object obj69 = hashMapTestDriver4.remove((java.lang.Object) hashMapTestDriver31);
        experiment.util.Collection collection70 = hashMapTestDriver31.values();
        boolean boolean71 = hashMapTestDriver31.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test235");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.keySet();
        java.lang.Object obj13 = hashMapTestDriver9.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver14.clear();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        boolean boolean17 = hashMapTestDriver14.isEmpty();
        boolean boolean18 = hashMapTestDriver14.isEmpty();
        experiment.util.Collection collection19 = hashMapTestDriver14.values();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver14);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) 0);
        hashMapTestDriver21.clear();
        java.lang.Object obj26 = hashMapTestDriver21.remove((java.lang.Object) 100.0f);
        java.lang.Object obj28 = hashMapTestDriver21.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.keySet();
        java.lang.Object obj33 = hashMapTestDriver29.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection34 = hashMapTestDriver29.values();
        java.lang.Object obj35 = hashMapTestDriver21.get((java.lang.Object) collection34);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set37 = hashMapTestDriver36.keySet();
        int int38 = hashMapTestDriver36.size();
        hashMapTestDriver36.clear();
        java.lang.Object obj41 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver36, (java.lang.Object) (-1L));
        boolean boolean43 = hashMapTestDriver36.containsKey((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj46 = hashMapTestDriver44.remove((java.lang.Object) 0);
        experiment.util.Collection collection47 = hashMapTestDriver44.values();
        boolean boolean48 = hashMapTestDriver36.containsKey((java.lang.Object) hashMapTestDriver44);
        experiment.util.Collection collection49 = hashMapTestDriver36.values();
        boolean boolean50 = hashMapTestDriver14.containsKey((java.lang.Object) hashMapTestDriver36);
        experiment.util.Set set51 = hashMapTestDriver14.entrySet();
        boolean boolean52 = hashMapTestDriver14.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test236");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj3 = hashMapTestDriver0.get((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set9 = hashMapTestDriver4.entrySet();
        experiment.util.Set set10 = hashMapTestDriver4.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set12 = hashMapTestDriver11.keySet();
        int int13 = hashMapTestDriver11.size();
        experiment.util.Set set14 = hashMapTestDriver11.keySet();
        java.lang.Object obj15 = hashMapTestDriver4.get((java.lang.Object) hashMapTestDriver11);
        hashMapTestDriver11.clear();
        boolean boolean17 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj18 = hashMapTestDriver0.remove((java.lang.Object) boolean17);
        int int19 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set22 = hashMapTestDriver21.keySet();
        java.lang.Object obj25 = hashMapTestDriver21.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj27 = hashMapTestDriver21.get((java.lang.Object) 0.0d);
        boolean boolean29 = hashMapTestDriver21.containsKey((java.lang.Object) (short) 10);
        int int30 = hashMapTestDriver21.size();
        hashMapTestDriver21.clear();
        java.lang.Object obj32 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver21);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test237");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        hashMapTestDriver0.clear();
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        int int10 = hashMapTestDriver8.size();
        experiment.util.Set set11 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.keySet();
        java.lang.Object obj16 = hashMapTestDriver12.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj18 = hashMapTestDriver12.get((java.lang.Object) 0.0d);
        boolean boolean20 = hashMapTestDriver12.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection21 = hashMapTestDriver12.values();
        hashMapTestDriver12.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) 0);
        hashMapTestDriver23.clear();
        java.lang.Object obj28 = hashMapTestDriver23.remove((java.lang.Object) 100.0f);
        java.lang.Object obj30 = hashMapTestDriver23.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.keySet();
        java.lang.Object obj35 = hashMapTestDriver31.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection36 = hashMapTestDriver31.values();
        java.lang.Object obj37 = hashMapTestDriver23.get((java.lang.Object) collection36);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.keySet();
        int int40 = hashMapTestDriver38.size();
        hashMapTestDriver38.clear();
        java.lang.Object obj43 = hashMapTestDriver23.put((java.lang.Object) hashMapTestDriver38, (java.lang.Object) (-1L));
        java.lang.Object obj44 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver12, (java.lang.Object) (-1L));
        hashMapTestDriver8.clear();
        java.lang.Object obj46 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver47.clear();
        experiment.util.Set set49 = hashMapTestDriver47.entrySet();
        boolean boolean50 = hashMapTestDriver47.isEmpty();
        boolean boolean51 = hashMapTestDriver47.isEmpty();
        hashMapTestDriver47.clear();
        experiment.util.Set set53 = hashMapTestDriver47.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver54.clear();
        experiment.util.Set set56 = hashMapTestDriver54.entrySet();
        boolean boolean57 = hashMapTestDriver54.isEmpty();
        boolean boolean58 = hashMapTestDriver54.isEmpty();
        experiment.util.Collection collection59 = hashMapTestDriver54.values();
        java.lang.Object obj60 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver47, (java.lang.Object) collection59);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test238");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        boolean boolean14 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) 0);
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver21.clear();
        experiment.util.Set set23 = hashMapTestDriver21.entrySet();
        boolean boolean24 = hashMapTestDriver21.isEmpty();
        boolean boolean25 = hashMapTestDriver21.isEmpty();
        experiment.util.Collection collection26 = hashMapTestDriver21.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) 0);
        hashMapTestDriver27.clear();
        java.lang.Object obj32 = hashMapTestDriver27.remove((java.lang.Object) 100.0f);
        java.lang.Object obj34 = hashMapTestDriver27.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection35 = hashMapTestDriver27.values();
        java.lang.Object obj36 = hashMapTestDriver21.remove((java.lang.Object) hashMapTestDriver27);
        boolean boolean37 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver21);
        boolean boolean38 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver21);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj41 = hashMapTestDriver39.remove((java.lang.Object) 0);
        hashMapTestDriver39.clear();
        java.lang.Object obj44 = hashMapTestDriver39.remove((java.lang.Object) 100.0f);
        java.lang.Object obj46 = hashMapTestDriver39.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection47 = hashMapTestDriver39.values();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set49 = hashMapTestDriver48.keySet();
        java.lang.Object obj52 = hashMapTestDriver48.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj54 = hashMapTestDriver48.get((java.lang.Object) 0.0d);
        boolean boolean56 = hashMapTestDriver48.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection57 = hashMapTestDriver48.values();
        hashMapTestDriver48.clear();
        java.lang.Object obj60 = hashMapTestDriver48.get((java.lang.Object) '4');
        java.lang.Object obj61 = hashMapTestDriver21.put((java.lang.Object) collection47, (java.lang.Object) hashMapTestDriver48);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass62 = obj61.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test239");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        int int37 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        java.lang.Object obj40 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) (-1L));
        int int41 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver35);
        boolean boolean43 = hashMapTestDriver16.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set45 = hashMapTestDriver44.keySet();
        java.lang.Object obj47 = hashMapTestDriver44.get((java.lang.Object) (byte) 0);
        java.lang.Object obj48 = hashMapTestDriver16.get((java.lang.Object) (byte) 0);
        int int49 = hashMapTestDriver16.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test240");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.keySet();
        int int9 = hashMapTestDriver7.size();
        experiment.util.Set set10 = hashMapTestDriver7.keySet();
        java.lang.Object obj11 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver7);
        hashMapTestDriver7.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.keySet();
        java.lang.Object obj17 = hashMapTestDriver13.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        hashMapTestDriver13.clear();
        java.lang.Class<?> wildcardClass19 = hashMapTestDriver13.getClass();
        java.lang.Object obj20 = hashMapTestDriver7.get((java.lang.Object) hashMapTestDriver13);
        hashMapTestDriver13.clear();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test241");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj9 = hashMapTestDriver5.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        java.lang.Object obj10 = hashMapTestDriver0.remove((java.lang.Object) (byte) 100);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.keySet();
        java.lang.Object obj16 = hashMapTestDriver12.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj18 = hashMapTestDriver12.get((java.lang.Object) 0.0d);
        boolean boolean20 = hashMapTestDriver12.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection21 = hashMapTestDriver12.values();
        java.lang.Object obj23 = hashMapTestDriver12.remove((java.lang.Object) false);
        experiment.util.Set set24 = hashMapTestDriver12.entrySet();
        boolean boolean25 = hashMapTestDriver12.isEmpty();
        boolean boolean26 = hashMapTestDriver12.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) 0);
        java.lang.Object obj32 = hashMapTestDriver27.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver33.clear();
        experiment.util.Set set35 = hashMapTestDriver33.entrySet();
        boolean boolean36 = hashMapTestDriver33.isEmpty();
        boolean boolean37 = hashMapTestDriver33.isEmpty();
        experiment.util.Collection collection38 = hashMapTestDriver33.values();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj41 = hashMapTestDriver39.remove((java.lang.Object) 0);
        hashMapTestDriver39.clear();
        java.lang.Object obj44 = hashMapTestDriver39.remove((java.lang.Object) 100.0f);
        java.lang.Object obj46 = hashMapTestDriver39.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection47 = hashMapTestDriver39.values();
        java.lang.Object obj48 = hashMapTestDriver33.remove((java.lang.Object) hashMapTestDriver39);
        boolean boolean49 = hashMapTestDriver27.containsKey((java.lang.Object) hashMapTestDriver33);
        boolean boolean50 = hashMapTestDriver12.containsKey((java.lang.Object) hashMapTestDriver33);
        int int51 = hashMapTestDriver12.size();
        boolean boolean52 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver12);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test242");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        int int17 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) (-1L));
        boolean boolean22 = hashMapTestDriver15.containsKey((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) 0);
        experiment.util.Collection collection26 = hashMapTestDriver23.values();
        boolean boolean27 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver23);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver28.remove((java.lang.Object) 0);
        hashMapTestDriver28.clear();
        java.lang.Object obj33 = hashMapTestDriver28.remove((java.lang.Object) 100.0f);
        java.lang.Object obj35 = hashMapTestDriver28.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection36 = hashMapTestDriver28.values();
        boolean boolean37 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver28);
        java.lang.Object obj38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj39 = hashMapTestDriver15.remove(obj38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test243");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver11.remove((java.lang.Object) 0);
        hashMapTestDriver11.clear();
        java.lang.Object obj16 = hashMapTestDriver11.remove((java.lang.Object) 100.0f);
        java.lang.Object obj18 = hashMapTestDriver11.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.keySet();
        java.lang.Object obj23 = hashMapTestDriver19.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection24 = hashMapTestDriver19.values();
        java.lang.Object obj25 = hashMapTestDriver11.get((java.lang.Object) collection24);
        int int26 = hashMapTestDriver11.size();
        experiment.util.Collection collection27 = hashMapTestDriver11.values();
        experiment.util.Collection collection28 = hashMapTestDriver11.values();
        java.lang.Object obj29 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver11);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test244");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver7.remove((java.lang.Object) 0);
        hashMapTestDriver7.clear();
        java.lang.Object obj12 = hashMapTestDriver7.remove((java.lang.Object) 100.0f);
        java.lang.Object obj14 = hashMapTestDriver7.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        java.lang.Object obj19 = hashMapTestDriver15.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection20 = hashMapTestDriver15.values();
        java.lang.Object obj21 = hashMapTestDriver7.get((java.lang.Object) collection20);
        hashMapTestDriver7.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.remove((java.lang.Object) 0);
        experiment.util.Collection collection26 = hashMapTestDriver23.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) 0);
        hashMapTestDriver27.clear();
        java.lang.Object obj32 = hashMapTestDriver27.remove((java.lang.Object) 100.0f);
        java.lang.Object obj34 = hashMapTestDriver27.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        java.lang.Object obj39 = hashMapTestDriver35.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection40 = hashMapTestDriver35.values();
        java.lang.Object obj41 = hashMapTestDriver27.get((java.lang.Object) collection40);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set43 = hashMapTestDriver42.keySet();
        int int44 = hashMapTestDriver42.size();
        hashMapTestDriver42.clear();
        java.lang.Object obj47 = hashMapTestDriver27.put((java.lang.Object) hashMapTestDriver42, (java.lang.Object) (-1L));
        int int48 = hashMapTestDriver42.size();
        java.lang.Object obj49 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver23, (java.lang.Object) hashMapTestDriver42);
        boolean boolean50 = hashMapTestDriver23.isEmpty();
        experiment.util.Set set51 = hashMapTestDriver23.keySet();
        experiment.util.Collection collection52 = hashMapTestDriver23.values();
        java.lang.Object obj53 = hashMapTestDriver0.remove((java.lang.Object) collection52);
        experiment.util.Set set54 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test245");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver6.clear();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        boolean boolean9 = hashMapTestDriver6.isEmpty();
        boolean boolean10 = hashMapTestDriver6.isEmpty();
        experiment.util.Collection collection11 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.remove((java.lang.Object) 0);
        hashMapTestDriver12.clear();
        java.lang.Object obj17 = hashMapTestDriver12.remove((java.lang.Object) 100.0f);
        java.lang.Object obj19 = hashMapTestDriver12.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection20 = hashMapTestDriver12.values();
        java.lang.Object obj21 = hashMapTestDriver6.remove((java.lang.Object) hashMapTestDriver12);
        boolean boolean22 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver6);
        experiment.util.Collection collection23 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver24.clear();
        experiment.util.Set set26 = hashMapTestDriver24.entrySet();
        java.lang.Class<?> wildcardClass27 = set26.getClass();
        java.lang.Object obj28 = hashMapTestDriver6.remove((java.lang.Object) set26);
        experiment.util.Set set29 = hashMapTestDriver6.keySet();
        java.lang.Class<?> wildcardClass30 = hashMapTestDriver6.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test246");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver5.clear();
        experiment.util.Set set7 = hashMapTestDriver5.entrySet();
        boolean boolean8 = hashMapTestDriver5.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        boolean boolean10 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver5);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.keySet();
        java.lang.Object obj16 = hashMapTestDriver12.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        hashMapTestDriver12.clear();
        boolean boolean18 = hashMapTestDriver12.isEmpty();
        experiment.util.Set set19 = hashMapTestDriver12.entrySet();
        java.lang.Object obj20 = hashMapTestDriver5.put((java.lang.Object) hashMapTestDriver11, (java.lang.Object) set19);
        experiment.util.Set set21 = hashMapTestDriver11.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test247");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        int int15 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.keySet();
        java.lang.Object obj20 = hashMapTestDriver16.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj22 = hashMapTestDriver16.get((java.lang.Object) 0.0d);
        boolean boolean24 = hashMapTestDriver16.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        java.lang.Object obj27 = hashMapTestDriver16.remove((java.lang.Object) false);
        experiment.util.Set set28 = hashMapTestDriver16.entrySet();
        boolean boolean29 = hashMapTestDriver16.isEmpty();
        boolean boolean30 = hashMapTestDriver16.isEmpty();
        java.lang.Object obj31 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver16);
        int int32 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj35 = hashMapTestDriver33.remove((java.lang.Object) 0);
        hashMapTestDriver33.clear();
        java.lang.Object obj38 = hashMapTestDriver33.remove((java.lang.Object) 100.0f);
        java.lang.Object obj40 = hashMapTestDriver33.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set42 = hashMapTestDriver41.keySet();
        java.lang.Object obj45 = hashMapTestDriver41.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection46 = hashMapTestDriver41.values();
        java.lang.Object obj47 = hashMapTestDriver33.get((java.lang.Object) collection46);
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set49 = hashMapTestDriver48.keySet();
        int int50 = hashMapTestDriver48.size();
        hashMapTestDriver48.clear();
        java.lang.Object obj53 = hashMapTestDriver33.put((java.lang.Object) hashMapTestDriver48, (java.lang.Object) (-1L));
        experiment.util.Collection collection54 = hashMapTestDriver33.values();
        experiment.util.Set set55 = hashMapTestDriver33.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set57 = hashMapTestDriver56.keySet();
        int int58 = hashMapTestDriver56.size();
        java.lang.Object obj59 = hashMapTestDriver33.get((java.lang.Object) hashMapTestDriver56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = hashMapTestDriver0.get(obj59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test248");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        int int2 = hashMapTestDriver0.size();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) 0);
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver15.remove((java.lang.Object) 100.0f);
        java.lang.Object obj22 = hashMapTestDriver15.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.keySet();
        java.lang.Object obj27 = hashMapTestDriver23.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection28 = hashMapTestDriver23.values();
        java.lang.Object obj29 = hashMapTestDriver15.get((java.lang.Object) collection28);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set31 = hashMapTestDriver30.keySet();
        int int32 = hashMapTestDriver30.size();
        hashMapTestDriver30.clear();
        java.lang.Object obj35 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) (-1L));
        java.lang.Object obj36 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) (-1L));
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.keySet();
        java.lang.Object obj42 = hashMapTestDriver38.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj44 = hashMapTestDriver38.get((java.lang.Object) 0.0d);
        boolean boolean46 = hashMapTestDriver38.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection47 = hashMapTestDriver38.values();
        hashMapTestDriver38.clear();
        java.lang.Object obj50 = hashMapTestDriver38.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set52 = hashMapTestDriver51.keySet();
        java.lang.Object obj55 = hashMapTestDriver51.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj57 = hashMapTestDriver51.get((java.lang.Object) 0.0d);
        boolean boolean59 = hashMapTestDriver51.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection60 = hashMapTestDriver51.values();
        hashMapTestDriver51.clear();
        java.lang.Object obj64 = hashMapTestDriver51.put((java.lang.Object) (-1.0f), (java.lang.Object) 1.0f);
        boolean boolean65 = hashMapTestDriver38.containsKey((java.lang.Object) 1.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver66.clear();
        java.lang.Object obj68 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver38, (java.lang.Object) hashMapTestDriver66);
        experiment.util.HashMapTestDriver hashMapTestDriver69 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj71 = hashMapTestDriver69.remove((java.lang.Object) 0);
        experiment.util.Collection collection72 = hashMapTestDriver69.values();
        java.lang.Object obj74 = hashMapTestDriver69.get((java.lang.Object) 1L);
        int int75 = hashMapTestDriver69.size();
        experiment.util.Set set76 = hashMapTestDriver69.entrySet();
        java.lang.Object obj77 = hashMapTestDriver66.get((java.lang.Object) set76);
        experiment.util.Set set78 = hashMapTestDriver66.keySet();
        boolean boolean79 = hashMapTestDriver66.isEmpty();
        experiment.util.Set set80 = hashMapTestDriver66.keySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(set80);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test249");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver6.clear();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        boolean boolean9 = hashMapTestDriver6.isEmpty();
        boolean boolean10 = hashMapTestDriver6.isEmpty();
        experiment.util.Collection collection11 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.remove((java.lang.Object) 0);
        hashMapTestDriver12.clear();
        java.lang.Object obj17 = hashMapTestDriver12.remove((java.lang.Object) 100.0f);
        java.lang.Object obj19 = hashMapTestDriver12.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection20 = hashMapTestDriver12.values();
        java.lang.Object obj21 = hashMapTestDriver6.remove((java.lang.Object) hashMapTestDriver12);
        boolean boolean22 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver6);
        experiment.util.Collection collection23 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver24.clear();
        experiment.util.Set set26 = hashMapTestDriver24.entrySet();
        java.lang.Class<?> wildcardClass27 = set26.getClass();
        java.lang.Object obj28 = hashMapTestDriver6.remove((java.lang.Object) set26);
        boolean boolean29 = hashMapTestDriver6.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test250");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.keySet();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        boolean boolean12 = hashMapTestDriver4.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection13 = hashMapTestDriver4.values();
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) false);
        experiment.util.Set set16 = hashMapTestDriver4.entrySet();
        boolean boolean17 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) (byte) -1);
        java.lang.Object obj20 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver4);
        hashMapTestDriver4.clear();
        experiment.util.Set set22 = hashMapTestDriver4.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test251");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj18 = hashMapTestDriver16.remove((java.lang.Object) 0);
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 0);
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver20.remove((java.lang.Object) 100.0f);
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.keySet();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection33 = hashMapTestDriver28.values();
        java.lang.Object obj34 = hashMapTestDriver20.get((java.lang.Object) collection33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        int int37 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        java.lang.Object obj40 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) (-1L));
        int int41 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver35);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.keySet();
        java.lang.Object obj47 = hashMapTestDriver43.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj49 = hashMapTestDriver43.get((java.lang.Object) 0.0d);
        boolean boolean51 = hashMapTestDriver43.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection52 = hashMapTestDriver43.values();
        hashMapTestDriver43.clear();
        experiment.util.Collection collection54 = hashMapTestDriver43.values();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj57 = hashMapTestDriver55.remove((java.lang.Object) 0);
        experiment.util.Collection collection58 = hashMapTestDriver55.values();
        java.lang.Object obj60 = hashMapTestDriver55.get((java.lang.Object) 1L);
        java.lang.Object obj61 = hashMapTestDriver43.get((java.lang.Object) hashMapTestDriver55);
        java.lang.Object obj62 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver55);
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver63.clear();
        experiment.util.Set set65 = hashMapTestDriver63.entrySet();
        boolean boolean66 = hashMapTestDriver63.isEmpty();
        experiment.util.Set set67 = hashMapTestDriver63.keySet();
        boolean boolean68 = hashMapTestDriver63.isEmpty();
        experiment.util.Collection collection69 = hashMapTestDriver63.values();
        java.lang.Object obj70 = hashMapTestDriver16.get((java.lang.Object) collection69);
        int int71 = hashMapTestDriver16.size();
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj74 = hashMapTestDriver72.remove((java.lang.Object) 0);
        hashMapTestDriver72.clear();
        int int76 = hashMapTestDriver72.size();
        int int77 = hashMapTestDriver72.size();
        java.lang.Object obj79 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver72, (java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver80 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver80.clear();
        experiment.util.Set set82 = hashMapTestDriver80.entrySet();
        boolean boolean83 = hashMapTestDriver80.isEmpty();
        experiment.util.Set set84 = hashMapTestDriver80.entrySet();
        boolean boolean85 = hashMapTestDriver80.isEmpty();
        experiment.util.Set set86 = hashMapTestDriver80.entrySet();
        java.lang.Object obj87 = hashMapTestDriver16.get((java.lang.Object) hashMapTestDriver80);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNull(obj87);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test252");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.remove((java.lang.Object) 0);
        hashMapTestDriver5.clear();
        java.lang.Object obj10 = hashMapTestDriver5.remove((java.lang.Object) 100.0f);
        java.lang.Object obj12 = hashMapTestDriver5.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.keySet();
        java.lang.Object obj17 = hashMapTestDriver13.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection18 = hashMapTestDriver13.values();
        java.lang.Object obj19 = hashMapTestDriver5.get((java.lang.Object) collection18);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set21 = hashMapTestDriver20.keySet();
        int int22 = hashMapTestDriver20.size();
        hashMapTestDriver20.clear();
        java.lang.Object obj25 = hashMapTestDriver5.put((java.lang.Object) hashMapTestDriver20, (java.lang.Object) (-1L));
        boolean boolean27 = hashMapTestDriver20.containsKey((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver28.remove((java.lang.Object) 0);
        experiment.util.Collection collection31 = hashMapTestDriver28.values();
        boolean boolean32 = hashMapTestDriver20.containsKey((java.lang.Object) hashMapTestDriver28);
        experiment.util.Collection collection33 = hashMapTestDriver20.values();
        java.lang.Object obj34 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) hashMapTestDriver20);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        java.lang.Object obj39 = hashMapTestDriver35.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver40.clear();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        boolean boolean43 = hashMapTestDriver40.isEmpty();
        experiment.util.Set set44 = hashMapTestDriver40.entrySet();
        boolean boolean45 = hashMapTestDriver35.containsKey((java.lang.Object) hashMapTestDriver40);
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set48 = hashMapTestDriver47.keySet();
        java.lang.Object obj51 = hashMapTestDriver47.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        hashMapTestDriver47.clear();
        boolean boolean53 = hashMapTestDriver47.isEmpty();
        experiment.util.Set set54 = hashMapTestDriver47.entrySet();
        java.lang.Object obj55 = hashMapTestDriver40.put((java.lang.Object) hashMapTestDriver46, (java.lang.Object) set54);
        java.lang.Object obj56 = hashMapTestDriver20.get((java.lang.Object) set54);
        int int57 = hashMapTestDriver20.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test253");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj14 = hashMapTestDriver8.get((java.lang.Object) 0.0d);
        boolean boolean16 = hashMapTestDriver8.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection17 = hashMapTestDriver8.values();
        java.lang.Object obj19 = hashMapTestDriver8.remove((java.lang.Object) false);
        experiment.util.Set set20 = hashMapTestDriver8.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.remove((java.lang.Object) 0);
        hashMapTestDriver21.clear();
        java.lang.Object obj26 = hashMapTestDriver21.remove((java.lang.Object) 100.0f);
        java.lang.Object obj28 = hashMapTestDriver21.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.keySet();
        java.lang.Object obj33 = hashMapTestDriver29.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection34 = hashMapTestDriver29.values();
        java.lang.Object obj35 = hashMapTestDriver21.get((java.lang.Object) collection34);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set37 = hashMapTestDriver36.keySet();
        int int38 = hashMapTestDriver36.size();
        hashMapTestDriver36.clear();
        java.lang.Object obj41 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver36, (java.lang.Object) (-1L));
        experiment.util.Collection collection42 = hashMapTestDriver21.values();
        boolean boolean43 = hashMapTestDriver8.containsKey((java.lang.Object) collection42);
        java.lang.Object obj44 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.remove((java.lang.Object) 0);
        java.lang.Object obj50 = hashMapTestDriver45.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        boolean boolean52 = hashMapTestDriver45.containsKey((java.lang.Object) true);
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver53.clear();
        experiment.util.Set set55 = hashMapTestDriver53.entrySet();
        boolean boolean56 = hashMapTestDriver53.isEmpty();
        boolean boolean57 = hashMapTestDriver53.isEmpty();
        java.lang.Object obj58 = hashMapTestDriver8.put((java.lang.Object) true, (java.lang.Object) hashMapTestDriver53);
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj61 = hashMapTestDriver59.remove((java.lang.Object) 0);
        hashMapTestDriver59.clear();
        java.lang.Object obj64 = hashMapTestDriver59.remove((java.lang.Object) 100.0f);
        java.lang.Object obj66 = hashMapTestDriver59.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection67 = hashMapTestDriver59.values();
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set69 = hashMapTestDriver68.keySet();
        java.lang.Object obj72 = hashMapTestDriver68.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver73 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver73.clear();
        experiment.util.Set set75 = hashMapTestDriver73.entrySet();
        boolean boolean76 = hashMapTestDriver73.isEmpty();
        boolean boolean77 = hashMapTestDriver73.isEmpty();
        experiment.util.Collection collection78 = hashMapTestDriver73.values();
        java.lang.Object obj79 = hashMapTestDriver59.put((java.lang.Object) hashMapTestDriver68, (java.lang.Object) hashMapTestDriver73);
        hashMapTestDriver59.clear();
        boolean boolean81 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver59);
        experiment.util.Collection collection82 = hashMapTestDriver59.values();
        java.lang.Class<?> wildcardClass83 = collection82.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test254");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 0);
        hashMapTestDriver0.clear();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Object obj14 = hashMapTestDriver0.get((java.lang.Object) collection13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        int int17 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        java.lang.Object obj20 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) (-1L));
        experiment.util.Set set21 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test255");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) false);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        boolean boolean14 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.remove((java.lang.Object) 0);
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) 1.0f, (java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver21.clear();
        experiment.util.Set set23 = hashMapTestDriver21.entrySet();
        boolean boolean24 = hashMapTestDriver21.isEmpty();
        boolean boolean25 = hashMapTestDriver21.isEmpty();
        experiment.util.Collection collection26 = hashMapTestDriver21.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver27.remove((java.lang.Object) 0);
        hashMapTestDriver27.clear();
        java.lang.Object obj32 = hashMapTestDriver27.remove((java.lang.Object) 100.0f);
        java.lang.Object obj34 = hashMapTestDriver27.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection35 = hashMapTestDriver27.values();
        java.lang.Object obj36 = hashMapTestDriver21.remove((java.lang.Object) hashMapTestDriver27);
        boolean boolean37 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver21);
        boolean boolean38 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver21);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj41 = hashMapTestDriver39.remove((java.lang.Object) 0);
        hashMapTestDriver39.clear();
        java.lang.Object obj44 = hashMapTestDriver39.remove((java.lang.Object) 100.0f);
        java.lang.Object obj46 = hashMapTestDriver39.get((java.lang.Object) (short) 100);
        experiment.util.Collection collection47 = hashMapTestDriver39.values();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set49 = hashMapTestDriver48.keySet();
        java.lang.Object obj52 = hashMapTestDriver48.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj54 = hashMapTestDriver48.get((java.lang.Object) 0.0d);
        boolean boolean56 = hashMapTestDriver48.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection57 = hashMapTestDriver48.values();
        hashMapTestDriver48.clear();
        java.lang.Object obj60 = hashMapTestDriver48.get((java.lang.Object) '4');
        java.lang.Object obj61 = hashMapTestDriver21.put((java.lang.Object) collection47, (java.lang.Object) hashMapTestDriver48);
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set63 = hashMapTestDriver62.keySet();
        java.lang.Object obj66 = hashMapTestDriver62.put((java.lang.Object) false, (java.lang.Object) (byte) 100);
        experiment.util.Set set67 = hashMapTestDriver62.entrySet();
        experiment.util.Set set68 = hashMapTestDriver62.entrySet();
        boolean boolean70 = hashMapTestDriver62.containsKey((java.lang.Object) 10.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set72 = hashMapTestDriver71.keySet();
        java.lang.Object obj75 = hashMapTestDriver71.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        hashMapTestDriver71.clear();
        boolean boolean77 = hashMapTestDriver71.isEmpty();
        experiment.util.Set set78 = hashMapTestDriver71.entrySet();
        java.lang.Object obj79 = hashMapTestDriver62.remove((java.lang.Object) hashMapTestDriver71);
        java.lang.Object obj80 = hashMapTestDriver21.remove((java.lang.Object) hashMapTestDriver71);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_939145594_1024_0.test256");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set3 = hashMapTestDriver2.keySet();
        java.lang.Object obj6 = hashMapTestDriver2.put((java.lang.Object) (byte) 1, (java.lang.Object) (-1));
        java.lang.Object obj8 = hashMapTestDriver2.get((java.lang.Object) 0.0d);
        boolean boolean10 = hashMapTestDriver2.containsKey((java.lang.Object) (short) 10);
        experiment.util.Collection collection11 = hashMapTestDriver2.values();
        java.lang.Object obj13 = hashMapTestDriver2.remove((java.lang.Object) false);
        experiment.util.Set set14 = hashMapTestDriver2.entrySet();
        java.lang.Object obj16 = hashMapTestDriver2.get((java.lang.Object) (byte) 1);
        java.lang.Class<?> wildcardClass17 = obj16.getClass();
        java.lang.Object obj18 = hashMapTestDriver0.remove((java.lang.Object) wildcardClass17);
        experiment.util.Collection collection19 = hashMapTestDriver0.values();
        int int20 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + (-1) + "'", obj16, (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

}
