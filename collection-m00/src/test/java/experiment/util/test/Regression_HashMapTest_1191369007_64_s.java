package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashMapTest_1191369007_64_s {

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

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test017");
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
        experiment.util.Set set11 = hashMapTestDriver6.entrySet();
        boolean boolean12 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver6);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.entrySet();
        java.lang.Object obj17 = hashMapTestDriver13.remove((java.lang.Object) set16);
        java.lang.Object obj19 = hashMapTestDriver13.get((java.lang.Object) false);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set21 = hashMapTestDriver20.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        java.lang.Object obj24 = hashMapTestDriver20.remove((java.lang.Object) set23);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        boolean boolean26 = hashMapTestDriver25.isEmpty();
        java.lang.Object obj28 = hashMapTestDriver25.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set29 = hashMapTestDriver25.entrySet();
        experiment.util.Set set30 = hashMapTestDriver25.entrySet();
        java.lang.Object obj31 = hashMapTestDriver20.get((java.lang.Object) set30);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set33 = hashMapTestDriver32.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set35 = hashMapTestDriver34.entrySet();
        java.lang.Object obj36 = hashMapTestDriver32.remove((java.lang.Object) set35);
        java.lang.Object obj38 = hashMapTestDriver32.get((java.lang.Object) false);
        int int39 = hashMapTestDriver32.size();
        boolean boolean41 = hashMapTestDriver32.containsKey((java.lang.Object) (short) 1);
        java.lang.Object obj42 = hashMapTestDriver13.put((java.lang.Object) hashMapTestDriver20, (java.lang.Object) boolean41);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        boolean boolean44 = hashMapTestDriver43.isEmpty();
        java.lang.Object obj46 = hashMapTestDriver43.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set47 = hashMapTestDriver43.entrySet();
        experiment.util.Collection collection48 = hashMapTestDriver43.values();
        java.lang.Object obj49 = hashMapTestDriver20.remove((java.lang.Object) hashMapTestDriver43);
        java.lang.Object obj50 = hashMapTestDriver6.get((java.lang.Object) hashMapTestDriver43);
        experiment.util.Set set51 = hashMapTestDriver43.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        boolean boolean53 = hashMapTestDriver52.isEmpty();
        java.lang.Object obj55 = hashMapTestDriver52.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        boolean boolean57 = hashMapTestDriver56.isEmpty();
        java.lang.Object obj59 = hashMapTestDriver56.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set60 = hashMapTestDriver56.entrySet();
        boolean boolean61 = hashMapTestDriver52.containsKey((java.lang.Object) hashMapTestDriver56);
        int int62 = hashMapTestDriver56.size();
        java.lang.Object obj63 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj64 = hashMapTestDriver43.put((java.lang.Object) int62, obj63);
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
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test018");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver6.isEmpty();
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean7);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        boolean boolean10 = hashMapTestDriver9.isEmpty();
        java.lang.Object obj12 = hashMapTestDriver9.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set13 = hashMapTestDriver9.entrySet();
        experiment.util.Collection collection14 = hashMapTestDriver9.values();
        java.lang.Object obj15 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver9);
        java.lang.Object obj17 = hashMapTestDriver0.remove((java.lang.Object) 100.0d);
        experiment.util.Set set18 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass19 = set18.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test019");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver6.isEmpty();
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean7);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        boolean boolean10 = hashMapTestDriver9.isEmpty();
        java.lang.Object obj12 = hashMapTestDriver9.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set13 = hashMapTestDriver9.entrySet();
        experiment.util.Collection collection14 = hashMapTestDriver9.values();
        java.lang.Object obj15 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver9);
        boolean boolean16 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver17.isEmpty();
        java.lang.Object obj20 = hashMapTestDriver17.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set21 = hashMapTestDriver17.entrySet();
        experiment.util.Set set22 = hashMapTestDriver17.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        java.lang.Object obj27 = hashMapTestDriver23.remove((java.lang.Object) set26);
        experiment.util.Set set28 = hashMapTestDriver23.entrySet();
        boolean boolean29 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver23);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        boolean boolean31 = hashMapTestDriver30.isEmpty();
        java.lang.Object obj33 = hashMapTestDriver30.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set34 = hashMapTestDriver30.entrySet();
        experiment.util.Set set35 = hashMapTestDriver30.entrySet();
        boolean boolean36 = hashMapTestDriver30.isEmpty();
        java.lang.Class<?> wildcardClass37 = hashMapTestDriver30.getClass();
        java.lang.Object obj38 = hashMapTestDriver0.put((java.lang.Object) boolean29, (java.lang.Object) hashMapTestDriver30);
        boolean boolean39 = hashMapTestDriver30.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test020");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = obj17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test021");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver4.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set8 = hashMapTestDriver4.entrySet();
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        boolean boolean10 = hashMapTestDriver4.isEmpty();
        experiment.util.Collection collection11 = hashMapTestDriver4.values();
        experiment.util.Set set12 = hashMapTestDriver4.entrySet();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test022");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        boolean boolean8 = hashMapTestDriver7.isEmpty();
        java.lang.Object obj10 = hashMapTestDriver7.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set11 = hashMapTestDriver7.entrySet();
        boolean boolean13 = hashMapTestDriver7.containsKey((java.lang.Object) (-1.0f));
        hashMapTestDriver7.clear();
        experiment.util.Set set15 = hashMapTestDriver7.keySet();
        java.lang.Object obj16 = hashMapTestDriver0.put((java.lang.Object) (short) 1, (java.lang.Object) hashMapTestDriver7);
        experiment.util.Collection collection17 = hashMapTestDriver7.values();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        boolean boolean19 = hashMapTestDriver18.isEmpty();
        java.lang.Object obj21 = hashMapTestDriver18.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set22 = hashMapTestDriver18.entrySet();
        boolean boolean23 = hashMapTestDriver18.isEmpty();
        java.lang.Object obj26 = hashMapTestDriver18.put((java.lang.Object) (short) 0, (java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = hashMapTestDriver7.remove(obj26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test023");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver4.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set8 = hashMapTestDriver4.entrySet();
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        hashMapTestDriver4.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test024");
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
        boolean boolean36 = hashMapTestDriver30.containsKey((java.lang.Object) (-1.0f));
        hashMapTestDriver30.clear();
        experiment.util.Set set38 = hashMapTestDriver30.keySet();
        boolean boolean39 = hashMapTestDriver7.containsKey((java.lang.Object) set38);
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test025");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) 1L);
        java.lang.Object obj9 = hashMapTestDriver0.remove((java.lang.Object) 100);
        hashMapTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test026");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver6.isEmpty();
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean7);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        boolean boolean10 = hashMapTestDriver9.isEmpty();
        java.lang.Object obj12 = hashMapTestDriver9.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set13 = hashMapTestDriver9.entrySet();
        experiment.util.Collection collection14 = hashMapTestDriver9.values();
        java.lang.Object obj15 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver9);
        boolean boolean16 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver17.isEmpty();
        java.lang.Object obj20 = hashMapTestDriver17.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set21 = hashMapTestDriver17.entrySet();
        experiment.util.Set set22 = hashMapTestDriver17.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        java.lang.Object obj27 = hashMapTestDriver23.remove((java.lang.Object) set26);
        experiment.util.Set set28 = hashMapTestDriver23.entrySet();
        boolean boolean29 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver23);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        boolean boolean31 = hashMapTestDriver30.isEmpty();
        java.lang.Object obj33 = hashMapTestDriver30.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set34 = hashMapTestDriver30.entrySet();
        experiment.util.Set set35 = hashMapTestDriver30.entrySet();
        boolean boolean36 = hashMapTestDriver30.isEmpty();
        java.lang.Class<?> wildcardClass37 = hashMapTestDriver30.getClass();
        java.lang.Object obj38 = hashMapTestDriver0.put((java.lang.Object) boolean29, (java.lang.Object) hashMapTestDriver30);
        java.lang.Class<?> wildcardClass39 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test027");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) (short) 0, (java.lang.Object) (-1));
        experiment.util.Set set9 = hashMapTestDriver0.entrySet();
        boolean boolean10 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test028");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver4.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set8 = hashMapTestDriver4.entrySet();
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        experiment.util.Set set10 = hashMapTestDriver4.keySet();
        java.lang.Class<?> wildcardClass11 = set10.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test029");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass2 = collection1.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test030");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver4.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set8 = hashMapTestDriver4.entrySet();
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        boolean boolean10 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        boolean boolean12 = hashMapTestDriver11.isEmpty();
        experiment.util.Set set13 = hashMapTestDriver11.keySet();
        java.lang.Object obj14 = hashMapTestDriver4.get((java.lang.Object) hashMapTestDriver11);
        experiment.util.Set set15 = hashMapTestDriver4.entrySet();
        java.lang.Class<?> wildcardClass16 = set15.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test031");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection7 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        java.lang.Object obj12 = hashMapTestDriver8.remove((java.lang.Object) set11);
        java.lang.Object obj14 = hashMapTestDriver8.get((java.lang.Object) false);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        java.lang.Object obj19 = hashMapTestDriver15.remove((java.lang.Object) set18);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        boolean boolean21 = hashMapTestDriver20.isEmpty();
        java.lang.Object obj23 = hashMapTestDriver20.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set24 = hashMapTestDriver20.entrySet();
        experiment.util.Set set25 = hashMapTestDriver20.entrySet();
        java.lang.Object obj26 = hashMapTestDriver15.get((java.lang.Object) set25);
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set28 = hashMapTestDriver27.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        java.lang.Object obj31 = hashMapTestDriver27.remove((java.lang.Object) set30);
        java.lang.Object obj33 = hashMapTestDriver27.get((java.lang.Object) false);
        int int34 = hashMapTestDriver27.size();
        boolean boolean36 = hashMapTestDriver27.containsKey((java.lang.Object) (short) 1);
        java.lang.Object obj37 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) boolean36);
        hashMapTestDriver15.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        boolean boolean40 = hashMapTestDriver39.isEmpty();
        java.lang.Object obj42 = hashMapTestDriver39.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set43 = hashMapTestDriver39.entrySet();
        experiment.util.Set set44 = hashMapTestDriver39.entrySet();
        boolean boolean45 = hashMapTestDriver39.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set47 = hashMapTestDriver46.entrySet();
        boolean boolean48 = hashMapTestDriver39.containsKey((java.lang.Object) set47);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection50 = hashMapTestDriver49.values();
        java.lang.Object obj51 = hashMapTestDriver15.put((java.lang.Object) set47, (java.lang.Object) hashMapTestDriver49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = hashMapTestDriver0.remove(obj51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test032");
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
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        boolean boolean35 = hashMapTestDriver34.isEmpty();
        java.lang.Object obj37 = hashMapTestDriver34.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set38 = hashMapTestDriver34.entrySet();
        boolean boolean39 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver34);
        hashMapTestDriver30.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        boolean boolean42 = hashMapTestDriver41.isEmpty();
        experiment.util.Set set43 = hashMapTestDriver41.keySet();
        java.lang.Object obj44 = hashMapTestDriver30.remove((java.lang.Object) set43);
        boolean boolean45 = hashMapTestDriver0.containsKey((java.lang.Object) set43);
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        boolean boolean47 = hashMapTestDriver46.isEmpty();
        java.lang.Object obj49 = hashMapTestDriver46.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set50 = hashMapTestDriver46.entrySet();
        boolean boolean51 = hashMapTestDriver46.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        boolean boolean54 = hashMapTestDriver53.isEmpty();
        java.lang.Object obj56 = hashMapTestDriver53.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set57 = hashMapTestDriver53.entrySet();
        boolean boolean59 = hashMapTestDriver53.containsKey((java.lang.Object) (-1.0f));
        hashMapTestDriver53.clear();
        experiment.util.Set set61 = hashMapTestDriver53.keySet();
        java.lang.Object obj62 = hashMapTestDriver46.put((java.lang.Object) (short) 1, (java.lang.Object) hashMapTestDriver53);
        java.lang.Object obj63 = hashMapTestDriver0.get((java.lang.Object) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test033");
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
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        boolean boolean35 = hashMapTestDriver34.isEmpty();
        java.lang.Object obj37 = hashMapTestDriver34.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set38 = hashMapTestDriver34.entrySet();
        boolean boolean39 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver34);
        hashMapTestDriver30.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        boolean boolean42 = hashMapTestDriver41.isEmpty();
        experiment.util.Set set43 = hashMapTestDriver41.keySet();
        java.lang.Object obj44 = hashMapTestDriver30.remove((java.lang.Object) set43);
        boolean boolean45 = hashMapTestDriver0.containsKey((java.lang.Object) set43);
        hashMapTestDriver0.clear();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test034");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        int int2 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        java.lang.Object obj6 = hashMapTestDriver3.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        boolean boolean8 = hashMapTestDriver7.isEmpty();
        java.lang.Object obj10 = hashMapTestDriver7.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set11 = hashMapTestDriver7.entrySet();
        boolean boolean12 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver7);
        java.lang.Class<?> wildcardClass13 = hashMapTestDriver3.getClass();
        java.lang.Object obj14 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver3);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test035");
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
        experiment.util.Collection collection77 = hashMapTestDriver30.values();
        experiment.util.Set set78 = hashMapTestDriver30.entrySet();
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
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNotNull(set78);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test036");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver6.isEmpty();
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean7);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        boolean boolean10 = hashMapTestDriver9.isEmpty();
        java.lang.Object obj12 = hashMapTestDriver9.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set13 = hashMapTestDriver9.entrySet();
        experiment.util.Collection collection14 = hashMapTestDriver9.values();
        java.lang.Object obj15 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver9);
        java.lang.Class<?> wildcardClass16 = hashMapTestDriver9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test037");
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
        experiment.util.Set set11 = hashMapTestDriver6.entrySet();
        boolean boolean12 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver6);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.entrySet();
        java.lang.Object obj17 = hashMapTestDriver13.remove((java.lang.Object) set16);
        java.lang.Object obj19 = hashMapTestDriver13.get((java.lang.Object) false);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set21 = hashMapTestDriver20.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        java.lang.Object obj24 = hashMapTestDriver20.remove((java.lang.Object) set23);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        boolean boolean26 = hashMapTestDriver25.isEmpty();
        java.lang.Object obj28 = hashMapTestDriver25.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set29 = hashMapTestDriver25.entrySet();
        experiment.util.Set set30 = hashMapTestDriver25.entrySet();
        java.lang.Object obj31 = hashMapTestDriver20.get((java.lang.Object) set30);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set33 = hashMapTestDriver32.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set35 = hashMapTestDriver34.entrySet();
        java.lang.Object obj36 = hashMapTestDriver32.remove((java.lang.Object) set35);
        java.lang.Object obj38 = hashMapTestDriver32.get((java.lang.Object) false);
        int int39 = hashMapTestDriver32.size();
        boolean boolean41 = hashMapTestDriver32.containsKey((java.lang.Object) (short) 1);
        java.lang.Object obj42 = hashMapTestDriver13.put((java.lang.Object) hashMapTestDriver20, (java.lang.Object) boolean41);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        boolean boolean44 = hashMapTestDriver43.isEmpty();
        java.lang.Object obj46 = hashMapTestDriver43.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set47 = hashMapTestDriver43.entrySet();
        experiment.util.Collection collection48 = hashMapTestDriver43.values();
        java.lang.Object obj49 = hashMapTestDriver20.remove((java.lang.Object) hashMapTestDriver43);
        boolean boolean50 = hashMapTestDriver20.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        boolean boolean52 = hashMapTestDriver51.isEmpty();
        java.lang.Object obj54 = hashMapTestDriver51.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        boolean boolean56 = hashMapTestDriver55.isEmpty();
        java.lang.Object obj58 = hashMapTestDriver55.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set59 = hashMapTestDriver55.entrySet();
        boolean boolean60 = hashMapTestDriver51.containsKey((java.lang.Object) hashMapTestDriver55);
        boolean boolean61 = hashMapTestDriver55.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        boolean boolean63 = hashMapTestDriver62.isEmpty();
        experiment.util.Set set64 = hashMapTestDriver62.keySet();
        java.lang.Object obj65 = hashMapTestDriver55.get((java.lang.Object) hashMapTestDriver62);
        experiment.util.Set set66 = hashMapTestDriver55.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set68 = hashMapTestDriver67.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver69 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set70 = hashMapTestDriver69.entrySet();
        java.lang.Object obj71 = hashMapTestDriver67.remove((java.lang.Object) set70);
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        boolean boolean73 = hashMapTestDriver72.isEmpty();
        java.lang.Object obj75 = hashMapTestDriver72.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver76 = new experiment.util.HashMapTestDriver();
        boolean boolean77 = hashMapTestDriver76.isEmpty();
        java.lang.Object obj79 = hashMapTestDriver76.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set80 = hashMapTestDriver76.entrySet();
        boolean boolean81 = hashMapTestDriver72.containsKey((java.lang.Object) hashMapTestDriver76);
        hashMapTestDriver72.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver83 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj84 = hashMapTestDriver72.remove((java.lang.Object) hashMapTestDriver83);
        java.lang.Object obj85 = hashMapTestDriver55.put((java.lang.Object) hashMapTestDriver67, (java.lang.Object) hashMapTestDriver83);
        experiment.util.Collection collection86 = hashMapTestDriver55.values();
        java.lang.Object obj87 = hashMapTestDriver0.put((java.lang.Object) boolean50, (java.lang.Object) collection86);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNull(obj87);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test038");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver6.isEmpty();
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean7);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection10 = hashMapTestDriver0.values();
        experiment.util.Set set11 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        boolean boolean14 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver12);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        boolean boolean16 = hashMapTestDriver15.isEmpty();
        java.lang.Object obj18 = hashMapTestDriver15.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        boolean boolean20 = hashMapTestDriver19.isEmpty();
        java.lang.Object obj22 = hashMapTestDriver19.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set23 = hashMapTestDriver19.entrySet();
        boolean boolean24 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver19);
        boolean boolean25 = hashMapTestDriver19.isEmpty();
        experiment.util.Set set26 = hashMapTestDriver19.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        boolean boolean28 = hashMapTestDriver27.isEmpty();
        java.lang.Object obj30 = hashMapTestDriver27.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set31 = hashMapTestDriver27.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        boolean boolean34 = hashMapTestDriver33.isEmpty();
        java.lang.Object obj35 = hashMapTestDriver27.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean34);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        boolean boolean37 = hashMapTestDriver36.isEmpty();
        java.lang.Object obj39 = hashMapTestDriver36.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set40 = hashMapTestDriver36.entrySet();
        experiment.util.Collection collection41 = hashMapTestDriver36.values();
        java.lang.Object obj42 = hashMapTestDriver27.get((java.lang.Object) hashMapTestDriver36);
        java.lang.Object obj44 = hashMapTestDriver19.put((java.lang.Object) hashMapTestDriver36, (java.lang.Object) "");
        hashMapTestDriver19.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        boolean boolean47 = hashMapTestDriver46.isEmpty();
        java.lang.Object obj49 = hashMapTestDriver46.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set50 = hashMapTestDriver46.entrySet();
        experiment.util.Set set51 = hashMapTestDriver46.entrySet();
        boolean boolean52 = hashMapTestDriver46.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set54 = hashMapTestDriver53.entrySet();
        boolean boolean55 = hashMapTestDriver46.containsKey((java.lang.Object) set54);
        experiment.util.Set set56 = hashMapTestDriver46.keySet();
        boolean boolean57 = hashMapTestDriver19.containsKey((java.lang.Object) hashMapTestDriver46);
        java.lang.Object obj58 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver19, obj58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test039");
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
        hashMapTestDriver7.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        boolean boolean32 = hashMapTestDriver31.isEmpty();
        java.lang.Object obj34 = hashMapTestDriver31.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set35 = hashMapTestDriver31.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        boolean boolean38 = hashMapTestDriver37.isEmpty();
        java.lang.Object obj39 = hashMapTestDriver31.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean38);
        boolean boolean40 = hashMapTestDriver7.containsKey((java.lang.Object) (byte) 100);
        java.lang.Class<?> wildcardClass41 = hashMapTestDriver7.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test040");
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
        boolean boolean37 = hashMapTestDriver30.isEmpty();
        experiment.util.Set set38 = hashMapTestDriver30.entrySet();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test041");
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
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        boolean boolean39 = hashMapTestDriver38.isEmpty();
        java.lang.Object obj41 = hashMapTestDriver38.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        boolean boolean43 = hashMapTestDriver42.isEmpty();
        java.lang.Object obj45 = hashMapTestDriver42.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set46 = hashMapTestDriver42.entrySet();
        boolean boolean47 = hashMapTestDriver38.containsKey((java.lang.Object) hashMapTestDriver42);
        experiment.util.Set set48 = hashMapTestDriver42.keySet();
        boolean boolean49 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver42);
        hashMapTestDriver42.clear();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test042");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver6.isEmpty();
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean7);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection10 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        boolean boolean12 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj14 = hashMapTestDriver11.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set15 = hashMapTestDriver11.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver17.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver11.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean18);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        boolean boolean21 = hashMapTestDriver20.isEmpty();
        java.lang.Object obj23 = hashMapTestDriver20.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set24 = hashMapTestDriver20.entrySet();
        experiment.util.Collection collection25 = hashMapTestDriver20.values();
        java.lang.Object obj26 = hashMapTestDriver11.get((java.lang.Object) hashMapTestDriver20);
        experiment.util.Collection collection27 = hashMapTestDriver11.values();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        boolean boolean29 = hashMapTestDriver28.isEmpty();
        java.lang.Object obj31 = hashMapTestDriver28.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set32 = hashMapTestDriver28.entrySet();
        boolean boolean33 = hashMapTestDriver28.isEmpty();
        java.lang.Object obj34 = new java.lang.Object();
        java.lang.Class<?> wildcardClass35 = obj34.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        boolean boolean37 = hashMapTestDriver36.isEmpty();
        java.lang.Object obj39 = hashMapTestDriver36.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        boolean boolean41 = hashMapTestDriver40.isEmpty();
        java.lang.Object obj43 = hashMapTestDriver40.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set44 = hashMapTestDriver40.entrySet();
        boolean boolean45 = hashMapTestDriver36.containsKey((java.lang.Object) hashMapTestDriver40);
        boolean boolean46 = hashMapTestDriver40.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        boolean boolean48 = hashMapTestDriver47.isEmpty();
        experiment.util.Set set49 = hashMapTestDriver47.keySet();
        java.lang.Object obj50 = hashMapTestDriver40.get((java.lang.Object) hashMapTestDriver47);
        java.lang.Object obj51 = hashMapTestDriver28.put(obj34, (java.lang.Object) hashMapTestDriver47);
        java.lang.Object obj52 = hashMapTestDriver11.remove(obj34);
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        boolean boolean54 = hashMapTestDriver53.isEmpty();
        java.lang.Object obj56 = hashMapTestDriver53.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        boolean boolean58 = hashMapTestDriver57.isEmpty();
        java.lang.Object obj60 = hashMapTestDriver57.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set61 = hashMapTestDriver57.entrySet();
        boolean boolean62 = hashMapTestDriver53.containsKey((java.lang.Object) hashMapTestDriver57);
        boolean boolean63 = hashMapTestDriver57.isEmpty();
        experiment.util.Set set64 = hashMapTestDriver57.entrySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj65 = hashMapTestDriver0.put(obj52, (java.lang.Object) set64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(set64);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test043");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set3 = hashMapTestDriver2.entrySet();
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) set3);
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set7 = hashMapTestDriver6.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        java.lang.Object obj10 = hashMapTestDriver6.remove((java.lang.Object) set9);
        java.lang.Object obj11 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver6);
        experiment.util.Set set12 = hashMapTestDriver6.entrySet();
        java.lang.Class<?> wildcardClass13 = set12.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test044");
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
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        boolean boolean39 = hashMapTestDriver38.isEmpty();
        java.lang.Object obj41 = hashMapTestDriver38.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        boolean boolean43 = hashMapTestDriver42.isEmpty();
        java.lang.Object obj45 = hashMapTestDriver42.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set46 = hashMapTestDriver42.entrySet();
        boolean boolean47 = hashMapTestDriver38.containsKey((java.lang.Object) hashMapTestDriver42);
        experiment.util.Set set48 = hashMapTestDriver42.keySet();
        boolean boolean49 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver42);
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        boolean boolean51 = hashMapTestDriver50.isEmpty();
        java.lang.Object obj53 = hashMapTestDriver50.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        boolean boolean55 = hashMapTestDriver54.isEmpty();
        java.lang.Object obj57 = hashMapTestDriver54.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set58 = hashMapTestDriver54.entrySet();
        boolean boolean59 = hashMapTestDriver50.containsKey((java.lang.Object) hashMapTestDriver54);
        boolean boolean60 = hashMapTestDriver54.isEmpty();
        experiment.util.Set set61 = hashMapTestDriver54.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        boolean boolean63 = hashMapTestDriver62.isEmpty();
        java.lang.Object obj65 = hashMapTestDriver62.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set66 = hashMapTestDriver62.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        boolean boolean69 = hashMapTestDriver68.isEmpty();
        java.lang.Object obj70 = hashMapTestDriver62.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean69);
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        boolean boolean72 = hashMapTestDriver71.isEmpty();
        java.lang.Object obj74 = hashMapTestDriver71.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set75 = hashMapTestDriver71.entrySet();
        experiment.util.Collection collection76 = hashMapTestDriver71.values();
        java.lang.Object obj77 = hashMapTestDriver62.get((java.lang.Object) hashMapTestDriver71);
        java.lang.Object obj79 = hashMapTestDriver54.put((java.lang.Object) hashMapTestDriver71, (java.lang.Object) "");
        hashMapTestDriver54.clear();
        java.lang.Object obj81 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver54);
        boolean boolean82 = hashMapTestDriver7.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test045");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        boolean boolean6 = hashMapTestDriver0.containsKey((java.lang.Object) (-1.0f));
        hashMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass8 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test046");
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
        java.lang.Class<?> wildcardClass38 = collection37.getClass();
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
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test047");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver4.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set8 = hashMapTestDriver4.entrySet();
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        experiment.util.Set set10 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass11 = set10.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test048");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set3 = hashMapTestDriver2.entrySet();
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) set3);
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set7 = hashMapTestDriver6.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        java.lang.Object obj10 = hashMapTestDriver6.remove((java.lang.Object) set9);
        java.lang.Object obj11 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver6);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        boolean boolean13 = hashMapTestDriver12.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver12.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set16 = hashMapTestDriver12.entrySet();
        boolean boolean17 = hashMapTestDriver12.isEmpty();
        experiment.util.Set set18 = hashMapTestDriver12.keySet();
        experiment.util.Collection collection19 = hashMapTestDriver12.values();
        java.lang.Object obj20 = hashMapTestDriver0.remove((java.lang.Object) collection19);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test049");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver6.isEmpty();
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean7);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        boolean boolean10 = hashMapTestDriver9.isEmpty();
        java.lang.Object obj12 = hashMapTestDriver9.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set13 = hashMapTestDriver9.entrySet();
        experiment.util.Collection collection14 = hashMapTestDriver9.values();
        java.lang.Object obj15 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set16 = hashMapTestDriver9.entrySet();
        experiment.util.Set set17 = hashMapTestDriver9.entrySet();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test050");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver6.isEmpty();
        java.lang.Object obj8 = hashMapTestDriver0.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean7);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        boolean boolean10 = hashMapTestDriver9.isEmpty();
        java.lang.Object obj12 = hashMapTestDriver9.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set13 = hashMapTestDriver9.entrySet();
        experiment.util.Collection collection14 = hashMapTestDriver9.values();
        java.lang.Object obj15 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set16 = hashMapTestDriver9.entrySet();
        java.lang.Class<?> wildcardClass17 = set16.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test051");
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
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        boolean boolean39 = hashMapTestDriver38.isEmpty();
        java.lang.Object obj41 = hashMapTestDriver38.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        boolean boolean43 = hashMapTestDriver42.isEmpty();
        java.lang.Object obj45 = hashMapTestDriver42.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set46 = hashMapTestDriver42.entrySet();
        boolean boolean47 = hashMapTestDriver38.containsKey((java.lang.Object) hashMapTestDriver42);
        experiment.util.Set set48 = hashMapTestDriver42.keySet();
        boolean boolean49 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver42);
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        boolean boolean51 = hashMapTestDriver50.isEmpty();
        java.lang.Object obj53 = hashMapTestDriver50.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        boolean boolean55 = hashMapTestDriver54.isEmpty();
        java.lang.Object obj57 = hashMapTestDriver54.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set58 = hashMapTestDriver54.entrySet();
        boolean boolean59 = hashMapTestDriver50.containsKey((java.lang.Object) hashMapTestDriver54);
        boolean boolean60 = hashMapTestDriver54.isEmpty();
        experiment.util.Set set61 = hashMapTestDriver54.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        boolean boolean63 = hashMapTestDriver62.isEmpty();
        java.lang.Object obj65 = hashMapTestDriver62.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set66 = hashMapTestDriver62.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        boolean boolean69 = hashMapTestDriver68.isEmpty();
        java.lang.Object obj70 = hashMapTestDriver62.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean69);
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        boolean boolean72 = hashMapTestDriver71.isEmpty();
        java.lang.Object obj74 = hashMapTestDriver71.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set75 = hashMapTestDriver71.entrySet();
        experiment.util.Collection collection76 = hashMapTestDriver71.values();
        java.lang.Object obj77 = hashMapTestDriver62.get((java.lang.Object) hashMapTestDriver71);
        java.lang.Object obj79 = hashMapTestDriver54.put((java.lang.Object) hashMapTestDriver71, (java.lang.Object) "");
        hashMapTestDriver54.clear();
        java.lang.Object obj81 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver54);
        hashMapTestDriver7.clear();
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj81);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test052");
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
        boolean boolean37 = hashMapTestDriver7.isEmpty();
        hashMapTestDriver7.clear();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test053");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver4.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set8 = hashMapTestDriver4.entrySet();
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        hashMapTestDriver0.clear();
        java.lang.Object obj12 = hashMapTestDriver0.get((java.lang.Object) (-1.0f));
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) (-1.0f));
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        java.lang.Object obj20 = hashMapTestDriver16.remove((java.lang.Object) set19);
        java.lang.Object obj22 = hashMapTestDriver16.get((java.lang.Object) false);
        int int23 = hashMapTestDriver16.size();
        boolean boolean25 = hashMapTestDriver16.containsKey((java.lang.Object) (short) 1);
        experiment.util.Set set26 = hashMapTestDriver16.entrySet();
        experiment.util.Collection collection27 = hashMapTestDriver16.values();
        boolean boolean28 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver16);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        boolean boolean30 = hashMapTestDriver29.isEmpty();
        java.lang.Object obj32 = hashMapTestDriver29.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set33 = hashMapTestDriver29.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        boolean boolean36 = hashMapTestDriver35.isEmpty();
        java.lang.Object obj37 = hashMapTestDriver29.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean36);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        boolean boolean39 = hashMapTestDriver38.isEmpty();
        java.lang.Object obj41 = hashMapTestDriver38.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set42 = hashMapTestDriver38.entrySet();
        experiment.util.Collection collection43 = hashMapTestDriver38.values();
        java.lang.Object obj44 = hashMapTestDriver29.get((java.lang.Object) hashMapTestDriver38);
        experiment.util.Collection collection45 = hashMapTestDriver29.values();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        boolean boolean47 = hashMapTestDriver46.isEmpty();
        java.lang.Object obj49 = hashMapTestDriver46.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set50 = hashMapTestDriver46.entrySet();
        boolean boolean51 = hashMapTestDriver46.isEmpty();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        boolean boolean55 = hashMapTestDriver54.isEmpty();
        java.lang.Object obj57 = hashMapTestDriver54.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        boolean boolean59 = hashMapTestDriver58.isEmpty();
        java.lang.Object obj61 = hashMapTestDriver58.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set62 = hashMapTestDriver58.entrySet();
        boolean boolean63 = hashMapTestDriver54.containsKey((java.lang.Object) hashMapTestDriver58);
        boolean boolean64 = hashMapTestDriver58.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        boolean boolean66 = hashMapTestDriver65.isEmpty();
        experiment.util.Set set67 = hashMapTestDriver65.keySet();
        java.lang.Object obj68 = hashMapTestDriver58.get((java.lang.Object) hashMapTestDriver65);
        java.lang.Object obj69 = hashMapTestDriver46.put(obj52, (java.lang.Object) hashMapTestDriver65);
        java.lang.Object obj70 = hashMapTestDriver29.remove(obj52);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean71 = hashMapTestDriver16.containsKey(obj70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj70);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test054");
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
        hashMapTestDriver7.clear();
        java.lang.Class<?> wildcardClass39 = hashMapTestDriver7.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test055");
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
        experiment.util.Set set11 = hashMapTestDriver6.entrySet();
        boolean boolean12 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver6);
        experiment.util.Collection collection13 = hashMapTestDriver0.values();
        experiment.util.Set set14 = hashMapTestDriver0.keySet();
        boolean boolean15 = hashMapTestDriver0.isEmpty();
        experiment.util.Collection collection16 = hashMapTestDriver0.values();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test056");
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
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        boolean boolean13 = hashMapTestDriver12.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver12.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        boolean boolean17 = hashMapTestDriver16.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver16.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set20 = hashMapTestDriver16.entrySet();
        boolean boolean21 = hashMapTestDriver12.containsKey((java.lang.Object) hashMapTestDriver16);
        boolean boolean22 = hashMapTestDriver16.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        boolean boolean24 = hashMapTestDriver23.isEmpty();
        experiment.util.Set set25 = hashMapTestDriver23.keySet();
        java.lang.Object obj26 = hashMapTestDriver16.get((java.lang.Object) hashMapTestDriver23);
        boolean boolean27 = hashMapTestDriver23.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        boolean boolean29 = hashMapTestDriver28.isEmpty();
        java.lang.Object obj31 = hashMapTestDriver28.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set32 = hashMapTestDriver28.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        boolean boolean35 = hashMapTestDriver34.isEmpty();
        java.lang.Object obj36 = hashMapTestDriver28.put((java.lang.Object) (byte) 100, (java.lang.Object) boolean35);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        boolean boolean38 = hashMapTestDriver37.isEmpty();
        java.lang.Object obj40 = hashMapTestDriver37.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set41 = hashMapTestDriver37.entrySet();
        experiment.util.Collection collection42 = hashMapTestDriver37.values();
        java.lang.Object obj43 = hashMapTestDriver28.get((java.lang.Object) hashMapTestDriver37);
        java.lang.Object obj45 = hashMapTestDriver28.remove((java.lang.Object) 100.0d);
        experiment.util.Set set46 = hashMapTestDriver28.entrySet();
        java.lang.Object obj47 = hashMapTestDriver23.get((java.lang.Object) set46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = hashMapTestDriver0.get(obj47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test057");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver4.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set8 = hashMapTestDriver4.entrySet();
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        java.lang.Object obj14 = hashMapTestDriver10.remove((java.lang.Object) set13);
        java.lang.Object obj16 = hashMapTestDriver10.get((java.lang.Object) false);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        java.lang.Object obj21 = hashMapTestDriver17.remove((java.lang.Object) set20);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        boolean boolean23 = hashMapTestDriver22.isEmpty();
        java.lang.Object obj25 = hashMapTestDriver22.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set26 = hashMapTestDriver22.entrySet();
        experiment.util.Set set27 = hashMapTestDriver22.entrySet();
        java.lang.Object obj28 = hashMapTestDriver17.get((java.lang.Object) set27);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        java.lang.Object obj33 = hashMapTestDriver29.remove((java.lang.Object) set32);
        java.lang.Object obj35 = hashMapTestDriver29.get((java.lang.Object) false);
        int int36 = hashMapTestDriver29.size();
        boolean boolean38 = hashMapTestDriver29.containsKey((java.lang.Object) (short) 1);
        java.lang.Object obj39 = hashMapTestDriver10.put((java.lang.Object) hashMapTestDriver17, (java.lang.Object) boolean38);
        experiment.util.Set set40 = hashMapTestDriver10.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        boolean boolean42 = hashMapTestDriver41.isEmpty();
        java.lang.Object obj44 = hashMapTestDriver41.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set45 = hashMapTestDriver41.entrySet();
        experiment.util.Set set46 = hashMapTestDriver41.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set48 = hashMapTestDriver47.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set50 = hashMapTestDriver49.entrySet();
        java.lang.Object obj51 = hashMapTestDriver47.remove((java.lang.Object) set50);
        experiment.util.Set set52 = hashMapTestDriver47.entrySet();
        boolean boolean53 = hashMapTestDriver41.containsKey((java.lang.Object) hashMapTestDriver47);
        java.lang.Object obj54 = hashMapTestDriver10.remove((java.lang.Object) hashMapTestDriver41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj55 = hashMapTestDriver0.remove(obj54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test058");
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
        experiment.util.Set set11 = hashMapTestDriver6.entrySet();
        boolean boolean12 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver6);
        experiment.util.Collection collection13 = hashMapTestDriver0.values();
        experiment.util.Set set14 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.entrySet();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set22 = hashMapTestDriver21.entrySet();
        java.lang.Object obj23 = hashMapTestDriver19.remove((java.lang.Object) set22);
        java.lang.Object obj25 = hashMapTestDriver19.get((java.lang.Object) false);
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set27 = hashMapTestDriver26.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.entrySet();
        java.lang.Object obj30 = hashMapTestDriver26.remove((java.lang.Object) set29);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        boolean boolean32 = hashMapTestDriver31.isEmpty();
        java.lang.Object obj34 = hashMapTestDriver31.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set35 = hashMapTestDriver31.entrySet();
        experiment.util.Set set36 = hashMapTestDriver31.entrySet();
        java.lang.Object obj37 = hashMapTestDriver26.get((java.lang.Object) set36);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        java.lang.Object obj42 = hashMapTestDriver38.remove((java.lang.Object) set41);
        java.lang.Object obj44 = hashMapTestDriver38.get((java.lang.Object) false);
        int int45 = hashMapTestDriver38.size();
        boolean boolean47 = hashMapTestDriver38.containsKey((java.lang.Object) (short) 1);
        java.lang.Object obj48 = hashMapTestDriver19.put((java.lang.Object) hashMapTestDriver26, (java.lang.Object) boolean47);
        experiment.util.Collection collection49 = hashMapTestDriver19.values();
        experiment.util.Collection collection50 = hashMapTestDriver19.values();
        boolean boolean51 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver19);
        java.lang.Object obj52 = hashMapTestDriver0.put((java.lang.Object) (byte) 10, (java.lang.Object) hashMapTestDriver16);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test059");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver4.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set8 = hashMapTestDriver4.entrySet();
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        boolean boolean10 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        boolean boolean12 = hashMapTestDriver11.isEmpty();
        experiment.util.Set set13 = hashMapTestDriver11.keySet();
        java.lang.Object obj14 = hashMapTestDriver4.get((java.lang.Object) hashMapTestDriver11);
        experiment.util.Collection collection15 = hashMapTestDriver11.values();
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = hashMapTestDriver11.remove(obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test060");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) 1L);
        java.lang.Object obj9 = hashMapTestDriver0.remove((java.lang.Object) 100);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test061");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        experiment.util.Set set7 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass8 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test062");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set3 = hashMapTestDriver2.entrySet();
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) set3);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) false);
        int int7 = hashMapTestDriver0.size();
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 1);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        boolean boolean12 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj14 = hashMapTestDriver11.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set15 = hashMapTestDriver11.entrySet();
        boolean boolean16 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver11.put((java.lang.Object) (short) 0, (java.lang.Object) (-1));
        experiment.util.Set set20 = hashMapTestDriver11.entrySet();
        boolean boolean22 = hashMapTestDriver11.containsKey((java.lang.Object) 1.0f);
        boolean boolean23 = hashMapTestDriver0.containsKey((java.lang.Object) boolean22);
        experiment.util.Set set24 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass25 = set24.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test063");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) (byte) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver4.remove((java.lang.Object) (byte) 0);
        experiment.util.Set set8 = hashMapTestDriver4.entrySet();
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        int int10 = hashMapTestDriver4.size();
        hashMapTestDriver4.clear();
        int int12 = hashMapTestDriver4.size();
        boolean boolean13 = hashMapTestDriver4.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1191369007_1024_0.test064");
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
        experiment.util.Set set30 = hashMapTestDriver0.entrySet();
        int int31 = hashMapTestDriver0.size();
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
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

}
