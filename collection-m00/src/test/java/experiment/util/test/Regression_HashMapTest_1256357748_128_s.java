package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashMapTest_1256357748_128_s {

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
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test001");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        java.lang.Class<?> wildcardClass4 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test003");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        java.lang.Object obj19 = hashMapTestDriver14.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean20 = hashMapTestDriver14.isEmpty();
        experiment.util.Set set21 = hashMapTestDriver14.entrySet();
        java.lang.Object obj23 = hashMapTestDriver14.remove((java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = hashMapTestDriver0.get(obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test004");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj6 = hashMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = obj6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test005");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test006");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test007");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection2 = hashMapTestDriver1.values();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        int int4 = hashMapTestDriver1.size();
        experiment.util.Collection collection5 = hashMapTestDriver1.values();
        boolean boolean6 = hashMapTestDriver1.isEmpty();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) boolean6, obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test008");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test009");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass10 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test010");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        int int10 = hashMapTestDriver7.size();
        int int11 = hashMapTestDriver7.size();
        int int12 = hashMapTestDriver7.size();
        java.lang.Object obj14 = hashMapTestDriver7.get((java.lang.Object) (-1));
        int int15 = hashMapTestDriver7.size();
        java.lang.Class<?> wildcardClass16 = hashMapTestDriver7.getClass();
        java.lang.Object obj17 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj21 = hashMapTestDriver18.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj24 = hashMapTestDriver18.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver25.clear();
        java.lang.Object obj27 = hashMapTestDriver18.remove((java.lang.Object) hashMapTestDriver25);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection31 = hashMapTestDriver30.values();
        experiment.util.Set set32 = hashMapTestDriver30.entrySet();
        java.lang.Object obj35 = hashMapTestDriver30.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean36 = hashMapTestDriver30.isEmpty();
        experiment.util.Set set37 = hashMapTestDriver30.entrySet();
        java.lang.Object obj39 = hashMapTestDriver28.put((java.lang.Object) set37, (java.lang.Object) 0.0d);
        java.lang.Object obj40 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver25, (java.lang.Object) set37);
        experiment.util.Set set41 = hashMapTestDriver7.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test011");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver14, (java.lang.Object) "hi!");
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = hashMapTestDriver0.remove(obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test012");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        int int6 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        java.lang.Object obj12 = hashMapTestDriver7.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean13 = hashMapTestDriver7.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        java.lang.Object obj19 = hashMapTestDriver14.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean20 = hashMapTestDriver14.isEmpty();
        experiment.util.Set set21 = hashMapTestDriver14.entrySet();
        java.lang.Object obj22 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver14);
        java.lang.Object obj23 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj24 = hashMapTestDriver0.put(obj22, obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test013");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver12);
        java.lang.Object obj14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = hashMapTestDriver0.containsKey(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test014");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        java.lang.Object obj12 = hashMapTestDriver7.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean13 = hashMapTestDriver7.isEmpty();
        experiment.util.Set set14 = hashMapTestDriver7.entrySet();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        java.lang.Object obj24 = hashMapTestDriver16.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        java.lang.Object obj26 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver16);
        java.lang.Object obj28 = hashMapTestDriver16.get((java.lang.Object) 100.0f);
        java.lang.Object obj29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = hashMapTestDriver16.remove(obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test015");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass5 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test016");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        java.lang.Object obj12 = hashMapTestDriver7.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean13 = hashMapTestDriver7.isEmpty();
        experiment.util.Set set14 = hashMapTestDriver7.entrySet();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        java.lang.Object obj24 = hashMapTestDriver16.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        java.lang.Object obj26 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver16);
        java.lang.Object obj28 = hashMapTestDriver16.get((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver29.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj35 = hashMapTestDriver29.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver36.clear();
        java.lang.Object obj38 = hashMapTestDriver29.remove((java.lang.Object) hashMapTestDriver36);
        experiment.util.Set set39 = hashMapTestDriver29.keySet();
        java.lang.Object obj40 = hashMapTestDriver16.remove((java.lang.Object) set39);
        java.lang.Object obj41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = hashMapTestDriver16.remove(obj41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test017");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj6 = hashMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver7.clear();
        java.lang.Object obj9 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set10 = hashMapTestDriver0.keySet();
        experiment.util.Set set11 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        java.lang.Object obj19 = hashMapTestDriver14.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean20 = hashMapTestDriver14.isEmpty();
        experiment.util.Set set21 = hashMapTestDriver14.entrySet();
        java.lang.Object obj23 = hashMapTestDriver12.put((java.lang.Object) set21, (java.lang.Object) 0.0d);
        java.lang.Object obj24 = hashMapTestDriver0.remove((java.lang.Object) 0.0d);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test018");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        java.lang.Class<?> wildcardClass14 = hashMapTestDriver12.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test019");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        java.lang.Object obj12 = hashMapTestDriver7.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean13 = hashMapTestDriver7.isEmpty();
        experiment.util.Set set14 = hashMapTestDriver7.entrySet();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        java.lang.Object obj24 = hashMapTestDriver16.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        java.lang.Object obj26 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver16);
        java.lang.Object obj28 = hashMapTestDriver16.get((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass29 = hashMapTestDriver16.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test020");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        java.lang.Object obj17 = hashMapTestDriver12.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean18 = hashMapTestDriver12.isEmpty();
        experiment.util.Set set19 = hashMapTestDriver12.entrySet();
        java.lang.Object obj21 = hashMapTestDriver10.put((java.lang.Object) set19, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        boolean boolean23 = hashMapTestDriver10.containsKey((java.lang.Object) hashMapTestDriver22);
        java.lang.Object obj24 = hashMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMapTestDriver10);
        int int25 = hashMapTestDriver10.size();
        java.lang.Object obj26 = null;
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection28 = hashMapTestDriver27.values();
        experiment.util.Set set29 = hashMapTestDriver27.entrySet();
        int int30 = hashMapTestDriver27.size();
        int int31 = hashMapTestDriver27.size();
        int int32 = hashMapTestDriver27.size();
        java.lang.Object obj34 = hashMapTestDriver27.get((java.lang.Object) (-1));
        int int35 = hashMapTestDriver27.size();
        experiment.util.Set set36 = hashMapTestDriver27.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj37 = hashMapTestDriver10.put(obj26, (java.lang.Object) hashMapTestDriver27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(set36);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test021");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        java.lang.Object obj11 = hashMapTestDriver6.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection12 = hashMapTestDriver6.values();
        java.lang.Object obj14 = hashMapTestDriver6.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection15 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean22 = hashMapTestDriver16.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection24 = hashMapTestDriver23.values();
        experiment.util.Set set25 = hashMapTestDriver23.entrySet();
        int int26 = hashMapTestDriver23.size();
        int int27 = hashMapTestDriver23.size();
        int int28 = hashMapTestDriver23.size();
        java.lang.Object obj30 = hashMapTestDriver23.get((java.lang.Object) (-1));
        int int31 = hashMapTestDriver23.size();
        java.lang.Class<?> wildcardClass32 = hashMapTestDriver23.getClass();
        java.lang.Object obj33 = hashMapTestDriver16.get((java.lang.Object) hashMapTestDriver23);
        java.lang.Object obj34 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) hashMapTestDriver23);
        hashMapTestDriver23.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test022");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        int int5 = hashMapTestDriver0.size();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (-1));
        int int8 = hashMapTestDriver0.size();
        experiment.util.Set set9 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        java.lang.Object obj17 = hashMapTestDriver12.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean18 = hashMapTestDriver12.isEmpty();
        experiment.util.Set set19 = hashMapTestDriver12.entrySet();
        java.lang.Object obj21 = hashMapTestDriver10.put((java.lang.Object) set19, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        boolean boolean23 = hashMapTestDriver10.containsKey((java.lang.Object) hashMapTestDriver22);
        int int24 = hashMapTestDriver22.size();
        experiment.util.Set set25 = hashMapTestDriver22.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection27 = hashMapTestDriver26.values();
        experiment.util.Set set28 = hashMapTestDriver26.entrySet();
        java.lang.Object obj31 = hashMapTestDriver26.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection32 = hashMapTestDriver26.values();
        java.lang.Object obj34 = hashMapTestDriver26.get((java.lang.Object) (short) -1);
        experiment.util.Set set35 = hashMapTestDriver26.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection37 = hashMapTestDriver36.values();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection39 = hashMapTestDriver38.values();
        experiment.util.Set set40 = hashMapTestDriver38.entrySet();
        java.lang.Object obj43 = hashMapTestDriver38.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean44 = hashMapTestDriver38.isEmpty();
        experiment.util.Set set45 = hashMapTestDriver38.entrySet();
        java.lang.Object obj47 = hashMapTestDriver36.put((java.lang.Object) set45, (java.lang.Object) 0.0d);
        java.lang.Object obj48 = hashMapTestDriver22.put((java.lang.Object) set35, (java.lang.Object) set45);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean49 = hashMapTestDriver0.containsKey(obj48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test023");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass6 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test024");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj16 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver14, (java.lang.Object) "hi!");
        java.lang.Object obj18 = hashMapTestDriver14.remove((java.lang.Object) (-1L));
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        java.lang.Object obj24 = hashMapTestDriver19.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection25 = hashMapTestDriver19.values();
        java.lang.Object obj27 = hashMapTestDriver19.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection30 = hashMapTestDriver29.values();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection32 = hashMapTestDriver31.values();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        java.lang.Object obj36 = hashMapTestDriver31.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean37 = hashMapTestDriver31.isEmpty();
        experiment.util.Set set38 = hashMapTestDriver31.entrySet();
        java.lang.Object obj40 = hashMapTestDriver29.put((java.lang.Object) set38, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        boolean boolean42 = hashMapTestDriver29.containsKey((java.lang.Object) hashMapTestDriver41);
        java.lang.Object obj43 = hashMapTestDriver19.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMapTestDriver29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj45 = hashMapTestDriver14.put(obj43, (java.lang.Object) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test025");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        int int5 = hashMapTestDriver0.size();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (-1));
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) ' ');
        experiment.util.Set set10 = hashMapTestDriver0.keySet();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test026");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        java.lang.Object obj17 = hashMapTestDriver12.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean18 = hashMapTestDriver12.isEmpty();
        experiment.util.Set set19 = hashMapTestDriver12.entrySet();
        java.lang.Object obj21 = hashMapTestDriver10.put((java.lang.Object) set19, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        boolean boolean23 = hashMapTestDriver10.containsKey((java.lang.Object) hashMapTestDriver22);
        java.lang.Object obj24 = hashMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMapTestDriver10);
        hashMapTestDriver0.clear();
        int int26 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver27.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj33 = hashMapTestDriver27.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver34.clear();
        java.lang.Object obj36 = hashMapTestDriver27.remove((java.lang.Object) hashMapTestDriver34);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection39 = hashMapTestDriver38.values();
        experiment.util.Set set40 = hashMapTestDriver38.entrySet();
        java.lang.Object obj41 = hashMapTestDriver27.put((java.lang.Object) 10.0f, (java.lang.Object) hashMapTestDriver38);
        boolean boolean42 = hashMapTestDriver27.isEmpty();
        java.lang.Object obj43 = hashMapTestDriver0.remove((java.lang.Object) boolean42);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test027");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        java.lang.Object obj9 = hashMapTestDriver0.remove((java.lang.Object) 10.0d);
        experiment.util.Set set10 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver12.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj18 = hashMapTestDriver12.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver19.clear();
        java.lang.Object obj21 = hashMapTestDriver12.remove((java.lang.Object) hashMapTestDriver19);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver22.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj28 = hashMapTestDriver22.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        hashMapTestDriver22.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection31 = hashMapTestDriver30.values();
        java.lang.Class<?> wildcardClass32 = hashMapTestDriver30.getClass();
        java.lang.Object obj33 = hashMapTestDriver22.get((java.lang.Object) wildcardClass32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver19, obj33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test028");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass3 = set2.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test029");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver12);
        int int14 = hashMapTestDriver12.size();
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = hashMapTestDriver12.get(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test030");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (short) -1);
        experiment.util.Set set9 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass10 = set9.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test031");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        int int5 = hashMapTestDriver0.size();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (-1));
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection13 = hashMapTestDriver10.values();
        boolean boolean14 = hashMapTestDriver0.containsKey((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        int int16 = hashMapTestDriver0.size();
        experiment.util.Collection collection17 = hashMapTestDriver0.values();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test032");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        java.lang.Object obj14 = hashMapTestDriver9.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean15 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        int int19 = hashMapTestDriver16.size();
        int int20 = hashMapTestDriver16.size();
        int int21 = hashMapTestDriver16.size();
        java.lang.Object obj23 = hashMapTestDriver16.get((java.lang.Object) (-1));
        int int24 = hashMapTestDriver16.size();
        java.lang.Class<?> wildcardClass25 = hashMapTestDriver16.getClass();
        java.lang.Object obj26 = hashMapTestDriver9.get((java.lang.Object) hashMapTestDriver16);
        java.lang.Object obj27 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver16);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test033");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        int int14 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        boolean boolean16 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test034");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 0);
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        java.lang.Object obj11 = hashMapTestDriver6.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection12 = hashMapTestDriver6.values();
        java.lang.Object obj14 = hashMapTestDriver6.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection15 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        int int19 = hashMapTestDriver16.size();
        int int20 = hashMapTestDriver16.size();
        int int21 = hashMapTestDriver16.size();
        java.lang.Object obj23 = hashMapTestDriver16.get((java.lang.Object) (-1));
        boolean boolean25 = hashMapTestDriver16.containsKey((java.lang.Object) ' ');
        int int26 = hashMapTestDriver16.size();
        java.lang.Object obj27 = hashMapTestDriver0.put((java.lang.Object) collection15, (java.lang.Object) int26);
        java.lang.Object obj28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = hashMapTestDriver0.containsKey(obj28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test035");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj6 = hashMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver7.clear();
        java.lang.Object obj9 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        int int13 = hashMapTestDriver10.size();
        int int14 = hashMapTestDriver10.size();
        int int15 = hashMapTestDriver10.size();
        java.lang.Object obj17 = hashMapTestDriver10.get((java.lang.Object) (-1));
        boolean boolean19 = hashMapTestDriver10.containsKey((java.lang.Object) ' ');
        experiment.util.Set set20 = hashMapTestDriver10.keySet();
        java.lang.Object obj21 = hashMapTestDriver7.get((java.lang.Object) hashMapTestDriver10);
        experiment.util.Set set22 = hashMapTestDriver7.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection24 = hashMapTestDriver23.values();
        experiment.util.Set set25 = hashMapTestDriver23.entrySet();
        java.lang.Object obj28 = hashMapTestDriver23.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean29 = hashMapTestDriver23.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection31 = hashMapTestDriver30.values();
        experiment.util.Set set32 = hashMapTestDriver30.entrySet();
        int int33 = hashMapTestDriver30.size();
        int int34 = hashMapTestDriver30.size();
        int int35 = hashMapTestDriver30.size();
        java.lang.Object obj37 = hashMapTestDriver30.get((java.lang.Object) (-1));
        int int38 = hashMapTestDriver30.size();
        java.lang.Class<?> wildcardClass39 = hashMapTestDriver30.getClass();
        java.lang.Object obj40 = hashMapTestDriver23.get((java.lang.Object) hashMapTestDriver30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = hashMapTestDriver7.get(obj40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test036");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (byte) 0);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        java.lang.Object obj15 = hashMapTestDriver10.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean16 = hashMapTestDriver10.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection18 = hashMapTestDriver17.values();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        java.lang.Object obj22 = hashMapTestDriver17.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean23 = hashMapTestDriver17.isEmpty();
        experiment.util.Set set24 = hashMapTestDriver17.entrySet();
        java.lang.Object obj25 = hashMapTestDriver10.remove((java.lang.Object) hashMapTestDriver17);
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection27 = hashMapTestDriver26.values();
        experiment.util.Set set28 = hashMapTestDriver26.entrySet();
        java.lang.Object obj31 = hashMapTestDriver26.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection32 = hashMapTestDriver26.values();
        java.lang.Object obj34 = hashMapTestDriver26.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection35 = hashMapTestDriver26.values();
        java.lang.Object obj36 = hashMapTestDriver17.remove((java.lang.Object) hashMapTestDriver26);
        java.lang.Object obj38 = hashMapTestDriver26.get((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj42 = hashMapTestDriver39.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj45 = hashMapTestDriver39.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver46.clear();
        java.lang.Object obj48 = hashMapTestDriver39.remove((java.lang.Object) hashMapTestDriver46);
        experiment.util.Set set49 = hashMapTestDriver39.keySet();
        java.lang.Object obj50 = hashMapTestDriver26.remove((java.lang.Object) set49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj51 = hashMapTestDriver0.get(obj50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test037");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj6 = hashMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test038");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        java.lang.Object obj14 = hashMapTestDriver9.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean15 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        int int19 = hashMapTestDriver16.size();
        int int20 = hashMapTestDriver16.size();
        int int21 = hashMapTestDriver16.size();
        java.lang.Object obj23 = hashMapTestDriver16.get((java.lang.Object) (-1));
        int int24 = hashMapTestDriver16.size();
        java.lang.Class<?> wildcardClass25 = hashMapTestDriver16.getClass();
        java.lang.Object obj26 = hashMapTestDriver9.get((java.lang.Object) hashMapTestDriver16);
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver27.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj33 = hashMapTestDriver27.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver34.clear();
        java.lang.Object obj36 = hashMapTestDriver27.remove((java.lang.Object) hashMapTestDriver34);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection38 = hashMapTestDriver37.values();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection40 = hashMapTestDriver39.values();
        experiment.util.Set set41 = hashMapTestDriver39.entrySet();
        java.lang.Object obj44 = hashMapTestDriver39.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean45 = hashMapTestDriver39.isEmpty();
        experiment.util.Set set46 = hashMapTestDriver39.entrySet();
        java.lang.Object obj48 = hashMapTestDriver37.put((java.lang.Object) set46, (java.lang.Object) 0.0d);
        java.lang.Object obj49 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver34, (java.lang.Object) set46);
        java.lang.Object obj50 = hashMapTestDriver0.get((java.lang.Object) set46);
        java.lang.Object obj51 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = hashMapTestDriver0.containsKey(obj51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test039");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        int int5 = hashMapTestDriver0.size();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (-1));
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection13 = hashMapTestDriver10.values();
        boolean boolean14 = hashMapTestDriver0.containsKey((java.lang.Object) collection13);
        experiment.util.Set set15 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test040");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = hashMapTestDriver0.containsKey(obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test041");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.Set set8 = hashMapTestDriver0.keySet();
        experiment.util.Set set9 = hashMapTestDriver0.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) "");
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test042");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        experiment.util.Set set6 = hashMapTestDriver4.entrySet();
        java.lang.Object obj9 = hashMapTestDriver4.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean10 = hashMapTestDriver4.isEmpty();
        experiment.util.Set set11 = hashMapTestDriver4.entrySet();
        java.lang.Object obj13 = hashMapTestDriver2.put((java.lang.Object) set11, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        boolean boolean15 = hashMapTestDriver2.containsKey((java.lang.Object) hashMapTestDriver14);
        int int16 = hashMapTestDriver14.size();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection18 = hashMapTestDriver17.values();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        java.lang.Object obj24 = hashMapTestDriver19.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean25 = hashMapTestDriver19.isEmpty();
        experiment.util.Set set26 = hashMapTestDriver19.entrySet();
        java.lang.Object obj28 = hashMapTestDriver17.put((java.lang.Object) set26, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver17.get((java.lang.Object) hashMapTestDriver29);
        hashMapTestDriver29.clear();
        java.lang.Object obj32 = hashMapTestDriver14.remove((java.lang.Object) hashMapTestDriver29);
        java.lang.Object obj33 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver14);
        experiment.util.Set set34 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass35 = set34.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test043");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        java.lang.Object obj14 = hashMapTestDriver9.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean15 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        int int19 = hashMapTestDriver16.size();
        int int20 = hashMapTestDriver16.size();
        int int21 = hashMapTestDriver16.size();
        java.lang.Object obj23 = hashMapTestDriver16.get((java.lang.Object) (-1));
        int int24 = hashMapTestDriver16.size();
        java.lang.Class<?> wildcardClass25 = hashMapTestDriver16.getClass();
        java.lang.Object obj26 = hashMapTestDriver9.get((java.lang.Object) hashMapTestDriver16);
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver27.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj33 = hashMapTestDriver27.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver34.clear();
        java.lang.Object obj36 = hashMapTestDriver27.remove((java.lang.Object) hashMapTestDriver34);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection38 = hashMapTestDriver37.values();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection40 = hashMapTestDriver39.values();
        experiment.util.Set set41 = hashMapTestDriver39.entrySet();
        java.lang.Object obj44 = hashMapTestDriver39.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean45 = hashMapTestDriver39.isEmpty();
        experiment.util.Set set46 = hashMapTestDriver39.entrySet();
        java.lang.Object obj48 = hashMapTestDriver37.put((java.lang.Object) set46, (java.lang.Object) 0.0d);
        java.lang.Object obj49 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver34, (java.lang.Object) set46);
        java.lang.Object obj50 = hashMapTestDriver0.get((java.lang.Object) set46);
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection52 = hashMapTestDriver51.values();
        experiment.util.Set set53 = hashMapTestDriver51.entrySet();
        int int54 = hashMapTestDriver51.size();
        int int55 = hashMapTestDriver51.size();
        int int56 = hashMapTestDriver51.size();
        experiment.util.Set set57 = hashMapTestDriver51.keySet();
        boolean boolean58 = hashMapTestDriver0.containsKey((java.lang.Object) set57);
        java.lang.Class<?> wildcardClass59 = set57.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test044");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver12);
        int int14 = hashMapTestDriver12.size();
        experiment.util.Set set15 = hashMapTestDriver12.entrySet();
        java.lang.Class<?> wildcardClass16 = set15.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test045");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        hashMapTestDriver12.clear();
        hashMapTestDriver12.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj19 = hashMapTestDriver16.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj22 = hashMapTestDriver16.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver23.clear();
        java.lang.Object obj25 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver23);
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection28 = hashMapTestDriver27.values();
        experiment.util.Set set29 = hashMapTestDriver27.entrySet();
        java.lang.Object obj30 = hashMapTestDriver16.put((java.lang.Object) 10.0f, (java.lang.Object) hashMapTestDriver27);
        hashMapTestDriver27.clear();
        boolean boolean32 = hashMapTestDriver27.isEmpty();
        boolean boolean33 = hashMapTestDriver12.containsKey((java.lang.Object) boolean32);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection35 = hashMapTestDriver34.values();
        experiment.util.Set set36 = hashMapTestDriver34.entrySet();
        int int37 = hashMapTestDriver34.size();
        int int38 = hashMapTestDriver34.size();
        int int39 = hashMapTestDriver34.size();
        java.lang.Object obj41 = hashMapTestDriver34.get((java.lang.Object) (-1));
        boolean boolean43 = hashMapTestDriver34.containsKey((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection45 = hashMapTestDriver44.values();
        experiment.util.Set set46 = hashMapTestDriver44.entrySet();
        experiment.util.Collection collection47 = hashMapTestDriver44.values();
        boolean boolean48 = hashMapTestDriver34.containsKey((java.lang.Object) collection47);
        hashMapTestDriver34.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection51 = hashMapTestDriver50.values();
        experiment.util.Set set52 = hashMapTestDriver50.entrySet();
        int int53 = hashMapTestDriver50.size();
        int int54 = hashMapTestDriver50.size();
        int int55 = hashMapTestDriver50.size();
        experiment.util.Set set56 = hashMapTestDriver50.keySet();
        int int57 = hashMapTestDriver50.size();
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection59 = hashMapTestDriver58.values();
        experiment.util.Set set60 = hashMapTestDriver58.entrySet();
        int int61 = hashMapTestDriver58.size();
        int int62 = hashMapTestDriver58.size();
        int int63 = hashMapTestDriver58.size();
        java.lang.Object obj65 = hashMapTestDriver58.get((java.lang.Object) (-1));
        java.lang.Object obj66 = hashMapTestDriver50.get((java.lang.Object) hashMapTestDriver58);
        java.lang.Object obj67 = hashMapTestDriver34.remove((java.lang.Object) hashMapTestDriver50);
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection69 = hashMapTestDriver68.values();
        experiment.util.Set set70 = hashMapTestDriver68.entrySet();
        experiment.util.Collection collection71 = hashMapTestDriver68.values();
        experiment.util.Collection collection72 = hashMapTestDriver68.values();
        int int73 = hashMapTestDriver68.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj74 = hashMapTestDriver12.put(obj67, (java.lang.Object) int73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test046");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        int int10 = hashMapTestDriver7.size();
        int int11 = hashMapTestDriver7.size();
        int int12 = hashMapTestDriver7.size();
        java.lang.Object obj14 = hashMapTestDriver7.get((java.lang.Object) (-1));
        int int15 = hashMapTestDriver7.size();
        java.lang.Class<?> wildcardClass16 = hashMapTestDriver7.getClass();
        java.lang.Object obj17 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set18 = hashMapTestDriver7.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test047");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        java.lang.Object obj17 = hashMapTestDriver12.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean18 = hashMapTestDriver12.isEmpty();
        experiment.util.Set set19 = hashMapTestDriver12.entrySet();
        java.lang.Object obj21 = hashMapTestDriver10.put((java.lang.Object) set19, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        boolean boolean23 = hashMapTestDriver10.containsKey((java.lang.Object) hashMapTestDriver22);
        java.lang.Object obj24 = hashMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMapTestDriver10);
        hashMapTestDriver0.clear();
        boolean boolean26 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test048");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        java.lang.Object obj14 = hashMapTestDriver9.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean15 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean22 = hashMapTestDriver16.isEmpty();
        experiment.util.Set set23 = hashMapTestDriver16.entrySet();
        java.lang.Object obj24 = hashMapTestDriver9.remove((java.lang.Object) hashMapTestDriver16);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        java.lang.Object obj30 = hashMapTestDriver25.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection31 = hashMapTestDriver25.values();
        java.lang.Object obj33 = hashMapTestDriver25.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection34 = hashMapTestDriver25.values();
        java.lang.Object obj35 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver25);
        java.lang.Object obj36 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver25);
        boolean boolean37 = hashMapTestDriver25.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver38.clear();
        java.lang.Object obj40 = hashMapTestDriver25.remove((java.lang.Object) hashMapTestDriver38);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection42 = hashMapTestDriver41.values();
        experiment.util.Set set43 = hashMapTestDriver41.entrySet();
        java.lang.Object obj46 = hashMapTestDriver41.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection47 = hashMapTestDriver41.values();
        java.lang.Object obj49 = hashMapTestDriver41.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection52 = hashMapTestDriver51.values();
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection54 = hashMapTestDriver53.values();
        experiment.util.Set set55 = hashMapTestDriver53.entrySet();
        java.lang.Object obj58 = hashMapTestDriver53.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean59 = hashMapTestDriver53.isEmpty();
        experiment.util.Set set60 = hashMapTestDriver53.entrySet();
        java.lang.Object obj62 = hashMapTestDriver51.put((java.lang.Object) set60, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        boolean boolean64 = hashMapTestDriver51.containsKey((java.lang.Object) hashMapTestDriver63);
        java.lang.Object obj65 = hashMapTestDriver41.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMapTestDriver51);
        hashMapTestDriver41.clear();
        int int67 = hashMapTestDriver41.size();
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection69 = hashMapTestDriver68.values();
        experiment.util.Set set70 = hashMapTestDriver68.entrySet();
        java.lang.Object obj73 = hashMapTestDriver68.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection74 = hashMapTestDriver68.values();
        java.lang.Object obj75 = hashMapTestDriver41.get((java.lang.Object) collection74);
        java.lang.Object obj76 = hashMapTestDriver38.get((java.lang.Object) collection74);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test049");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        hashMapTestDriver12.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        experiment.util.Set set17 = hashMapTestDriver15.entrySet();
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean21 = hashMapTestDriver15.isEmpty();
        experiment.util.Set set22 = hashMapTestDriver15.entrySet();
        java.lang.Object obj24 = hashMapTestDriver15.remove((java.lang.Object) 10.0d);
        experiment.util.Set set25 = hashMapTestDriver15.keySet();
        boolean boolean26 = hashMapTestDriver12.containsKey((java.lang.Object) hashMapTestDriver15);
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection28 = hashMapTestDriver27.values();
        experiment.util.Set set29 = hashMapTestDriver27.entrySet();
        java.lang.Object obj32 = hashMapTestDriver27.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection33 = hashMapTestDriver27.values();
        java.lang.Object obj35 = hashMapTestDriver27.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection38 = hashMapTestDriver37.values();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection40 = hashMapTestDriver39.values();
        experiment.util.Set set41 = hashMapTestDriver39.entrySet();
        java.lang.Object obj44 = hashMapTestDriver39.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean45 = hashMapTestDriver39.isEmpty();
        experiment.util.Set set46 = hashMapTestDriver39.entrySet();
        java.lang.Object obj48 = hashMapTestDriver37.put((java.lang.Object) set46, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        boolean boolean50 = hashMapTestDriver37.containsKey((java.lang.Object) hashMapTestDriver49);
        java.lang.Object obj51 = hashMapTestDriver27.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMapTestDriver37);
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection53 = hashMapTestDriver52.values();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection55 = hashMapTestDriver54.values();
        experiment.util.Set set56 = hashMapTestDriver54.entrySet();
        java.lang.Object obj59 = hashMapTestDriver54.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean60 = hashMapTestDriver54.isEmpty();
        experiment.util.Set set61 = hashMapTestDriver54.entrySet();
        java.lang.Object obj63 = hashMapTestDriver52.put((java.lang.Object) set61, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj65 = hashMapTestDriver52.get((java.lang.Object) hashMapTestDriver64);
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj68 = hashMapTestDriver52.put((java.lang.Object) hashMapTestDriver66, (java.lang.Object) "hi!");
        java.lang.Object obj70 = hashMapTestDriver66.remove((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj71 = hashMapTestDriver12.put(obj51, (java.lang.Object) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj70);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test050");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        int int5 = hashMapTestDriver0.size();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (-1));
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) ' ');
        int int10 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        experiment.util.Set set13 = hashMapTestDriver11.entrySet();
        java.lang.Object obj16 = hashMapTestDriver11.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection17 = hashMapTestDriver11.values();
        experiment.util.Set set18 = hashMapTestDriver11.entrySet();
        hashMapTestDriver11.clear();
        experiment.util.Set set20 = hashMapTestDriver11.entrySet();
        experiment.util.Set set21 = hashMapTestDriver11.keySet();
        java.lang.Object obj22 = hashMapTestDriver0.get((java.lang.Object) set21);
        experiment.util.Set set23 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test051");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        int int5 = hashMapTestDriver0.size();
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        int int7 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        java.lang.Object obj15 = hashMapTestDriver10.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean16 = hashMapTestDriver10.isEmpty();
        experiment.util.Set set17 = hashMapTestDriver10.entrySet();
        java.lang.Object obj19 = hashMapTestDriver8.put((java.lang.Object) set17, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        boolean boolean21 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver20);
        int int22 = hashMapTestDriver20.size();
        experiment.util.Set set23 = hashMapTestDriver20.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        experiment.util.Set set26 = hashMapTestDriver24.entrySet();
        java.lang.Object obj29 = hashMapTestDriver24.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection30 = hashMapTestDriver24.values();
        java.lang.Object obj32 = hashMapTestDriver24.get((java.lang.Object) (short) -1);
        experiment.util.Set set33 = hashMapTestDriver24.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection35 = hashMapTestDriver34.values();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection37 = hashMapTestDriver36.values();
        experiment.util.Set set38 = hashMapTestDriver36.entrySet();
        java.lang.Object obj41 = hashMapTestDriver36.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean42 = hashMapTestDriver36.isEmpty();
        experiment.util.Set set43 = hashMapTestDriver36.entrySet();
        java.lang.Object obj45 = hashMapTestDriver34.put((java.lang.Object) set43, (java.lang.Object) 0.0d);
        java.lang.Object obj46 = hashMapTestDriver20.put((java.lang.Object) set33, (java.lang.Object) set43);
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection48 = hashMapTestDriver47.values();
        experiment.util.Set set49 = hashMapTestDriver47.entrySet();
        java.lang.Object obj52 = hashMapTestDriver47.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection53 = hashMapTestDriver47.values();
        java.lang.Object obj55 = hashMapTestDriver47.get((java.lang.Object) (byte) 0);
        int int56 = hashMapTestDriver47.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = hashMapTestDriver0.put(obj46, (java.lang.Object) hashMapTestDriver47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test052");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set3 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test053");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        hashMapTestDriver0.clear();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        java.lang.Object obj12 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) (short) -1);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        java.lang.Class<?> wildcardClass14 = hashMapTestDriver8.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test054");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        experiment.util.Set set6 = hashMapTestDriver4.entrySet();
        java.lang.Object obj9 = hashMapTestDriver4.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean10 = hashMapTestDriver4.isEmpty();
        experiment.util.Set set11 = hashMapTestDriver4.entrySet();
        java.lang.Object obj13 = hashMapTestDriver2.put((java.lang.Object) set11, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        boolean boolean15 = hashMapTestDriver2.containsKey((java.lang.Object) hashMapTestDriver14);
        int int16 = hashMapTestDriver14.size();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection18 = hashMapTestDriver17.values();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        java.lang.Object obj24 = hashMapTestDriver19.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean25 = hashMapTestDriver19.isEmpty();
        experiment.util.Set set26 = hashMapTestDriver19.entrySet();
        java.lang.Object obj28 = hashMapTestDriver17.put((java.lang.Object) set26, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver17.get((java.lang.Object) hashMapTestDriver29);
        hashMapTestDriver29.clear();
        java.lang.Object obj32 = hashMapTestDriver14.remove((java.lang.Object) hashMapTestDriver29);
        java.lang.Object obj33 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver14);
        experiment.util.Collection collection34 = hashMapTestDriver0.values();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test055");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 0);
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test056");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        hashMapTestDriver0.clear();
        java.lang.Object obj16 = hashMapTestDriver0.remove((java.lang.Object) (short) -1);
        experiment.util.Set set17 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass18 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test057");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        hashMapTestDriver12.clear();
        experiment.util.Collection collection15 = hashMapTestDriver12.values();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj19 = hashMapTestDriver16.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj22 = hashMapTestDriver16.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver23.clear();
        java.lang.Object obj25 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver23);
        int int26 = hashMapTestDriver16.size();
        java.lang.Object obj27 = hashMapTestDriver12.get((java.lang.Object) int26);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test058");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        java.lang.Object obj11 = hashMapTestDriver6.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection12 = hashMapTestDriver6.values();
        experiment.util.Set set13 = hashMapTestDriver6.entrySet();
        java.lang.Class<?> wildcardClass14 = set13.getClass();
        boolean boolean15 = hashMapTestDriver0.containsKey((java.lang.Object) set13);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        java.lang.Object obj24 = hashMapTestDriver16.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection27 = hashMapTestDriver26.values();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        experiment.util.Set set30 = hashMapTestDriver28.entrySet();
        java.lang.Object obj33 = hashMapTestDriver28.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean34 = hashMapTestDriver28.isEmpty();
        experiment.util.Set set35 = hashMapTestDriver28.entrySet();
        java.lang.Object obj37 = hashMapTestDriver26.put((java.lang.Object) set35, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        boolean boolean39 = hashMapTestDriver26.containsKey((java.lang.Object) hashMapTestDriver38);
        java.lang.Object obj40 = hashMapTestDriver16.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMapTestDriver26);
        hashMapTestDriver16.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection43 = hashMapTestDriver42.values();
        experiment.util.Set set44 = hashMapTestDriver42.entrySet();
        java.lang.Object obj47 = hashMapTestDriver42.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean48 = hashMapTestDriver42.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection50 = hashMapTestDriver49.values();
        experiment.util.Set set51 = hashMapTestDriver49.entrySet();
        java.lang.Object obj54 = hashMapTestDriver49.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean55 = hashMapTestDriver49.isEmpty();
        experiment.util.Set set56 = hashMapTestDriver49.entrySet();
        java.lang.Object obj57 = hashMapTestDriver42.remove((java.lang.Object) hashMapTestDriver49);
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection59 = hashMapTestDriver58.values();
        experiment.util.Set set60 = hashMapTestDriver58.entrySet();
        java.lang.Object obj63 = hashMapTestDriver58.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection64 = hashMapTestDriver58.values();
        java.lang.Object obj66 = hashMapTestDriver58.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection67 = hashMapTestDriver58.values();
        java.lang.Object obj68 = hashMapTestDriver49.remove((java.lang.Object) hashMapTestDriver58);
        java.lang.Object obj70 = hashMapTestDriver58.get((java.lang.Object) 100.0f);
        boolean boolean72 = hashMapTestDriver58.containsKey((java.lang.Object) (short) 1);
        java.lang.Object obj73 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) boolean72);
        int int74 = hashMapTestDriver16.size();
        java.lang.Object obj76 = hashMapTestDriver16.get((java.lang.Object) 1L);
        experiment.util.HashMapTestDriver hashMapTestDriver77 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection78 = hashMapTestDriver77.values();
        experiment.util.Set set79 = hashMapTestDriver77.entrySet();
        int int80 = hashMapTestDriver77.size();
        experiment.util.Collection collection81 = hashMapTestDriver77.values();
        boolean boolean82 = hashMapTestDriver77.isEmpty();
        java.lang.Object obj83 = hashMapTestDriver16.remove((java.lang.Object) boolean82);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(obj83);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test059");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        hashMapTestDriver0.clear();
        java.lang.Object obj16 = hashMapTestDriver0.remove((java.lang.Object) (short) -1);
        experiment.util.Set set17 = hashMapTestDriver0.entrySet();
        experiment.util.Set set18 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test060");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 0);
        int int5 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test061");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (short) -1);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection13 = hashMapTestDriver10.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        java.lang.Object obj19 = hashMapTestDriver14.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection20 = hashMapTestDriver14.values();
        java.lang.Object obj22 = hashMapTestDriver14.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection27 = hashMapTestDriver26.values();
        experiment.util.Set set28 = hashMapTestDriver26.entrySet();
        java.lang.Object obj31 = hashMapTestDriver26.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean32 = hashMapTestDriver26.isEmpty();
        experiment.util.Set set33 = hashMapTestDriver26.entrySet();
        java.lang.Object obj35 = hashMapTestDriver24.put((java.lang.Object) set33, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        boolean boolean37 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver36);
        java.lang.Object obj38 = hashMapTestDriver14.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMapTestDriver24);
        hashMapTestDriver14.clear();
        java.lang.Object obj40 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver10, (java.lang.Object) hashMapTestDriver14);
        hashMapTestDriver14.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test062");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        java.lang.Object obj17 = hashMapTestDriver12.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean18 = hashMapTestDriver12.isEmpty();
        experiment.util.Set set19 = hashMapTestDriver12.entrySet();
        java.lang.Object obj21 = hashMapTestDriver10.put((java.lang.Object) set19, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        boolean boolean23 = hashMapTestDriver10.containsKey((java.lang.Object) hashMapTestDriver22);
        java.lang.Object obj24 = hashMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMapTestDriver10);
        int int25 = hashMapTestDriver10.size();
        experiment.util.Set set26 = hashMapTestDriver10.entrySet();
        int int27 = hashMapTestDriver10.size();
        boolean boolean28 = hashMapTestDriver10.isEmpty();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test063");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        java.lang.Object obj11 = hashMapTestDriver6.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection12 = hashMapTestDriver6.values();
        experiment.util.Set set13 = hashMapTestDriver6.entrySet();
        java.lang.Class<?> wildcardClass14 = set13.getClass();
        boolean boolean15 = hashMapTestDriver0.containsKey((java.lang.Object) set13);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection19 = hashMapTestDriver18.values();
        experiment.util.Set set20 = hashMapTestDriver18.entrySet();
        java.lang.Object obj23 = hashMapTestDriver18.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean24 = hashMapTestDriver18.isEmpty();
        experiment.util.Set set25 = hashMapTestDriver18.entrySet();
        java.lang.Object obj27 = hashMapTestDriver16.put((java.lang.Object) set25, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver16.get((java.lang.Object) hashMapTestDriver28);
        hashMapTestDriver28.clear();
        hashMapTestDriver28.clear();
        java.lang.Object obj32 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver28);
        experiment.util.Set set33 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test064");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (short) -1);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection13 = hashMapTestDriver10.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        java.lang.Object obj19 = hashMapTestDriver14.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection20 = hashMapTestDriver14.values();
        java.lang.Object obj22 = hashMapTestDriver14.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection27 = hashMapTestDriver26.values();
        experiment.util.Set set28 = hashMapTestDriver26.entrySet();
        java.lang.Object obj31 = hashMapTestDriver26.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean32 = hashMapTestDriver26.isEmpty();
        experiment.util.Set set33 = hashMapTestDriver26.entrySet();
        java.lang.Object obj35 = hashMapTestDriver24.put((java.lang.Object) set33, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        boolean boolean37 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver36);
        java.lang.Object obj38 = hashMapTestDriver14.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMapTestDriver24);
        hashMapTestDriver14.clear();
        java.lang.Object obj40 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver10, (java.lang.Object) hashMapTestDriver14);
        experiment.util.Set set41 = hashMapTestDriver10.keySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test065");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        java.lang.Object obj12 = hashMapTestDriver7.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean13 = hashMapTestDriver7.isEmpty();
        experiment.util.Set set14 = hashMapTestDriver7.entrySet();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        java.lang.Object obj24 = hashMapTestDriver16.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        java.lang.Object obj26 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver16);
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection28 = hashMapTestDriver27.values();
        experiment.util.Set set29 = hashMapTestDriver27.entrySet();
        java.lang.Object obj32 = hashMapTestDriver27.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean33 = hashMapTestDriver27.isEmpty();
        java.lang.Class<?> wildcardClass34 = hashMapTestDriver27.getClass();
        java.lang.Object obj35 = hashMapTestDriver7.remove((java.lang.Object) wildcardClass34);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection37 = hashMapTestDriver36.values();
        experiment.util.Set set38 = hashMapTestDriver36.entrySet();
        java.lang.Object obj41 = hashMapTestDriver36.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean42 = hashMapTestDriver36.isEmpty();
        experiment.util.Set set43 = hashMapTestDriver36.entrySet();
        java.lang.Class<?> wildcardClass44 = set43.getClass();
        boolean boolean45 = hashMapTestDriver7.containsKey((java.lang.Object) set43);
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver46.clear();
        experiment.util.Collection collection48 = hashMapTestDriver46.values();
        java.lang.Object obj49 = hashMapTestDriver7.remove((java.lang.Object) collection48);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test066");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        experiment.util.Set set6 = hashMapTestDriver4.entrySet();
        java.lang.Object obj9 = hashMapTestDriver4.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean10 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        experiment.util.Set set13 = hashMapTestDriver11.entrySet();
        java.lang.Object obj16 = hashMapTestDriver11.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean17 = hashMapTestDriver11.isEmpty();
        experiment.util.Set set18 = hashMapTestDriver11.entrySet();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) hashMapTestDriver11);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection21 = hashMapTestDriver20.values();
        experiment.util.Set set22 = hashMapTestDriver20.entrySet();
        java.lang.Object obj25 = hashMapTestDriver20.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection26 = hashMapTestDriver20.values();
        java.lang.Object obj28 = hashMapTestDriver20.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection29 = hashMapTestDriver20.values();
        java.lang.Object obj30 = hashMapTestDriver11.remove((java.lang.Object) hashMapTestDriver20);
        java.lang.Object obj32 = hashMapTestDriver20.get((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection34 = hashMapTestDriver33.values();
        experiment.util.Set set35 = hashMapTestDriver33.entrySet();
        java.lang.Object obj38 = hashMapTestDriver33.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection39 = hashMapTestDriver33.values();
        java.lang.Object obj41 = hashMapTestDriver33.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection44 = hashMapTestDriver43.values();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection46 = hashMapTestDriver45.values();
        experiment.util.Set set47 = hashMapTestDriver45.entrySet();
        java.lang.Object obj50 = hashMapTestDriver45.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean51 = hashMapTestDriver45.isEmpty();
        experiment.util.Set set52 = hashMapTestDriver45.entrySet();
        java.lang.Object obj54 = hashMapTestDriver43.put((java.lang.Object) set52, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        boolean boolean56 = hashMapTestDriver43.containsKey((java.lang.Object) hashMapTestDriver55);
        java.lang.Object obj57 = hashMapTestDriver33.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMapTestDriver43);
        hashMapTestDriver33.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection60 = hashMapTestDriver59.values();
        experiment.util.Set set61 = hashMapTestDriver59.entrySet();
        java.lang.Object obj64 = hashMapTestDriver59.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean65 = hashMapTestDriver59.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection67 = hashMapTestDriver66.values();
        experiment.util.Set set68 = hashMapTestDriver66.entrySet();
        java.lang.Object obj71 = hashMapTestDriver66.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean72 = hashMapTestDriver66.isEmpty();
        experiment.util.Set set73 = hashMapTestDriver66.entrySet();
        java.lang.Object obj74 = hashMapTestDriver59.remove((java.lang.Object) hashMapTestDriver66);
        experiment.util.HashMapTestDriver hashMapTestDriver75 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection76 = hashMapTestDriver75.values();
        experiment.util.Set set77 = hashMapTestDriver75.entrySet();
        java.lang.Object obj80 = hashMapTestDriver75.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection81 = hashMapTestDriver75.values();
        java.lang.Object obj83 = hashMapTestDriver75.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection84 = hashMapTestDriver75.values();
        java.lang.Object obj85 = hashMapTestDriver66.remove((java.lang.Object) hashMapTestDriver75);
        experiment.util.HashMapTestDriver hashMapTestDriver86 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection87 = hashMapTestDriver86.values();
        experiment.util.Set set88 = hashMapTestDriver86.entrySet();
        java.lang.Object obj91 = hashMapTestDriver86.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean92 = hashMapTestDriver86.isEmpty();
        java.lang.Class<?> wildcardClass93 = hashMapTestDriver86.getClass();
        java.lang.Object obj94 = hashMapTestDriver66.remove((java.lang.Object) wildcardClass93);
        boolean boolean95 = hashMapTestDriver66.isEmpty();
        java.lang.Object obj96 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver33, (java.lang.Object) hashMapTestDriver66);
        experiment.util.Set set97 = hashMapTestDriver66.keySet();
        boolean boolean98 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver66);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(wildcardClass93);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertNotNull(set97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test067");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        java.lang.Object obj12 = hashMapTestDriver7.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean13 = hashMapTestDriver7.isEmpty();
        experiment.util.Set set14 = hashMapTestDriver7.entrySet();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        java.lang.Object obj24 = hashMapTestDriver16.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        java.lang.Object obj26 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver16);
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver27.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj33 = hashMapTestDriver27.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver34.clear();
        java.lang.Object obj36 = hashMapTestDriver27.remove((java.lang.Object) hashMapTestDriver34);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection38 = hashMapTestDriver37.values();
        experiment.util.Set set39 = hashMapTestDriver37.entrySet();
        int int40 = hashMapTestDriver37.size();
        int int41 = hashMapTestDriver37.size();
        int int42 = hashMapTestDriver37.size();
        java.lang.Object obj44 = hashMapTestDriver37.get((java.lang.Object) (-1));
        boolean boolean46 = hashMapTestDriver37.containsKey((java.lang.Object) ' ');
        experiment.util.Set set47 = hashMapTestDriver37.keySet();
        java.lang.Object obj48 = hashMapTestDriver34.get((java.lang.Object) hashMapTestDriver37);
        experiment.util.Set set49 = hashMapTestDriver34.keySet();
        java.lang.Object obj50 = hashMapTestDriver7.get((java.lang.Object) set49);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test068");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (short) -1);
        experiment.util.Set set9 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        java.lang.Object obj17 = hashMapTestDriver12.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean18 = hashMapTestDriver12.isEmpty();
        experiment.util.Set set19 = hashMapTestDriver12.entrySet();
        java.lang.Object obj21 = hashMapTestDriver10.put((java.lang.Object) set19, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver10.get((java.lang.Object) hashMapTestDriver22);
        hashMapTestDriver22.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        java.lang.Object obj30 = hashMapTestDriver25.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean31 = hashMapTestDriver25.isEmpty();
        experiment.util.Set set32 = hashMapTestDriver25.entrySet();
        java.lang.Object obj34 = hashMapTestDriver25.remove((java.lang.Object) 10.0d);
        experiment.util.Set set35 = hashMapTestDriver25.keySet();
        boolean boolean36 = hashMapTestDriver22.containsKey((java.lang.Object) hashMapTestDriver25);
        java.lang.Object obj37 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver22);
        hashMapTestDriver22.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test069");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj6 = hashMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver7.clear();
        java.lang.Object obj9 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        experiment.util.Set set13 = hashMapTestDriver11.entrySet();
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) 10.0f, (java.lang.Object) hashMapTestDriver11);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        experiment.util.Set set17 = hashMapTestDriver15.entrySet();
        int int18 = hashMapTestDriver15.size();
        int int19 = hashMapTestDriver15.size();
        boolean boolean20 = hashMapTestDriver15.isEmpty();
        experiment.util.Set set21 = hashMapTestDriver15.keySet();
        experiment.util.Collection collection22 = hashMapTestDriver15.values();
        java.lang.Class<?> wildcardClass23 = hashMapTestDriver15.getClass();
        boolean boolean24 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver15);
        int int25 = hashMapTestDriver15.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test070");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj6 = hashMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver7.clear();
        java.lang.Object obj9 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        experiment.util.Set set13 = hashMapTestDriver11.entrySet();
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) 10.0f, (java.lang.Object) hashMapTestDriver11);
        hashMapTestDriver11.clear();
        boolean boolean16 = hashMapTestDriver11.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection18 = hashMapTestDriver17.values();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        java.lang.Object obj22 = hashMapTestDriver17.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection23 = hashMapTestDriver17.values();
        java.lang.Object obj25 = hashMapTestDriver17.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection27 = hashMapTestDriver26.values();
        experiment.util.Set set28 = hashMapTestDriver26.entrySet();
        java.lang.Object obj31 = hashMapTestDriver26.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean32 = hashMapTestDriver26.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection34 = hashMapTestDriver33.values();
        experiment.util.Set set35 = hashMapTestDriver33.entrySet();
        java.lang.Object obj38 = hashMapTestDriver33.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean39 = hashMapTestDriver33.isEmpty();
        experiment.util.Set set40 = hashMapTestDriver33.entrySet();
        java.lang.Object obj41 = hashMapTestDriver26.remove((java.lang.Object) hashMapTestDriver33);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection43 = hashMapTestDriver42.values();
        experiment.util.Set set44 = hashMapTestDriver42.entrySet();
        java.lang.Object obj47 = hashMapTestDriver42.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection48 = hashMapTestDriver42.values();
        java.lang.Object obj50 = hashMapTestDriver42.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection51 = hashMapTestDriver42.values();
        java.lang.Object obj52 = hashMapTestDriver33.remove((java.lang.Object) hashMapTestDriver42);
        java.lang.Object obj53 = hashMapTestDriver17.get((java.lang.Object) hashMapTestDriver42);
        java.lang.Class<?> wildcardClass54 = hashMapTestDriver17.getClass();
        java.lang.Object obj55 = hashMapTestDriver11.remove((java.lang.Object) wildcardClass54);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test071");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        java.lang.Object obj14 = hashMapTestDriver9.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean15 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        int int19 = hashMapTestDriver16.size();
        int int20 = hashMapTestDriver16.size();
        int int21 = hashMapTestDriver16.size();
        java.lang.Object obj23 = hashMapTestDriver16.get((java.lang.Object) (-1));
        int int24 = hashMapTestDriver16.size();
        java.lang.Class<?> wildcardClass25 = hashMapTestDriver16.getClass();
        java.lang.Object obj26 = hashMapTestDriver9.get((java.lang.Object) hashMapTestDriver16);
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver27.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj33 = hashMapTestDriver27.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver34.clear();
        java.lang.Object obj36 = hashMapTestDriver27.remove((java.lang.Object) hashMapTestDriver34);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection38 = hashMapTestDriver37.values();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection40 = hashMapTestDriver39.values();
        experiment.util.Set set41 = hashMapTestDriver39.entrySet();
        java.lang.Object obj44 = hashMapTestDriver39.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean45 = hashMapTestDriver39.isEmpty();
        experiment.util.Set set46 = hashMapTestDriver39.entrySet();
        java.lang.Object obj48 = hashMapTestDriver37.put((java.lang.Object) set46, (java.lang.Object) 0.0d);
        java.lang.Object obj49 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver34, (java.lang.Object) set46);
        java.lang.Object obj50 = hashMapTestDriver0.get((java.lang.Object) set46);
        experiment.util.Set set51 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test072");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        int int14 = hashMapTestDriver0.size();
        experiment.util.Set set15 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        java.lang.Object obj20 = hashMapTestDriver0.remove((java.lang.Object) collection19);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test073");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (short) -1);
        experiment.util.Set set9 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        java.lang.Object obj17 = hashMapTestDriver12.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean18 = hashMapTestDriver12.isEmpty();
        experiment.util.Set set19 = hashMapTestDriver12.entrySet();
        java.lang.Object obj21 = hashMapTestDriver10.put((java.lang.Object) set19, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver10.get((java.lang.Object) hashMapTestDriver22);
        hashMapTestDriver22.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        java.lang.Object obj30 = hashMapTestDriver25.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean31 = hashMapTestDriver25.isEmpty();
        experiment.util.Set set32 = hashMapTestDriver25.entrySet();
        java.lang.Object obj34 = hashMapTestDriver25.remove((java.lang.Object) 10.0d);
        experiment.util.Set set35 = hashMapTestDriver25.keySet();
        boolean boolean36 = hashMapTestDriver22.containsKey((java.lang.Object) hashMapTestDriver25);
        java.lang.Object obj37 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver22);
        boolean boolean38 = hashMapTestDriver22.isEmpty();
        java.lang.Object obj40 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = hashMapTestDriver22.put((java.lang.Object) (byte) -1, obj40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test074");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (byte) 0);
        int int9 = hashMapTestDriver0.size();
        experiment.util.Set set10 = hashMapTestDriver0.keySet();
        experiment.util.Set set11 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test075");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        hashMapTestDriver0.clear();
        hashMapTestDriver0.clear();
        java.lang.Object obj9 = hashMapTestDriver0.remove((java.lang.Object) 0);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test076");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        int int5 = hashMapTestDriver0.size();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) (-1));
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection13 = hashMapTestDriver10.values();
        boolean boolean14 = hashMapTestDriver0.containsKey((java.lang.Object) collection13);
        hashMapTestDriver0.clear();
        int int16 = hashMapTestDriver0.size();
        boolean boolean17 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection19 = hashMapTestDriver18.values();
        experiment.util.Set set20 = hashMapTestDriver18.entrySet();
        java.lang.Object obj23 = hashMapTestDriver18.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean24 = hashMapTestDriver18.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        java.lang.Object obj30 = hashMapTestDriver25.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean31 = hashMapTestDriver25.isEmpty();
        experiment.util.Set set32 = hashMapTestDriver25.entrySet();
        java.lang.Object obj33 = hashMapTestDriver18.remove((java.lang.Object) hashMapTestDriver25);
        int int34 = hashMapTestDriver25.size();
        boolean boolean35 = hashMapTestDriver0.containsKey((java.lang.Object) int34);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test077");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection8 = hashMapTestDriver2.values();
        java.lang.Object obj10 = hashMapTestDriver2.get((java.lang.Object) (byte) 0);
        int int11 = hashMapTestDriver2.size();
        experiment.util.Set set12 = hashMapTestDriver2.keySet();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) set12);
        experiment.util.Set set14 = hashMapTestDriver0.keySet();
        experiment.util.Set set15 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test078");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        java.lang.Object obj12 = hashMapTestDriver7.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean13 = hashMapTestDriver7.isEmpty();
        experiment.util.Set set14 = hashMapTestDriver7.entrySet();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        java.lang.Object obj24 = hashMapTestDriver16.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        java.lang.Object obj26 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver16);
        java.lang.Object obj28 = hashMapTestDriver16.get((java.lang.Object) 100.0f);
        int int29 = hashMapTestDriver16.size();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test079");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        java.lang.Object obj14 = hashMapTestDriver9.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean15 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean22 = hashMapTestDriver16.isEmpty();
        experiment.util.Set set23 = hashMapTestDriver16.entrySet();
        java.lang.Object obj24 = hashMapTestDriver9.remove((java.lang.Object) hashMapTestDriver16);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        java.lang.Object obj30 = hashMapTestDriver25.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection31 = hashMapTestDriver25.values();
        java.lang.Object obj33 = hashMapTestDriver25.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection34 = hashMapTestDriver25.values();
        java.lang.Object obj35 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver25);
        java.lang.Object obj36 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver25);
        boolean boolean37 = hashMapTestDriver25.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver38.clear();
        java.lang.Object obj40 = hashMapTestDriver25.remove((java.lang.Object) hashMapTestDriver38);
        experiment.util.Set set41 = hashMapTestDriver38.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection43 = hashMapTestDriver42.values();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection45 = hashMapTestDriver44.values();
        experiment.util.Set set46 = hashMapTestDriver44.entrySet();
        java.lang.Object obj49 = hashMapTestDriver44.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean50 = hashMapTestDriver44.isEmpty();
        experiment.util.Set set51 = hashMapTestDriver44.entrySet();
        java.lang.Object obj53 = hashMapTestDriver42.put((java.lang.Object) set51, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        boolean boolean55 = hashMapTestDriver42.containsKey((java.lang.Object) hashMapTestDriver54);
        int int56 = hashMapTestDriver54.size();
        experiment.util.Set set57 = hashMapTestDriver54.entrySet();
        boolean boolean58 = hashMapTestDriver38.containsKey((java.lang.Object) set57);
        experiment.util.Set set59 = hashMapTestDriver38.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(set59);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test080");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection8 = hashMapTestDriver2.values();
        java.lang.Object obj10 = hashMapTestDriver2.get((java.lang.Object) (byte) 0);
        int int11 = hashMapTestDriver2.size();
        experiment.util.Set set12 = hashMapTestDriver2.keySet();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) set12);
        java.lang.Class<?> wildcardClass14 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test081");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        int int14 = hashMapTestDriver0.size();
        experiment.util.Set set15 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test082");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        java.lang.Object obj17 = hashMapTestDriver12.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean18 = hashMapTestDriver12.isEmpty();
        experiment.util.Set set19 = hashMapTestDriver12.entrySet();
        java.lang.Object obj21 = hashMapTestDriver10.put((java.lang.Object) set19, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        boolean boolean23 = hashMapTestDriver10.containsKey((java.lang.Object) hashMapTestDriver22);
        java.lang.Object obj24 = hashMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection28 = hashMapTestDriver27.values();
        experiment.util.Set set29 = hashMapTestDriver27.entrySet();
        java.lang.Object obj32 = hashMapTestDriver27.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean33 = hashMapTestDriver27.isEmpty();
        experiment.util.Set set34 = hashMapTestDriver27.entrySet();
        java.lang.Object obj36 = hashMapTestDriver25.put((java.lang.Object) set34, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj38 = hashMapTestDriver25.get((java.lang.Object) hashMapTestDriver37);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj41 = hashMapTestDriver25.put((java.lang.Object) hashMapTestDriver39, (java.lang.Object) "hi!");
        java.lang.Object obj42 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver39);
        boolean boolean43 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test083");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        int int7 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) (short) 0);
        experiment.util.Collection collection13 = hashMapTestDriver8.values();
        boolean boolean14 = hashMapTestDriver0.containsKey((java.lang.Object) collection13);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test084");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (byte) 0);
        int int9 = hashMapTestDriver0.size();
        experiment.util.Set set10 = hashMapTestDriver0.keySet();
        int int11 = hashMapTestDriver0.size();
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test085");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        int int14 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        int int19 = hashMapTestDriver16.size();
        experiment.util.Collection collection20 = hashMapTestDriver16.values();
        java.lang.Object obj21 = hashMapTestDriver0.remove((java.lang.Object) collection20);
        int int22 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test086");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj6 = hashMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver7.clear();
        java.lang.Object obj9 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        experiment.util.Set set13 = hashMapTestDriver11.entrySet();
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) 10.0f, (java.lang.Object) hashMapTestDriver11);
        int int15 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        experiment.util.Set set23 = hashMapTestDriver16.keySet();
        boolean boolean24 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver16);
        experiment.util.Set set25 = hashMapTestDriver16.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection28 = hashMapTestDriver27.values();
        experiment.util.Set set29 = hashMapTestDriver27.entrySet();
        int int30 = hashMapTestDriver27.size();
        int int31 = hashMapTestDriver27.size();
        int int32 = hashMapTestDriver27.size();
        experiment.util.Set set33 = hashMapTestDriver27.keySet();
        int int34 = hashMapTestDriver27.size();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection36 = hashMapTestDriver35.values();
        experiment.util.Set set37 = hashMapTestDriver35.entrySet();
        int int38 = hashMapTestDriver35.size();
        int int39 = hashMapTestDriver35.size();
        int int40 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver35.get((java.lang.Object) (-1));
        java.lang.Object obj43 = hashMapTestDriver27.get((java.lang.Object) hashMapTestDriver35);
        experiment.util.Set set44 = hashMapTestDriver35.entrySet();
        java.lang.Object obj45 = hashMapTestDriver16.get((java.lang.Object) hashMapTestDriver35);
        hashMapTestDriver16.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test087");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass7 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test088");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj6 = hashMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        hashMapTestDriver0.clear();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test089");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        java.lang.Object obj9 = hashMapTestDriver0.remove((java.lang.Object) 10.0d);
        boolean boolean10 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test090");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        int int14 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        int int19 = hashMapTestDriver16.size();
        experiment.util.Collection collection20 = hashMapTestDriver16.values();
        java.lang.Object obj21 = hashMapTestDriver0.remove((java.lang.Object) collection20);
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test091");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        java.lang.Object obj11 = hashMapTestDriver6.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection12 = hashMapTestDriver6.values();
        experiment.util.Set set13 = hashMapTestDriver6.entrySet();
        java.lang.Class<?> wildcardClass14 = set13.getClass();
        boolean boolean15 = hashMapTestDriver0.containsKey((java.lang.Object) set13);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection19 = hashMapTestDriver18.values();
        experiment.util.Set set20 = hashMapTestDriver18.entrySet();
        java.lang.Object obj23 = hashMapTestDriver18.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean24 = hashMapTestDriver18.isEmpty();
        experiment.util.Set set25 = hashMapTestDriver18.entrySet();
        java.lang.Object obj27 = hashMapTestDriver16.put((java.lang.Object) set25, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj29 = hashMapTestDriver16.get((java.lang.Object) hashMapTestDriver28);
        hashMapTestDriver28.clear();
        hashMapTestDriver28.clear();
        java.lang.Object obj32 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver28);
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection34 = hashMapTestDriver33.values();
        experiment.util.Set set35 = hashMapTestDriver33.entrySet();
        int int36 = hashMapTestDriver33.size();
        int int37 = hashMapTestDriver33.size();
        int int38 = hashMapTestDriver33.size();
        java.lang.Object obj40 = hashMapTestDriver33.get((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj41 = hashMapTestDriver0.remove(obj40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test092");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.entrySet();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = hashMapTestDriver0.containsKey(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test093");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        java.lang.Object obj12 = hashMapTestDriver7.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean13 = hashMapTestDriver7.isEmpty();
        experiment.util.Set set14 = hashMapTestDriver7.entrySet();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        java.lang.Object obj24 = hashMapTestDriver16.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        java.lang.Object obj26 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver16);
        java.lang.Object obj28 = hashMapTestDriver16.get((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection30 = hashMapTestDriver29.values();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        java.lang.Object obj34 = hashMapTestDriver29.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection35 = hashMapTestDriver29.values();
        java.lang.Object obj37 = hashMapTestDriver29.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection40 = hashMapTestDriver39.values();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection42 = hashMapTestDriver41.values();
        experiment.util.Set set43 = hashMapTestDriver41.entrySet();
        java.lang.Object obj46 = hashMapTestDriver41.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean47 = hashMapTestDriver41.isEmpty();
        experiment.util.Set set48 = hashMapTestDriver41.entrySet();
        java.lang.Object obj50 = hashMapTestDriver39.put((java.lang.Object) set48, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        boolean boolean52 = hashMapTestDriver39.containsKey((java.lang.Object) hashMapTestDriver51);
        java.lang.Object obj53 = hashMapTestDriver29.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMapTestDriver39);
        hashMapTestDriver29.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection56 = hashMapTestDriver55.values();
        experiment.util.Set set57 = hashMapTestDriver55.entrySet();
        java.lang.Object obj60 = hashMapTestDriver55.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean61 = hashMapTestDriver55.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection63 = hashMapTestDriver62.values();
        experiment.util.Set set64 = hashMapTestDriver62.entrySet();
        java.lang.Object obj67 = hashMapTestDriver62.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean68 = hashMapTestDriver62.isEmpty();
        experiment.util.Set set69 = hashMapTestDriver62.entrySet();
        java.lang.Object obj70 = hashMapTestDriver55.remove((java.lang.Object) hashMapTestDriver62);
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection72 = hashMapTestDriver71.values();
        experiment.util.Set set73 = hashMapTestDriver71.entrySet();
        java.lang.Object obj76 = hashMapTestDriver71.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection77 = hashMapTestDriver71.values();
        java.lang.Object obj79 = hashMapTestDriver71.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection80 = hashMapTestDriver71.values();
        java.lang.Object obj81 = hashMapTestDriver62.remove((java.lang.Object) hashMapTestDriver71);
        experiment.util.HashMapTestDriver hashMapTestDriver82 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection83 = hashMapTestDriver82.values();
        experiment.util.Set set84 = hashMapTestDriver82.entrySet();
        java.lang.Object obj87 = hashMapTestDriver82.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean88 = hashMapTestDriver82.isEmpty();
        java.lang.Class<?> wildcardClass89 = hashMapTestDriver82.getClass();
        java.lang.Object obj90 = hashMapTestDriver62.remove((java.lang.Object) wildcardClass89);
        boolean boolean91 = hashMapTestDriver62.isEmpty();
        java.lang.Object obj92 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver29, (java.lang.Object) hashMapTestDriver62);
        experiment.util.Set set93 = hashMapTestDriver62.entrySet();
        experiment.util.Set set94 = hashMapTestDriver62.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(set93);
        org.junit.Assert.assertNotNull(set94);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test094");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        java.lang.Object obj12 = hashMapTestDriver7.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean13 = hashMapTestDriver7.isEmpty();
        experiment.util.Set set14 = hashMapTestDriver7.entrySet();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        java.lang.Object obj24 = hashMapTestDriver16.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        java.lang.Object obj26 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver16);
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection28 = hashMapTestDriver27.values();
        experiment.util.Set set29 = hashMapTestDriver27.entrySet();
        java.lang.Object obj32 = hashMapTestDriver27.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean33 = hashMapTestDriver27.isEmpty();
        java.lang.Class<?> wildcardClass34 = hashMapTestDriver27.getClass();
        java.lang.Object obj35 = hashMapTestDriver7.remove((java.lang.Object) wildcardClass34);
        boolean boolean36 = hashMapTestDriver7.isEmpty();
        hashMapTestDriver7.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test095");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        java.lang.Object obj17 = hashMapTestDriver12.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean18 = hashMapTestDriver12.isEmpty();
        experiment.util.Set set19 = hashMapTestDriver12.entrySet();
        java.lang.Object obj21 = hashMapTestDriver10.put((java.lang.Object) set19, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        boolean boolean23 = hashMapTestDriver10.containsKey((java.lang.Object) hashMapTestDriver22);
        java.lang.Object obj24 = hashMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver25.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj31 = hashMapTestDriver25.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver32.clear();
        java.lang.Object obj34 = hashMapTestDriver25.remove((java.lang.Object) hashMapTestDriver32);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection37 = hashMapTestDriver36.values();
        experiment.util.Set set38 = hashMapTestDriver36.entrySet();
        java.lang.Object obj39 = hashMapTestDriver25.put((java.lang.Object) 10.0f, (java.lang.Object) hashMapTestDriver36);
        java.lang.Object obj40 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass41 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test096");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (short) -1);
        experiment.util.Set set9 = hashMapTestDriver0.keySet();
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test097");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test098");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection8 = hashMapTestDriver2.values();
        java.lang.Object obj10 = hashMapTestDriver2.get((java.lang.Object) (byte) 0);
        int int11 = hashMapTestDriver2.size();
        experiment.util.Set set12 = hashMapTestDriver2.keySet();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) set12);
        experiment.util.Set set14 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass15 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test099");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj6 = hashMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver7.clear();
        java.lang.Object obj9 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        experiment.util.Set set13 = hashMapTestDriver11.entrySet();
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) 10.0f, (java.lang.Object) hashMapTestDriver11);
        experiment.util.Set set15 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test100");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (byte) 0);
        experiment.util.Set set9 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        experiment.util.Set set13 = hashMapTestDriver11.entrySet();
        int int14 = hashMapTestDriver11.size();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        experiment.util.Set set17 = hashMapTestDriver15.entrySet();
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection21 = hashMapTestDriver15.values();
        java.lang.Object obj23 = hashMapTestDriver15.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection24 = hashMapTestDriver15.values();
        java.lang.Object obj25 = hashMapTestDriver11.get((java.lang.Object) hashMapTestDriver15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = hashMapTestDriver0.containsKey(obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test101");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        hashMapTestDriver0.clear();
        hashMapTestDriver0.clear();
        experiment.util.Set set8 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass9 = set8.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test102");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        experiment.util.Set set5 = hashMapTestDriver3.entrySet();
        java.lang.Object obj8 = hashMapTestDriver3.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection9 = hashMapTestDriver3.values();
        java.lang.Object obj11 = hashMapTestDriver3.get((java.lang.Object) (short) -1);
        experiment.util.Set set12 = hashMapTestDriver3.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        experiment.util.Set set17 = hashMapTestDriver15.entrySet();
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean21 = hashMapTestDriver15.isEmpty();
        experiment.util.Set set22 = hashMapTestDriver15.entrySet();
        java.lang.Object obj24 = hashMapTestDriver13.put((java.lang.Object) set22, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj26 = hashMapTestDriver13.get((java.lang.Object) hashMapTestDriver25);
        hashMapTestDriver25.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        experiment.util.Set set30 = hashMapTestDriver28.entrySet();
        java.lang.Object obj33 = hashMapTestDriver28.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean34 = hashMapTestDriver28.isEmpty();
        experiment.util.Set set35 = hashMapTestDriver28.entrySet();
        java.lang.Object obj37 = hashMapTestDriver28.remove((java.lang.Object) 10.0d);
        experiment.util.Set set38 = hashMapTestDriver28.keySet();
        boolean boolean39 = hashMapTestDriver25.containsKey((java.lang.Object) hashMapTestDriver28);
        java.lang.Object obj40 = hashMapTestDriver3.get((java.lang.Object) hashMapTestDriver25);
        boolean boolean41 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver25);
        experiment.util.Collection collection42 = hashMapTestDriver0.values();
        experiment.util.Set set43 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass44 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test103");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        java.lang.Object obj13 = hashMapTestDriver8.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean14 = hashMapTestDriver8.isEmpty();
        experiment.util.Set set15 = hashMapTestDriver8.entrySet();
        java.lang.Object obj17 = hashMapTestDriver6.put((java.lang.Object) set15, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        boolean boolean19 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver18);
        int int20 = hashMapTestDriver18.size();
        hashMapTestDriver18.clear();
        java.lang.Object obj22 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver18);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection24 = hashMapTestDriver23.values();
        experiment.util.Set set25 = hashMapTestDriver23.entrySet();
        int int26 = hashMapTestDriver23.size();
        int int27 = hashMapTestDriver23.size();
        int int28 = hashMapTestDriver23.size();
        java.lang.Object obj30 = hashMapTestDriver23.get((java.lang.Object) (-1));
        boolean boolean32 = hashMapTestDriver23.containsKey((java.lang.Object) ' ');
        boolean boolean33 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver23);
        hashMapTestDriver23.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test104");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj6 = hashMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver7.clear();
        java.lang.Object obj9 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        int int10 = hashMapTestDriver0.size();
        experiment.util.Collection collection11 = hashMapTestDriver0.values();
        int int12 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        experiment.util.Set set15 = hashMapTestDriver13.entrySet();
        int int16 = hashMapTestDriver13.size();
        int int17 = hashMapTestDriver13.size();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection19 = hashMapTestDriver18.values();
        experiment.util.Set set20 = hashMapTestDriver18.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) (short) 0);
        experiment.util.Collection collection23 = hashMapTestDriver18.values();
        java.lang.Object obj24 = hashMapTestDriver13.get((java.lang.Object) collection23);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        int int28 = hashMapTestDriver25.size();
        int int29 = hashMapTestDriver25.size();
        experiment.util.Set set30 = hashMapTestDriver25.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection32 = hashMapTestDriver31.values();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        java.lang.Object obj36 = hashMapTestDriver31.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection37 = hashMapTestDriver31.values();
        java.lang.Object obj39 = hashMapTestDriver31.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection40 = hashMapTestDriver31.values();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection42 = hashMapTestDriver41.values();
        experiment.util.Set set43 = hashMapTestDriver41.entrySet();
        java.lang.Object obj46 = hashMapTestDriver41.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean47 = hashMapTestDriver41.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection49 = hashMapTestDriver48.values();
        experiment.util.Set set50 = hashMapTestDriver48.entrySet();
        int int51 = hashMapTestDriver48.size();
        int int52 = hashMapTestDriver48.size();
        int int53 = hashMapTestDriver48.size();
        java.lang.Object obj55 = hashMapTestDriver48.get((java.lang.Object) (-1));
        int int56 = hashMapTestDriver48.size();
        java.lang.Class<?> wildcardClass57 = hashMapTestDriver48.getClass();
        java.lang.Object obj58 = hashMapTestDriver41.get((java.lang.Object) hashMapTestDriver48);
        java.lang.Object obj59 = hashMapTestDriver25.put((java.lang.Object) hashMapTestDriver31, (java.lang.Object) hashMapTestDriver48);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = hashMapTestDriver0.put(obj24, (java.lang.Object) hashMapTestDriver25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test105");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        int int14 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.Set set16 = hashMapTestDriver0.entrySet();
        boolean boolean17 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test106");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj6 = hashMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver7.clear();
        java.lang.Object obj9 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set10 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        experiment.util.Set set13 = hashMapTestDriver11.entrySet();
        java.lang.Object obj16 = hashMapTestDriver11.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean17 = hashMapTestDriver11.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection19 = hashMapTestDriver18.values();
        experiment.util.Set set20 = hashMapTestDriver18.entrySet();
        java.lang.Object obj23 = hashMapTestDriver18.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean24 = hashMapTestDriver18.isEmpty();
        experiment.util.Set set25 = hashMapTestDriver18.entrySet();
        java.lang.Object obj26 = hashMapTestDriver11.remove((java.lang.Object) hashMapTestDriver18);
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection28 = hashMapTestDriver27.values();
        experiment.util.Set set29 = hashMapTestDriver27.entrySet();
        java.lang.Object obj32 = hashMapTestDriver27.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection33 = hashMapTestDriver27.values();
        java.lang.Object obj35 = hashMapTestDriver27.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection36 = hashMapTestDriver27.values();
        java.lang.Object obj37 = hashMapTestDriver18.remove((java.lang.Object) hashMapTestDriver27);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection39 = hashMapTestDriver38.values();
        experiment.util.Set set40 = hashMapTestDriver38.entrySet();
        java.lang.Object obj43 = hashMapTestDriver38.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean44 = hashMapTestDriver38.isEmpty();
        java.lang.Class<?> wildcardClass45 = hashMapTestDriver38.getClass();
        java.lang.Object obj46 = hashMapTestDriver18.remove((java.lang.Object) wildcardClass45);
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection48 = hashMapTestDriver47.values();
        experiment.util.Set set49 = hashMapTestDriver47.entrySet();
        java.lang.Object obj52 = hashMapTestDriver47.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean53 = hashMapTestDriver47.isEmpty();
        experiment.util.Set set54 = hashMapTestDriver47.entrySet();
        java.lang.Class<?> wildcardClass55 = set54.getClass();
        boolean boolean56 = hashMapTestDriver18.containsKey((java.lang.Object) set54);
        java.lang.Object obj57 = hashMapTestDriver0.remove((java.lang.Object) set54);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test107");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver12);
        experiment.util.Collection collection14 = hashMapTestDriver0.values();
        boolean boolean15 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) (short) 0);
        experiment.util.Collection collection21 = hashMapTestDriver16.values();
        java.lang.Object obj22 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver16);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test108");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        experiment.util.Set set6 = hashMapTestDriver4.entrySet();
        java.lang.Object obj9 = hashMapTestDriver4.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean10 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        experiment.util.Set set13 = hashMapTestDriver11.entrySet();
        java.lang.Object obj16 = hashMapTestDriver11.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean17 = hashMapTestDriver11.isEmpty();
        experiment.util.Set set18 = hashMapTestDriver11.entrySet();
        java.lang.Object obj19 = hashMapTestDriver4.remove((java.lang.Object) hashMapTestDriver11);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection21 = hashMapTestDriver20.values();
        experiment.util.Set set22 = hashMapTestDriver20.entrySet();
        java.lang.Object obj25 = hashMapTestDriver20.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection26 = hashMapTestDriver20.values();
        java.lang.Object obj28 = hashMapTestDriver20.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection29 = hashMapTestDriver20.values();
        java.lang.Object obj30 = hashMapTestDriver11.remove((java.lang.Object) hashMapTestDriver20);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection32 = hashMapTestDriver31.values();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        java.lang.Object obj36 = hashMapTestDriver31.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean37 = hashMapTestDriver31.isEmpty();
        java.lang.Class<?> wildcardClass38 = hashMapTestDriver31.getClass();
        java.lang.Object obj39 = hashMapTestDriver11.remove((java.lang.Object) wildcardClass38);
        boolean boolean40 = hashMapTestDriver0.containsKey((java.lang.Object) wildcardClass38);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection42 = hashMapTestDriver41.values();
        experiment.util.Set set43 = hashMapTestDriver41.entrySet();
        int int44 = hashMapTestDriver41.size();
        experiment.util.Collection collection45 = hashMapTestDriver41.values();
        boolean boolean46 = hashMapTestDriver41.isEmpty();
        boolean boolean47 = hashMapTestDriver41.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection49 = hashMapTestDriver48.values();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection51 = hashMapTestDriver50.values();
        experiment.util.Set set52 = hashMapTestDriver50.entrySet();
        java.lang.Object obj55 = hashMapTestDriver50.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean56 = hashMapTestDriver50.isEmpty();
        experiment.util.Set set57 = hashMapTestDriver50.entrySet();
        java.lang.Object obj59 = hashMapTestDriver48.put((java.lang.Object) set57, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj61 = hashMapTestDriver48.get((java.lang.Object) hashMapTestDriver60);
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj64 = hashMapTestDriver48.put((java.lang.Object) hashMapTestDriver62, (java.lang.Object) "hi!");
        java.lang.Object obj65 = hashMapTestDriver41.get((java.lang.Object) "hi!");
        experiment.util.Set set66 = hashMapTestDriver41.keySet();
        boolean boolean67 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver41);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test109");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        int int14 = hashMapTestDriver0.size();
        int int15 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean22 = hashMapTestDriver16.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection24 = hashMapTestDriver23.values();
        experiment.util.Set set25 = hashMapTestDriver23.entrySet();
        java.lang.Object obj28 = hashMapTestDriver23.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean29 = hashMapTestDriver23.isEmpty();
        experiment.util.Set set30 = hashMapTestDriver23.entrySet();
        java.lang.Object obj31 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver23);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection33 = hashMapTestDriver32.values();
        experiment.util.Set set34 = hashMapTestDriver32.entrySet();
        java.lang.Object obj37 = hashMapTestDriver32.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection38 = hashMapTestDriver32.values();
        java.lang.Object obj40 = hashMapTestDriver32.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection41 = hashMapTestDriver32.values();
        java.lang.Object obj42 = hashMapTestDriver23.remove((java.lang.Object) hashMapTestDriver32);
        java.lang.Object obj44 = hashMapTestDriver32.get((java.lang.Object) 100.0f);
        boolean boolean46 = hashMapTestDriver32.containsKey((java.lang.Object) (short) 1);
        experiment.util.Set set47 = hashMapTestDriver32.entrySet();
        experiment.util.Set set48 = hashMapTestDriver32.keySet();
        experiment.util.Collection collection49 = hashMapTestDriver32.values();
        boolean boolean50 = hashMapTestDriver0.containsKey((java.lang.Object) collection49);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test110");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        experiment.util.Set set5 = hashMapTestDriver3.entrySet();
        java.lang.Object obj8 = hashMapTestDriver3.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection9 = hashMapTestDriver3.values();
        java.lang.Object obj11 = hashMapTestDriver3.get((java.lang.Object) (short) -1);
        experiment.util.Set set12 = hashMapTestDriver3.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        experiment.util.Set set17 = hashMapTestDriver15.entrySet();
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean21 = hashMapTestDriver15.isEmpty();
        experiment.util.Set set22 = hashMapTestDriver15.entrySet();
        java.lang.Object obj24 = hashMapTestDriver13.put((java.lang.Object) set22, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj26 = hashMapTestDriver13.get((java.lang.Object) hashMapTestDriver25);
        hashMapTestDriver25.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        experiment.util.Set set30 = hashMapTestDriver28.entrySet();
        java.lang.Object obj33 = hashMapTestDriver28.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean34 = hashMapTestDriver28.isEmpty();
        experiment.util.Set set35 = hashMapTestDriver28.entrySet();
        java.lang.Object obj37 = hashMapTestDriver28.remove((java.lang.Object) 10.0d);
        experiment.util.Set set38 = hashMapTestDriver28.keySet();
        boolean boolean39 = hashMapTestDriver25.containsKey((java.lang.Object) hashMapTestDriver28);
        java.lang.Object obj40 = hashMapTestDriver3.get((java.lang.Object) hashMapTestDriver25);
        boolean boolean41 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver25);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj45 = hashMapTestDriver42.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj48 = hashMapTestDriver42.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver49.clear();
        java.lang.Object obj51 = hashMapTestDriver42.remove((java.lang.Object) hashMapTestDriver49);
        experiment.util.Set set52 = hashMapTestDriver42.keySet();
        experiment.util.Set set53 = hashMapTestDriver42.entrySet();
        boolean boolean54 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver42);
        java.lang.Class<?> wildcardClass55 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test111");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj6 = hashMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        java.lang.Class<?> wildcardClass10 = hashMapTestDriver8.getClass();
        java.lang.Object obj11 = hashMapTestDriver0.get((java.lang.Object) wildcardClass10);
        experiment.util.Set set12 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test112");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        int int3 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test113");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        int int5 = hashMapTestDriver0.size();
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        int int7 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        int int11 = hashMapTestDriver8.size();
        int int12 = hashMapTestDriver8.size();
        int int13 = hashMapTestDriver8.size();
        java.lang.Object obj15 = hashMapTestDriver8.get((java.lang.Object) (-1));
        java.lang.Object obj16 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = hashMapTestDriver8.remove(obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test114");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        experiment.util.Set set7 = hashMapTestDriver5.entrySet();
        boolean boolean9 = hashMapTestDriver5.containsKey((java.lang.Object) (short) 0);
        experiment.util.Collection collection10 = hashMapTestDriver5.values();
        java.lang.Object obj11 = hashMapTestDriver0.get((java.lang.Object) collection10);
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test115");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        int int5 = hashMapTestDriver0.size();
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        int int7 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        int int11 = hashMapTestDriver8.size();
        int int12 = hashMapTestDriver8.size();
        int int13 = hashMapTestDriver8.size();
        java.lang.Object obj15 = hashMapTestDriver8.get((java.lang.Object) (-1));
        java.lang.Object obj16 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection18 = hashMapTestDriver17.values();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        java.lang.Object obj24 = hashMapTestDriver19.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean25 = hashMapTestDriver19.isEmpty();
        experiment.util.Set set26 = hashMapTestDriver19.entrySet();
        java.lang.Object obj28 = hashMapTestDriver17.put((java.lang.Object) set26, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        boolean boolean30 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver29);
        experiment.util.Set set31 = hashMapTestDriver17.entrySet();
        boolean boolean32 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver17);
        boolean boolean34 = hashMapTestDriver17.containsKey((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test116");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (short) -1);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection13 = hashMapTestDriver10.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        java.lang.Object obj19 = hashMapTestDriver14.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection20 = hashMapTestDriver14.values();
        java.lang.Object obj22 = hashMapTestDriver14.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection27 = hashMapTestDriver26.values();
        experiment.util.Set set28 = hashMapTestDriver26.entrySet();
        java.lang.Object obj31 = hashMapTestDriver26.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean32 = hashMapTestDriver26.isEmpty();
        experiment.util.Set set33 = hashMapTestDriver26.entrySet();
        java.lang.Object obj35 = hashMapTestDriver24.put((java.lang.Object) set33, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        boolean boolean37 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver36);
        java.lang.Object obj38 = hashMapTestDriver14.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMapTestDriver24);
        hashMapTestDriver14.clear();
        java.lang.Object obj40 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver10, (java.lang.Object) hashMapTestDriver14);
        boolean boolean41 = hashMapTestDriver14.isEmpty();
        java.lang.Object obj43 = hashMapTestDriver14.get((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test117");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = hashMapTestDriver0.get(obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test118");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        java.lang.Object obj12 = hashMapTestDriver7.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean13 = hashMapTestDriver7.isEmpty();
        experiment.util.Set set14 = hashMapTestDriver7.entrySet();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        java.lang.Object obj24 = hashMapTestDriver16.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        java.lang.Object obj26 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver16);
        java.lang.Object obj28 = hashMapTestDriver16.get((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver29.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj35 = hashMapTestDriver29.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver36.clear();
        java.lang.Object obj38 = hashMapTestDriver29.remove((java.lang.Object) hashMapTestDriver36);
        experiment.util.Set set39 = hashMapTestDriver29.keySet();
        java.lang.Object obj40 = hashMapTestDriver16.remove((java.lang.Object) set39);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection42 = hashMapTestDriver41.values();
        experiment.util.Set set43 = hashMapTestDriver41.entrySet();
        java.lang.Object obj46 = hashMapTestDriver41.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection47 = hashMapTestDriver41.values();
        java.lang.Object obj49 = hashMapTestDriver41.get((java.lang.Object) (byte) 0);
        experiment.util.Collection collection50 = hashMapTestDriver41.values();
        experiment.util.Set set51 = hashMapTestDriver41.entrySet();
        boolean boolean52 = hashMapTestDriver16.containsKey((java.lang.Object) set51);
        experiment.util.Set set53 = hashMapTestDriver16.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(set53);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test119");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass4 = collection3.getClass();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test120");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test121");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        hashMapTestDriver0.clear();
        experiment.util.Set set7 = hashMapTestDriver0.keySet();
        experiment.util.Set set8 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test122");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        int int3 = hashMapTestDriver0.size();
        int int4 = hashMapTestDriver0.size();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        java.lang.Object obj13 = hashMapTestDriver8.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean14 = hashMapTestDriver8.isEmpty();
        experiment.util.Set set15 = hashMapTestDriver8.entrySet();
        java.lang.Object obj17 = hashMapTestDriver6.put((java.lang.Object) set15, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        boolean boolean19 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver18);
        int int20 = hashMapTestDriver18.size();
        hashMapTestDriver18.clear();
        java.lang.Object obj22 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver18);
        experiment.util.Set set23 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test123");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj3 = hashMapTestDriver0.put((java.lang.Object) 'a', (java.lang.Object) ' ');
        java.lang.Object obj6 = hashMapTestDriver0.put((java.lang.Object) 1.0d, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver7.clear();
        java.lang.Object obj9 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        experiment.util.Set set13 = hashMapTestDriver11.entrySet();
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) 10.0f, (java.lang.Object) hashMapTestDriver11);
        int int15 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        experiment.util.Set set23 = hashMapTestDriver16.keySet();
        boolean boolean24 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver16);
        experiment.util.Set set25 = hashMapTestDriver16.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection28 = hashMapTestDriver27.values();
        experiment.util.Set set29 = hashMapTestDriver27.entrySet();
        int int30 = hashMapTestDriver27.size();
        int int31 = hashMapTestDriver27.size();
        int int32 = hashMapTestDriver27.size();
        experiment.util.Set set33 = hashMapTestDriver27.keySet();
        int int34 = hashMapTestDriver27.size();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection36 = hashMapTestDriver35.values();
        experiment.util.Set set37 = hashMapTestDriver35.entrySet();
        int int38 = hashMapTestDriver35.size();
        int int39 = hashMapTestDriver35.size();
        int int40 = hashMapTestDriver35.size();
        java.lang.Object obj42 = hashMapTestDriver35.get((java.lang.Object) (-1));
        java.lang.Object obj43 = hashMapTestDriver27.get((java.lang.Object) hashMapTestDriver35);
        experiment.util.Set set44 = hashMapTestDriver35.entrySet();
        java.lang.Object obj45 = hashMapTestDriver16.get((java.lang.Object) hashMapTestDriver35);
        boolean boolean47 = hashMapTestDriver35.containsKey((java.lang.Object) 100);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test124");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        java.lang.Object obj12 = hashMapTestDriver7.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean13 = hashMapTestDriver7.isEmpty();
        experiment.util.Set set14 = hashMapTestDriver7.entrySet();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        java.lang.Object obj24 = hashMapTestDriver16.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        java.lang.Object obj26 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver16);
        int int27 = hashMapTestDriver16.size();
        hashMapTestDriver16.clear();
        hashMapTestDriver16.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test125");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        java.lang.Object obj14 = hashMapTestDriver9.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean15 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean22 = hashMapTestDriver16.isEmpty();
        experiment.util.Set set23 = hashMapTestDriver16.entrySet();
        java.lang.Object obj24 = hashMapTestDriver9.remove((java.lang.Object) hashMapTestDriver16);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        java.lang.Object obj30 = hashMapTestDriver25.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection31 = hashMapTestDriver25.values();
        java.lang.Object obj33 = hashMapTestDriver25.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection34 = hashMapTestDriver25.values();
        java.lang.Object obj35 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver25);
        java.lang.Object obj36 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver25);
        experiment.util.Set set37 = hashMapTestDriver25.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test126");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.Set set8 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        int int13 = hashMapTestDriver10.size();
        experiment.util.Collection collection14 = hashMapTestDriver10.values();
        boolean boolean15 = hashMapTestDriver10.isEmpty();
        java.lang.Object obj16 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver10);
        hashMapTestDriver10.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test127");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection3 = hashMapTestDriver2.values();
        experiment.util.Set set4 = hashMapTestDriver2.entrySet();
        java.lang.Object obj7 = hashMapTestDriver2.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean8 = hashMapTestDriver2.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver2.entrySet();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) set9, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        int int14 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        java.lang.Object obj24 = hashMapTestDriver16.get((java.lang.Object) (byte) 0);
        java.lang.Object obj25 = hashMapTestDriver0.get((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1256357748_1024_0.test128");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        java.lang.Object obj12 = hashMapTestDriver7.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean13 = hashMapTestDriver7.isEmpty();
        experiment.util.Set set14 = hashMapTestDriver7.entrySet();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        java.lang.Object obj21 = hashMapTestDriver16.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        java.lang.Object obj24 = hashMapTestDriver16.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        java.lang.Object obj26 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver16);
        java.lang.Object obj28 = hashMapTestDriver16.get((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection30 = hashMapTestDriver29.values();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        java.lang.Object obj34 = hashMapTestDriver29.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection35 = hashMapTestDriver29.values();
        java.lang.Object obj37 = hashMapTestDriver29.get((java.lang.Object) (short) -1);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection40 = hashMapTestDriver39.values();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection42 = hashMapTestDriver41.values();
        experiment.util.Set set43 = hashMapTestDriver41.entrySet();
        java.lang.Object obj46 = hashMapTestDriver41.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean47 = hashMapTestDriver41.isEmpty();
        experiment.util.Set set48 = hashMapTestDriver41.entrySet();
        java.lang.Object obj50 = hashMapTestDriver39.put((java.lang.Object) set48, (java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        boolean boolean52 = hashMapTestDriver39.containsKey((java.lang.Object) hashMapTestDriver51);
        java.lang.Object obj53 = hashMapTestDriver29.put((java.lang.Object) (byte) 100, (java.lang.Object) hashMapTestDriver39);
        hashMapTestDriver29.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection56 = hashMapTestDriver55.values();
        experiment.util.Set set57 = hashMapTestDriver55.entrySet();
        java.lang.Object obj60 = hashMapTestDriver55.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean61 = hashMapTestDriver55.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection63 = hashMapTestDriver62.values();
        experiment.util.Set set64 = hashMapTestDriver62.entrySet();
        java.lang.Object obj67 = hashMapTestDriver62.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean68 = hashMapTestDriver62.isEmpty();
        experiment.util.Set set69 = hashMapTestDriver62.entrySet();
        java.lang.Object obj70 = hashMapTestDriver55.remove((java.lang.Object) hashMapTestDriver62);
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection72 = hashMapTestDriver71.values();
        experiment.util.Set set73 = hashMapTestDriver71.entrySet();
        java.lang.Object obj76 = hashMapTestDriver71.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        experiment.util.Collection collection77 = hashMapTestDriver71.values();
        java.lang.Object obj79 = hashMapTestDriver71.get((java.lang.Object) (short) -1);
        experiment.util.Collection collection80 = hashMapTestDriver71.values();
        java.lang.Object obj81 = hashMapTestDriver62.remove((java.lang.Object) hashMapTestDriver71);
        experiment.util.HashMapTestDriver hashMapTestDriver82 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection83 = hashMapTestDriver82.values();
        experiment.util.Set set84 = hashMapTestDriver82.entrySet();
        java.lang.Object obj87 = hashMapTestDriver82.put((java.lang.Object) 0L, (java.lang.Object) 10.0f);
        boolean boolean88 = hashMapTestDriver82.isEmpty();
        java.lang.Class<?> wildcardClass89 = hashMapTestDriver82.getClass();
        java.lang.Object obj90 = hashMapTestDriver62.remove((java.lang.Object) wildcardClass89);
        boolean boolean91 = hashMapTestDriver62.isEmpty();
        java.lang.Object obj92 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver29, (java.lang.Object) hashMapTestDriver62);
        experiment.util.Collection collection93 = hashMapTestDriver62.values();
        java.lang.Class<?> wildcardClass94 = hashMapTestDriver62.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(collection93);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

}
