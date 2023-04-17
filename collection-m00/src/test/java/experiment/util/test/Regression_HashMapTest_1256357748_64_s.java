package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashMapTest_1256357748_64_s {

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

}
