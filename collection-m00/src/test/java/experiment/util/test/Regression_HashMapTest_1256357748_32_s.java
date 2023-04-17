package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashMapTest_1256357748_32_s {

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

}
