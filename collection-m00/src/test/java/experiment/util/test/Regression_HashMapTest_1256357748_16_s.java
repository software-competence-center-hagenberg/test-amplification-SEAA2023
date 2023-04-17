package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashMapTest_1256357748_16_s {

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

}
