package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashMapTest_1191369007_16_s {

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
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test002");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test003");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = hashMapTestDriver0.put(obj2, (java.lang.Object) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test004");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver4.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set8 = hashMapTestDriver4.entrySet();
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        hashMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass11 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test005");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = hashMapTestDriver0.remove(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test007");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set7 = hashMapTestDriver6.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        java.lang.Object obj10 = hashMapTestDriver6.remove((java.lang.Object) set9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = hashMapTestDriver0.containsKey(obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test008");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        boolean boolean6 = hashMapTestDriver0.containsKey((java.lang.Object) (-1.0f));
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        boolean boolean8 = hashMapTestDriver7.isEmpty();
        java.lang.Object obj10 = hashMapTestDriver7.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set11 = hashMapTestDriver7.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        boolean boolean14 = hashMapTestDriver13.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver7.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean14);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        boolean boolean17 = hashMapTestDriver16.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver16.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set20 = hashMapTestDriver16.entrySet();
        experiment.util.Collection collection21 = hashMapTestDriver16.values();
        java.lang.Object obj22 = hashMapTestDriver7.get((java.lang.Object) hashMapTestDriver16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = hashMapTestDriver0.get(obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test009");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set3 = hashMapTestDriver2.entrySet();
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) set3);
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass6 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test010");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set7 = hashMapTestDriver6.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        java.lang.Object obj10 = hashMapTestDriver6.remove((java.lang.Object) set9);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        boolean boolean12 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj14 = hashMapTestDriver11.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set15 = hashMapTestDriver11.entrySet();
        experiment.util.Set set16 = hashMapTestDriver11.entrySet();
        java.lang.Object obj17 = hashMapTestDriver6.get((java.lang.Object) set16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = hashMapTestDriver0.remove(obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test011");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set3 = hashMapTestDriver2.entrySet();
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) set3);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) false);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        java.lang.Object obj11 = hashMapTestDriver7.remove((java.lang.Object) set10);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        boolean boolean13 = hashMapTestDriver12.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver12.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set16 = hashMapTestDriver12.entrySet();
        experiment.util.Set set17 = hashMapTestDriver12.entrySet();
        java.lang.Object obj18 = hashMapTestDriver7.get((java.lang.Object) set17);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set22 = hashMapTestDriver21.entrySet();
        java.lang.Object obj23 = hashMapTestDriver19.remove((java.lang.Object) set22);
        java.lang.Object obj25 = hashMapTestDriver19.get((java.lang.Object) false);
        int int26 = hashMapTestDriver19.size();
        boolean boolean28 = hashMapTestDriver19.containsKey((java.lang.Object) (short) 1);
        java.lang.Object obj29 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver7, (java.lang.Object) boolean28);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        boolean boolean31 = hashMapTestDriver30.isEmpty();
        java.lang.Object obj33 = hashMapTestDriver30.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set34 = hashMapTestDriver30.entrySet();
        experiment.util.Collection collection35 = hashMapTestDriver30.values();
        java.lang.Object obj36 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver30);
        experiment.util.Collection collection37 = hashMapTestDriver7.values();
        java.lang.Class<?> wildcardClass38 = hashMapTestDriver7.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test012");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) 1L);
        java.lang.Class<?> wildcardClass8 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test013");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        boolean boolean6 = hashMapTestDriver0.containsKey((java.lang.Object) 1);
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test014");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.entrySet();
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) set8);
        experiment.util.Set set10 = hashMapTestDriver0.keySet();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass12 = set11.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test015");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set3 = hashMapTestDriver2.entrySet();
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) set3);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) false);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        boolean boolean8 = hashMapTestDriver7.isEmpty();
        java.lang.Object obj10 = hashMapTestDriver7.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set11 = hashMapTestDriver7.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        boolean boolean14 = hashMapTestDriver13.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver7.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean14);
        java.lang.Class<?> wildcardClass16 = hashMapTestDriver7.getClass();
        java.lang.Object obj17 = hashMapTestDriver0.get((java.lang.Object) wildcardClass16);
        hashMapTestDriver0.clear();
        experiment.util.Set set19 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set19);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test016");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set3 = hashMapTestDriver2.entrySet();
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) set3);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) false);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        java.lang.Object obj11 = hashMapTestDriver7.remove((java.lang.Object) set10);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        boolean boolean13 = hashMapTestDriver12.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver12.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set16 = hashMapTestDriver12.entrySet();
        experiment.util.Set set17 = hashMapTestDriver12.entrySet();
        java.lang.Object obj18 = hashMapTestDriver7.get((java.lang.Object) set17);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set22 = hashMapTestDriver21.entrySet();
        java.lang.Object obj23 = hashMapTestDriver19.remove((java.lang.Object) set22);
        java.lang.Object obj25 = hashMapTestDriver19.get((java.lang.Object) false);
        int int26 = hashMapTestDriver19.size();
        boolean boolean28 = hashMapTestDriver19.containsKey((java.lang.Object) (short) 1);
        java.lang.Object obj29 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver7, (java.lang.Object) boolean28);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set31 = hashMapTestDriver30.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set33 = hashMapTestDriver32.entrySet();
        java.lang.Object obj34 = hashMapTestDriver30.remove((java.lang.Object) set33);
        java.lang.Object obj36 = hashMapTestDriver30.get((java.lang.Object) false);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set38 = hashMapTestDriver37.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set40 = hashMapTestDriver39.entrySet();
        java.lang.Object obj41 = hashMapTestDriver37.remove((java.lang.Object) set40);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        boolean boolean43 = hashMapTestDriver42.isEmpty();
        java.lang.Object obj45 = hashMapTestDriver42.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set46 = hashMapTestDriver42.entrySet();
        experiment.util.Set set47 = hashMapTestDriver42.entrySet();
        java.lang.Object obj48 = hashMapTestDriver37.get((java.lang.Object) set47);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set50 = hashMapTestDriver49.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set52 = hashMapTestDriver51.entrySet();
        java.lang.Object obj53 = hashMapTestDriver49.remove((java.lang.Object) set52);
        java.lang.Object obj55 = hashMapTestDriver49.get((java.lang.Object) false);
        int int56 = hashMapTestDriver49.size();
        boolean boolean58 = hashMapTestDriver49.containsKey((java.lang.Object) (short) 1);
        java.lang.Object obj59 = hashMapTestDriver30.put((java.lang.Object) hashMapTestDriver37, (java.lang.Object) boolean58);
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        boolean boolean61 = hashMapTestDriver60.isEmpty();
        java.lang.Object obj63 = hashMapTestDriver60.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        boolean boolean65 = hashMapTestDriver64.isEmpty();
        java.lang.Object obj67 = hashMapTestDriver64.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set68 = hashMapTestDriver64.entrySet();
        boolean boolean69 = hashMapTestDriver60.containsKey((java.lang.Object) hashMapTestDriver64);
        hashMapTestDriver60.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        boolean boolean72 = hashMapTestDriver71.isEmpty();
        experiment.util.Set set73 = hashMapTestDriver71.keySet();
        java.lang.Object obj74 = hashMapTestDriver60.remove((java.lang.Object) set73);
        boolean boolean75 = hashMapTestDriver30.containsKey((java.lang.Object) set73);
        java.lang.Object obj76 = hashMapTestDriver7.get((java.lang.Object) hashMapTestDriver30);
        boolean boolean77 = hashMapTestDriver7.isEmpty();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

}
