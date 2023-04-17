package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashMapTest_939145594_64_s {

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

}
