package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashMapTest_54676380_256_s {

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
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test002");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass1 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test003");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = hashMapTestDriver0.remove(obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test004");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = hashMapTestDriver0.containsKey(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test005");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass5 = set4.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test006");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass6 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test007");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass6 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test008");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test009");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = hashMapTestDriver0.put(obj7, (java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test010");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        int int3 = hashMapTestDriver2.size();
        java.lang.Object obj5 = hashMapTestDriver2.remove((java.lang.Object) 10.0f);
        experiment.util.Set set6 = hashMapTestDriver2.keySet();
        java.lang.Object obj8 = hashMapTestDriver2.get((java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = hashMapTestDriver0.containsKey(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test011");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set4 = hashMapTestDriver3.entrySet();
        experiment.util.Set set5 = hashMapTestDriver3.entrySet();
        boolean boolean6 = hashMapTestDriver2.containsKey((java.lang.Object) hashMapTestDriver3);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.keySet();
        java.lang.Object obj9 = hashMapTestDriver2.get((java.lang.Object) set8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = hashMapTestDriver0.remove(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test012");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.Set set7 = hashMapTestDriver5.entrySet();
        boolean boolean8 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver5);
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        int int12 = hashMapTestDriver11.size();
        boolean boolean14 = hashMapTestDriver11.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.entrySet();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        boolean boolean19 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver16);
        hashMapTestDriver15.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set22 = hashMapTestDriver21.entrySet();
        experiment.util.Collection collection23 = hashMapTestDriver21.values();
        hashMapTestDriver21.clear();
        experiment.util.Set set25 = hashMapTestDriver21.keySet();
        java.lang.Object obj26 = hashMapTestDriver11.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) hashMapTestDriver21);
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.entrySet();
        experiment.util.Set set30 = hashMapTestDriver28.entrySet();
        boolean boolean31 = hashMapTestDriver27.containsKey((java.lang.Object) hashMapTestDriver28);
        hashMapTestDriver27.clear();
        experiment.util.Collection collection33 = hashMapTestDriver27.values();
        experiment.util.Set set34 = hashMapTestDriver27.keySet();
        java.lang.Object obj36 = hashMapTestDriver11.put((java.lang.Object) hashMapTestDriver27, (java.lang.Object) '4');
        java.lang.Object obj37 = hashMapTestDriver4.put((java.lang.Object) (-1.0f), (java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = hashMapTestDriver0.containsKey(obj37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test013");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        int int9 = hashMapTestDriver8.size();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set12 = hashMapTestDriver11.entrySet();
        experiment.util.Collection collection13 = hashMapTestDriver11.values();
        experiment.util.Set set14 = hashMapTestDriver11.keySet();
        java.lang.Object obj16 = hashMapTestDriver11.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Collection collection19 = hashMapTestDriver17.values();
        hashMapTestDriver17.clear();
        experiment.util.Set set21 = hashMapTestDriver17.keySet();
        java.lang.Object obj22 = hashMapTestDriver11.get((java.lang.Object) set21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = hashMapTestDriver0.remove(obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test014");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        int int9 = hashMapTestDriver8.size();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set12 = hashMapTestDriver11.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.remove((java.lang.Object) 1L);
        experiment.util.Set set16 = hashMapTestDriver13.entrySet();
        java.lang.Object obj17 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver11, (java.lang.Object) hashMapTestDriver13);
        java.lang.Class<?> wildcardClass18 = hashMapTestDriver13.getClass();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test015");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = obj5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test016");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.entrySet();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        boolean boolean10 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set11 = hashMapTestDriver6.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        int int13 = hashMapTestDriver12.size();
        boolean boolean15 = hashMapTestDriver12.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        hashMapTestDriver16.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Collection collection24 = hashMapTestDriver22.values();
        hashMapTestDriver22.clear();
        experiment.util.Set set26 = hashMapTestDriver22.keySet();
        java.lang.Object obj27 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver22);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        boolean boolean32 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver29);
        hashMapTestDriver28.clear();
        experiment.util.Collection collection34 = hashMapTestDriver28.values();
        experiment.util.Set set35 = hashMapTestDriver28.keySet();
        java.lang.Object obj37 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver28, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.entrySet();
        experiment.util.Set set40 = hashMapTestDriver38.entrySet();
        java.lang.Object obj41 = hashMapTestDriver28.remove((java.lang.Object) set40);
        java.lang.Object obj42 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) hashMapTestDriver28);
        boolean boolean43 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver28);
        java.lang.Class<?> wildcardClass44 = hashMapTestDriver28.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test017");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        hashMapTestDriver0.clear();
        java.lang.Object obj9 = hashMapTestDriver0.get((java.lang.Object) 10.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        int int11 = hashMapTestDriver10.size();
        java.lang.Object obj13 = hashMapTestDriver10.remove((java.lang.Object) 10.0f);
        experiment.util.Set set14 = hashMapTestDriver10.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.entrySet();
        experiment.util.Collection collection17 = hashMapTestDriver15.values();
        java.lang.Object obj19 = hashMapTestDriver15.remove((java.lang.Object) 10.0f);
        java.lang.Object obj20 = hashMapTestDriver10.get((java.lang.Object) hashMapTestDriver15);
        java.lang.Object obj21 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Collection collection24 = hashMapTestDriver22.values();
        experiment.util.Set set25 = hashMapTestDriver22.keySet();
        java.lang.Object obj27 = hashMapTestDriver22.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.entrySet();
        experiment.util.Collection collection30 = hashMapTestDriver28.values();
        hashMapTestDriver28.clear();
        experiment.util.Set set32 = hashMapTestDriver28.keySet();
        java.lang.Object obj33 = hashMapTestDriver22.get((java.lang.Object) set32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj34 = hashMapTestDriver10.get(obj33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test018");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = hashMapTestDriver0.containsKey(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test019");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver9.isEmpty();
        experiment.util.Collection collection13 = hashMapTestDriver9.values();
        java.lang.Object obj14 = hashMapTestDriver6.get((java.lang.Object) collection13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = hashMapTestDriver0.remove(obj14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test020");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass9 = set8.getClass();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test021");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        boolean boolean6 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 100);
        int int7 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test022");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Class<?> wildcardClass5 = hashMapTestDriver1.getClass();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test023");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        java.lang.Object obj3 = null;
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.Set set7 = hashMapTestDriver5.entrySet();
        boolean boolean8 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver5);
        hashMapTestDriver4.clear();
        experiment.util.Collection collection10 = hashMapTestDriver4.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        int int13 = hashMapTestDriver12.size();
        java.lang.Object obj14 = hashMapTestDriver4.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver12);
        boolean boolean15 = hashMapTestDriver12.isEmpty();
        int int16 = hashMapTestDriver12.size();
        boolean boolean17 = hashMapTestDriver12.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = hashMapTestDriver0.put(obj3, (java.lang.Object) hashMapTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test024");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj12 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set13 = hashMapTestDriver7.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.entrySet();
        experiment.util.Collection collection16 = hashMapTestDriver14.values();
        hashMapTestDriver14.clear();
        experiment.util.Set set18 = hashMapTestDriver14.keySet();
        boolean boolean19 = hashMapTestDriver7.containsKey((java.lang.Object) set18);
        java.lang.Class<?> wildcardClass20 = hashMapTestDriver7.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test025");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        int int6 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test026");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.entrySet();
        experiment.util.Set set6 = hashMapTestDriver4.entrySet();
        boolean boolean7 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj10 = hashMapTestDriver3.get((java.lang.Object) set9);
        experiment.util.Set set11 = hashMapTestDriver3.entrySet();
        java.lang.Object obj13 = hashMapTestDriver0.put((java.lang.Object) set11, (java.lang.Object) 1.0d);
        java.lang.Class<?> wildcardClass14 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test027");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        int int6 = hashMapTestDriver0.size();
        java.lang.Class<?> wildcardClass7 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test028");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver10.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.entrySet();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        boolean boolean19 = hashMapTestDriver16.isEmpty();
        experiment.util.Collection collection20 = hashMapTestDriver16.values();
        java.lang.Object obj21 = hashMapTestDriver13.get((java.lang.Object) collection20);
        experiment.util.Set set22 = hashMapTestDriver13.keySet();
        java.lang.Object obj23 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver10, (java.lang.Object) hashMapTestDriver13);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        int int25 = hashMapTestDriver24.size();
        boolean boolean27 = hashMapTestDriver24.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        boolean boolean32 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver29);
        java.lang.Object obj34 = hashMapTestDriver28.get((java.lang.Object) 100.0d);
        boolean boolean35 = hashMapTestDriver28.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set38 = hashMapTestDriver37.entrySet();
        experiment.util.Set set39 = hashMapTestDriver37.entrySet();
        boolean boolean40 = hashMapTestDriver36.containsKey((java.lang.Object) hashMapTestDriver37);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set42 = hashMapTestDriver41.keySet();
        java.lang.Object obj43 = hashMapTestDriver36.get((java.lang.Object) set42);
        experiment.util.Set set44 = hashMapTestDriver36.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        int int46 = hashMapTestDriver45.size();
        java.lang.Object obj48 = hashMapTestDriver45.remove((java.lang.Object) 10.0f);
        java.lang.Object obj49 = hashMapTestDriver28.put((java.lang.Object) hashMapTestDriver36, (java.lang.Object) 10.0f);
        java.lang.Object obj50 = hashMapTestDriver10.put((java.lang.Object) boolean27, (java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test029");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.entrySet();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        boolean boolean10 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set11 = hashMapTestDriver6.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        int int13 = hashMapTestDriver12.size();
        boolean boolean15 = hashMapTestDriver12.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        hashMapTestDriver16.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Collection collection24 = hashMapTestDriver22.values();
        hashMapTestDriver22.clear();
        experiment.util.Set set26 = hashMapTestDriver22.keySet();
        java.lang.Object obj27 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver22);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        boolean boolean32 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver29);
        hashMapTestDriver28.clear();
        experiment.util.Collection collection34 = hashMapTestDriver28.values();
        experiment.util.Set set35 = hashMapTestDriver28.keySet();
        java.lang.Object obj37 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver28, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.entrySet();
        experiment.util.Set set40 = hashMapTestDriver38.entrySet();
        java.lang.Object obj41 = hashMapTestDriver28.remove((java.lang.Object) set40);
        java.lang.Object obj42 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) hashMapTestDriver28);
        boolean boolean43 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver28);
        boolean boolean44 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set45 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj48 = hashMapTestDriver46.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set51 = hashMapTestDriver50.entrySet();
        experiment.util.Set set52 = hashMapTestDriver50.entrySet();
        boolean boolean53 = hashMapTestDriver49.containsKey((java.lang.Object) hashMapTestDriver50);
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set55 = hashMapTestDriver54.keySet();
        java.lang.Object obj56 = hashMapTestDriver49.get((java.lang.Object) set55);
        experiment.util.Set set57 = hashMapTestDriver49.entrySet();
        java.lang.Object obj59 = hashMapTestDriver46.put((java.lang.Object) set57, (java.lang.Object) 1.0d);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean60 = hashMapTestDriver0.containsKey(obj59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test030");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        int int9 = hashMapTestDriver8.size();
        boolean boolean11 = hashMapTestDriver8.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.entrySet();
        experiment.util.Set set15 = hashMapTestDriver13.entrySet();
        boolean boolean16 = hashMapTestDriver12.containsKey((java.lang.Object) hashMapTestDriver13);
        hashMapTestDriver12.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        experiment.util.Collection collection20 = hashMapTestDriver18.values();
        hashMapTestDriver18.clear();
        experiment.util.Set set22 = hashMapTestDriver18.keySet();
        java.lang.Object obj23 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver12, (java.lang.Object) hashMapTestDriver18);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        boolean boolean28 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver25);
        hashMapTestDriver24.clear();
        experiment.util.Collection collection30 = hashMapTestDriver24.values();
        experiment.util.Set set31 = hashMapTestDriver24.keySet();
        java.lang.Object obj33 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) '4');
        java.lang.Object obj34 = hashMapTestDriver0.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set37 = hashMapTestDriver36.entrySet();
        experiment.util.Set set38 = hashMapTestDriver36.entrySet();
        boolean boolean39 = hashMapTestDriver35.containsKey((java.lang.Object) hashMapTestDriver36);
        hashMapTestDriver35.clear();
        experiment.util.Set set41 = hashMapTestDriver35.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        int int43 = hashMapTestDriver42.size();
        int int44 = hashMapTestDriver42.size();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set46 = hashMapTestDriver45.entrySet();
        experiment.util.Collection collection47 = hashMapTestDriver45.values();
        hashMapTestDriver45.clear();
        experiment.util.Set set49 = hashMapTestDriver45.keySet();
        java.lang.Object obj51 = hashMapTestDriver42.put((java.lang.Object) set49, (java.lang.Object) true);
        java.lang.Object obj52 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) hashMapTestDriver42);
        int int53 = hashMapTestDriver0.size();
        experiment.util.Set set54 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(set54);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test031");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        int int5 = hashMapTestDriver4.size();
        int int6 = hashMapTestDriver4.size();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.entrySet();
        experiment.util.Collection collection9 = hashMapTestDriver7.values();
        hashMapTestDriver7.clear();
        experiment.util.Set set11 = hashMapTestDriver7.keySet();
        java.lang.Object obj13 = hashMapTestDriver4.put((java.lang.Object) set11, (java.lang.Object) true);
        experiment.util.Set set14 = hashMapTestDriver4.entrySet();
        int int15 = hashMapTestDriver4.size();
        experiment.util.Set set16 = hashMapTestDriver4.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        int int18 = hashMapTestDriver17.size();
        int int19 = hashMapTestDriver17.size();
        java.lang.Class<?> wildcardClass20 = hashMapTestDriver17.getClass();
        java.lang.Object obj21 = hashMapTestDriver0.put((java.lang.Object) set16, (java.lang.Object) wildcardClass20);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test032");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        int int10 = hashMapTestDriver9.size();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.entrySet();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        boolean boolean17 = hashMapTestDriver13.containsKey((java.lang.Object) hashMapTestDriver14);
        hashMapTestDriver13.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Collection collection21 = hashMapTestDriver19.values();
        hashMapTestDriver19.clear();
        experiment.util.Set set23 = hashMapTestDriver19.keySet();
        java.lang.Object obj24 = hashMapTestDriver9.put((java.lang.Object) hashMapTestDriver13, (java.lang.Object) hashMapTestDriver19);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set27 = hashMapTestDriver26.entrySet();
        experiment.util.Set set28 = hashMapTestDriver26.entrySet();
        boolean boolean29 = hashMapTestDriver25.containsKey((java.lang.Object) hashMapTestDriver26);
        hashMapTestDriver25.clear();
        experiment.util.Collection collection31 = hashMapTestDriver25.values();
        experiment.util.Set set32 = hashMapTestDriver25.keySet();
        java.lang.Object obj34 = hashMapTestDriver9.put((java.lang.Object) hashMapTestDriver25, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.entrySet();
        experiment.util.Set set37 = hashMapTestDriver35.entrySet();
        java.lang.Object obj38 = hashMapTestDriver25.remove((java.lang.Object) set37);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        boolean boolean43 = hashMapTestDriver39.containsKey((java.lang.Object) hashMapTestDriver40);
        java.lang.Object obj45 = hashMapTestDriver39.get((java.lang.Object) 100.0d);
        boolean boolean46 = hashMapTestDriver39.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set49 = hashMapTestDriver48.entrySet();
        experiment.util.Set set50 = hashMapTestDriver48.entrySet();
        boolean boolean51 = hashMapTestDriver47.containsKey((java.lang.Object) hashMapTestDriver48);
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set53 = hashMapTestDriver52.keySet();
        java.lang.Object obj54 = hashMapTestDriver47.get((java.lang.Object) set53);
        experiment.util.Set set55 = hashMapTestDriver47.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        int int57 = hashMapTestDriver56.size();
        java.lang.Object obj59 = hashMapTestDriver56.remove((java.lang.Object) 10.0f);
        java.lang.Object obj60 = hashMapTestDriver39.put((java.lang.Object) hashMapTestDriver47, (java.lang.Object) 10.0f);
        java.lang.Object obj61 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver25, (java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test033");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        hashMapTestDriver0.clear();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test034");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        int int8 = hashMapTestDriver7.size();
        boolean boolean10 = hashMapTestDriver7.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        boolean boolean15 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver12);
        hashMapTestDriver11.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Collection collection19 = hashMapTestDriver17.values();
        hashMapTestDriver17.clear();
        experiment.util.Set set21 = hashMapTestDriver17.keySet();
        java.lang.Object obj22 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver11, (java.lang.Object) hashMapTestDriver17);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Set set26 = hashMapTestDriver24.entrySet();
        boolean boolean27 = hashMapTestDriver23.containsKey((java.lang.Object) hashMapTestDriver24);
        hashMapTestDriver23.clear();
        experiment.util.Collection collection29 = hashMapTestDriver23.values();
        experiment.util.Set set30 = hashMapTestDriver23.keySet();
        java.lang.Object obj32 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver23, (java.lang.Object) '4');
        java.lang.Object obj33 = hashMapTestDriver0.put((java.lang.Object) (-1.0f), (java.lang.Object) '4');
        experiment.util.Set set34 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.entrySet();
        experiment.util.Collection collection37 = hashMapTestDriver35.values();
        java.lang.Object obj39 = hashMapTestDriver35.remove((java.lang.Object) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = hashMapTestDriver0.remove(obj39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test035");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        int int9 = hashMapTestDriver8.size();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver8);
        boolean boolean11 = hashMapTestDriver8.isEmpty();
        int int12 = hashMapTestDriver8.size();
        experiment.util.Set set13 = hashMapTestDriver8.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test036");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = hashMapTestDriver0.get(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test037");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test038");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        int int9 = hashMapTestDriver8.size();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver8);
        boolean boolean11 = hashMapTestDriver8.isEmpty();
        int int12 = hashMapTestDriver8.size();
        boolean boolean13 = hashMapTestDriver8.isEmpty();
        experiment.util.Set set14 = hashMapTestDriver8.entrySet();
        experiment.util.Set set15 = hashMapTestDriver8.entrySet();
        int int16 = hashMapTestDriver8.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test039");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set4 = hashMapTestDriver3.entrySet();
        experiment.util.Set set5 = hashMapTestDriver3.entrySet();
        boolean boolean6 = hashMapTestDriver2.containsKey((java.lang.Object) hashMapTestDriver3);
        experiment.util.Set set7 = hashMapTestDriver2.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        int int9 = hashMapTestDriver8.size();
        boolean boolean11 = hashMapTestDriver8.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.entrySet();
        experiment.util.Set set15 = hashMapTestDriver13.entrySet();
        boolean boolean16 = hashMapTestDriver12.containsKey((java.lang.Object) hashMapTestDriver13);
        hashMapTestDriver12.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        experiment.util.Collection collection20 = hashMapTestDriver18.values();
        hashMapTestDriver18.clear();
        experiment.util.Set set22 = hashMapTestDriver18.keySet();
        java.lang.Object obj23 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver12, (java.lang.Object) hashMapTestDriver18);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        boolean boolean28 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver25);
        hashMapTestDriver24.clear();
        experiment.util.Collection collection30 = hashMapTestDriver24.values();
        experiment.util.Set set31 = hashMapTestDriver24.keySet();
        java.lang.Object obj33 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set35 = hashMapTestDriver34.entrySet();
        experiment.util.Set set36 = hashMapTestDriver34.entrySet();
        java.lang.Object obj37 = hashMapTestDriver24.remove((java.lang.Object) set36);
        java.lang.Object obj38 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver2, (java.lang.Object) hashMapTestDriver24);
        int int39 = hashMapTestDriver24.size();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test040");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        experiment.util.Set set7 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test041");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set7 = hashMapTestDriver6.entrySet();
        experiment.util.Collection collection8 = hashMapTestDriver6.values();
        hashMapTestDriver6.clear();
        experiment.util.Set set10 = hashMapTestDriver6.keySet();
        java.lang.Object obj11 = hashMapTestDriver0.get((java.lang.Object) set10);
        int int12 = hashMapTestDriver0.size();
        boolean boolean13 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test042");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set13 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        int int15 = hashMapTestDriver14.size();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        hashMapTestDriver18.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver24.values();
        hashMapTestDriver24.clear();
        experiment.util.Set set28 = hashMapTestDriver24.keySet();
        java.lang.Object obj29 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver31);
        hashMapTestDriver30.clear();
        experiment.util.Collection collection36 = hashMapTestDriver30.values();
        experiment.util.Set set37 = hashMapTestDriver30.keySet();
        java.lang.Object obj39 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        java.lang.Object obj43 = hashMapTestDriver30.remove((java.lang.Object) set42);
        java.lang.Object obj44 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj45 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver30);
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set48 = hashMapTestDriver47.entrySet();
        experiment.util.Set set49 = hashMapTestDriver47.entrySet();
        boolean boolean50 = hashMapTestDriver46.containsKey((java.lang.Object) hashMapTestDriver47);
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set52 = hashMapTestDriver51.keySet();
        java.lang.Object obj53 = hashMapTestDriver46.get((java.lang.Object) set52);
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        int int55 = hashMapTestDriver54.size();
        java.lang.Object obj57 = hashMapTestDriver54.remove((java.lang.Object) 10.0f);
        experiment.util.Set set58 = hashMapTestDriver54.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set60 = hashMapTestDriver59.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set63 = hashMapTestDriver62.entrySet();
        experiment.util.Set set64 = hashMapTestDriver62.entrySet();
        boolean boolean65 = hashMapTestDriver61.containsKey((java.lang.Object) hashMapTestDriver62);
        java.lang.Object obj66 = hashMapTestDriver54.put((java.lang.Object) hashMapTestDriver59, (java.lang.Object) hashMapTestDriver61);
        java.lang.Object obj68 = hashMapTestDriver54.remove((java.lang.Object) 1.0f);
        experiment.util.Collection collection69 = hashMapTestDriver54.values();
        experiment.util.HashMapTestDriver hashMapTestDriver70 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set72 = hashMapTestDriver71.entrySet();
        experiment.util.Set set73 = hashMapTestDriver71.entrySet();
        boolean boolean74 = hashMapTestDriver70.containsKey((java.lang.Object) hashMapTestDriver71);
        hashMapTestDriver70.clear();
        java.lang.Object obj76 = new java.lang.Object();
        java.lang.Class<?> wildcardClass77 = obj76.getClass();
        boolean boolean78 = hashMapTestDriver70.containsKey((java.lang.Object) wildcardClass77);
        java.lang.Object obj79 = hashMapTestDriver46.put((java.lang.Object) collection69, (java.lang.Object) hashMapTestDriver70);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj81 = hashMapTestDriver0.put(obj79, (java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(obj79);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test043");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set4 = hashMapTestDriver3.entrySet();
        experiment.util.Collection collection5 = hashMapTestDriver3.values();
        experiment.util.Set set6 = hashMapTestDriver3.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        boolean boolean13 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver10);
        experiment.util.Set set14 = hashMapTestDriver9.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        int int16 = hashMapTestDriver15.size();
        boolean boolean18 = hashMapTestDriver15.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set21 = hashMapTestDriver20.entrySet();
        experiment.util.Set set22 = hashMapTestDriver20.entrySet();
        boolean boolean23 = hashMapTestDriver19.containsKey((java.lang.Object) hashMapTestDriver20);
        hashMapTestDriver19.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Collection collection27 = hashMapTestDriver25.values();
        hashMapTestDriver25.clear();
        experiment.util.Set set29 = hashMapTestDriver25.keySet();
        java.lang.Object obj30 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver19, (java.lang.Object) hashMapTestDriver25);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set33 = hashMapTestDriver32.entrySet();
        experiment.util.Set set34 = hashMapTestDriver32.entrySet();
        boolean boolean35 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver32);
        hashMapTestDriver31.clear();
        experiment.util.Collection collection37 = hashMapTestDriver31.values();
        experiment.util.Set set38 = hashMapTestDriver31.keySet();
        java.lang.Object obj40 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver31, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set42 = hashMapTestDriver41.entrySet();
        experiment.util.Set set43 = hashMapTestDriver41.entrySet();
        java.lang.Object obj44 = hashMapTestDriver31.remove((java.lang.Object) set43);
        java.lang.Object obj45 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver31);
        boolean boolean46 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver31);
        boolean boolean47 = hashMapTestDriver3.isEmpty();
        java.lang.Object obj48 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver3);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set50 = hashMapTestDriver49.entrySet();
        experiment.util.Collection collection51 = hashMapTestDriver49.values();
        experiment.util.Set set52 = hashMapTestDriver49.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection54 = hashMapTestDriver53.values();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set57 = hashMapTestDriver56.entrySet();
        experiment.util.Set set58 = hashMapTestDriver56.entrySet();
        boolean boolean59 = hashMapTestDriver55.containsKey((java.lang.Object) hashMapTestDriver56);
        experiment.util.Set set60 = hashMapTestDriver55.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        int int62 = hashMapTestDriver61.size();
        boolean boolean64 = hashMapTestDriver61.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set67 = hashMapTestDriver66.entrySet();
        experiment.util.Set set68 = hashMapTestDriver66.entrySet();
        boolean boolean69 = hashMapTestDriver65.containsKey((java.lang.Object) hashMapTestDriver66);
        hashMapTestDriver65.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set72 = hashMapTestDriver71.entrySet();
        experiment.util.Collection collection73 = hashMapTestDriver71.values();
        hashMapTestDriver71.clear();
        experiment.util.Set set75 = hashMapTestDriver71.keySet();
        java.lang.Object obj76 = hashMapTestDriver61.put((java.lang.Object) hashMapTestDriver65, (java.lang.Object) hashMapTestDriver71);
        experiment.util.HashMapTestDriver hashMapTestDriver77 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver78 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set79 = hashMapTestDriver78.entrySet();
        experiment.util.Set set80 = hashMapTestDriver78.entrySet();
        boolean boolean81 = hashMapTestDriver77.containsKey((java.lang.Object) hashMapTestDriver78);
        hashMapTestDriver77.clear();
        experiment.util.Collection collection83 = hashMapTestDriver77.values();
        experiment.util.Set set84 = hashMapTestDriver77.keySet();
        java.lang.Object obj86 = hashMapTestDriver61.put((java.lang.Object) hashMapTestDriver77, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver87 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set88 = hashMapTestDriver87.entrySet();
        experiment.util.Set set89 = hashMapTestDriver87.entrySet();
        java.lang.Object obj90 = hashMapTestDriver77.remove((java.lang.Object) set89);
        java.lang.Object obj91 = hashMapTestDriver53.put((java.lang.Object) hashMapTestDriver55, (java.lang.Object) hashMapTestDriver77);
        boolean boolean92 = hashMapTestDriver49.containsKey((java.lang.Object) hashMapTestDriver77);
        boolean boolean93 = hashMapTestDriver49.isEmpty();
        experiment.util.Set set94 = hashMapTestDriver49.keySet();
        java.lang.Object obj95 = hashMapTestDriver3.remove((java.lang.Object) set94);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertNull(obj95);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test044");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        experiment.util.Collection collection7 = hashMapTestDriver0.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test045");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set7 = hashMapTestDriver6.entrySet();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        boolean boolean9 = hashMapTestDriver5.containsKey((java.lang.Object) hashMapTestDriver6);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.keySet();
        java.lang.Object obj12 = hashMapTestDriver5.get((java.lang.Object) set11);
        hashMapTestDriver5.clear();
        experiment.util.Set set14 = hashMapTestDriver5.keySet();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver5);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set22 = hashMapTestDriver21.keySet();
        java.lang.Object obj23 = hashMapTestDriver16.get((java.lang.Object) set22);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        int int25 = hashMapTestDriver24.size();
        java.lang.Object obj27 = hashMapTestDriver24.remove((java.lang.Object) 10.0f);
        experiment.util.Set set28 = hashMapTestDriver24.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set33 = hashMapTestDriver32.entrySet();
        experiment.util.Set set34 = hashMapTestDriver32.entrySet();
        boolean boolean35 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver32);
        java.lang.Object obj36 = hashMapTestDriver24.put((java.lang.Object) hashMapTestDriver29, (java.lang.Object) hashMapTestDriver31);
        java.lang.Object obj38 = hashMapTestDriver24.remove((java.lang.Object) 1.0f);
        experiment.util.Collection collection39 = hashMapTestDriver24.values();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set42 = hashMapTestDriver41.entrySet();
        experiment.util.Set set43 = hashMapTestDriver41.entrySet();
        boolean boolean44 = hashMapTestDriver40.containsKey((java.lang.Object) hashMapTestDriver41);
        hashMapTestDriver40.clear();
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Class<?> wildcardClass47 = obj46.getClass();
        boolean boolean48 = hashMapTestDriver40.containsKey((java.lang.Object) wildcardClass47);
        java.lang.Object obj49 = hashMapTestDriver16.put((java.lang.Object) collection39, (java.lang.Object) hashMapTestDriver40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = hashMapTestDriver0.get(obj49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test046");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.Set set7 = hashMapTestDriver0.keySet();
        experiment.util.Set set8 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = hashMapTestDriver0.containsKey(obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test047");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set4 = hashMapTestDriver3.entrySet();
        experiment.util.Set set5 = hashMapTestDriver3.entrySet();
        boolean boolean6 = hashMapTestDriver2.containsKey((java.lang.Object) hashMapTestDriver3);
        experiment.util.Set set7 = hashMapTestDriver2.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        int int9 = hashMapTestDriver8.size();
        boolean boolean11 = hashMapTestDriver8.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.entrySet();
        experiment.util.Set set15 = hashMapTestDriver13.entrySet();
        boolean boolean16 = hashMapTestDriver12.containsKey((java.lang.Object) hashMapTestDriver13);
        hashMapTestDriver12.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        experiment.util.Collection collection20 = hashMapTestDriver18.values();
        hashMapTestDriver18.clear();
        experiment.util.Set set22 = hashMapTestDriver18.keySet();
        java.lang.Object obj23 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver12, (java.lang.Object) hashMapTestDriver18);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        boolean boolean28 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver25);
        hashMapTestDriver24.clear();
        experiment.util.Collection collection30 = hashMapTestDriver24.values();
        experiment.util.Set set31 = hashMapTestDriver24.keySet();
        java.lang.Object obj33 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set35 = hashMapTestDriver34.entrySet();
        experiment.util.Set set36 = hashMapTestDriver34.entrySet();
        java.lang.Object obj37 = hashMapTestDriver24.remove((java.lang.Object) set36);
        java.lang.Object obj38 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver2, (java.lang.Object) hashMapTestDriver24);
        boolean boolean39 = hashMapTestDriver2.isEmpty();
        int int40 = hashMapTestDriver2.size();
        java.lang.Class<?> wildcardClass41 = hashMapTestDriver2.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test048");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set4 = hashMapTestDriver3.entrySet();
        experiment.util.Collection collection5 = hashMapTestDriver3.values();
        experiment.util.Set set6 = hashMapTestDriver3.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        boolean boolean13 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver10);
        experiment.util.Set set14 = hashMapTestDriver9.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        int int16 = hashMapTestDriver15.size();
        boolean boolean18 = hashMapTestDriver15.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set21 = hashMapTestDriver20.entrySet();
        experiment.util.Set set22 = hashMapTestDriver20.entrySet();
        boolean boolean23 = hashMapTestDriver19.containsKey((java.lang.Object) hashMapTestDriver20);
        hashMapTestDriver19.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Collection collection27 = hashMapTestDriver25.values();
        hashMapTestDriver25.clear();
        experiment.util.Set set29 = hashMapTestDriver25.keySet();
        java.lang.Object obj30 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver19, (java.lang.Object) hashMapTestDriver25);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set33 = hashMapTestDriver32.entrySet();
        experiment.util.Set set34 = hashMapTestDriver32.entrySet();
        boolean boolean35 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver32);
        hashMapTestDriver31.clear();
        experiment.util.Collection collection37 = hashMapTestDriver31.values();
        experiment.util.Set set38 = hashMapTestDriver31.keySet();
        java.lang.Object obj40 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver31, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set42 = hashMapTestDriver41.entrySet();
        experiment.util.Set set43 = hashMapTestDriver41.entrySet();
        java.lang.Object obj44 = hashMapTestDriver31.remove((java.lang.Object) set43);
        java.lang.Object obj45 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver31);
        boolean boolean46 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver31);
        boolean boolean47 = hashMapTestDriver3.isEmpty();
        java.lang.Object obj48 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver3);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        int int50 = hashMapTestDriver49.size();
        boolean boolean52 = hashMapTestDriver49.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set55 = hashMapTestDriver54.entrySet();
        experiment.util.Set set56 = hashMapTestDriver54.entrySet();
        boolean boolean57 = hashMapTestDriver53.containsKey((java.lang.Object) hashMapTestDriver54);
        hashMapTestDriver53.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set60 = hashMapTestDriver59.entrySet();
        experiment.util.Collection collection61 = hashMapTestDriver59.values();
        hashMapTestDriver59.clear();
        experiment.util.Set set63 = hashMapTestDriver59.keySet();
        java.lang.Object obj64 = hashMapTestDriver49.put((java.lang.Object) hashMapTestDriver53, (java.lang.Object) hashMapTestDriver59);
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set67 = hashMapTestDriver66.entrySet();
        experiment.util.Set set68 = hashMapTestDriver66.entrySet();
        boolean boolean69 = hashMapTestDriver65.containsKey((java.lang.Object) hashMapTestDriver66);
        hashMapTestDriver65.clear();
        experiment.util.Collection collection71 = hashMapTestDriver65.values();
        experiment.util.Set set72 = hashMapTestDriver65.keySet();
        java.lang.Object obj74 = hashMapTestDriver49.put((java.lang.Object) hashMapTestDriver65, (java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj75 = hashMapTestDriver3.get(obj74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test049");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Collection collection10 = hashMapTestDriver8.values();
        experiment.util.Set set11 = hashMapTestDriver8.keySet();
        boolean boolean12 = hashMapTestDriver0.containsKey((java.lang.Object) set11);
        experiment.util.Collection collection13 = hashMapTestDriver0.values();
        experiment.util.Collection collection14 = hashMapTestDriver0.values();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test050");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.entrySet();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        boolean boolean10 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set11 = hashMapTestDriver6.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        int int13 = hashMapTestDriver12.size();
        boolean boolean15 = hashMapTestDriver12.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        hashMapTestDriver16.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Collection collection24 = hashMapTestDriver22.values();
        hashMapTestDriver22.clear();
        experiment.util.Set set26 = hashMapTestDriver22.keySet();
        java.lang.Object obj27 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver22);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        boolean boolean32 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver29);
        hashMapTestDriver28.clear();
        experiment.util.Collection collection34 = hashMapTestDriver28.values();
        experiment.util.Set set35 = hashMapTestDriver28.keySet();
        java.lang.Object obj37 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver28, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.entrySet();
        experiment.util.Set set40 = hashMapTestDriver38.entrySet();
        java.lang.Object obj41 = hashMapTestDriver28.remove((java.lang.Object) set40);
        java.lang.Object obj42 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) hashMapTestDriver28);
        boolean boolean43 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver28);
        boolean boolean44 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set45 = hashMapTestDriver0.keySet();
        experiment.util.Set set46 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass47 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test051");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        hashMapTestDriver0.clear();
        java.lang.Object obj9 = hashMapTestDriver0.get((java.lang.Object) 10.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        int int11 = hashMapTestDriver10.size();
        java.lang.Object obj13 = hashMapTestDriver10.remove((java.lang.Object) 10.0f);
        experiment.util.Set set14 = hashMapTestDriver10.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.entrySet();
        experiment.util.Collection collection17 = hashMapTestDriver15.values();
        java.lang.Object obj19 = hashMapTestDriver15.remove((java.lang.Object) 10.0f);
        java.lang.Object obj20 = hashMapTestDriver10.get((java.lang.Object) hashMapTestDriver15);
        java.lang.Object obj21 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver10);
        boolean boolean22 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test052");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set4 = hashMapTestDriver3.entrySet();
        experiment.util.Set set5 = hashMapTestDriver3.entrySet();
        boolean boolean6 = hashMapTestDriver2.containsKey((java.lang.Object) hashMapTestDriver3);
        experiment.util.Set set7 = hashMapTestDriver2.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        int int9 = hashMapTestDriver8.size();
        boolean boolean11 = hashMapTestDriver8.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.entrySet();
        experiment.util.Set set15 = hashMapTestDriver13.entrySet();
        boolean boolean16 = hashMapTestDriver12.containsKey((java.lang.Object) hashMapTestDriver13);
        hashMapTestDriver12.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        experiment.util.Collection collection20 = hashMapTestDriver18.values();
        hashMapTestDriver18.clear();
        experiment.util.Set set22 = hashMapTestDriver18.keySet();
        java.lang.Object obj23 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver12, (java.lang.Object) hashMapTestDriver18);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        boolean boolean28 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver25);
        hashMapTestDriver24.clear();
        experiment.util.Collection collection30 = hashMapTestDriver24.values();
        experiment.util.Set set31 = hashMapTestDriver24.keySet();
        java.lang.Object obj33 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set35 = hashMapTestDriver34.entrySet();
        experiment.util.Set set36 = hashMapTestDriver34.entrySet();
        java.lang.Object obj37 = hashMapTestDriver24.remove((java.lang.Object) set36);
        java.lang.Object obj38 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver2, (java.lang.Object) hashMapTestDriver24);
        java.lang.Object obj40 = hashMapTestDriver24.get((java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test053");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.Set set3 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        int int5 = hashMapTestDriver4.size();
        experiment.util.Collection collection6 = hashMapTestDriver4.values();
        boolean boolean7 = hashMapTestDriver4.isEmpty();
        experiment.util.Collection collection8 = hashMapTestDriver4.values();
        java.lang.Object obj9 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver4);
        int int10 = hashMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test054");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        int int10 = hashMapTestDriver9.size();
        java.lang.Object obj12 = hashMapTestDriver9.get((java.lang.Object) 10.0d);
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        int int15 = hashMapTestDriver14.size();
        int int16 = hashMapTestDriver14.size();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        int int18 = hashMapTestDriver17.size();
        experiment.util.Collection collection19 = hashMapTestDriver17.values();
        boolean boolean20 = hashMapTestDriver17.isEmpty();
        experiment.util.Collection collection21 = hashMapTestDriver17.values();
        java.lang.Object obj22 = hashMapTestDriver14.remove((java.lang.Object) collection21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = hashMapTestDriver9.containsKey(obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test055");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        int int10 = hashMapTestDriver9.size();
        java.lang.Object obj12 = hashMapTestDriver9.get((java.lang.Object) 10.0d);
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set14 = hashMapTestDriver9.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test056");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set13 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        int int15 = hashMapTestDriver14.size();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        hashMapTestDriver18.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver24.values();
        hashMapTestDriver24.clear();
        experiment.util.Set set28 = hashMapTestDriver24.keySet();
        java.lang.Object obj29 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver31);
        hashMapTestDriver30.clear();
        experiment.util.Collection collection36 = hashMapTestDriver30.values();
        experiment.util.Set set37 = hashMapTestDriver30.keySet();
        java.lang.Object obj39 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        java.lang.Object obj43 = hashMapTestDriver30.remove((java.lang.Object) set42);
        java.lang.Object obj44 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj45 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver30);
        int int46 = hashMapTestDriver0.size();
        int int47 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set50 = hashMapTestDriver49.entrySet();
        experiment.util.Collection collection51 = hashMapTestDriver49.values();
        experiment.util.Set set52 = hashMapTestDriver49.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection54 = hashMapTestDriver53.values();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set57 = hashMapTestDriver56.entrySet();
        experiment.util.Set set58 = hashMapTestDriver56.entrySet();
        boolean boolean59 = hashMapTestDriver55.containsKey((java.lang.Object) hashMapTestDriver56);
        experiment.util.Set set60 = hashMapTestDriver55.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        int int62 = hashMapTestDriver61.size();
        boolean boolean64 = hashMapTestDriver61.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set67 = hashMapTestDriver66.entrySet();
        experiment.util.Set set68 = hashMapTestDriver66.entrySet();
        boolean boolean69 = hashMapTestDriver65.containsKey((java.lang.Object) hashMapTestDriver66);
        hashMapTestDriver65.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set72 = hashMapTestDriver71.entrySet();
        experiment.util.Collection collection73 = hashMapTestDriver71.values();
        hashMapTestDriver71.clear();
        experiment.util.Set set75 = hashMapTestDriver71.keySet();
        java.lang.Object obj76 = hashMapTestDriver61.put((java.lang.Object) hashMapTestDriver65, (java.lang.Object) hashMapTestDriver71);
        experiment.util.HashMapTestDriver hashMapTestDriver77 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver78 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set79 = hashMapTestDriver78.entrySet();
        experiment.util.Set set80 = hashMapTestDriver78.entrySet();
        boolean boolean81 = hashMapTestDriver77.containsKey((java.lang.Object) hashMapTestDriver78);
        hashMapTestDriver77.clear();
        experiment.util.Collection collection83 = hashMapTestDriver77.values();
        experiment.util.Set set84 = hashMapTestDriver77.keySet();
        java.lang.Object obj86 = hashMapTestDriver61.put((java.lang.Object) hashMapTestDriver77, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver87 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set88 = hashMapTestDriver87.entrySet();
        experiment.util.Set set89 = hashMapTestDriver87.entrySet();
        java.lang.Object obj90 = hashMapTestDriver77.remove((java.lang.Object) set89);
        java.lang.Object obj91 = hashMapTestDriver53.put((java.lang.Object) hashMapTestDriver55, (java.lang.Object) hashMapTestDriver77);
        boolean boolean92 = hashMapTestDriver49.containsKey((java.lang.Object) hashMapTestDriver77);
        boolean boolean93 = hashMapTestDriver49.isEmpty();
        experiment.util.Set set94 = hashMapTestDriver49.keySet();
        experiment.util.Set set95 = hashMapTestDriver49.entrySet();
        java.lang.Object obj96 = hashMapTestDriver0.put((java.lang.Object) (byte) 10, (java.lang.Object) hashMapTestDriver49);
        java.lang.Object obj98 = hashMapTestDriver49.remove((java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertNotNull(set95);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertNull(obj98);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test057");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set13 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        int int15 = hashMapTestDriver14.size();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        hashMapTestDriver18.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver24.values();
        hashMapTestDriver24.clear();
        experiment.util.Set set28 = hashMapTestDriver24.keySet();
        java.lang.Object obj29 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver31);
        hashMapTestDriver30.clear();
        experiment.util.Collection collection36 = hashMapTestDriver30.values();
        experiment.util.Set set37 = hashMapTestDriver30.keySet();
        java.lang.Object obj39 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        java.lang.Object obj43 = hashMapTestDriver30.remove((java.lang.Object) set42);
        java.lang.Object obj44 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj45 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver30);
        int int46 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        int int48 = hashMapTestDriver47.size();
        java.lang.Object obj49 = hashMapTestDriver0.get((java.lang.Object) int48);
        java.lang.Object obj50 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = hashMapTestDriver0.containsKey(obj50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test058");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        int int9 = hashMapTestDriver8.size();
        boolean boolean11 = hashMapTestDriver8.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.entrySet();
        experiment.util.Set set15 = hashMapTestDriver13.entrySet();
        boolean boolean16 = hashMapTestDriver12.containsKey((java.lang.Object) hashMapTestDriver13);
        hashMapTestDriver12.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        experiment.util.Collection collection20 = hashMapTestDriver18.values();
        hashMapTestDriver18.clear();
        experiment.util.Set set22 = hashMapTestDriver18.keySet();
        java.lang.Object obj23 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver12, (java.lang.Object) hashMapTestDriver18);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        boolean boolean28 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver25);
        hashMapTestDriver24.clear();
        experiment.util.Collection collection30 = hashMapTestDriver24.values();
        experiment.util.Set set31 = hashMapTestDriver24.keySet();
        java.lang.Object obj33 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) '4');
        java.lang.Object obj34 = hashMapTestDriver0.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set37 = hashMapTestDriver36.entrySet();
        experiment.util.Set set38 = hashMapTestDriver36.entrySet();
        boolean boolean39 = hashMapTestDriver35.containsKey((java.lang.Object) hashMapTestDriver36);
        hashMapTestDriver35.clear();
        experiment.util.Set set41 = hashMapTestDriver35.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        int int43 = hashMapTestDriver42.size();
        int int44 = hashMapTestDriver42.size();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set46 = hashMapTestDriver45.entrySet();
        experiment.util.Collection collection47 = hashMapTestDriver45.values();
        hashMapTestDriver45.clear();
        experiment.util.Set set49 = hashMapTestDriver45.keySet();
        java.lang.Object obj51 = hashMapTestDriver42.put((java.lang.Object) set49, (java.lang.Object) true);
        java.lang.Object obj52 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) hashMapTestDriver42);
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set54 = hashMapTestDriver53.entrySet();
        experiment.util.Collection collection55 = hashMapTestDriver53.values();
        experiment.util.Set set56 = hashMapTestDriver53.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        int int58 = hashMapTestDriver57.size();
        boolean boolean60 = hashMapTestDriver57.containsKey((java.lang.Object) (byte) 100);
        experiment.util.Set set61 = hashMapTestDriver57.keySet();
        java.lang.Object obj62 = hashMapTestDriver0.put((java.lang.Object) set56, (java.lang.Object) hashMapTestDriver57);
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        int int64 = hashMapTestDriver63.size();
        int int65 = hashMapTestDriver63.size();
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set67 = hashMapTestDriver66.entrySet();
        experiment.util.Collection collection68 = hashMapTestDriver66.values();
        hashMapTestDriver66.clear();
        experiment.util.Set set70 = hashMapTestDriver66.keySet();
        java.lang.Object obj72 = hashMapTestDriver63.put((java.lang.Object) set70, (java.lang.Object) true);
        experiment.util.Collection collection73 = hashMapTestDriver63.values();
        java.lang.Object obj74 = hashMapTestDriver57.get((java.lang.Object) collection73);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test059");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set13 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        int int15 = hashMapTestDriver14.size();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        hashMapTestDriver18.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver24.values();
        hashMapTestDriver24.clear();
        experiment.util.Set set28 = hashMapTestDriver24.keySet();
        java.lang.Object obj29 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver31);
        hashMapTestDriver30.clear();
        experiment.util.Collection collection36 = hashMapTestDriver30.values();
        experiment.util.Set set37 = hashMapTestDriver30.keySet();
        java.lang.Object obj39 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        java.lang.Object obj43 = hashMapTestDriver30.remove((java.lang.Object) set42);
        java.lang.Object obj44 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj45 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver30);
        int int46 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        int int48 = hashMapTestDriver47.size();
        java.lang.Object obj49 = hashMapTestDriver0.get((java.lang.Object) int48);
        experiment.util.Set set50 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test060");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.Set set7 = hashMapTestDriver5.entrySet();
        boolean boolean8 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver5);
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 100.0d);
        experiment.util.Set set11 = hashMapTestDriver4.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        int int13 = hashMapTestDriver12.size();
        boolean boolean15 = hashMapTestDriver12.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        hashMapTestDriver16.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Collection collection24 = hashMapTestDriver22.values();
        hashMapTestDriver22.clear();
        experiment.util.Set set26 = hashMapTestDriver22.keySet();
        java.lang.Object obj27 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver22);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        boolean boolean32 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver29);
        hashMapTestDriver28.clear();
        experiment.util.Collection collection34 = hashMapTestDriver28.values();
        experiment.util.Set set35 = hashMapTestDriver28.keySet();
        java.lang.Object obj37 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver28, (java.lang.Object) '4');
        java.lang.Object obj38 = hashMapTestDriver4.get((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean39 = hashMapTestDriver0.containsKey(obj38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test061");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj12 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver7);
        java.lang.Object obj14 = hashMapTestDriver0.remove((java.lang.Object) 1.0f);
        experiment.util.Collection collection15 = hashMapTestDriver0.values();
        int int16 = hashMapTestDriver0.size();
        experiment.util.Set set17 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test062");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        int int9 = hashMapTestDriver8.size();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver8);
        hashMapTestDriver0.clear();
        int int12 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test063");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set7 = hashMapTestDriver6.entrySet();
        experiment.util.Collection collection8 = hashMapTestDriver6.values();
        hashMapTestDriver6.clear();
        experiment.util.Set set10 = hashMapTestDriver6.keySet();
        java.lang.Object obj11 = hashMapTestDriver0.get((java.lang.Object) set10);
        java.lang.Class<?> wildcardClass12 = set10.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test064");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set13 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        int int15 = hashMapTestDriver14.size();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        hashMapTestDriver18.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver24.values();
        hashMapTestDriver24.clear();
        experiment.util.Set set28 = hashMapTestDriver24.keySet();
        java.lang.Object obj29 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver31);
        hashMapTestDriver30.clear();
        experiment.util.Collection collection36 = hashMapTestDriver30.values();
        experiment.util.Set set37 = hashMapTestDriver30.keySet();
        java.lang.Object obj39 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        java.lang.Object obj43 = hashMapTestDriver30.remove((java.lang.Object) set42);
        java.lang.Object obj44 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj45 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver30);
        int int46 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set50 = hashMapTestDriver49.entrySet();
        experiment.util.Set set51 = hashMapTestDriver49.entrySet();
        boolean boolean52 = hashMapTestDriver48.containsKey((java.lang.Object) hashMapTestDriver49);
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set54 = hashMapTestDriver53.keySet();
        java.lang.Object obj55 = hashMapTestDriver48.get((java.lang.Object) set54);
        boolean boolean56 = hashMapTestDriver48.isEmpty();
        java.lang.Object obj57 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver48);
        java.lang.Object obj58 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj59 = hashMapTestDriver0.get(obj58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test065");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) (short) -1);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        int int9 = hashMapTestDriver8.size();
        java.lang.Object obj11 = hashMapTestDriver8.remove((java.lang.Object) 10.0f);
        experiment.util.Set set12 = hashMapTestDriver8.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.entrySet();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        boolean boolean19 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver16);
        java.lang.Object obj20 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver13, (java.lang.Object) hashMapTestDriver15);
        java.lang.Object obj22 = hashMapTestDriver8.remove((java.lang.Object) 1.0f);
        experiment.util.Collection collection23 = hashMapTestDriver8.values();
        int int24 = hashMapTestDriver8.size();
        java.lang.Object obj25 = hashMapTestDriver0.get((java.lang.Object) int24);
        java.lang.Class<?> wildcardClass26 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test066");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        int int6 = hashMapTestDriver0.size();
        int int7 = hashMapTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test067");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.keySet();
        java.lang.Object obj14 = hashMapTestDriver7.get((java.lang.Object) set13);
        experiment.util.Set set15 = hashMapTestDriver7.entrySet();
        java.lang.Object obj17 = hashMapTestDriver4.put((java.lang.Object) set15, (java.lang.Object) 1.0d);
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set21 = hashMapTestDriver20.entrySet();
        experiment.util.Set set22 = hashMapTestDriver20.entrySet();
        boolean boolean23 = hashMapTestDriver19.containsKey((java.lang.Object) hashMapTestDriver20);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.keySet();
        java.lang.Object obj26 = hashMapTestDriver19.get((java.lang.Object) set25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj27 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, obj26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test068");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test069");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.Set set7 = hashMapTestDriver5.entrySet();
        boolean boolean8 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver5);
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        hashMapTestDriver10.clear();
        experiment.util.Set set14 = hashMapTestDriver10.keySet();
        java.lang.Object obj15 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        hashMapTestDriver16.clear();
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        experiment.util.Set set23 = hashMapTestDriver16.keySet();
        java.lang.Object obj25 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) '4');
        experiment.util.Collection collection26 = hashMapTestDriver16.values();
        experiment.util.Set set27 = hashMapTestDriver16.entrySet();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test070");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Collection collection10 = hashMapTestDriver8.values();
        experiment.util.Set set11 = hashMapTestDriver8.keySet();
        boolean boolean12 = hashMapTestDriver0.containsKey((java.lang.Object) set11);
        java.lang.Class<?> wildcardClass13 = set11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test071");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.Set set7 = hashMapTestDriver5.entrySet();
        boolean boolean8 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver5);
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        hashMapTestDriver10.clear();
        experiment.util.Set set14 = hashMapTestDriver10.keySet();
        java.lang.Object obj15 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) hashMapTestDriver10);
        experiment.util.Collection collection16 = hashMapTestDriver4.values();
        int int17 = hashMapTestDriver4.size();
        java.lang.Class<?> wildcardClass18 = hashMapTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test072");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.Collection collection7 = hashMapTestDriver0.values();
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        boolean boolean9 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test073");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        int int9 = hashMapTestDriver8.size();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver8);
        boolean boolean11 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = hashMapTestDriver0.remove(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test074");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set7 = hashMapTestDriver6.entrySet();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        boolean boolean9 = hashMapTestDriver5.containsKey((java.lang.Object) hashMapTestDriver6);
        java.lang.Object obj11 = hashMapTestDriver5.get((java.lang.Object) 100.0d);
        experiment.util.Set set12 = hashMapTestDriver5.entrySet();
        experiment.util.Set set13 = hashMapTestDriver5.keySet();
        boolean boolean14 = hashMapTestDriver0.containsKey((java.lang.Object) set13);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test075");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.entrySet();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        boolean boolean10 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set11 = hashMapTestDriver6.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        int int13 = hashMapTestDriver12.size();
        boolean boolean15 = hashMapTestDriver12.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        hashMapTestDriver16.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Collection collection24 = hashMapTestDriver22.values();
        hashMapTestDriver22.clear();
        experiment.util.Set set26 = hashMapTestDriver22.keySet();
        java.lang.Object obj27 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver22);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        boolean boolean32 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver29);
        hashMapTestDriver28.clear();
        experiment.util.Collection collection34 = hashMapTestDriver28.values();
        experiment.util.Set set35 = hashMapTestDriver28.keySet();
        java.lang.Object obj37 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver28, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.entrySet();
        experiment.util.Set set40 = hashMapTestDriver38.entrySet();
        java.lang.Object obj41 = hashMapTestDriver28.remove((java.lang.Object) set40);
        java.lang.Object obj42 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) hashMapTestDriver28);
        boolean boolean43 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver28);
        boolean boolean44 = hashMapTestDriver0.isEmpty();
        int int45 = hashMapTestDriver0.size();
        boolean boolean46 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        int int48 = hashMapTestDriver47.size();
        java.lang.Object obj50 = hashMapTestDriver47.remove((java.lang.Object) 10.0f);
        experiment.util.Set set51 = hashMapTestDriver47.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set53 = hashMapTestDriver52.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set56 = hashMapTestDriver55.entrySet();
        experiment.util.Set set57 = hashMapTestDriver55.entrySet();
        boolean boolean58 = hashMapTestDriver54.containsKey((java.lang.Object) hashMapTestDriver55);
        java.lang.Object obj59 = hashMapTestDriver47.put((java.lang.Object) hashMapTestDriver52, (java.lang.Object) hashMapTestDriver54);
        int int60 = hashMapTestDriver47.size();
        boolean boolean61 = hashMapTestDriver0.containsKey((java.lang.Object) int60);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test076");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.Collection collection7 = hashMapTestDriver5.values();
        java.lang.Object obj9 = hashMapTestDriver5.remove((java.lang.Object) 10.0f);
        java.lang.Object obj10 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = obj10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test077");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.Set set7 = hashMapTestDriver0.keySet();
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test078");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set13 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        int int15 = hashMapTestDriver14.size();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        hashMapTestDriver18.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver24.values();
        hashMapTestDriver24.clear();
        experiment.util.Set set28 = hashMapTestDriver24.keySet();
        java.lang.Object obj29 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver31);
        hashMapTestDriver30.clear();
        experiment.util.Collection collection36 = hashMapTestDriver30.values();
        experiment.util.Set set37 = hashMapTestDriver30.keySet();
        java.lang.Object obj39 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        java.lang.Object obj43 = hashMapTestDriver30.remove((java.lang.Object) set42);
        java.lang.Object obj44 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj45 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver30);
        int int46 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test079");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        int int10 = hashMapTestDriver9.size();
        java.lang.Object obj12 = hashMapTestDriver9.get((java.lang.Object) 10.0d);
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set14 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection15 = hashMapTestDriver0.values();
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = hashMapTestDriver0.containsKey(obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test080");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        int int2 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set4 = hashMapTestDriver3.entrySet();
        experiment.util.Collection collection5 = hashMapTestDriver3.values();
        hashMapTestDriver3.clear();
        experiment.util.Set set7 = hashMapTestDriver3.keySet();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) set7, (java.lang.Object) true);
        experiment.util.Collection collection10 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set12 = hashMapTestDriver11.entrySet();
        experiment.util.Collection collection13 = hashMapTestDriver11.values();
        experiment.util.Set set14 = hashMapTestDriver11.keySet();
        boolean boolean15 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver11);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test081");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        int int5 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test082");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver10.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.entrySet();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        boolean boolean19 = hashMapTestDriver16.isEmpty();
        experiment.util.Collection collection20 = hashMapTestDriver16.values();
        java.lang.Object obj21 = hashMapTestDriver13.get((java.lang.Object) collection20);
        experiment.util.Set set22 = hashMapTestDriver13.keySet();
        java.lang.Object obj23 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver10, (java.lang.Object) hashMapTestDriver13);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        boolean boolean28 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver25);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.keySet();
        java.lang.Object obj31 = hashMapTestDriver24.get((java.lang.Object) set30);
        experiment.util.Set set32 = hashMapTestDriver24.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        int int34 = hashMapTestDriver33.size();
        java.lang.Object obj36 = hashMapTestDriver33.get((java.lang.Object) 10.0d);
        boolean boolean37 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver33);
        java.lang.Object obj38 = hashMapTestDriver10.remove((java.lang.Object) hashMapTestDriver24);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test083");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        int int10 = hashMapTestDriver9.size();
        java.lang.Object obj12 = hashMapTestDriver9.get((java.lang.Object) 10.0d);
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Collection collection14 = hashMapTestDriver9.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test084");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        hashMapTestDriver0.clear();
        java.lang.Object obj9 = hashMapTestDriver0.get((java.lang.Object) 10.0f);
        boolean boolean10 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set11 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj14 = hashMapTestDriver12.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.entrySet();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        boolean boolean19 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver16);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set21 = hashMapTestDriver20.keySet();
        java.lang.Object obj22 = hashMapTestDriver15.get((java.lang.Object) set21);
        experiment.util.Set set23 = hashMapTestDriver15.entrySet();
        java.lang.Object obj25 = hashMapTestDriver12.put((java.lang.Object) set23, (java.lang.Object) 1.0d);
        hashMapTestDriver12.clear();
        java.lang.Object obj27 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        boolean boolean28 = hashMapTestDriver12.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test085");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        hashMapTestDriver7.clear();
        experiment.util.Collection collection13 = hashMapTestDriver7.values();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        int int16 = hashMapTestDriver15.size();
        java.lang.Object obj17 = hashMapTestDriver7.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver15);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 1L);
        experiment.util.Set set23 = hashMapTestDriver20.entrySet();
        java.lang.Object obj24 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver20);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        int int26 = hashMapTestDriver25.size();
        boolean boolean28 = hashMapTestDriver25.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj31 = hashMapTestDriver29.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set33 = hashMapTestDriver32.entrySet();
        experiment.util.Set set34 = hashMapTestDriver32.entrySet();
        boolean boolean35 = hashMapTestDriver32.isEmpty();
        experiment.util.Collection collection36 = hashMapTestDriver32.values();
        java.lang.Object obj37 = hashMapTestDriver29.get((java.lang.Object) collection36);
        experiment.util.Set set38 = hashMapTestDriver29.keySet();
        boolean boolean39 = hashMapTestDriver25.containsKey((java.lang.Object) set38);
        java.lang.Object obj40 = hashMapTestDriver15.remove((java.lang.Object) boolean39);
        boolean boolean41 = hashMapTestDriver0.containsKey((java.lang.Object) boolean39);
        java.lang.Class<?> wildcardClass42 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test086");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set7 = hashMapTestDriver6.entrySet();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        boolean boolean9 = hashMapTestDriver5.containsKey((java.lang.Object) hashMapTestDriver6);
        java.lang.Object obj11 = hashMapTestDriver5.get((java.lang.Object) 100.0d);
        experiment.util.Set set12 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        int int14 = hashMapTestDriver13.size();
        boolean boolean16 = hashMapTestDriver13.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        experiment.util.Set set20 = hashMapTestDriver18.entrySet();
        boolean boolean21 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver18);
        hashMapTestDriver17.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.entrySet();
        experiment.util.Collection collection25 = hashMapTestDriver23.values();
        hashMapTestDriver23.clear();
        experiment.util.Set set27 = hashMapTestDriver23.keySet();
        java.lang.Object obj28 = hashMapTestDriver13.put((java.lang.Object) hashMapTestDriver17, (java.lang.Object) hashMapTestDriver23);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set31 = hashMapTestDriver30.entrySet();
        experiment.util.Set set32 = hashMapTestDriver30.entrySet();
        boolean boolean33 = hashMapTestDriver29.containsKey((java.lang.Object) hashMapTestDriver30);
        hashMapTestDriver29.clear();
        experiment.util.Collection collection35 = hashMapTestDriver29.values();
        experiment.util.Set set36 = hashMapTestDriver29.keySet();
        java.lang.Object obj38 = hashMapTestDriver13.put((java.lang.Object) hashMapTestDriver29, (java.lang.Object) '4');
        java.lang.Object obj39 = hashMapTestDriver5.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set42 = hashMapTestDriver41.entrySet();
        experiment.util.Set set43 = hashMapTestDriver41.entrySet();
        boolean boolean44 = hashMapTestDriver40.containsKey((java.lang.Object) hashMapTestDriver41);
        hashMapTestDriver40.clear();
        experiment.util.Set set46 = hashMapTestDriver40.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        int int48 = hashMapTestDriver47.size();
        int int49 = hashMapTestDriver47.size();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set51 = hashMapTestDriver50.entrySet();
        experiment.util.Collection collection52 = hashMapTestDriver50.values();
        hashMapTestDriver50.clear();
        experiment.util.Set set54 = hashMapTestDriver50.keySet();
        java.lang.Object obj56 = hashMapTestDriver47.put((java.lang.Object) set54, (java.lang.Object) true);
        java.lang.Object obj57 = hashMapTestDriver5.put((java.lang.Object) hashMapTestDriver40, (java.lang.Object) hashMapTestDriver47);
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set59 = hashMapTestDriver58.entrySet();
        experiment.util.Collection collection60 = hashMapTestDriver58.values();
        experiment.util.Set set61 = hashMapTestDriver58.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        int int63 = hashMapTestDriver62.size();
        boolean boolean65 = hashMapTestDriver62.containsKey((java.lang.Object) (byte) 100);
        experiment.util.Set set66 = hashMapTestDriver62.keySet();
        java.lang.Object obj67 = hashMapTestDriver5.put((java.lang.Object) set61, (java.lang.Object) hashMapTestDriver62);
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        int int69 = hashMapTestDriver68.size();
        java.lang.Object obj71 = hashMapTestDriver68.remove((java.lang.Object) 10.0f);
        experiment.util.Set set72 = hashMapTestDriver68.keySet();
        java.lang.Object obj74 = hashMapTestDriver68.get((java.lang.Object) (short) -1);
        hashMapTestDriver68.clear();
        java.lang.Object obj76 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver62, (java.lang.Object) hashMapTestDriver68);
        hashMapTestDriver62.clear();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test087");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj12 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set13 = hashMapTestDriver7.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.entrySet();
        experiment.util.Collection collection16 = hashMapTestDriver14.values();
        hashMapTestDriver14.clear();
        experiment.util.Set set18 = hashMapTestDriver14.keySet();
        boolean boolean19 = hashMapTestDriver7.containsKey((java.lang.Object) set18);
        boolean boolean20 = hashMapTestDriver7.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test088");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        int int2 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set4 = hashMapTestDriver3.entrySet();
        experiment.util.Collection collection5 = hashMapTestDriver3.values();
        hashMapTestDriver3.clear();
        experiment.util.Set set7 = hashMapTestDriver3.keySet();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) set7, (java.lang.Object) true);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        boolean boolean15 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver12);
        java.lang.Object obj17 = hashMapTestDriver11.get((java.lang.Object) 100.0d);
        hashMapTestDriver11.clear();
        java.lang.Object obj20 = hashMapTestDriver11.get((java.lang.Object) 10.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        int int22 = hashMapTestDriver21.size();
        java.lang.Object obj24 = hashMapTestDriver21.remove((java.lang.Object) 10.0f);
        experiment.util.Set set25 = hashMapTestDriver21.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set27 = hashMapTestDriver26.entrySet();
        experiment.util.Collection collection28 = hashMapTestDriver26.values();
        java.lang.Object obj30 = hashMapTestDriver26.remove((java.lang.Object) 10.0f);
        java.lang.Object obj31 = hashMapTestDriver21.get((java.lang.Object) hashMapTestDriver26);
        java.lang.Object obj32 = hashMapTestDriver11.remove((java.lang.Object) hashMapTestDriver21);
        int int33 = hashMapTestDriver21.size();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.entrySet();
        experiment.util.Set set37 = hashMapTestDriver35.entrySet();
        boolean boolean38 = hashMapTestDriver34.containsKey((java.lang.Object) hashMapTestDriver35);
        hashMapTestDriver34.clear();
        experiment.util.Collection collection40 = hashMapTestDriver34.values();
        java.lang.Object obj41 = hashMapTestDriver21.remove((java.lang.Object) hashMapTestDriver34);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = hashMapTestDriver0.containsKey(obj41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test089");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        hashMapTestDriver0.clear();
        java.lang.Object obj9 = hashMapTestDriver0.get((java.lang.Object) 10.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        int int11 = hashMapTestDriver10.size();
        java.lang.Object obj13 = hashMapTestDriver10.remove((java.lang.Object) 10.0f);
        experiment.util.Set set14 = hashMapTestDriver10.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.entrySet();
        experiment.util.Collection collection17 = hashMapTestDriver15.values();
        java.lang.Object obj19 = hashMapTestDriver15.remove((java.lang.Object) 10.0f);
        java.lang.Object obj20 = hashMapTestDriver10.get((java.lang.Object) hashMapTestDriver15);
        java.lang.Object obj21 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver10);
        int int22 = hashMapTestDriver10.size();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.entrySet();
        experiment.util.Collection collection25 = hashMapTestDriver23.values();
        experiment.util.Set set26 = hashMapTestDriver23.keySet();
        java.lang.Object obj28 = hashMapTestDriver23.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Collection collection31 = hashMapTestDriver29.values();
        hashMapTestDriver29.clear();
        experiment.util.Set set33 = hashMapTestDriver29.keySet();
        java.lang.Object obj34 = hashMapTestDriver23.get((java.lang.Object) set33);
        boolean boolean35 = hashMapTestDriver10.containsKey((java.lang.Object) hashMapTestDriver23);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        int int37 = hashMapTestDriver36.size();
        boolean boolean39 = hashMapTestDriver36.containsKey((java.lang.Object) (byte) 100);
        int int40 = hashMapTestDriver36.size();
        boolean boolean41 = hashMapTestDriver10.containsKey((java.lang.Object) int40);
        int int42 = hashMapTestDriver10.size();
        experiment.util.Set set43 = hashMapTestDriver10.keySet();
        experiment.util.Collection collection44 = hashMapTestDriver10.values();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        int int46 = hashMapTestDriver45.size();
        java.lang.Object obj48 = hashMapTestDriver45.remove((java.lang.Object) 10.0f);
        experiment.util.Set set49 = hashMapTestDriver45.keySet();
        java.lang.Object obj51 = hashMapTestDriver45.get((java.lang.Object) (short) -1);
        hashMapTestDriver45.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        int int54 = hashMapTestDriver53.size();
        java.lang.Object obj56 = hashMapTestDriver53.remove((java.lang.Object) 10.0f);
        experiment.util.Set set57 = hashMapTestDriver53.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set59 = hashMapTestDriver58.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set62 = hashMapTestDriver61.entrySet();
        experiment.util.Set set63 = hashMapTestDriver61.entrySet();
        boolean boolean64 = hashMapTestDriver60.containsKey((java.lang.Object) hashMapTestDriver61);
        java.lang.Object obj65 = hashMapTestDriver53.put((java.lang.Object) hashMapTestDriver58, (java.lang.Object) hashMapTestDriver60);
        java.lang.Object obj67 = hashMapTestDriver53.remove((java.lang.Object) 1.0f);
        experiment.util.Collection collection68 = hashMapTestDriver53.values();
        int int69 = hashMapTestDriver53.size();
        java.lang.Object obj70 = hashMapTestDriver45.get((java.lang.Object) int69);
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        int int72 = hashMapTestDriver71.size();
        boolean boolean74 = hashMapTestDriver71.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver75 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver76 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set77 = hashMapTestDriver76.entrySet();
        experiment.util.Set set78 = hashMapTestDriver76.entrySet();
        boolean boolean79 = hashMapTestDriver75.containsKey((java.lang.Object) hashMapTestDriver76);
        hashMapTestDriver75.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver81 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set82 = hashMapTestDriver81.entrySet();
        experiment.util.Collection collection83 = hashMapTestDriver81.values();
        hashMapTestDriver81.clear();
        experiment.util.Set set85 = hashMapTestDriver81.keySet();
        java.lang.Object obj86 = hashMapTestDriver71.put((java.lang.Object) hashMapTestDriver75, (java.lang.Object) hashMapTestDriver81);
        experiment.util.Collection collection87 = hashMapTestDriver75.values();
        boolean boolean88 = hashMapTestDriver45.containsKey((java.lang.Object) collection87);
        java.lang.Object obj89 = hashMapTestDriver10.get((java.lang.Object) hashMapTestDriver45);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(obj89);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test090");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.Set set7 = hashMapTestDriver5.entrySet();
        boolean boolean8 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver5);
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        hashMapTestDriver10.clear();
        experiment.util.Set set14 = hashMapTestDriver10.keySet();
        java.lang.Object obj15 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        hashMapTestDriver16.clear();
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        experiment.util.Set set23 = hashMapTestDriver16.keySet();
        java.lang.Object obj25 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) '4');
        int int26 = hashMapTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test091");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        int int9 = hashMapTestDriver8.size();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver8);
        boolean boolean11 = hashMapTestDriver8.isEmpty();
        int int12 = hashMapTestDriver8.size();
        boolean boolean13 = hashMapTestDriver8.isEmpty();
        experiment.util.Set set14 = hashMapTestDriver8.entrySet();
        experiment.util.Set set15 = hashMapTestDriver8.keySet();
        java.lang.Object obj16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = hashMapTestDriver8.get(obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test092");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) wildcardClass7);
        java.lang.Class<?> wildcardClass9 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test093");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.Set set7 = hashMapTestDriver5.entrySet();
        boolean boolean8 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver5);
        boolean boolean10 = hashMapTestDriver4.containsKey((java.lang.Object) ' ');
        java.lang.Object obj11 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.Collection collection12 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass13 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test094");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test095");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        experiment.util.Set set10 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test096");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        int int9 = hashMapTestDriver8.size();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver8);
        boolean boolean11 = hashMapTestDriver0.isEmpty();
        int int12 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test097");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.Set set7 = hashMapTestDriver5.entrySet();
        boolean boolean8 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver5);
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        hashMapTestDriver10.clear();
        experiment.util.Set set14 = hashMapTestDriver10.keySet();
        java.lang.Object obj15 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        hashMapTestDriver16.clear();
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        experiment.util.Set set23 = hashMapTestDriver16.keySet();
        java.lang.Object obj25 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set31 = hashMapTestDriver30.entrySet();
        experiment.util.Set set32 = hashMapTestDriver30.entrySet();
        boolean boolean33 = hashMapTestDriver29.containsKey((java.lang.Object) hashMapTestDriver30);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set35 = hashMapTestDriver34.keySet();
        java.lang.Object obj36 = hashMapTestDriver29.get((java.lang.Object) set35);
        experiment.util.Set set37 = hashMapTestDriver29.entrySet();
        java.lang.Object obj39 = hashMapTestDriver26.put((java.lang.Object) set37, (java.lang.Object) 1.0d);
        java.lang.Object obj40 = hashMapTestDriver0.get((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test098");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.Set set3 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        int int6 = hashMapTestDriver5.size();
        java.lang.Object obj8 = hashMapTestDriver5.remove((java.lang.Object) 10.0f);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        java.lang.Object obj14 = hashMapTestDriver10.remove((java.lang.Object) 10.0f);
        java.lang.Object obj15 = hashMapTestDriver5.get((java.lang.Object) hashMapTestDriver10);
        java.lang.Object obj16 = hashMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) hashMapTestDriver10);
        experiment.util.Collection collection17 = hashMapTestDriver10.values();
        experiment.util.Set set18 = hashMapTestDriver10.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test099");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver10.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.entrySet();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        boolean boolean19 = hashMapTestDriver16.isEmpty();
        experiment.util.Collection collection20 = hashMapTestDriver16.values();
        java.lang.Object obj21 = hashMapTestDriver13.get((java.lang.Object) collection20);
        experiment.util.Set set22 = hashMapTestDriver13.keySet();
        java.lang.Object obj23 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver10, (java.lang.Object) hashMapTestDriver13);
        experiment.util.Collection collection24 = hashMapTestDriver13.values();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        boolean boolean32 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver29);
        hashMapTestDriver28.clear();
        experiment.util.Collection collection34 = hashMapTestDriver28.values();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        int int37 = hashMapTestDriver36.size();
        java.lang.Object obj38 = hashMapTestDriver28.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver36);
        boolean boolean39 = hashMapTestDriver28.isEmpty();
        java.lang.Object obj40 = hashMapTestDriver25.remove((java.lang.Object) boolean39);
        java.lang.Object obj41 = hashMapTestDriver13.remove((java.lang.Object) boolean39);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test100");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        int int2 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        int int4 = hashMapTestDriver3.size();
        experiment.util.Collection collection5 = hashMapTestDriver3.values();
        boolean boolean6 = hashMapTestDriver3.isEmpty();
        experiment.util.Collection collection7 = hashMapTestDriver3.values();
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) collection7);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        int int10 = hashMapTestDriver9.size();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.entrySet();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        boolean boolean17 = hashMapTestDriver13.containsKey((java.lang.Object) hashMapTestDriver14);
        hashMapTestDriver13.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Collection collection21 = hashMapTestDriver19.values();
        hashMapTestDriver19.clear();
        experiment.util.Set set23 = hashMapTestDriver19.keySet();
        java.lang.Object obj24 = hashMapTestDriver9.put((java.lang.Object) hashMapTestDriver13, (java.lang.Object) hashMapTestDriver19);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set27 = hashMapTestDriver26.entrySet();
        experiment.util.Set set28 = hashMapTestDriver26.entrySet();
        boolean boolean29 = hashMapTestDriver25.containsKey((java.lang.Object) hashMapTestDriver26);
        hashMapTestDriver25.clear();
        experiment.util.Collection collection31 = hashMapTestDriver25.values();
        experiment.util.Set set32 = hashMapTestDriver25.keySet();
        java.lang.Object obj34 = hashMapTestDriver9.put((java.lang.Object) hashMapTestDriver25, (java.lang.Object) '4');
        java.lang.Object obj35 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver25);
        experiment.util.Collection collection36 = hashMapTestDriver25.values();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test101");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) wildcardClass7);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        boolean boolean13 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.keySet();
        java.lang.Object obj16 = hashMapTestDriver9.get((java.lang.Object) set15);
        java.lang.Object obj17 = hashMapTestDriver0.get((java.lang.Object) set15);
        boolean boolean18 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set19 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass20 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test102");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set4 = hashMapTestDriver3.entrySet();
        experiment.util.Set set5 = hashMapTestDriver3.entrySet();
        boolean boolean6 = hashMapTestDriver2.containsKey((java.lang.Object) hashMapTestDriver3);
        experiment.util.Set set7 = hashMapTestDriver2.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        int int9 = hashMapTestDriver8.size();
        boolean boolean11 = hashMapTestDriver8.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.entrySet();
        experiment.util.Set set15 = hashMapTestDriver13.entrySet();
        boolean boolean16 = hashMapTestDriver12.containsKey((java.lang.Object) hashMapTestDriver13);
        hashMapTestDriver12.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        experiment.util.Collection collection20 = hashMapTestDriver18.values();
        hashMapTestDriver18.clear();
        experiment.util.Set set22 = hashMapTestDriver18.keySet();
        java.lang.Object obj23 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver12, (java.lang.Object) hashMapTestDriver18);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        boolean boolean28 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver25);
        hashMapTestDriver24.clear();
        experiment.util.Collection collection30 = hashMapTestDriver24.values();
        experiment.util.Set set31 = hashMapTestDriver24.keySet();
        java.lang.Object obj33 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set35 = hashMapTestDriver34.entrySet();
        experiment.util.Set set36 = hashMapTestDriver34.entrySet();
        java.lang.Object obj37 = hashMapTestDriver24.remove((java.lang.Object) set36);
        java.lang.Object obj38 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver2, (java.lang.Object) hashMapTestDriver24);
        experiment.util.Set set39 = hashMapTestDriver24.entrySet();
        java.lang.Class<?> wildcardClass40 = set39.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test103");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Collection collection11 = hashMapTestDriver9.values();
        hashMapTestDriver9.clear();
        experiment.util.Set set13 = hashMapTestDriver9.keySet();
        experiment.util.Collection collection14 = hashMapTestDriver9.values();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set16 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test104");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.entrySet();
        experiment.util.Set set6 = hashMapTestDriver4.entrySet();
        boolean boolean7 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj10 = hashMapTestDriver3.get((java.lang.Object) set9);
        experiment.util.Set set11 = hashMapTestDriver3.entrySet();
        java.lang.Object obj13 = hashMapTestDriver0.put((java.lang.Object) set11, (java.lang.Object) 1.0d);
        hashMapTestDriver0.clear();
        experiment.util.Set set15 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test105");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        int int8 = hashMapTestDriver7.size();
        java.lang.Object obj10 = hashMapTestDriver7.remove((java.lang.Object) 10.0f);
        experiment.util.Set set11 = hashMapTestDriver7.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.entrySet();
        experiment.util.Set set17 = hashMapTestDriver15.entrySet();
        boolean boolean18 = hashMapTestDriver14.containsKey((java.lang.Object) hashMapTestDriver15);
        java.lang.Object obj19 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver12, (java.lang.Object) hashMapTestDriver14);
        java.lang.Object obj21 = hashMapTestDriver7.remove((java.lang.Object) 1.0f);
        experiment.util.Collection collection22 = hashMapTestDriver7.values();
        int int23 = hashMapTestDriver7.size();
        experiment.util.Set set24 = hashMapTestDriver7.keySet();
        boolean boolean25 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver7);
        hashMapTestDriver7.clear();
        boolean boolean27 = hashMapTestDriver7.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test106");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj12 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver7);
        java.lang.Object obj14 = hashMapTestDriver0.remove((java.lang.Object) 1.0f);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection16 = hashMapTestDriver0.values();
        int int17 = hashMapTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test107");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set4 = hashMapTestDriver3.entrySet();
        experiment.util.Collection collection5 = hashMapTestDriver3.values();
        experiment.util.Set set6 = hashMapTestDriver3.keySet();
        java.lang.Object obj8 = hashMapTestDriver3.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        boolean boolean15 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver12);
        experiment.util.Set set16 = hashMapTestDriver11.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        int int18 = hashMapTestDriver17.size();
        boolean boolean20 = hashMapTestDriver17.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Set set24 = hashMapTestDriver22.entrySet();
        boolean boolean25 = hashMapTestDriver21.containsKey((java.lang.Object) hashMapTestDriver22);
        hashMapTestDriver21.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set28 = hashMapTestDriver27.entrySet();
        experiment.util.Collection collection29 = hashMapTestDriver27.values();
        hashMapTestDriver27.clear();
        experiment.util.Set set31 = hashMapTestDriver27.keySet();
        java.lang.Object obj32 = hashMapTestDriver17.put((java.lang.Object) hashMapTestDriver21, (java.lang.Object) hashMapTestDriver27);
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set35 = hashMapTestDriver34.entrySet();
        experiment.util.Set set36 = hashMapTestDriver34.entrySet();
        boolean boolean37 = hashMapTestDriver33.containsKey((java.lang.Object) hashMapTestDriver34);
        hashMapTestDriver33.clear();
        experiment.util.Collection collection39 = hashMapTestDriver33.values();
        experiment.util.Set set40 = hashMapTestDriver33.keySet();
        java.lang.Object obj42 = hashMapTestDriver17.put((java.lang.Object) hashMapTestDriver33, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.entrySet();
        experiment.util.Set set45 = hashMapTestDriver43.entrySet();
        java.lang.Object obj46 = hashMapTestDriver33.remove((java.lang.Object) set45);
        java.lang.Object obj47 = hashMapTestDriver9.put((java.lang.Object) hashMapTestDriver11, (java.lang.Object) hashMapTestDriver33);
        java.lang.Object obj48 = hashMapTestDriver3.get((java.lang.Object) hashMapTestDriver33);
        int int49 = hashMapTestDriver3.size();
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set53 = hashMapTestDriver52.entrySet();
        experiment.util.Set set54 = hashMapTestDriver52.entrySet();
        boolean boolean55 = hashMapTestDriver51.containsKey((java.lang.Object) hashMapTestDriver52);
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set57 = hashMapTestDriver56.keySet();
        java.lang.Object obj58 = hashMapTestDriver51.get((java.lang.Object) set57);
        boolean boolean59 = hashMapTestDriver51.isEmpty();
        java.lang.Object obj60 = hashMapTestDriver3.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver51);
        boolean boolean61 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver3);
        experiment.util.Set set62 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass63 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test108");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.entrySet();
        experiment.util.Set set6 = hashMapTestDriver4.entrySet();
        boolean boolean7 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj10 = hashMapTestDriver3.get((java.lang.Object) set9);
        experiment.util.Set set11 = hashMapTestDriver3.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        experiment.util.Collection collection14 = hashMapTestDriver12.values();
        hashMapTestDriver12.clear();
        experiment.util.Set set16 = hashMapTestDriver12.keySet();
        experiment.util.Collection collection17 = hashMapTestDriver12.values();
        java.lang.Object obj18 = hashMapTestDriver3.remove((java.lang.Object) hashMapTestDriver12);
        experiment.util.Collection collection19 = hashMapTestDriver12.values();
        java.lang.Object obj20 = hashMapTestDriver0.remove((java.lang.Object) collection19);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test109");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set13 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        int int15 = hashMapTestDriver14.size();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        hashMapTestDriver18.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver24.values();
        hashMapTestDriver24.clear();
        experiment.util.Set set28 = hashMapTestDriver24.keySet();
        java.lang.Object obj29 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver31);
        hashMapTestDriver30.clear();
        experiment.util.Collection collection36 = hashMapTestDriver30.values();
        experiment.util.Set set37 = hashMapTestDriver30.keySet();
        java.lang.Object obj39 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        java.lang.Object obj43 = hashMapTestDriver30.remove((java.lang.Object) set42);
        java.lang.Object obj44 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj45 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver30);
        int int46 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set50 = hashMapTestDriver49.entrySet();
        experiment.util.Set set51 = hashMapTestDriver49.entrySet();
        boolean boolean52 = hashMapTestDriver48.containsKey((java.lang.Object) hashMapTestDriver49);
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set54 = hashMapTestDriver53.keySet();
        java.lang.Object obj55 = hashMapTestDriver48.get((java.lang.Object) set54);
        boolean boolean56 = hashMapTestDriver48.isEmpty();
        java.lang.Object obj57 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver48);
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set60 = hashMapTestDriver59.entrySet();
        experiment.util.Set set61 = hashMapTestDriver59.entrySet();
        boolean boolean62 = hashMapTestDriver58.containsKey((java.lang.Object) hashMapTestDriver59);
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set64 = hashMapTestDriver63.keySet();
        java.lang.Object obj65 = hashMapTestDriver58.get((java.lang.Object) set64);
        experiment.util.Set set66 = hashMapTestDriver58.entrySet();
        java.lang.Object obj67 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj68 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver58, obj67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set66);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test110");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        int int8 = hashMapTestDriver7.size();
        boolean boolean10 = hashMapTestDriver7.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        boolean boolean15 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver12);
        hashMapTestDriver11.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Collection collection19 = hashMapTestDriver17.values();
        hashMapTestDriver17.clear();
        experiment.util.Set set21 = hashMapTestDriver17.keySet();
        java.lang.Object obj22 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver11, (java.lang.Object) hashMapTestDriver17);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Set set26 = hashMapTestDriver24.entrySet();
        boolean boolean27 = hashMapTestDriver23.containsKey((java.lang.Object) hashMapTestDriver24);
        hashMapTestDriver23.clear();
        experiment.util.Collection collection29 = hashMapTestDriver23.values();
        experiment.util.Set set30 = hashMapTestDriver23.keySet();
        java.lang.Object obj32 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver23, (java.lang.Object) '4');
        java.lang.Object obj33 = hashMapTestDriver0.put((java.lang.Object) (-1.0f), (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set35 = hashMapTestDriver34.entrySet();
        experiment.util.Collection collection36 = hashMapTestDriver34.values();
        hashMapTestDriver34.clear();
        java.lang.Object obj38 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver34);
        experiment.util.Set set39 = hashMapTestDriver34.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test111");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj12 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.entrySet();
        experiment.util.Collection collection15 = hashMapTestDriver13.values();
        experiment.util.Set set16 = hashMapTestDriver13.keySet();
        java.lang.Object obj18 = hashMapTestDriver13.get((java.lang.Object) 0.0d);
        experiment.util.Set set19 = hashMapTestDriver13.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        int int21 = hashMapTestDriver20.size();
        java.lang.Object obj23 = hashMapTestDriver20.remove((java.lang.Object) 10.0f);
        experiment.util.Set set24 = hashMapTestDriver20.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.entrySet();
        experiment.util.Set set30 = hashMapTestDriver28.entrySet();
        boolean boolean31 = hashMapTestDriver27.containsKey((java.lang.Object) hashMapTestDriver28);
        java.lang.Object obj32 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver25, (java.lang.Object) hashMapTestDriver27);
        java.lang.Object obj34 = hashMapTestDriver20.remove((java.lang.Object) 1.0f);
        experiment.util.Collection collection35 = hashMapTestDriver20.values();
        int int36 = hashMapTestDriver20.size();
        java.lang.Object obj37 = hashMapTestDriver5.put((java.lang.Object) hashMapTestDriver13, (java.lang.Object) int36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test112");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.entrySet();
        experiment.util.Set set6 = hashMapTestDriver4.entrySet();
        boolean boolean7 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver4);
        hashMapTestDriver3.clear();
        experiment.util.Collection collection9 = hashMapTestDriver3.values();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        int int12 = hashMapTestDriver11.size();
        java.lang.Object obj13 = hashMapTestDriver3.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver11);
        boolean boolean14 = hashMapTestDriver3.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) boolean14);
        boolean boolean16 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test113");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        boolean boolean4 = hashMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass5 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test114");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) wildcardClass7);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        boolean boolean13 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.keySet();
        java.lang.Object obj16 = hashMapTestDriver9.get((java.lang.Object) set15);
        java.lang.Object obj17 = hashMapTestDriver0.get((java.lang.Object) set15);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        java.lang.Object obj24 = hashMapTestDriver18.get((java.lang.Object) 100.0d);
        hashMapTestDriver18.clear();
        experiment.util.Set set26 = hashMapTestDriver18.entrySet();
        experiment.util.Set set27 = hashMapTestDriver18.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        boolean boolean32 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver29);
        boolean boolean34 = hashMapTestDriver28.containsKey((java.lang.Object) (short) 100);
        experiment.util.Collection collection35 = hashMapTestDriver28.values();
        hashMapTestDriver28.clear();
        java.lang.Object obj37 = hashMapTestDriver0.put((java.lang.Object) set27, (java.lang.Object) hashMapTestDriver28);
        java.lang.Class<?> wildcardClass38 = set27.getClass();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test115");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        experiment.util.Set set7 = hashMapTestDriver0.keySet();
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test116");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        int int2 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        int int4 = hashMapTestDriver3.size();
        experiment.util.Collection collection5 = hashMapTestDriver3.values();
        boolean boolean6 = hashMapTestDriver3.isEmpty();
        experiment.util.Collection collection7 = hashMapTestDriver3.values();
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) collection7);
        experiment.util.Set set9 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection10 = hashMapTestDriver0.values();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test117");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set13 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        int int15 = hashMapTestDriver14.size();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        hashMapTestDriver18.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver24.values();
        hashMapTestDriver24.clear();
        experiment.util.Set set28 = hashMapTestDriver24.keySet();
        java.lang.Object obj29 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver31);
        hashMapTestDriver30.clear();
        experiment.util.Collection collection36 = hashMapTestDriver30.values();
        experiment.util.Set set37 = hashMapTestDriver30.keySet();
        java.lang.Object obj39 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        java.lang.Object obj43 = hashMapTestDriver30.remove((java.lang.Object) set42);
        java.lang.Object obj44 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj45 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver30);
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set48 = hashMapTestDriver47.entrySet();
        experiment.util.Set set49 = hashMapTestDriver47.entrySet();
        boolean boolean50 = hashMapTestDriver46.containsKey((java.lang.Object) hashMapTestDriver47);
        hashMapTestDriver46.clear();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        boolean boolean54 = hashMapTestDriver46.containsKey((java.lang.Object) wildcardClass53);
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        int int56 = hashMapTestDriver55.size();
        java.lang.Object obj58 = hashMapTestDriver55.remove((java.lang.Object) 10.0f);
        experiment.util.Set set59 = hashMapTestDriver55.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set61 = hashMapTestDriver60.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set64 = hashMapTestDriver63.entrySet();
        experiment.util.Set set65 = hashMapTestDriver63.entrySet();
        boolean boolean66 = hashMapTestDriver62.containsKey((java.lang.Object) hashMapTestDriver63);
        java.lang.Object obj67 = hashMapTestDriver55.put((java.lang.Object) hashMapTestDriver60, (java.lang.Object) hashMapTestDriver62);
        java.lang.Class<?> wildcardClass68 = hashMapTestDriver60.getClass();
        java.lang.Object obj69 = hashMapTestDriver0.put((java.lang.Object) wildcardClass53, (java.lang.Object) hashMapTestDriver60);
        experiment.util.Set set70 = hashMapTestDriver0.keySet();
        int int71 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test118");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set13 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        int int15 = hashMapTestDriver14.size();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        hashMapTestDriver18.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver24.values();
        hashMapTestDriver24.clear();
        experiment.util.Set set28 = hashMapTestDriver24.keySet();
        java.lang.Object obj29 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver31);
        hashMapTestDriver30.clear();
        experiment.util.Collection collection36 = hashMapTestDriver30.values();
        experiment.util.Set set37 = hashMapTestDriver30.keySet();
        java.lang.Object obj39 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        java.lang.Object obj43 = hashMapTestDriver30.remove((java.lang.Object) set42);
        java.lang.Object obj44 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj45 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver30);
        int int46 = hashMapTestDriver0.size();
        boolean boolean47 = hashMapTestDriver0.isEmpty();
        experiment.util.Collection collection48 = hashMapTestDriver0.values();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(collection48);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test119");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        int int8 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        boolean boolean13 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver10);
        java.lang.Object obj15 = hashMapTestDriver9.get((java.lang.Object) 100.0d);
        hashMapTestDriver9.clear();
        java.lang.Object obj18 = hashMapTestDriver9.get((java.lang.Object) 10.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        int int20 = hashMapTestDriver19.size();
        java.lang.Object obj22 = hashMapTestDriver19.remove((java.lang.Object) 10.0f);
        experiment.util.Set set23 = hashMapTestDriver19.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver24.values();
        java.lang.Object obj28 = hashMapTestDriver24.remove((java.lang.Object) 10.0f);
        java.lang.Object obj29 = hashMapTestDriver19.get((java.lang.Object) hashMapTestDriver24);
        java.lang.Object obj30 = hashMapTestDriver9.remove((java.lang.Object) hashMapTestDriver19);
        experiment.util.Set set31 = hashMapTestDriver9.keySet();
        java.lang.Object obj32 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test120");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        hashMapTestDriver0.clear();
        hashMapTestDriver0.clear();
        boolean boolean9 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test121");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.entrySet();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        boolean boolean10 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set11 = hashMapTestDriver6.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        int int13 = hashMapTestDriver12.size();
        boolean boolean15 = hashMapTestDriver12.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        hashMapTestDriver16.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Collection collection24 = hashMapTestDriver22.values();
        hashMapTestDriver22.clear();
        experiment.util.Set set26 = hashMapTestDriver22.keySet();
        java.lang.Object obj27 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver22);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        boolean boolean32 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver29);
        hashMapTestDriver28.clear();
        experiment.util.Collection collection34 = hashMapTestDriver28.values();
        experiment.util.Set set35 = hashMapTestDriver28.keySet();
        java.lang.Object obj37 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver28, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.entrySet();
        experiment.util.Set set40 = hashMapTestDriver38.entrySet();
        java.lang.Object obj41 = hashMapTestDriver28.remove((java.lang.Object) set40);
        java.lang.Object obj42 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) hashMapTestDriver28);
        boolean boolean43 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver28);
        hashMapTestDriver28.clear();
        int int45 = hashMapTestDriver28.size();
        experiment.util.Set set46 = hashMapTestDriver28.keySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test122");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.Set set7 = hashMapTestDriver5.entrySet();
        boolean boolean8 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver5);
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        hashMapTestDriver10.clear();
        experiment.util.Set set14 = hashMapTestDriver10.keySet();
        java.lang.Object obj15 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        hashMapTestDriver16.clear();
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        experiment.util.Set set23 = hashMapTestDriver16.keySet();
        java.lang.Object obj25 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set27 = hashMapTestDriver26.entrySet();
        experiment.util.Set set28 = hashMapTestDriver26.entrySet();
        java.lang.Object obj29 = hashMapTestDriver16.remove((java.lang.Object) set28);
        experiment.util.Set set30 = hashMapTestDriver16.entrySet();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test123");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.Set set3 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        int int6 = hashMapTestDriver5.size();
        java.lang.Object obj8 = hashMapTestDriver5.remove((java.lang.Object) 10.0f);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        java.lang.Object obj14 = hashMapTestDriver10.remove((java.lang.Object) 10.0f);
        java.lang.Object obj15 = hashMapTestDriver5.get((java.lang.Object) hashMapTestDriver10);
        java.lang.Object obj16 = hashMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) hashMapTestDriver10);
        experiment.util.Collection collection17 = hashMapTestDriver0.values();
        boolean boolean18 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set19 = hashMapTestDriver0.entrySet();
        int int20 = hashMapTestDriver0.size();
        experiment.util.Collection collection21 = hashMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test124");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.Set set3 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        int int6 = hashMapTestDriver5.size();
        java.lang.Object obj8 = hashMapTestDriver5.remove((java.lang.Object) 10.0f);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        java.lang.Object obj14 = hashMapTestDriver10.remove((java.lang.Object) 10.0f);
        java.lang.Object obj15 = hashMapTestDriver5.get((java.lang.Object) hashMapTestDriver10);
        java.lang.Object obj16 = hashMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) hashMapTestDriver10);
        experiment.util.Collection collection17 = hashMapTestDriver0.values();
        boolean boolean18 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set19 = hashMapTestDriver0.entrySet();
        experiment.util.Set set20 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test125");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        int int4 = hashMapTestDriver3.size();
        boolean boolean6 = hashMapTestDriver3.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver7.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        boolean boolean13 = hashMapTestDriver10.isEmpty();
        experiment.util.Collection collection14 = hashMapTestDriver10.values();
        java.lang.Object obj15 = hashMapTestDriver7.get((java.lang.Object) collection14);
        experiment.util.Set set16 = hashMapTestDriver7.keySet();
        boolean boolean17 = hashMapTestDriver3.containsKey((java.lang.Object) set16);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        int int19 = hashMapTestDriver18.size();
        java.lang.Object obj21 = hashMapTestDriver18.remove((java.lang.Object) 10.0f);
        experiment.util.Set set22 = hashMapTestDriver18.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set27 = hashMapTestDriver26.entrySet();
        experiment.util.Set set28 = hashMapTestDriver26.entrySet();
        boolean boolean29 = hashMapTestDriver25.containsKey((java.lang.Object) hashMapTestDriver26);
        java.lang.Object obj30 = hashMapTestDriver18.put((java.lang.Object) hashMapTestDriver23, (java.lang.Object) hashMapTestDriver25);
        java.lang.Object obj32 = hashMapTestDriver18.remove((java.lang.Object) 1.0f);
        java.lang.Object obj33 = hashMapTestDriver3.get((java.lang.Object) hashMapTestDriver18);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        int int35 = hashMapTestDriver34.size();
        java.lang.Object obj37 = hashMapTestDriver34.remove((java.lang.Object) 10.0f);
        experiment.util.Set set38 = hashMapTestDriver34.keySet();
        hashMapTestDriver34.clear();
        int int40 = hashMapTestDriver34.size();
        hashMapTestDriver34.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.entrySet();
        experiment.util.Set set45 = hashMapTestDriver43.entrySet();
        boolean boolean46 = hashMapTestDriver42.containsKey((java.lang.Object) hashMapTestDriver43);
        hashMapTestDriver42.clear();
        experiment.util.Collection collection48 = hashMapTestDriver42.values();
        experiment.util.Collection collection49 = hashMapTestDriver42.values();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set52 = hashMapTestDriver51.entrySet();
        experiment.util.Set set53 = hashMapTestDriver51.entrySet();
        boolean boolean54 = hashMapTestDriver50.containsKey((java.lang.Object) hashMapTestDriver51);
        java.lang.Object obj56 = hashMapTestDriver50.get((java.lang.Object) 100.0d);
        boolean boolean57 = hashMapTestDriver50.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set60 = hashMapTestDriver59.entrySet();
        experiment.util.Set set61 = hashMapTestDriver59.entrySet();
        boolean boolean62 = hashMapTestDriver58.containsKey((java.lang.Object) hashMapTestDriver59);
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set64 = hashMapTestDriver63.keySet();
        java.lang.Object obj65 = hashMapTestDriver58.get((java.lang.Object) set64);
        experiment.util.Set set66 = hashMapTestDriver58.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        int int68 = hashMapTestDriver67.size();
        java.lang.Object obj70 = hashMapTestDriver67.remove((java.lang.Object) 10.0f);
        java.lang.Object obj71 = hashMapTestDriver50.put((java.lang.Object) hashMapTestDriver58, (java.lang.Object) 10.0f);
        java.lang.Object obj72 = hashMapTestDriver34.put((java.lang.Object) hashMapTestDriver42, (java.lang.Object) hashMapTestDriver50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj73 = hashMapTestDriver0.put(obj33, (java.lang.Object) hashMapTestDriver50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj72);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test126");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        int int8 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test127");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test128");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.Set set3 = hashMapTestDriver0.entrySet();
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test129");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Collection collection10 = hashMapTestDriver8.values();
        experiment.util.Set set11 = hashMapTestDriver8.keySet();
        boolean boolean12 = hashMapTestDriver0.containsKey((java.lang.Object) set11);
        hashMapTestDriver0.clear();
        experiment.util.Set set14 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.entrySet();
        experiment.util.Collection collection17 = hashMapTestDriver15.values();
        experiment.util.Set set18 = hashMapTestDriver15.keySet();
        java.lang.Object obj20 = hashMapTestDriver15.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection22 = hashMapTestDriver21.values();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Set set26 = hashMapTestDriver24.entrySet();
        boolean boolean27 = hashMapTestDriver23.containsKey((java.lang.Object) hashMapTestDriver24);
        experiment.util.Set set28 = hashMapTestDriver23.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        int int30 = hashMapTestDriver29.size();
        boolean boolean32 = hashMapTestDriver29.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set35 = hashMapTestDriver34.entrySet();
        experiment.util.Set set36 = hashMapTestDriver34.entrySet();
        boolean boolean37 = hashMapTestDriver33.containsKey((java.lang.Object) hashMapTestDriver34);
        hashMapTestDriver33.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set40 = hashMapTestDriver39.entrySet();
        experiment.util.Collection collection41 = hashMapTestDriver39.values();
        hashMapTestDriver39.clear();
        experiment.util.Set set43 = hashMapTestDriver39.keySet();
        java.lang.Object obj44 = hashMapTestDriver29.put((java.lang.Object) hashMapTestDriver33, (java.lang.Object) hashMapTestDriver39);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set47 = hashMapTestDriver46.entrySet();
        experiment.util.Set set48 = hashMapTestDriver46.entrySet();
        boolean boolean49 = hashMapTestDriver45.containsKey((java.lang.Object) hashMapTestDriver46);
        hashMapTestDriver45.clear();
        experiment.util.Collection collection51 = hashMapTestDriver45.values();
        experiment.util.Set set52 = hashMapTestDriver45.keySet();
        java.lang.Object obj54 = hashMapTestDriver29.put((java.lang.Object) hashMapTestDriver45, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set56 = hashMapTestDriver55.entrySet();
        experiment.util.Set set57 = hashMapTestDriver55.entrySet();
        java.lang.Object obj58 = hashMapTestDriver45.remove((java.lang.Object) set57);
        java.lang.Object obj59 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver23, (java.lang.Object) hashMapTestDriver45);
        java.lang.Object obj60 = hashMapTestDriver15.get((java.lang.Object) hashMapTestDriver45);
        int int61 = hashMapTestDriver15.size();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        int int63 = hashMapTestDriver62.size();
        java.lang.Object obj64 = hashMapTestDriver15.get((java.lang.Object) int63);
        java.lang.Class<?> wildcardClass65 = hashMapTestDriver15.getClass();
        java.lang.Object obj66 = hashMapTestDriver0.remove((java.lang.Object) wildcardClass65);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test130");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        int int5 = hashMapTestDriver4.size();
        java.lang.Object obj7 = hashMapTestDriver4.remove((java.lang.Object) 10.0f);
        experiment.util.Set set8 = hashMapTestDriver4.keySet();
        hashMapTestDriver4.clear();
        int int10 = hashMapTestDriver4.size();
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        experiment.util.Collection collection14 = hashMapTestDriver12.values();
        experiment.util.Set set15 = hashMapTestDriver12.keySet();
        boolean boolean16 = hashMapTestDriver4.containsKey((java.lang.Object) set15);
        boolean boolean17 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver4);
        java.lang.Class<?> wildcardClass18 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test131");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        hashMapTestDriver8.clear();
        experiment.util.Collection collection14 = hashMapTestDriver8.values();
        experiment.util.Collection collection15 = hashMapTestDriver8.values();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        java.lang.Object obj22 = hashMapTestDriver16.get((java.lang.Object) 100.0d);
        boolean boolean23 = hashMapTestDriver16.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        boolean boolean28 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver25);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.keySet();
        java.lang.Object obj31 = hashMapTestDriver24.get((java.lang.Object) set30);
        experiment.util.Set set32 = hashMapTestDriver24.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        int int34 = hashMapTestDriver33.size();
        java.lang.Object obj36 = hashMapTestDriver33.remove((java.lang.Object) 10.0f);
        java.lang.Object obj37 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) 10.0f);
        java.lang.Object obj38 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver16);
        int int39 = hashMapTestDriver8.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test132");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.Set set7 = hashMapTestDriver5.entrySet();
        boolean boolean8 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver5);
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        hashMapTestDriver10.clear();
        experiment.util.Set set14 = hashMapTestDriver10.keySet();
        java.lang.Object obj15 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) hashMapTestDriver10);
        experiment.util.Collection collection16 = hashMapTestDriver4.values();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        int int18 = hashMapTestDriver17.size();
        java.lang.Object obj20 = hashMapTestDriver17.remove((java.lang.Object) 10.0f);
        java.lang.Object obj22 = hashMapTestDriver17.get((java.lang.Object) 100.0d);
        experiment.util.Set set23 = hashMapTestDriver17.keySet();
        experiment.util.Set set24 = hashMapTestDriver17.keySet();
        boolean boolean25 = hashMapTestDriver4.containsKey((java.lang.Object) set24);
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        int int27 = hashMapTestDriver26.size();
        int int28 = hashMapTestDriver26.size();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Collection collection31 = hashMapTestDriver29.values();
        hashMapTestDriver29.clear();
        experiment.util.Set set33 = hashMapTestDriver29.keySet();
        java.lang.Object obj35 = hashMapTestDriver26.put((java.lang.Object) set33, (java.lang.Object) true);
        experiment.util.Collection collection36 = hashMapTestDriver26.values();
        boolean boolean37 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver26);
        hashMapTestDriver4.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test133");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        int int8 = hashMapTestDriver0.size();
        boolean boolean9 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test134");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) wildcardClass7);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        boolean boolean13 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.keySet();
        java.lang.Object obj16 = hashMapTestDriver9.get((java.lang.Object) set15);
        java.lang.Object obj17 = hashMapTestDriver0.get((java.lang.Object) set15);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        java.lang.Object obj24 = hashMapTestDriver18.get((java.lang.Object) 100.0d);
        hashMapTestDriver18.clear();
        experiment.util.Set set26 = hashMapTestDriver18.entrySet();
        experiment.util.Set set27 = hashMapTestDriver18.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        boolean boolean32 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver29);
        boolean boolean34 = hashMapTestDriver28.containsKey((java.lang.Object) (short) 100);
        experiment.util.Collection collection35 = hashMapTestDriver28.values();
        hashMapTestDriver28.clear();
        java.lang.Object obj37 = hashMapTestDriver0.put((java.lang.Object) set27, (java.lang.Object) hashMapTestDriver28);
        experiment.util.Collection collection38 = hashMapTestDriver0.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test135");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        int int8 = hashMapTestDriver7.size();
        boolean boolean10 = hashMapTestDriver7.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        boolean boolean15 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver12);
        hashMapTestDriver11.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Collection collection19 = hashMapTestDriver17.values();
        hashMapTestDriver17.clear();
        experiment.util.Set set21 = hashMapTestDriver17.keySet();
        java.lang.Object obj22 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver11, (java.lang.Object) hashMapTestDriver17);
        experiment.util.Collection collection23 = hashMapTestDriver11.values();
        boolean boolean24 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver11);
        experiment.util.Set set25 = hashMapTestDriver11.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test136");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        int int10 = hashMapTestDriver9.size();
        java.lang.Object obj12 = hashMapTestDriver9.remove((java.lang.Object) 10.0f);
        experiment.util.Set set13 = hashMapTestDriver9.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        java.lang.Object obj21 = hashMapTestDriver9.put((java.lang.Object) hashMapTestDriver14, (java.lang.Object) hashMapTestDriver16);
        java.lang.Object obj23 = hashMapTestDriver9.remove((java.lang.Object) 1.0f);
        experiment.util.Collection collection24 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set27 = hashMapTestDriver26.entrySet();
        experiment.util.Set set28 = hashMapTestDriver26.entrySet();
        boolean boolean29 = hashMapTestDriver25.containsKey((java.lang.Object) hashMapTestDriver26);
        java.lang.Object obj31 = hashMapTestDriver25.get((java.lang.Object) 100.0d);
        hashMapTestDriver25.clear();
        java.lang.Object obj34 = hashMapTestDriver25.get((java.lang.Object) 10.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        int int36 = hashMapTestDriver35.size();
        java.lang.Object obj38 = hashMapTestDriver35.remove((java.lang.Object) 10.0f);
        experiment.util.Set set39 = hashMapTestDriver35.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Collection collection42 = hashMapTestDriver40.values();
        java.lang.Object obj44 = hashMapTestDriver40.remove((java.lang.Object) 10.0f);
        java.lang.Object obj45 = hashMapTestDriver35.get((java.lang.Object) hashMapTestDriver40);
        java.lang.Object obj46 = hashMapTestDriver25.remove((java.lang.Object) hashMapTestDriver35);
        int int47 = hashMapTestDriver35.size();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set50 = hashMapTestDriver49.entrySet();
        experiment.util.Set set51 = hashMapTestDriver49.entrySet();
        boolean boolean52 = hashMapTestDriver48.containsKey((java.lang.Object) hashMapTestDriver49);
        hashMapTestDriver48.clear();
        experiment.util.Collection collection54 = hashMapTestDriver48.values();
        java.lang.Object obj55 = hashMapTestDriver35.remove((java.lang.Object) hashMapTestDriver48);
        boolean boolean56 = hashMapTestDriver35.isEmpty();
        experiment.util.Set set57 = hashMapTestDriver35.keySet();
        java.lang.Object obj58 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) set57);
        experiment.util.Set set59 = hashMapTestDriver9.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set59);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test137");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.Set set3 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        int int6 = hashMapTestDriver5.size();
        java.lang.Object obj8 = hashMapTestDriver5.remove((java.lang.Object) 10.0f);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        java.lang.Object obj14 = hashMapTestDriver10.remove((java.lang.Object) 10.0f);
        java.lang.Object obj15 = hashMapTestDriver5.get((java.lang.Object) hashMapTestDriver10);
        java.lang.Object obj16 = hashMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) hashMapTestDriver10);
        experiment.util.Collection collection17 = hashMapTestDriver10.values();
        java.lang.Class<?> wildcardClass18 = hashMapTestDriver10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test138");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj12 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver7);
        java.lang.Object obj14 = hashMapTestDriver0.remove((java.lang.Object) 1.0f);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection16 = hashMapTestDriver0.values();
        boolean boolean17 = hashMapTestDriver0.isEmpty();
        experiment.util.Collection collection18 = hashMapTestDriver0.values();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test139");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.Set set7 = hashMapTestDriver0.keySet();
        experiment.util.Set set8 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        hashMapTestDriver0.clear();
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = hashMapTestDriver0.get(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test140");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.keySet();
        java.lang.Object obj15 = hashMapTestDriver8.get((java.lang.Object) set14);
        experiment.util.Set set16 = hashMapTestDriver8.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        int int18 = hashMapTestDriver17.size();
        java.lang.Object obj20 = hashMapTestDriver17.remove((java.lang.Object) 10.0f);
        java.lang.Object obj21 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) 10.0f);
        java.lang.Class<?> wildcardClass22 = hashMapTestDriver8.getClass();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test141");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test142");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.entrySet();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        boolean boolean10 = hashMapTestDriver7.isEmpty();
        experiment.util.Collection collection11 = hashMapTestDriver7.values();
        java.lang.Object obj12 = hashMapTestDriver4.get((java.lang.Object) collection11);
        experiment.util.Set set13 = hashMapTestDriver4.keySet();
        boolean boolean14 = hashMapTestDriver0.containsKey((java.lang.Object) set13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.entrySet();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        boolean boolean19 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver16);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set21 = hashMapTestDriver20.keySet();
        java.lang.Object obj22 = hashMapTestDriver15.get((java.lang.Object) set21);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        int int24 = hashMapTestDriver23.size();
        java.lang.Object obj26 = hashMapTestDriver23.remove((java.lang.Object) 10.0f);
        experiment.util.Set set27 = hashMapTestDriver23.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver31);
        java.lang.Object obj35 = hashMapTestDriver23.put((java.lang.Object) hashMapTestDriver28, (java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj37 = hashMapTestDriver23.remove((java.lang.Object) 1.0f);
        experiment.util.Collection collection38 = hashMapTestDriver23.values();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        boolean boolean43 = hashMapTestDriver39.containsKey((java.lang.Object) hashMapTestDriver40);
        hashMapTestDriver39.clear();
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Class<?> wildcardClass46 = obj45.getClass();
        boolean boolean47 = hashMapTestDriver39.containsKey((java.lang.Object) wildcardClass46);
        java.lang.Object obj48 = hashMapTestDriver15.put((java.lang.Object) collection38, (java.lang.Object) hashMapTestDriver39);
        java.lang.Object obj49 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver15);
        int int50 = hashMapTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test143");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 100);
        boolean boolean4 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test144");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.entrySet();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        boolean boolean10 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set11 = hashMapTestDriver6.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        int int13 = hashMapTestDriver12.size();
        boolean boolean15 = hashMapTestDriver12.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        hashMapTestDriver16.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Collection collection24 = hashMapTestDriver22.values();
        hashMapTestDriver22.clear();
        experiment.util.Set set26 = hashMapTestDriver22.keySet();
        java.lang.Object obj27 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver22);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        boolean boolean32 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver29);
        hashMapTestDriver28.clear();
        experiment.util.Collection collection34 = hashMapTestDriver28.values();
        experiment.util.Set set35 = hashMapTestDriver28.keySet();
        java.lang.Object obj37 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver28, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.entrySet();
        experiment.util.Set set40 = hashMapTestDriver38.entrySet();
        java.lang.Object obj41 = hashMapTestDriver28.remove((java.lang.Object) set40);
        java.lang.Object obj42 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) hashMapTestDriver28);
        boolean boolean43 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver28);
        boolean boolean44 = hashMapTestDriver0.isEmpty();
        int int45 = hashMapTestDriver0.size();
        boolean boolean46 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass48 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test145");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        int int5 = hashMapTestDriver1.size();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.remove((java.lang.Object) 1L);
        experiment.util.Set set9 = hashMapTestDriver6.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        int int11 = hashMapTestDriver10.size();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        boolean boolean13 = hashMapTestDriver10.isEmpty();
        experiment.util.Collection collection14 = hashMapTestDriver10.values();
        java.lang.Object obj15 = hashMapTestDriver6.remove((java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        java.lang.Object obj22 = hashMapTestDriver16.get((java.lang.Object) 100.0d);
        experiment.util.Set set23 = hashMapTestDriver16.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        int int25 = hashMapTestDriver24.size();
        boolean boolean27 = hashMapTestDriver24.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        boolean boolean32 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver29);
        hashMapTestDriver28.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set35 = hashMapTestDriver34.entrySet();
        experiment.util.Collection collection36 = hashMapTestDriver34.values();
        hashMapTestDriver34.clear();
        experiment.util.Set set38 = hashMapTestDriver34.keySet();
        java.lang.Object obj39 = hashMapTestDriver24.put((java.lang.Object) hashMapTestDriver28, (java.lang.Object) hashMapTestDriver34);
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set42 = hashMapTestDriver41.entrySet();
        experiment.util.Set set43 = hashMapTestDriver41.entrySet();
        boolean boolean44 = hashMapTestDriver40.containsKey((java.lang.Object) hashMapTestDriver41);
        hashMapTestDriver40.clear();
        experiment.util.Collection collection46 = hashMapTestDriver40.values();
        experiment.util.Set set47 = hashMapTestDriver40.keySet();
        java.lang.Object obj49 = hashMapTestDriver24.put((java.lang.Object) hashMapTestDriver40, (java.lang.Object) '4');
        java.lang.Object obj50 = hashMapTestDriver16.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set53 = hashMapTestDriver52.entrySet();
        experiment.util.Set set54 = hashMapTestDriver52.entrySet();
        boolean boolean55 = hashMapTestDriver51.containsKey((java.lang.Object) hashMapTestDriver52);
        hashMapTestDriver51.clear();
        experiment.util.Set set57 = hashMapTestDriver51.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        int int59 = hashMapTestDriver58.size();
        int int60 = hashMapTestDriver58.size();
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set62 = hashMapTestDriver61.entrySet();
        experiment.util.Collection collection63 = hashMapTestDriver61.values();
        hashMapTestDriver61.clear();
        experiment.util.Set set65 = hashMapTestDriver61.keySet();
        java.lang.Object obj67 = hashMapTestDriver58.put((java.lang.Object) set65, (java.lang.Object) true);
        java.lang.Object obj68 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver51, (java.lang.Object) hashMapTestDriver58);
        experiment.util.HashMapTestDriver hashMapTestDriver69 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set70 = hashMapTestDriver69.entrySet();
        experiment.util.Collection collection71 = hashMapTestDriver69.values();
        experiment.util.Set set72 = hashMapTestDriver69.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver73 = new experiment.util.HashMapTestDriver();
        int int74 = hashMapTestDriver73.size();
        boolean boolean76 = hashMapTestDriver73.containsKey((java.lang.Object) (byte) 100);
        experiment.util.Set set77 = hashMapTestDriver73.keySet();
        java.lang.Object obj78 = hashMapTestDriver16.put((java.lang.Object) set72, (java.lang.Object) hashMapTestDriver73);
        hashMapTestDriver16.clear();
        java.lang.Object obj80 = hashMapTestDriver6.remove((java.lang.Object) hashMapTestDriver16);
        int int81 = hashMapTestDriver6.size();
        boolean boolean82 = hashMapTestDriver1.containsKey((java.lang.Object) hashMapTestDriver6);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test146");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.entrySet();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        boolean boolean10 = hashMapTestDriver7.isEmpty();
        experiment.util.Collection collection11 = hashMapTestDriver7.values();
        java.lang.Object obj12 = hashMapTestDriver4.get((java.lang.Object) collection11);
        experiment.util.Set set13 = hashMapTestDriver4.keySet();
        boolean boolean14 = hashMapTestDriver0.containsKey((java.lang.Object) set13);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        int int16 = hashMapTestDriver15.size();
        java.lang.Object obj18 = hashMapTestDriver15.remove((java.lang.Object) 10.0f);
        experiment.util.Set set19 = hashMapTestDriver15.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set21 = hashMapTestDriver20.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.entrySet();
        experiment.util.Set set25 = hashMapTestDriver23.entrySet();
        boolean boolean26 = hashMapTestDriver22.containsKey((java.lang.Object) hashMapTestDriver23);
        java.lang.Object obj27 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver20, (java.lang.Object) hashMapTestDriver22);
        java.lang.Object obj29 = hashMapTestDriver15.remove((java.lang.Object) 1.0f);
        java.lang.Object obj30 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver15);
        experiment.util.Set set31 = hashMapTestDriver15.keySet();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test147");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        int int7 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set12 = hashMapTestDriver11.entrySet();
        experiment.util.Set set13 = hashMapTestDriver11.entrySet();
        boolean boolean14 = hashMapTestDriver10.containsKey((java.lang.Object) hashMapTestDriver11);
        experiment.util.Set set15 = hashMapTestDriver10.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        int int17 = hashMapTestDriver16.size();
        boolean boolean19 = hashMapTestDriver16.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set22 = hashMapTestDriver21.entrySet();
        experiment.util.Set set23 = hashMapTestDriver21.entrySet();
        boolean boolean24 = hashMapTestDriver20.containsKey((java.lang.Object) hashMapTestDriver21);
        hashMapTestDriver20.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set27 = hashMapTestDriver26.entrySet();
        experiment.util.Collection collection28 = hashMapTestDriver26.values();
        hashMapTestDriver26.clear();
        experiment.util.Set set30 = hashMapTestDriver26.keySet();
        java.lang.Object obj31 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver20, (java.lang.Object) hashMapTestDriver26);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set34 = hashMapTestDriver33.entrySet();
        experiment.util.Set set35 = hashMapTestDriver33.entrySet();
        boolean boolean36 = hashMapTestDriver32.containsKey((java.lang.Object) hashMapTestDriver33);
        hashMapTestDriver32.clear();
        experiment.util.Collection collection38 = hashMapTestDriver32.values();
        experiment.util.Set set39 = hashMapTestDriver32.keySet();
        java.lang.Object obj41 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver32, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set43 = hashMapTestDriver42.entrySet();
        experiment.util.Set set44 = hashMapTestDriver42.entrySet();
        java.lang.Object obj45 = hashMapTestDriver32.remove((java.lang.Object) set44);
        java.lang.Object obj46 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver10, (java.lang.Object) hashMapTestDriver32);
        boolean boolean47 = hashMapTestDriver10.isEmpty();
        int int48 = hashMapTestDriver10.size();
        java.lang.Object obj49 = hashMapTestDriver0.remove((java.lang.Object) int48);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test148");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        hashMapTestDriver8.clear();
        experiment.util.Collection collection14 = hashMapTestDriver8.values();
        experiment.util.Collection collection15 = hashMapTestDriver8.values();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        java.lang.Object obj22 = hashMapTestDriver16.get((java.lang.Object) 100.0d);
        boolean boolean23 = hashMapTestDriver16.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        boolean boolean28 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver25);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.keySet();
        java.lang.Object obj31 = hashMapTestDriver24.get((java.lang.Object) set30);
        experiment.util.Set set32 = hashMapTestDriver24.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        int int34 = hashMapTestDriver33.size();
        java.lang.Object obj36 = hashMapTestDriver33.remove((java.lang.Object) 10.0f);
        java.lang.Object obj37 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) 10.0f);
        java.lang.Object obj38 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver16);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        boolean boolean43 = hashMapTestDriver39.containsKey((java.lang.Object) hashMapTestDriver40);
        java.lang.Object obj45 = hashMapTestDriver39.get((java.lang.Object) 100.0d);
        hashMapTestDriver39.clear();
        boolean boolean47 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver39);
        java.lang.Class<?> wildcardClass48 = hashMapTestDriver39.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test149");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.Set set7 = hashMapTestDriver0.keySet();
        experiment.util.Set set8 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test150");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass5 = set4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test151");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        boolean boolean6 = hashMapTestDriver0.containsKey((java.lang.Object) ' ');
        int int7 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Collection collection10 = hashMapTestDriver8.values();
        hashMapTestDriver8.clear();
        experiment.util.Set set12 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.entrySet();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        boolean boolean17 = hashMapTestDriver13.containsKey((java.lang.Object) hashMapTestDriver14);
        java.lang.Object obj18 = hashMapTestDriver8.remove((java.lang.Object) boolean17);
        boolean boolean19 = hashMapTestDriver0.containsKey((java.lang.Object) boolean17);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test152");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver3.clear();
        experiment.util.Collection collection5 = hashMapTestDriver3.values();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        int int7 = hashMapTestDriver6.size();
        java.lang.Object obj9 = hashMapTestDriver6.remove((java.lang.Object) 10.0f);
        experiment.util.Set set10 = hashMapTestDriver6.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set12 = hashMapTestDriver11.entrySet();
        experiment.util.Collection collection13 = hashMapTestDriver11.values();
        java.lang.Object obj15 = hashMapTestDriver11.remove((java.lang.Object) 10.0f);
        java.lang.Object obj16 = hashMapTestDriver6.get((java.lang.Object) hashMapTestDriver11);
        java.lang.Object obj17 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) hashMapTestDriver6);
        java.lang.Class<?> wildcardClass18 = hashMapTestDriver3.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test153");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set13 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        int int15 = hashMapTestDriver14.size();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        hashMapTestDriver18.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver24.values();
        hashMapTestDriver24.clear();
        experiment.util.Set set28 = hashMapTestDriver24.keySet();
        java.lang.Object obj29 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver31);
        hashMapTestDriver30.clear();
        experiment.util.Collection collection36 = hashMapTestDriver30.values();
        experiment.util.Set set37 = hashMapTestDriver30.keySet();
        java.lang.Object obj39 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        java.lang.Object obj43 = hashMapTestDriver30.remove((java.lang.Object) set42);
        java.lang.Object obj44 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj45 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver30);
        int int46 = hashMapTestDriver0.size();
        int int47 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set50 = hashMapTestDriver49.entrySet();
        experiment.util.Collection collection51 = hashMapTestDriver49.values();
        experiment.util.Set set52 = hashMapTestDriver49.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection54 = hashMapTestDriver53.values();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set57 = hashMapTestDriver56.entrySet();
        experiment.util.Set set58 = hashMapTestDriver56.entrySet();
        boolean boolean59 = hashMapTestDriver55.containsKey((java.lang.Object) hashMapTestDriver56);
        experiment.util.Set set60 = hashMapTestDriver55.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        int int62 = hashMapTestDriver61.size();
        boolean boolean64 = hashMapTestDriver61.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set67 = hashMapTestDriver66.entrySet();
        experiment.util.Set set68 = hashMapTestDriver66.entrySet();
        boolean boolean69 = hashMapTestDriver65.containsKey((java.lang.Object) hashMapTestDriver66);
        hashMapTestDriver65.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set72 = hashMapTestDriver71.entrySet();
        experiment.util.Collection collection73 = hashMapTestDriver71.values();
        hashMapTestDriver71.clear();
        experiment.util.Set set75 = hashMapTestDriver71.keySet();
        java.lang.Object obj76 = hashMapTestDriver61.put((java.lang.Object) hashMapTestDriver65, (java.lang.Object) hashMapTestDriver71);
        experiment.util.HashMapTestDriver hashMapTestDriver77 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver78 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set79 = hashMapTestDriver78.entrySet();
        experiment.util.Set set80 = hashMapTestDriver78.entrySet();
        boolean boolean81 = hashMapTestDriver77.containsKey((java.lang.Object) hashMapTestDriver78);
        hashMapTestDriver77.clear();
        experiment.util.Collection collection83 = hashMapTestDriver77.values();
        experiment.util.Set set84 = hashMapTestDriver77.keySet();
        java.lang.Object obj86 = hashMapTestDriver61.put((java.lang.Object) hashMapTestDriver77, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver87 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set88 = hashMapTestDriver87.entrySet();
        experiment.util.Set set89 = hashMapTestDriver87.entrySet();
        java.lang.Object obj90 = hashMapTestDriver77.remove((java.lang.Object) set89);
        java.lang.Object obj91 = hashMapTestDriver53.put((java.lang.Object) hashMapTestDriver55, (java.lang.Object) hashMapTestDriver77);
        boolean boolean92 = hashMapTestDriver49.containsKey((java.lang.Object) hashMapTestDriver77);
        boolean boolean93 = hashMapTestDriver49.isEmpty();
        experiment.util.Set set94 = hashMapTestDriver49.keySet();
        experiment.util.Set set95 = hashMapTestDriver49.entrySet();
        java.lang.Object obj96 = hashMapTestDriver0.put((java.lang.Object) (byte) 10, (java.lang.Object) hashMapTestDriver49);
        experiment.util.Collection collection97 = hashMapTestDriver0.values();
        java.lang.Object obj98 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean99 = hashMapTestDriver0.containsKey(obj98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertNotNull(set95);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertNotNull(collection97);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test154");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        hashMapTestDriver8.clear();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        boolean boolean16 = hashMapTestDriver8.containsKey((java.lang.Object) wildcardClass15);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        experiment.util.Set set20 = hashMapTestDriver18.entrySet();
        boolean boolean21 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver18);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.keySet();
        java.lang.Object obj24 = hashMapTestDriver17.get((java.lang.Object) set23);
        java.lang.Object obj25 = hashMapTestDriver8.get((java.lang.Object) set23);
        boolean boolean26 = hashMapTestDriver8.isEmpty();
        int int27 = hashMapTestDriver8.size();
        experiment.util.Set set28 = hashMapTestDriver8.keySet();
        java.lang.Object obj29 = hashMapTestDriver0.remove((java.lang.Object) set28);
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test155");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        java.lang.Object obj10 = hashMapTestDriver0.remove((java.lang.Object) (-1.0d));
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = hashMapTestDriver0.remove(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test156");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        int int6 = hashMapTestDriver5.size();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        boolean boolean15 = hashMapTestDriver12.isEmpty();
        experiment.util.Collection collection16 = hashMapTestDriver12.values();
        java.lang.Object obj17 = hashMapTestDriver9.get((java.lang.Object) collection16);
        experiment.util.Set set18 = hashMapTestDriver9.keySet();
        boolean boolean19 = hashMapTestDriver5.containsKey((java.lang.Object) set18);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        int int21 = hashMapTestDriver20.size();
        java.lang.Object obj23 = hashMapTestDriver20.remove((java.lang.Object) 10.0f);
        experiment.util.Set set24 = hashMapTestDriver20.keySet();
        java.lang.Object obj26 = hashMapTestDriver20.get((java.lang.Object) (short) -1);
        hashMapTestDriver20.clear();
        java.lang.Object obj28 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver20);
        boolean boolean29 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set30 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass31 = set30.getClass();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test157");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.entrySet();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        boolean boolean10 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set11 = hashMapTestDriver6.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        int int13 = hashMapTestDriver12.size();
        boolean boolean15 = hashMapTestDriver12.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        hashMapTestDriver16.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Collection collection24 = hashMapTestDriver22.values();
        hashMapTestDriver22.clear();
        experiment.util.Set set26 = hashMapTestDriver22.keySet();
        java.lang.Object obj27 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver22);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        boolean boolean32 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver29);
        hashMapTestDriver28.clear();
        experiment.util.Collection collection34 = hashMapTestDriver28.values();
        experiment.util.Set set35 = hashMapTestDriver28.keySet();
        java.lang.Object obj37 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver28, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.entrySet();
        experiment.util.Set set40 = hashMapTestDriver38.entrySet();
        java.lang.Object obj41 = hashMapTestDriver28.remove((java.lang.Object) set40);
        java.lang.Object obj42 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) hashMapTestDriver28);
        boolean boolean43 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver28);
        boolean boolean45 = hashMapTestDriver28.containsKey((java.lang.Object) 0);
        experiment.util.Set set46 = hashMapTestDriver28.keySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test158");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) wildcardClass7);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        boolean boolean13 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.keySet();
        java.lang.Object obj16 = hashMapTestDriver9.get((java.lang.Object) set15);
        java.lang.Object obj17 = hashMapTestDriver0.get((java.lang.Object) set15);
        boolean boolean18 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set19 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.remove((java.lang.Object) 1L);
        experiment.util.Set set23 = hashMapTestDriver20.entrySet();
        boolean boolean24 = hashMapTestDriver20.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set27 = hashMapTestDriver26.entrySet();
        experiment.util.Set set28 = hashMapTestDriver26.entrySet();
        boolean boolean29 = hashMapTestDriver25.containsKey((java.lang.Object) hashMapTestDriver26);
        hashMapTestDriver25.clear();
        experiment.util.Collection collection31 = hashMapTestDriver25.values();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        int int34 = hashMapTestDriver33.size();
        java.lang.Object obj35 = hashMapTestDriver25.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver33);
        java.lang.Object obj36 = hashMapTestDriver0.put((java.lang.Object) boolean24, (java.lang.Object) hashMapTestDriver33);
        boolean boolean37 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set38 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test159");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = hashMapTestDriver0.values();
        int int8 = hashMapTestDriver0.size();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = hashMapTestDriver0.containsKey(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test160");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test161");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj12 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = obj12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test162");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj4 = hashMapTestDriver2.remove((java.lang.Object) 1L);
        experiment.util.Set set5 = hashMapTestDriver2.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        int int7 = hashMapTestDriver6.size();
        experiment.util.Collection collection8 = hashMapTestDriver6.values();
        boolean boolean9 = hashMapTestDriver6.isEmpty();
        experiment.util.Collection collection10 = hashMapTestDriver6.values();
        java.lang.Object obj11 = hashMapTestDriver2.remove((java.lang.Object) hashMapTestDriver6);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.entrySet();
        experiment.util.Set set15 = hashMapTestDriver13.entrySet();
        boolean boolean16 = hashMapTestDriver12.containsKey((java.lang.Object) hashMapTestDriver13);
        java.lang.Object obj18 = hashMapTestDriver12.get((java.lang.Object) 100.0d);
        experiment.util.Set set19 = hashMapTestDriver12.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        int int21 = hashMapTestDriver20.size();
        boolean boolean23 = hashMapTestDriver20.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        boolean boolean28 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver25);
        hashMapTestDriver24.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set31 = hashMapTestDriver30.entrySet();
        experiment.util.Collection collection32 = hashMapTestDriver30.values();
        hashMapTestDriver30.clear();
        experiment.util.Set set34 = hashMapTestDriver30.keySet();
        java.lang.Object obj35 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) hashMapTestDriver30);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set38 = hashMapTestDriver37.entrySet();
        experiment.util.Set set39 = hashMapTestDriver37.entrySet();
        boolean boolean40 = hashMapTestDriver36.containsKey((java.lang.Object) hashMapTestDriver37);
        hashMapTestDriver36.clear();
        experiment.util.Collection collection42 = hashMapTestDriver36.values();
        experiment.util.Set set43 = hashMapTestDriver36.keySet();
        java.lang.Object obj45 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver36, (java.lang.Object) '4');
        java.lang.Object obj46 = hashMapTestDriver12.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set49 = hashMapTestDriver48.entrySet();
        experiment.util.Set set50 = hashMapTestDriver48.entrySet();
        boolean boolean51 = hashMapTestDriver47.containsKey((java.lang.Object) hashMapTestDriver48);
        hashMapTestDriver47.clear();
        experiment.util.Set set53 = hashMapTestDriver47.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        int int55 = hashMapTestDriver54.size();
        int int56 = hashMapTestDriver54.size();
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set58 = hashMapTestDriver57.entrySet();
        experiment.util.Collection collection59 = hashMapTestDriver57.values();
        hashMapTestDriver57.clear();
        experiment.util.Set set61 = hashMapTestDriver57.keySet();
        java.lang.Object obj63 = hashMapTestDriver54.put((java.lang.Object) set61, (java.lang.Object) true);
        java.lang.Object obj64 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver47, (java.lang.Object) hashMapTestDriver54);
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set66 = hashMapTestDriver65.entrySet();
        experiment.util.Collection collection67 = hashMapTestDriver65.values();
        experiment.util.Set set68 = hashMapTestDriver65.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver69 = new experiment.util.HashMapTestDriver();
        int int70 = hashMapTestDriver69.size();
        boolean boolean72 = hashMapTestDriver69.containsKey((java.lang.Object) (byte) 100);
        experiment.util.Set set73 = hashMapTestDriver69.keySet();
        java.lang.Object obj74 = hashMapTestDriver12.put((java.lang.Object) set68, (java.lang.Object) hashMapTestDriver69);
        hashMapTestDriver12.clear();
        java.lang.Object obj76 = hashMapTestDriver2.remove((java.lang.Object) hashMapTestDriver12);
        int int77 = hashMapTestDriver2.size();
        experiment.util.Set set78 = hashMapTestDriver2.keySet();
        java.lang.Object obj79 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNull(obj79);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test163");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set7 = hashMapTestDriver6.entrySet();
        experiment.util.Collection collection8 = hashMapTestDriver6.values();
        hashMapTestDriver6.clear();
        experiment.util.Set set10 = hashMapTestDriver6.keySet();
        experiment.util.Collection collection11 = hashMapTestDriver6.values();
        experiment.util.Set set12 = hashMapTestDriver6.entrySet();
        experiment.util.Collection collection13 = hashMapTestDriver6.values();
        boolean boolean14 = hashMapTestDriver0.containsKey((java.lang.Object) collection13);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test164");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        hashMapTestDriver0.clear();
        java.lang.Object obj9 = hashMapTestDriver0.get((java.lang.Object) 10.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        int int11 = hashMapTestDriver10.size();
        java.lang.Object obj13 = hashMapTestDriver10.remove((java.lang.Object) 10.0f);
        experiment.util.Set set14 = hashMapTestDriver10.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.entrySet();
        experiment.util.Collection collection17 = hashMapTestDriver15.values();
        java.lang.Object obj19 = hashMapTestDriver15.remove((java.lang.Object) 10.0f);
        java.lang.Object obj20 = hashMapTestDriver10.get((java.lang.Object) hashMapTestDriver15);
        java.lang.Object obj21 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver10);
        int int22 = hashMapTestDriver10.size();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.entrySet();
        experiment.util.Collection collection25 = hashMapTestDriver23.values();
        experiment.util.Set set26 = hashMapTestDriver23.keySet();
        java.lang.Object obj28 = hashMapTestDriver23.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Collection collection31 = hashMapTestDriver29.values();
        hashMapTestDriver29.clear();
        experiment.util.Set set33 = hashMapTestDriver29.keySet();
        java.lang.Object obj34 = hashMapTestDriver23.get((java.lang.Object) set33);
        boolean boolean35 = hashMapTestDriver10.containsKey((java.lang.Object) hashMapTestDriver23);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        int int37 = hashMapTestDriver36.size();
        boolean boolean39 = hashMapTestDriver36.containsKey((java.lang.Object) (byte) 100);
        int int40 = hashMapTestDriver36.size();
        boolean boolean41 = hashMapTestDriver10.containsKey((java.lang.Object) int40);
        int int42 = hashMapTestDriver10.size();
        experiment.util.Set set43 = hashMapTestDriver10.keySet();
        boolean boolean44 = hashMapTestDriver10.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set47 = hashMapTestDriver46.entrySet();
        experiment.util.Set set48 = hashMapTestDriver46.entrySet();
        boolean boolean49 = hashMapTestDriver45.containsKey((java.lang.Object) hashMapTestDriver46);
        java.lang.Object obj51 = hashMapTestDriver45.get((java.lang.Object) 100.0d);
        hashMapTestDriver45.clear();
        java.lang.Object obj54 = hashMapTestDriver45.get((java.lang.Object) 10.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        int int56 = hashMapTestDriver55.size();
        java.lang.Object obj58 = hashMapTestDriver55.remove((java.lang.Object) 10.0f);
        experiment.util.Set set59 = hashMapTestDriver55.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set61 = hashMapTestDriver60.entrySet();
        experiment.util.Collection collection62 = hashMapTestDriver60.values();
        java.lang.Object obj64 = hashMapTestDriver60.remove((java.lang.Object) 10.0f);
        java.lang.Object obj65 = hashMapTestDriver55.get((java.lang.Object) hashMapTestDriver60);
        java.lang.Object obj66 = hashMapTestDriver45.remove((java.lang.Object) hashMapTestDriver55);
        int int67 = hashMapTestDriver55.size();
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver69 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set70 = hashMapTestDriver69.entrySet();
        experiment.util.Set set71 = hashMapTestDriver69.entrySet();
        boolean boolean72 = hashMapTestDriver68.containsKey((java.lang.Object) hashMapTestDriver69);
        hashMapTestDriver68.clear();
        experiment.util.Collection collection74 = hashMapTestDriver68.values();
        java.lang.Object obj75 = hashMapTestDriver55.remove((java.lang.Object) hashMapTestDriver68);
        boolean boolean76 = hashMapTestDriver55.isEmpty();
        experiment.util.Set set77 = hashMapTestDriver55.keySet();
        boolean boolean78 = hashMapTestDriver10.containsKey((java.lang.Object) hashMapTestDriver55);
        experiment.util.HashMapTestDriver hashMapTestDriver79 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver80 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set81 = hashMapTestDriver80.entrySet();
        experiment.util.Set set82 = hashMapTestDriver80.entrySet();
        boolean boolean83 = hashMapTestDriver79.containsKey((java.lang.Object) hashMapTestDriver80);
        java.lang.Object obj85 = hashMapTestDriver79.get((java.lang.Object) 100.0d);
        experiment.util.Set set86 = hashMapTestDriver79.entrySet();
        experiment.util.Set set87 = hashMapTestDriver79.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver88 = new experiment.util.HashMapTestDriver();
        int int89 = hashMapTestDriver88.size();
        java.lang.Object obj91 = hashMapTestDriver88.remove((java.lang.Object) 10.0f);
        experiment.util.Set set92 = hashMapTestDriver88.keySet();
        java.lang.Object obj94 = hashMapTestDriver88.get((java.lang.Object) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj95 = hashMapTestDriver55.put((java.lang.Object) set87, obj94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(collection74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(set92);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test165");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        int int6 = hashMapTestDriver5.size();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        boolean boolean15 = hashMapTestDriver12.isEmpty();
        experiment.util.Collection collection16 = hashMapTestDriver12.values();
        java.lang.Object obj17 = hashMapTestDriver9.get((java.lang.Object) collection16);
        experiment.util.Set set18 = hashMapTestDriver9.keySet();
        boolean boolean19 = hashMapTestDriver5.containsKey((java.lang.Object) set18);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        int int21 = hashMapTestDriver20.size();
        java.lang.Object obj23 = hashMapTestDriver20.remove((java.lang.Object) 10.0f);
        experiment.util.Set set24 = hashMapTestDriver20.keySet();
        java.lang.Object obj26 = hashMapTestDriver20.get((java.lang.Object) (short) -1);
        hashMapTestDriver20.clear();
        java.lang.Object obj28 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver20);
        experiment.util.Set set29 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test166");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        int int6 = hashMapTestDriver5.size();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        boolean boolean15 = hashMapTestDriver12.isEmpty();
        experiment.util.Collection collection16 = hashMapTestDriver12.values();
        java.lang.Object obj17 = hashMapTestDriver9.get((java.lang.Object) collection16);
        experiment.util.Set set18 = hashMapTestDriver9.keySet();
        boolean boolean19 = hashMapTestDriver5.containsKey((java.lang.Object) set18);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        int int21 = hashMapTestDriver20.size();
        java.lang.Object obj23 = hashMapTestDriver20.remove((java.lang.Object) 10.0f);
        experiment.util.Set set24 = hashMapTestDriver20.keySet();
        java.lang.Object obj26 = hashMapTestDriver20.get((java.lang.Object) (short) -1);
        hashMapTestDriver20.clear();
        java.lang.Object obj28 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver20);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set31 = hashMapTestDriver30.entrySet();
        experiment.util.Set set32 = hashMapTestDriver30.entrySet();
        boolean boolean33 = hashMapTestDriver29.containsKey((java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj35 = hashMapTestDriver29.get((java.lang.Object) 100.0d);
        experiment.util.Set set36 = hashMapTestDriver29.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        int int38 = hashMapTestDriver37.size();
        boolean boolean40 = hashMapTestDriver37.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set43 = hashMapTestDriver42.entrySet();
        experiment.util.Set set44 = hashMapTestDriver42.entrySet();
        boolean boolean45 = hashMapTestDriver41.containsKey((java.lang.Object) hashMapTestDriver42);
        hashMapTestDriver41.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set48 = hashMapTestDriver47.entrySet();
        experiment.util.Collection collection49 = hashMapTestDriver47.values();
        hashMapTestDriver47.clear();
        experiment.util.Set set51 = hashMapTestDriver47.keySet();
        java.lang.Object obj52 = hashMapTestDriver37.put((java.lang.Object) hashMapTestDriver41, (java.lang.Object) hashMapTestDriver47);
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set55 = hashMapTestDriver54.entrySet();
        experiment.util.Set set56 = hashMapTestDriver54.entrySet();
        boolean boolean57 = hashMapTestDriver53.containsKey((java.lang.Object) hashMapTestDriver54);
        hashMapTestDriver53.clear();
        experiment.util.Collection collection59 = hashMapTestDriver53.values();
        experiment.util.Set set60 = hashMapTestDriver53.keySet();
        java.lang.Object obj62 = hashMapTestDriver37.put((java.lang.Object) hashMapTestDriver53, (java.lang.Object) '4');
        java.lang.Object obj63 = hashMapTestDriver29.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set66 = hashMapTestDriver65.entrySet();
        experiment.util.Set set67 = hashMapTestDriver65.entrySet();
        boolean boolean68 = hashMapTestDriver64.containsKey((java.lang.Object) hashMapTestDriver65);
        hashMapTestDriver64.clear();
        experiment.util.Set set70 = hashMapTestDriver64.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        int int72 = hashMapTestDriver71.size();
        int int73 = hashMapTestDriver71.size();
        experiment.util.HashMapTestDriver hashMapTestDriver74 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set75 = hashMapTestDriver74.entrySet();
        experiment.util.Collection collection76 = hashMapTestDriver74.values();
        hashMapTestDriver74.clear();
        experiment.util.Set set78 = hashMapTestDriver74.keySet();
        java.lang.Object obj80 = hashMapTestDriver71.put((java.lang.Object) set78, (java.lang.Object) true);
        java.lang.Object obj81 = hashMapTestDriver29.put((java.lang.Object) hashMapTestDriver64, (java.lang.Object) hashMapTestDriver71);
        experiment.util.HashMapTestDriver hashMapTestDriver82 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set83 = hashMapTestDriver82.entrySet();
        experiment.util.Collection collection84 = hashMapTestDriver82.values();
        experiment.util.Set set85 = hashMapTestDriver82.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver86 = new experiment.util.HashMapTestDriver();
        int int87 = hashMapTestDriver86.size();
        boolean boolean89 = hashMapTestDriver86.containsKey((java.lang.Object) (byte) 100);
        experiment.util.Set set90 = hashMapTestDriver86.keySet();
        java.lang.Object obj91 = hashMapTestDriver29.put((java.lang.Object) set85, (java.lang.Object) hashMapTestDriver86);
        int int92 = hashMapTestDriver86.size();
        boolean boolean93 = hashMapTestDriver5.containsKey((java.lang.Object) hashMapTestDriver86);
        hashMapTestDriver86.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test167");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        hashMapTestDriver0.clear();
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        boolean boolean13 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver10);
        hashMapTestDriver9.clear();
        experiment.util.Collection collection15 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        int int18 = hashMapTestDriver17.size();
        java.lang.Object obj19 = hashMapTestDriver9.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver17);
        boolean boolean20 = hashMapTestDriver17.isEmpty();
        java.lang.Object obj21 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver17);
        experiment.util.Collection collection22 = hashMapTestDriver0.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test168");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        int int7 = hashMapTestDriver6.size();
        java.lang.Object obj9 = hashMapTestDriver6.remove((java.lang.Object) 10.0f);
        experiment.util.Set set10 = hashMapTestDriver6.entrySet();
        boolean boolean11 = hashMapTestDriver0.containsKey((java.lang.Object) set10);
        java.lang.Object obj12 = null;
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.entrySet();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        boolean boolean17 = hashMapTestDriver13.containsKey((java.lang.Object) hashMapTestDriver14);
        hashMapTestDriver13.clear();
        experiment.util.Collection collection19 = hashMapTestDriver13.values();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        int int22 = hashMapTestDriver21.size();
        java.lang.Object obj23 = hashMapTestDriver13.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver21);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.remove((java.lang.Object) 1L);
        experiment.util.Set set29 = hashMapTestDriver26.entrySet();
        java.lang.Object obj30 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) hashMapTestDriver26);
        java.lang.Class<?> wildcardClass31 = hashMapTestDriver21.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = hashMapTestDriver0.put(obj12, (java.lang.Object) hashMapTestDriver21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test169");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.Set set3 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        int int6 = hashMapTestDriver5.size();
        java.lang.Object obj8 = hashMapTestDriver5.remove((java.lang.Object) 10.0f);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        java.lang.Object obj14 = hashMapTestDriver10.remove((java.lang.Object) 10.0f);
        java.lang.Object obj15 = hashMapTestDriver5.get((java.lang.Object) hashMapTestDriver10);
        java.lang.Object obj16 = hashMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        java.lang.Object obj20 = hashMapTestDriver10.remove((java.lang.Object) set19);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Set set24 = hashMapTestDriver22.entrySet();
        boolean boolean25 = hashMapTestDriver21.containsKey((java.lang.Object) hashMapTestDriver22);
        hashMapTestDriver21.clear();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        boolean boolean29 = hashMapTestDriver21.containsKey((java.lang.Object) wildcardClass28);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver31);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        java.lang.Object obj37 = hashMapTestDriver30.get((java.lang.Object) set36);
        java.lang.Object obj38 = hashMapTestDriver21.get((java.lang.Object) set36);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        boolean boolean43 = hashMapTestDriver39.containsKey((java.lang.Object) hashMapTestDriver40);
        java.lang.Object obj45 = hashMapTestDriver39.get((java.lang.Object) 100.0d);
        hashMapTestDriver39.clear();
        experiment.util.Set set47 = hashMapTestDriver39.entrySet();
        experiment.util.Set set48 = hashMapTestDriver39.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set51 = hashMapTestDriver50.entrySet();
        experiment.util.Set set52 = hashMapTestDriver50.entrySet();
        boolean boolean53 = hashMapTestDriver49.containsKey((java.lang.Object) hashMapTestDriver50);
        boolean boolean55 = hashMapTestDriver49.containsKey((java.lang.Object) (short) 100);
        experiment.util.Collection collection56 = hashMapTestDriver49.values();
        hashMapTestDriver49.clear();
        java.lang.Object obj58 = hashMapTestDriver21.put((java.lang.Object) set48, (java.lang.Object) hashMapTestDriver49);
        boolean boolean59 = hashMapTestDriver10.containsKey((java.lang.Object) set48);
        hashMapTestDriver10.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test170");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        hashMapTestDriver0.clear();
        java.lang.Object obj9 = hashMapTestDriver0.get((java.lang.Object) 10.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        int int11 = hashMapTestDriver10.size();
        java.lang.Object obj13 = hashMapTestDriver10.remove((java.lang.Object) 10.0f);
        experiment.util.Set set14 = hashMapTestDriver10.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.entrySet();
        experiment.util.Collection collection17 = hashMapTestDriver15.values();
        java.lang.Object obj19 = hashMapTestDriver15.remove((java.lang.Object) 10.0f);
        java.lang.Object obj20 = hashMapTestDriver10.get((java.lang.Object) hashMapTestDriver15);
        java.lang.Object obj21 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.entrySet();
        experiment.util.Set set25 = hashMapTestDriver23.entrySet();
        boolean boolean26 = hashMapTestDriver22.containsKey((java.lang.Object) hashMapTestDriver23);
        java.lang.Object obj28 = hashMapTestDriver22.get((java.lang.Object) 100.0d);
        hashMapTestDriver22.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        int int31 = hashMapTestDriver30.size();
        java.lang.Object obj33 = hashMapTestDriver30.remove((java.lang.Object) 10.0f);
        experiment.util.Set set34 = hashMapTestDriver30.keySet();
        java.lang.Object obj36 = hashMapTestDriver30.get((java.lang.Object) (short) -1);
        hashMapTestDriver30.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        int int39 = hashMapTestDriver38.size();
        java.lang.Object obj41 = hashMapTestDriver38.remove((java.lang.Object) 10.0f);
        experiment.util.Set set42 = hashMapTestDriver38.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set47 = hashMapTestDriver46.entrySet();
        experiment.util.Set set48 = hashMapTestDriver46.entrySet();
        boolean boolean49 = hashMapTestDriver45.containsKey((java.lang.Object) hashMapTestDriver46);
        java.lang.Object obj50 = hashMapTestDriver38.put((java.lang.Object) hashMapTestDriver43, (java.lang.Object) hashMapTestDriver45);
        java.lang.Object obj52 = hashMapTestDriver38.remove((java.lang.Object) 1.0f);
        experiment.util.Collection collection53 = hashMapTestDriver38.values();
        int int54 = hashMapTestDriver38.size();
        java.lang.Object obj55 = hashMapTestDriver30.get((java.lang.Object) int54);
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        int int57 = hashMapTestDriver56.size();
        boolean boolean59 = hashMapTestDriver56.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set62 = hashMapTestDriver61.entrySet();
        experiment.util.Set set63 = hashMapTestDriver61.entrySet();
        boolean boolean64 = hashMapTestDriver60.containsKey((java.lang.Object) hashMapTestDriver61);
        hashMapTestDriver60.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set67 = hashMapTestDriver66.entrySet();
        experiment.util.Collection collection68 = hashMapTestDriver66.values();
        hashMapTestDriver66.clear();
        experiment.util.Set set70 = hashMapTestDriver66.keySet();
        java.lang.Object obj71 = hashMapTestDriver56.put((java.lang.Object) hashMapTestDriver60, (java.lang.Object) hashMapTestDriver66);
        experiment.util.Collection collection72 = hashMapTestDriver60.values();
        boolean boolean73 = hashMapTestDriver30.containsKey((java.lang.Object) collection72);
        java.lang.Object obj74 = hashMapTestDriver22.remove((java.lang.Object) boolean73);
        java.lang.Object obj75 = hashMapTestDriver10.remove((java.lang.Object) boolean73);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test171");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set13 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        int int15 = hashMapTestDriver14.size();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        hashMapTestDriver18.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver24.values();
        hashMapTestDriver24.clear();
        experiment.util.Set set28 = hashMapTestDriver24.keySet();
        java.lang.Object obj29 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver31);
        hashMapTestDriver30.clear();
        experiment.util.Collection collection36 = hashMapTestDriver30.values();
        experiment.util.Set set37 = hashMapTestDriver30.keySet();
        java.lang.Object obj39 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        java.lang.Object obj43 = hashMapTestDriver30.remove((java.lang.Object) set42);
        java.lang.Object obj44 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj45 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver30);
        int int46 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        int int48 = hashMapTestDriver47.size();
        java.lang.Object obj50 = hashMapTestDriver47.remove((java.lang.Object) 10.0f);
        experiment.util.Set set51 = hashMapTestDriver47.keySet();
        java.lang.Object obj53 = hashMapTestDriver47.get((java.lang.Object) (short) -1);
        hashMapTestDriver47.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set57 = hashMapTestDriver56.entrySet();
        experiment.util.Set set58 = hashMapTestDriver56.entrySet();
        boolean boolean59 = hashMapTestDriver55.containsKey((java.lang.Object) hashMapTestDriver56);
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        int int61 = hashMapTestDriver60.size();
        boolean boolean63 = hashMapTestDriver60.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj66 = hashMapTestDriver64.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set68 = hashMapTestDriver67.entrySet();
        experiment.util.Set set69 = hashMapTestDriver67.entrySet();
        boolean boolean70 = hashMapTestDriver67.isEmpty();
        experiment.util.Collection collection71 = hashMapTestDriver67.values();
        java.lang.Object obj72 = hashMapTestDriver64.get((java.lang.Object) collection71);
        experiment.util.Set set73 = hashMapTestDriver64.keySet();
        boolean boolean74 = hashMapTestDriver60.containsKey((java.lang.Object) set73);
        experiment.util.HashMapTestDriver hashMapTestDriver75 = new experiment.util.HashMapTestDriver();
        int int76 = hashMapTestDriver75.size();
        java.lang.Object obj78 = hashMapTestDriver75.remove((java.lang.Object) 10.0f);
        experiment.util.Set set79 = hashMapTestDriver75.keySet();
        java.lang.Object obj81 = hashMapTestDriver75.get((java.lang.Object) (short) -1);
        hashMapTestDriver75.clear();
        java.lang.Object obj83 = hashMapTestDriver55.put((java.lang.Object) hashMapTestDriver60, (java.lang.Object) hashMapTestDriver75);
        java.lang.Object obj84 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver47, (java.lang.Object) hashMapTestDriver55);
        experiment.util.HashMapTestDriver hashMapTestDriver85 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver86 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set87 = hashMapTestDriver86.entrySet();
        experiment.util.Set set88 = hashMapTestDriver86.entrySet();
        boolean boolean89 = hashMapTestDriver85.containsKey((java.lang.Object) hashMapTestDriver86);
        experiment.util.HashMapTestDriver hashMapTestDriver90 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set91 = hashMapTestDriver90.keySet();
        java.lang.Object obj92 = hashMapTestDriver85.get((java.lang.Object) set91);
        experiment.util.HashMapTestDriver hashMapTestDriver93 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection94 = hashMapTestDriver93.values();
        boolean boolean95 = hashMapTestDriver93.isEmpty();
        boolean boolean96 = hashMapTestDriver93.isEmpty();
        experiment.util.Set set97 = hashMapTestDriver93.entrySet();
        hashMapTestDriver93.clear();
        java.lang.Object obj99 = hashMapTestDriver55.put((java.lang.Object) set91, (java.lang.Object) hashMapTestDriver93);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(set91);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(collection94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(set97);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test172");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test173");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.Collection collection7 = hashMapTestDriver0.values();
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection12 = hashMapTestDriver0.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test174");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) wildcardClass7);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        boolean boolean13 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.keySet();
        java.lang.Object obj16 = hashMapTestDriver9.get((java.lang.Object) set15);
        java.lang.Object obj17 = hashMapTestDriver0.get((java.lang.Object) set15);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        experiment.util.Collection collection20 = hashMapTestDriver18.values();
        hashMapTestDriver18.clear();
        experiment.util.Set set22 = hashMapTestDriver18.keySet();
        boolean boolean24 = hashMapTestDriver18.containsKey((java.lang.Object) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Collection collection27 = hashMapTestDriver25.values();
        experiment.util.Set set28 = hashMapTestDriver25.keySet();
        java.lang.Object obj30 = hashMapTestDriver25.get((java.lang.Object) 0.0d);
        experiment.util.Set set31 = hashMapTestDriver25.entrySet();
        java.lang.Object obj32 = hashMapTestDriver0.put((java.lang.Object) boolean24, (java.lang.Object) set31);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test175");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.Set set7 = hashMapTestDriver5.entrySet();
        boolean boolean8 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver5);
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        hashMapTestDriver10.clear();
        experiment.util.Set set14 = hashMapTestDriver10.keySet();
        java.lang.Object obj15 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        experiment.util.Set set21 = hashMapTestDriver16.keySet();
        boolean boolean22 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver16);
        experiment.util.Set set23 = hashMapTestDriver16.entrySet();
        int int24 = hashMapTestDriver16.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test176");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        int int5 = hashMapTestDriver4.size();
        boolean boolean7 = hashMapTestDriver4.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        hashMapTestDriver8.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.entrySet();
        experiment.util.Collection collection16 = hashMapTestDriver14.values();
        hashMapTestDriver14.clear();
        experiment.util.Set set18 = hashMapTestDriver14.keySet();
        java.lang.Object obj19 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver14);
        experiment.util.Collection collection20 = hashMapTestDriver8.values();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        int int22 = hashMapTestDriver21.size();
        java.lang.Object obj24 = hashMapTestDriver21.remove((java.lang.Object) 10.0f);
        java.lang.Object obj26 = hashMapTestDriver21.get((java.lang.Object) 100.0d);
        experiment.util.Set set27 = hashMapTestDriver21.keySet();
        experiment.util.Set set28 = hashMapTestDriver21.keySet();
        boolean boolean29 = hashMapTestDriver8.containsKey((java.lang.Object) set28);
        java.lang.Object obj30 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Collection collection33 = hashMapTestDriver31.values();
        experiment.util.Set set34 = hashMapTestDriver31.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection36 = hashMapTestDriver35.values();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.entrySet();
        experiment.util.Set set40 = hashMapTestDriver38.entrySet();
        boolean boolean41 = hashMapTestDriver37.containsKey((java.lang.Object) hashMapTestDriver38);
        experiment.util.Set set42 = hashMapTestDriver37.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        int int44 = hashMapTestDriver43.size();
        boolean boolean46 = hashMapTestDriver43.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set49 = hashMapTestDriver48.entrySet();
        experiment.util.Set set50 = hashMapTestDriver48.entrySet();
        boolean boolean51 = hashMapTestDriver47.containsKey((java.lang.Object) hashMapTestDriver48);
        hashMapTestDriver47.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set54 = hashMapTestDriver53.entrySet();
        experiment.util.Collection collection55 = hashMapTestDriver53.values();
        hashMapTestDriver53.clear();
        experiment.util.Set set57 = hashMapTestDriver53.keySet();
        java.lang.Object obj58 = hashMapTestDriver43.put((java.lang.Object) hashMapTestDriver47, (java.lang.Object) hashMapTestDriver53);
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set61 = hashMapTestDriver60.entrySet();
        experiment.util.Set set62 = hashMapTestDriver60.entrySet();
        boolean boolean63 = hashMapTestDriver59.containsKey((java.lang.Object) hashMapTestDriver60);
        hashMapTestDriver59.clear();
        experiment.util.Collection collection65 = hashMapTestDriver59.values();
        experiment.util.Set set66 = hashMapTestDriver59.keySet();
        java.lang.Object obj68 = hashMapTestDriver43.put((java.lang.Object) hashMapTestDriver59, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver69 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set70 = hashMapTestDriver69.entrySet();
        experiment.util.Set set71 = hashMapTestDriver69.entrySet();
        java.lang.Object obj72 = hashMapTestDriver59.remove((java.lang.Object) set71);
        java.lang.Object obj73 = hashMapTestDriver35.put((java.lang.Object) hashMapTestDriver37, (java.lang.Object) hashMapTestDriver59);
        boolean boolean74 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver59);
        boolean boolean75 = hashMapTestDriver31.isEmpty();
        int int76 = hashMapTestDriver31.size();
        boolean boolean77 = hashMapTestDriver31.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver78 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set79 = hashMapTestDriver78.entrySet();
        experiment.util.Collection collection80 = hashMapTestDriver78.values();
        experiment.util.Set set81 = hashMapTestDriver78.keySet();
        java.lang.Object obj83 = hashMapTestDriver78.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver84 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set85 = hashMapTestDriver84.entrySet();
        experiment.util.Collection collection86 = hashMapTestDriver84.values();
        hashMapTestDriver84.clear();
        experiment.util.Set set88 = hashMapTestDriver84.keySet();
        java.lang.Object obj89 = hashMapTestDriver78.get((java.lang.Object) set88);
        int int90 = hashMapTestDriver78.size();
        java.lang.Object obj91 = hashMapTestDriver31.remove((java.lang.Object) hashMapTestDriver78);
        experiment.util.Set set92 = hashMapTestDriver31.keySet();
        boolean boolean93 = hashMapTestDriver0.containsKey((java.lang.Object) set92);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(set92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test177");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver10.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.entrySet();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        boolean boolean19 = hashMapTestDriver16.isEmpty();
        experiment.util.Collection collection20 = hashMapTestDriver16.values();
        java.lang.Object obj21 = hashMapTestDriver13.get((java.lang.Object) collection20);
        experiment.util.Set set22 = hashMapTestDriver13.keySet();
        java.lang.Object obj23 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver10, (java.lang.Object) hashMapTestDriver13);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver24.values();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set28 = hashMapTestDriver27.entrySet();
        experiment.util.Set set29 = hashMapTestDriver27.entrySet();
        boolean boolean30 = hashMapTestDriver27.isEmpty();
        experiment.util.Collection collection31 = hashMapTestDriver27.values();
        java.lang.Object obj32 = hashMapTestDriver24.remove((java.lang.Object) collection31);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = hashMapTestDriver10.containsKey(obj32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test178");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        experiment.util.Set set8 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test179");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set7 = hashMapTestDriver6.entrySet();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        boolean boolean9 = hashMapTestDriver5.containsKey((java.lang.Object) hashMapTestDriver6);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.keySet();
        java.lang.Object obj12 = hashMapTestDriver5.get((java.lang.Object) set11);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.entrySet();
        experiment.util.Set set16 = hashMapTestDriver14.entrySet();
        boolean boolean17 = hashMapTestDriver13.containsKey((java.lang.Object) hashMapTestDriver14);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.keySet();
        java.lang.Object obj20 = hashMapTestDriver13.get((java.lang.Object) set19);
        experiment.util.Set set21 = hashMapTestDriver13.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        int int23 = hashMapTestDriver22.size();
        java.lang.Object obj25 = hashMapTestDriver22.get((java.lang.Object) 10.0d);
        boolean boolean26 = hashMapTestDriver13.containsKey((java.lang.Object) hashMapTestDriver22);
        experiment.util.Set set27 = hashMapTestDriver13.keySet();
        experiment.util.Set set28 = hashMapTestDriver13.keySet();
        java.lang.Object obj29 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver13);
        int int30 = hashMapTestDriver5.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test180");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.Set set7 = hashMapTestDriver5.entrySet();
        boolean boolean8 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver5);
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        hashMapTestDriver10.clear();
        experiment.util.Set set14 = hashMapTestDriver10.keySet();
        java.lang.Object obj15 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) hashMapTestDriver10);
        experiment.util.Collection collection16 = hashMapTestDriver4.values();
        int int17 = hashMapTestDriver4.size();
        hashMapTestDriver4.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test181");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        int int10 = hashMapTestDriver9.size();
        java.lang.Object obj12 = hashMapTestDriver9.get((java.lang.Object) 10.0d);
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver9);
        int int14 = hashMapTestDriver9.size();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.entrySet();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        boolean boolean19 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver16);
        hashMapTestDriver15.clear();
        experiment.util.Collection collection21 = hashMapTestDriver15.values();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        int int24 = hashMapTestDriver23.size();
        java.lang.Object obj25 = hashMapTestDriver15.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver23);
        boolean boolean26 = hashMapTestDriver23.isEmpty();
        experiment.util.Collection collection27 = hashMapTestDriver23.values();
        java.lang.Object obj28 = hashMapTestDriver9.remove((java.lang.Object) hashMapTestDriver23);
        experiment.util.Set set29 = hashMapTestDriver23.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test182");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.entrySet();
        experiment.util.Set set6 = hashMapTestDriver4.entrySet();
        boolean boolean7 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.keySet();
        java.lang.Object obj10 = hashMapTestDriver3.get((java.lang.Object) set9);
        experiment.util.Set set11 = hashMapTestDriver3.entrySet();
        java.lang.Object obj13 = hashMapTestDriver0.put((java.lang.Object) set11, (java.lang.Object) 1.0d);
        boolean boolean14 = hashMapTestDriver0.isEmpty();
        boolean boolean15 = hashMapTestDriver0.isEmpty();
        int int16 = hashMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test183");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set4 = hashMapTestDriver3.entrySet();
        experiment.util.Set set5 = hashMapTestDriver3.entrySet();
        boolean boolean6 = hashMapTestDriver3.isEmpty();
        experiment.util.Collection collection7 = hashMapTestDriver3.values();
        java.lang.Object obj8 = hashMapTestDriver0.get((java.lang.Object) collection7);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Collection collection11 = hashMapTestDriver9.values();
        experiment.util.Set set12 = hashMapTestDriver9.keySet();
        java.lang.Object obj14 = hashMapTestDriver9.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        experiment.util.Set set20 = hashMapTestDriver18.entrySet();
        boolean boolean21 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver18);
        experiment.util.Set set22 = hashMapTestDriver17.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        int int24 = hashMapTestDriver23.size();
        boolean boolean26 = hashMapTestDriver23.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.entrySet();
        experiment.util.Set set30 = hashMapTestDriver28.entrySet();
        boolean boolean31 = hashMapTestDriver27.containsKey((java.lang.Object) hashMapTestDriver28);
        hashMapTestDriver27.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set34 = hashMapTestDriver33.entrySet();
        experiment.util.Collection collection35 = hashMapTestDriver33.values();
        hashMapTestDriver33.clear();
        experiment.util.Set set37 = hashMapTestDriver33.keySet();
        java.lang.Object obj38 = hashMapTestDriver23.put((java.lang.Object) hashMapTestDriver27, (java.lang.Object) hashMapTestDriver33);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        boolean boolean43 = hashMapTestDriver39.containsKey((java.lang.Object) hashMapTestDriver40);
        hashMapTestDriver39.clear();
        experiment.util.Collection collection45 = hashMapTestDriver39.values();
        experiment.util.Set set46 = hashMapTestDriver39.keySet();
        java.lang.Object obj48 = hashMapTestDriver23.put((java.lang.Object) hashMapTestDriver39, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set50 = hashMapTestDriver49.entrySet();
        experiment.util.Set set51 = hashMapTestDriver49.entrySet();
        java.lang.Object obj52 = hashMapTestDriver39.remove((java.lang.Object) set51);
        java.lang.Object obj53 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver17, (java.lang.Object) hashMapTestDriver39);
        java.lang.Object obj54 = hashMapTestDriver9.get((java.lang.Object) hashMapTestDriver39);
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set57 = hashMapTestDriver56.entrySet();
        experiment.util.Set set58 = hashMapTestDriver56.entrySet();
        boolean boolean59 = hashMapTestDriver55.containsKey((java.lang.Object) hashMapTestDriver56);
        hashMapTestDriver55.clear();
        java.lang.Object obj61 = new java.lang.Object();
        java.lang.Class<?> wildcardClass62 = obj61.getClass();
        boolean boolean63 = hashMapTestDriver55.containsKey((java.lang.Object) wildcardClass62);
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        int int65 = hashMapTestDriver64.size();
        java.lang.Object obj67 = hashMapTestDriver64.remove((java.lang.Object) 10.0f);
        experiment.util.Set set68 = hashMapTestDriver64.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver69 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set70 = hashMapTestDriver69.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set73 = hashMapTestDriver72.entrySet();
        experiment.util.Set set74 = hashMapTestDriver72.entrySet();
        boolean boolean75 = hashMapTestDriver71.containsKey((java.lang.Object) hashMapTestDriver72);
        java.lang.Object obj76 = hashMapTestDriver64.put((java.lang.Object) hashMapTestDriver69, (java.lang.Object) hashMapTestDriver71);
        java.lang.Class<?> wildcardClass77 = hashMapTestDriver69.getClass();
        java.lang.Object obj78 = hashMapTestDriver9.put((java.lang.Object) wildcardClass62, (java.lang.Object) hashMapTestDriver69);
        experiment.util.HashMapTestDriver hashMapTestDriver79 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set80 = hashMapTestDriver79.entrySet();
        experiment.util.Collection collection81 = hashMapTestDriver79.values();
        hashMapTestDriver79.clear();
        experiment.util.Set set83 = hashMapTestDriver79.keySet();
        experiment.util.Collection collection84 = hashMapTestDriver79.values();
        experiment.util.Set set85 = hashMapTestDriver79.entrySet();
        java.lang.Object obj86 = hashMapTestDriver0.put((java.lang.Object) wildcardClass62, (java.lang.Object) hashMapTestDriver79);
        experiment.util.Set set87 = hashMapTestDriver0.entrySet();
        experiment.util.Set set88 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNotNull(set88);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test184");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test185");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        int int10 = hashMapTestDriver9.size();
        java.lang.Object obj12 = hashMapTestDriver9.get((java.lang.Object) 10.0d);
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set14 = hashMapTestDriver0.keySet();
        experiment.util.Set set15 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test186");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass7 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test187");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        int int6 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Collection collection10 = hashMapTestDriver8.values();
        experiment.util.Set set11 = hashMapTestDriver8.keySet();
        boolean boolean12 = hashMapTestDriver0.containsKey((java.lang.Object) set11);
        int int13 = hashMapTestDriver0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test188");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        int int3 = hashMapTestDriver2.size();
        boolean boolean5 = hashMapTestDriver2.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.entrySet();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        boolean boolean10 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        hashMapTestDriver6.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        experiment.util.Collection collection14 = hashMapTestDriver12.values();
        hashMapTestDriver12.clear();
        experiment.util.Set set16 = hashMapTestDriver12.keySet();
        java.lang.Object obj17 = hashMapTestDriver2.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) hashMapTestDriver12);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        hashMapTestDriver18.clear();
        experiment.util.Collection collection24 = hashMapTestDriver18.values();
        experiment.util.Set set25 = hashMapTestDriver18.keySet();
        java.lang.Object obj27 = hashMapTestDriver2.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.entrySet();
        experiment.util.Set set30 = hashMapTestDriver28.entrySet();
        java.lang.Object obj31 = hashMapTestDriver18.remove((java.lang.Object) set30);
        java.lang.Object obj32 = hashMapTestDriver0.remove((java.lang.Object) set30);
        int int33 = hashMapTestDriver0.size();
        experiment.util.Set set34 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass35 = set34.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test189");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.Set set7 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test190");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set13 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        int int15 = hashMapTestDriver14.size();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        hashMapTestDriver18.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver24.values();
        hashMapTestDriver24.clear();
        experiment.util.Set set28 = hashMapTestDriver24.keySet();
        java.lang.Object obj29 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver31);
        hashMapTestDriver30.clear();
        experiment.util.Collection collection36 = hashMapTestDriver30.values();
        experiment.util.Set set37 = hashMapTestDriver30.keySet();
        java.lang.Object obj39 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        java.lang.Object obj43 = hashMapTestDriver30.remove((java.lang.Object) set42);
        java.lang.Object obj44 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj45 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver30);
        int int46 = hashMapTestDriver0.size();
        boolean boolean47 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set48 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(set48);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test191");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.Collection collection7 = hashMapTestDriver0.values();
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test192");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.entrySet();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        boolean boolean10 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set12 = hashMapTestDriver11.keySet();
        java.lang.Object obj13 = hashMapTestDriver6.get((java.lang.Object) set12);
        experiment.util.Collection collection14 = hashMapTestDriver6.values();
        java.lang.Object obj16 = hashMapTestDriver6.remove((java.lang.Object) (-1.0d));
        java.lang.Object obj17 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver6);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test193");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.Set set3 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        int int6 = hashMapTestDriver5.size();
        java.lang.Object obj8 = hashMapTestDriver5.remove((java.lang.Object) 10.0f);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        java.lang.Object obj14 = hashMapTestDriver10.remove((java.lang.Object) 10.0f);
        java.lang.Object obj15 = hashMapTestDriver5.get((java.lang.Object) hashMapTestDriver10);
        java.lang.Object obj16 = hashMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        experiment.util.Set set20 = hashMapTestDriver18.entrySet();
        boolean boolean21 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver18);
        hashMapTestDriver17.clear();
        experiment.util.Set set23 = hashMapTestDriver17.entrySet();
        java.lang.Object obj24 = hashMapTestDriver10.remove((java.lang.Object) set23);
        experiment.util.Set set25 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver10.values();
        java.lang.Class<?> wildcardClass27 = hashMapTestDriver10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test194");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) wildcardClass7);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        boolean boolean13 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.keySet();
        java.lang.Object obj16 = hashMapTestDriver9.get((java.lang.Object) set15);
        java.lang.Object obj17 = hashMapTestDriver0.get((java.lang.Object) set15);
        experiment.util.Set set18 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test195");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.Collection collection7 = hashMapTestDriver5.values();
        java.lang.Object obj9 = hashMapTestDriver5.remove((java.lang.Object) 10.0f);
        java.lang.Object obj10 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver5);
        experiment.util.Collection collection11 = hashMapTestDriver5.values();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        experiment.util.Collection collection14 = hashMapTestDriver12.values();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.entrySet();
        experiment.util.Set set17 = hashMapTestDriver15.entrySet();
        boolean boolean18 = hashMapTestDriver15.isEmpty();
        experiment.util.Collection collection19 = hashMapTestDriver15.values();
        java.lang.Object obj20 = hashMapTestDriver12.remove((java.lang.Object) collection19);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Set set24 = hashMapTestDriver22.entrySet();
        boolean boolean25 = hashMapTestDriver21.containsKey((java.lang.Object) hashMapTestDriver22);
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        int int27 = hashMapTestDriver26.size();
        boolean boolean29 = hashMapTestDriver26.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set34 = hashMapTestDriver33.entrySet();
        experiment.util.Set set35 = hashMapTestDriver33.entrySet();
        boolean boolean36 = hashMapTestDriver33.isEmpty();
        experiment.util.Collection collection37 = hashMapTestDriver33.values();
        java.lang.Object obj38 = hashMapTestDriver30.get((java.lang.Object) collection37);
        experiment.util.Set set39 = hashMapTestDriver30.keySet();
        boolean boolean40 = hashMapTestDriver26.containsKey((java.lang.Object) set39);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        int int42 = hashMapTestDriver41.size();
        java.lang.Object obj44 = hashMapTestDriver41.remove((java.lang.Object) 10.0f);
        experiment.util.Set set45 = hashMapTestDriver41.keySet();
        java.lang.Object obj47 = hashMapTestDriver41.get((java.lang.Object) (short) -1);
        hashMapTestDriver41.clear();
        java.lang.Object obj49 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver26, (java.lang.Object) hashMapTestDriver41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj50 = hashMapTestDriver5.put((java.lang.Object) collection19, obj49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test196");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test197");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.Set set3 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        int int5 = hashMapTestDriver4.size();
        experiment.util.Collection collection6 = hashMapTestDriver4.values();
        boolean boolean7 = hashMapTestDriver4.isEmpty();
        experiment.util.Collection collection8 = hashMapTestDriver4.values();
        java.lang.Object obj9 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set12 = hashMapTestDriver11.entrySet();
        experiment.util.Set set13 = hashMapTestDriver11.entrySet();
        boolean boolean14 = hashMapTestDriver10.containsKey((java.lang.Object) hashMapTestDriver11);
        java.lang.Object obj16 = hashMapTestDriver10.get((java.lang.Object) 100.0d);
        experiment.util.Set set17 = hashMapTestDriver10.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        int int19 = hashMapTestDriver18.size();
        boolean boolean21 = hashMapTestDriver18.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.entrySet();
        experiment.util.Set set25 = hashMapTestDriver23.entrySet();
        boolean boolean26 = hashMapTestDriver22.containsKey((java.lang.Object) hashMapTestDriver23);
        hashMapTestDriver22.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set29 = hashMapTestDriver28.entrySet();
        experiment.util.Collection collection30 = hashMapTestDriver28.values();
        hashMapTestDriver28.clear();
        experiment.util.Set set32 = hashMapTestDriver28.keySet();
        java.lang.Object obj33 = hashMapTestDriver18.put((java.lang.Object) hashMapTestDriver22, (java.lang.Object) hashMapTestDriver28);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.entrySet();
        experiment.util.Set set37 = hashMapTestDriver35.entrySet();
        boolean boolean38 = hashMapTestDriver34.containsKey((java.lang.Object) hashMapTestDriver35);
        hashMapTestDriver34.clear();
        experiment.util.Collection collection40 = hashMapTestDriver34.values();
        experiment.util.Set set41 = hashMapTestDriver34.keySet();
        java.lang.Object obj43 = hashMapTestDriver18.put((java.lang.Object) hashMapTestDriver34, (java.lang.Object) '4');
        java.lang.Object obj44 = hashMapTestDriver10.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set47 = hashMapTestDriver46.entrySet();
        experiment.util.Set set48 = hashMapTestDriver46.entrySet();
        boolean boolean49 = hashMapTestDriver45.containsKey((java.lang.Object) hashMapTestDriver46);
        hashMapTestDriver45.clear();
        experiment.util.Set set51 = hashMapTestDriver45.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        int int53 = hashMapTestDriver52.size();
        int int54 = hashMapTestDriver52.size();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set56 = hashMapTestDriver55.entrySet();
        experiment.util.Collection collection57 = hashMapTestDriver55.values();
        hashMapTestDriver55.clear();
        experiment.util.Set set59 = hashMapTestDriver55.keySet();
        java.lang.Object obj61 = hashMapTestDriver52.put((java.lang.Object) set59, (java.lang.Object) true);
        java.lang.Object obj62 = hashMapTestDriver10.put((java.lang.Object) hashMapTestDriver45, (java.lang.Object) hashMapTestDriver52);
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set64 = hashMapTestDriver63.entrySet();
        experiment.util.Collection collection65 = hashMapTestDriver63.values();
        experiment.util.Set set66 = hashMapTestDriver63.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        int int68 = hashMapTestDriver67.size();
        boolean boolean70 = hashMapTestDriver67.containsKey((java.lang.Object) (byte) 100);
        experiment.util.Set set71 = hashMapTestDriver67.keySet();
        java.lang.Object obj72 = hashMapTestDriver10.put((java.lang.Object) set66, (java.lang.Object) hashMapTestDriver67);
        hashMapTestDriver10.clear();
        java.lang.Object obj74 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver10);
        java.lang.Class<?> wildcardClass75 = hashMapTestDriver10.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test198");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test199");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        hashMapTestDriver0.clear();
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        boolean boolean13 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver10);
        hashMapTestDriver9.clear();
        experiment.util.Collection collection15 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        int int18 = hashMapTestDriver17.size();
        java.lang.Object obj19 = hashMapTestDriver9.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver17);
        boolean boolean20 = hashMapTestDriver17.isEmpty();
        java.lang.Object obj21 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver17);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        int int23 = hashMapTestDriver22.size();
        java.lang.Object obj25 = hashMapTestDriver22.remove((java.lang.Object) 10.0f);
        java.lang.Object obj27 = hashMapTestDriver22.get((java.lang.Object) 100.0d);
        experiment.util.Set set28 = hashMapTestDriver22.keySet();
        java.lang.Object obj29 = hashMapTestDriver17.get((java.lang.Object) set28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = obj29.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test200");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.Set set3 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        int int6 = hashMapTestDriver5.size();
        java.lang.Object obj8 = hashMapTestDriver5.remove((java.lang.Object) 10.0f);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        java.lang.Object obj14 = hashMapTestDriver10.remove((java.lang.Object) 10.0f);
        java.lang.Object obj15 = hashMapTestDriver5.get((java.lang.Object) hashMapTestDriver10);
        java.lang.Object obj16 = hashMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        experiment.util.Set set20 = hashMapTestDriver18.entrySet();
        boolean boolean21 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver18);
        java.lang.Object obj23 = hashMapTestDriver17.get((java.lang.Object) 100.0d);
        hashMapTestDriver17.clear();
        java.lang.Object obj26 = hashMapTestDriver17.get((java.lang.Object) 10.0f);
        boolean boolean27 = hashMapTestDriver17.isEmpty();
        experiment.util.Set set28 = hashMapTestDriver17.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj31 = hashMapTestDriver29.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set34 = hashMapTestDriver33.entrySet();
        experiment.util.Set set35 = hashMapTestDriver33.entrySet();
        boolean boolean36 = hashMapTestDriver32.containsKey((java.lang.Object) hashMapTestDriver33);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set38 = hashMapTestDriver37.keySet();
        java.lang.Object obj39 = hashMapTestDriver32.get((java.lang.Object) set38);
        experiment.util.Set set40 = hashMapTestDriver32.entrySet();
        java.lang.Object obj42 = hashMapTestDriver29.put((java.lang.Object) set40, (java.lang.Object) 1.0d);
        hashMapTestDriver29.clear();
        java.lang.Object obj44 = hashMapTestDriver17.get((java.lang.Object) hashMapTestDriver29);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        int int46 = hashMapTestDriver45.size();
        int int47 = hashMapTestDriver45.size();
        java.lang.Class<?> wildcardClass48 = hashMapTestDriver45.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj49 = hashMapTestDriver0.put(obj44, (java.lang.Object) hashMapTestDriver45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test201");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.keySet();
        java.lang.Object obj15 = hashMapTestDriver8.get((java.lang.Object) set14);
        experiment.util.Set set16 = hashMapTestDriver8.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        int int18 = hashMapTestDriver17.size();
        java.lang.Object obj20 = hashMapTestDriver17.remove((java.lang.Object) 10.0f);
        java.lang.Object obj21 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) 10.0f);
        experiment.util.Set set22 = hashMapTestDriver8.entrySet();
        boolean boolean23 = hashMapTestDriver8.isEmpty();
        int int24 = hashMapTestDriver8.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test202");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set4 = hashMapTestDriver3.entrySet();
        experiment.util.Set set5 = hashMapTestDriver3.entrySet();
        boolean boolean6 = hashMapTestDriver2.containsKey((java.lang.Object) hashMapTestDriver3);
        experiment.util.Set set7 = hashMapTestDriver2.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        int int9 = hashMapTestDriver8.size();
        boolean boolean11 = hashMapTestDriver8.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.entrySet();
        experiment.util.Set set15 = hashMapTestDriver13.entrySet();
        boolean boolean16 = hashMapTestDriver12.containsKey((java.lang.Object) hashMapTestDriver13);
        hashMapTestDriver12.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        experiment.util.Collection collection20 = hashMapTestDriver18.values();
        hashMapTestDriver18.clear();
        experiment.util.Set set22 = hashMapTestDriver18.keySet();
        java.lang.Object obj23 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver12, (java.lang.Object) hashMapTestDriver18);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        boolean boolean28 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver25);
        hashMapTestDriver24.clear();
        experiment.util.Collection collection30 = hashMapTestDriver24.values();
        experiment.util.Set set31 = hashMapTestDriver24.keySet();
        java.lang.Object obj33 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set35 = hashMapTestDriver34.entrySet();
        experiment.util.Set set36 = hashMapTestDriver34.entrySet();
        java.lang.Object obj37 = hashMapTestDriver24.remove((java.lang.Object) set36);
        java.lang.Object obj38 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver2, (java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set40 = hashMapTestDriver39.entrySet();
        experiment.util.Collection collection41 = hashMapTestDriver39.values();
        experiment.util.Set set42 = hashMapTestDriver39.keySet();
        java.lang.Object obj44 = hashMapTestDriver39.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection46 = hashMapTestDriver45.values();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set49 = hashMapTestDriver48.entrySet();
        experiment.util.Set set50 = hashMapTestDriver48.entrySet();
        boolean boolean51 = hashMapTestDriver47.containsKey((java.lang.Object) hashMapTestDriver48);
        experiment.util.Set set52 = hashMapTestDriver47.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        int int54 = hashMapTestDriver53.size();
        boolean boolean56 = hashMapTestDriver53.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set59 = hashMapTestDriver58.entrySet();
        experiment.util.Set set60 = hashMapTestDriver58.entrySet();
        boolean boolean61 = hashMapTestDriver57.containsKey((java.lang.Object) hashMapTestDriver58);
        hashMapTestDriver57.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set64 = hashMapTestDriver63.entrySet();
        experiment.util.Collection collection65 = hashMapTestDriver63.values();
        hashMapTestDriver63.clear();
        experiment.util.Set set67 = hashMapTestDriver63.keySet();
        java.lang.Object obj68 = hashMapTestDriver53.put((java.lang.Object) hashMapTestDriver57, (java.lang.Object) hashMapTestDriver63);
        experiment.util.HashMapTestDriver hashMapTestDriver69 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver70 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set71 = hashMapTestDriver70.entrySet();
        experiment.util.Set set72 = hashMapTestDriver70.entrySet();
        boolean boolean73 = hashMapTestDriver69.containsKey((java.lang.Object) hashMapTestDriver70);
        hashMapTestDriver69.clear();
        experiment.util.Collection collection75 = hashMapTestDriver69.values();
        experiment.util.Set set76 = hashMapTestDriver69.keySet();
        java.lang.Object obj78 = hashMapTestDriver53.put((java.lang.Object) hashMapTestDriver69, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver79 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set80 = hashMapTestDriver79.entrySet();
        experiment.util.Set set81 = hashMapTestDriver79.entrySet();
        java.lang.Object obj82 = hashMapTestDriver69.remove((java.lang.Object) set81);
        java.lang.Object obj83 = hashMapTestDriver45.put((java.lang.Object) hashMapTestDriver47, (java.lang.Object) hashMapTestDriver69);
        java.lang.Object obj84 = hashMapTestDriver39.get((java.lang.Object) hashMapTestDriver69);
        int int85 = hashMapTestDriver39.size();
        experiment.util.HashMapTestDriver hashMapTestDriver86 = new experiment.util.HashMapTestDriver();
        int int87 = hashMapTestDriver86.size();
        java.lang.Object obj88 = hashMapTestDriver39.get((java.lang.Object) int87);
        java.lang.Class<?> wildcardClass89 = hashMapTestDriver39.getClass();
        java.lang.Object obj90 = hashMapTestDriver2.get((java.lang.Object) hashMapTestDriver39);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNotNull(wildcardClass89);
        org.junit.Assert.assertNull(obj90);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test203");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.Set set7 = hashMapTestDriver5.entrySet();
        boolean boolean8 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver5);
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        hashMapTestDriver10.clear();
        experiment.util.Set set14 = hashMapTestDriver10.keySet();
        java.lang.Object obj15 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        hashMapTestDriver16.clear();
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        experiment.util.Set set23 = hashMapTestDriver16.keySet();
        java.lang.Object obj25 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) '4');
        java.lang.Object obj27 = hashMapTestDriver16.remove((java.lang.Object) 100.0d);
        experiment.util.Set set28 = hashMapTestDriver16.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        int int30 = hashMapTestDriver29.size();
        java.lang.Object obj32 = hashMapTestDriver29.remove((java.lang.Object) 10.0f);
        experiment.util.Set set33 = hashMapTestDriver29.keySet();
        java.lang.Object obj34 = hashMapTestDriver16.get((java.lang.Object) set33);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test204");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.Set set7 = hashMapTestDriver5.entrySet();
        boolean boolean8 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver5);
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        hashMapTestDriver10.clear();
        experiment.util.Set set14 = hashMapTestDriver10.keySet();
        java.lang.Object obj15 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) hashMapTestDriver10);
        experiment.util.Collection collection16 = hashMapTestDriver4.values();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        int int18 = hashMapTestDriver17.size();
        java.lang.Object obj20 = hashMapTestDriver17.remove((java.lang.Object) 10.0f);
        java.lang.Object obj22 = hashMapTestDriver17.get((java.lang.Object) 100.0d);
        experiment.util.Set set23 = hashMapTestDriver17.keySet();
        experiment.util.Set set24 = hashMapTestDriver17.keySet();
        boolean boolean25 = hashMapTestDriver4.containsKey((java.lang.Object) set24);
        experiment.util.Set set26 = hashMapTestDriver4.keySet();
        java.lang.Class<?> wildcardClass27 = set26.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test205");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.Collection collection7 = hashMapTestDriver0.values();
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        boolean boolean9 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        experiment.util.Set set13 = hashMapTestDriver10.keySet();
        java.lang.Object obj15 = hashMapTestDriver10.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        experiment.util.Set set23 = hashMapTestDriver18.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        int int25 = hashMapTestDriver24.size();
        boolean boolean27 = hashMapTestDriver24.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        boolean boolean32 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver29);
        hashMapTestDriver28.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set35 = hashMapTestDriver34.entrySet();
        experiment.util.Collection collection36 = hashMapTestDriver34.values();
        hashMapTestDriver34.clear();
        experiment.util.Set set38 = hashMapTestDriver34.keySet();
        java.lang.Object obj39 = hashMapTestDriver24.put((java.lang.Object) hashMapTestDriver28, (java.lang.Object) hashMapTestDriver34);
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set42 = hashMapTestDriver41.entrySet();
        experiment.util.Set set43 = hashMapTestDriver41.entrySet();
        boolean boolean44 = hashMapTestDriver40.containsKey((java.lang.Object) hashMapTestDriver41);
        hashMapTestDriver40.clear();
        experiment.util.Collection collection46 = hashMapTestDriver40.values();
        experiment.util.Set set47 = hashMapTestDriver40.keySet();
        java.lang.Object obj49 = hashMapTestDriver24.put((java.lang.Object) hashMapTestDriver40, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set51 = hashMapTestDriver50.entrySet();
        experiment.util.Set set52 = hashMapTestDriver50.entrySet();
        java.lang.Object obj53 = hashMapTestDriver40.remove((java.lang.Object) set52);
        java.lang.Object obj54 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver40);
        java.lang.Object obj55 = hashMapTestDriver10.get((java.lang.Object) hashMapTestDriver40);
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set58 = hashMapTestDriver57.entrySet();
        experiment.util.Set set59 = hashMapTestDriver57.entrySet();
        boolean boolean60 = hashMapTestDriver56.containsKey((java.lang.Object) hashMapTestDriver57);
        hashMapTestDriver56.clear();
        java.lang.Object obj62 = new java.lang.Object();
        java.lang.Class<?> wildcardClass63 = obj62.getClass();
        boolean boolean64 = hashMapTestDriver56.containsKey((java.lang.Object) wildcardClass63);
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        int int66 = hashMapTestDriver65.size();
        java.lang.Object obj68 = hashMapTestDriver65.remove((java.lang.Object) 10.0f);
        experiment.util.Set set69 = hashMapTestDriver65.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver70 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set71 = hashMapTestDriver70.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver73 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set74 = hashMapTestDriver73.entrySet();
        experiment.util.Set set75 = hashMapTestDriver73.entrySet();
        boolean boolean76 = hashMapTestDriver72.containsKey((java.lang.Object) hashMapTestDriver73);
        java.lang.Object obj77 = hashMapTestDriver65.put((java.lang.Object) hashMapTestDriver70, (java.lang.Object) hashMapTestDriver72);
        java.lang.Class<?> wildcardClass78 = hashMapTestDriver70.getClass();
        java.lang.Object obj79 = hashMapTestDriver10.put((java.lang.Object) wildcardClass63, (java.lang.Object) hashMapTestDriver70);
        experiment.util.Set set80 = hashMapTestDriver10.keySet();
        boolean boolean81 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver10);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test206");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set7 = hashMapTestDriver6.entrySet();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        boolean boolean9 = hashMapTestDriver5.containsKey((java.lang.Object) hashMapTestDriver6);
        java.lang.Object obj11 = hashMapTestDriver5.get((java.lang.Object) 100.0d);
        experiment.util.Set set12 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        int int14 = hashMapTestDriver13.size();
        boolean boolean16 = hashMapTestDriver13.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        experiment.util.Set set20 = hashMapTestDriver18.entrySet();
        boolean boolean21 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver18);
        hashMapTestDriver17.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set24 = hashMapTestDriver23.entrySet();
        experiment.util.Collection collection25 = hashMapTestDriver23.values();
        hashMapTestDriver23.clear();
        experiment.util.Set set27 = hashMapTestDriver23.keySet();
        java.lang.Object obj28 = hashMapTestDriver13.put((java.lang.Object) hashMapTestDriver17, (java.lang.Object) hashMapTestDriver23);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set31 = hashMapTestDriver30.entrySet();
        experiment.util.Set set32 = hashMapTestDriver30.entrySet();
        boolean boolean33 = hashMapTestDriver29.containsKey((java.lang.Object) hashMapTestDriver30);
        hashMapTestDriver29.clear();
        experiment.util.Collection collection35 = hashMapTestDriver29.values();
        experiment.util.Set set36 = hashMapTestDriver29.keySet();
        java.lang.Object obj38 = hashMapTestDriver13.put((java.lang.Object) hashMapTestDriver29, (java.lang.Object) '4');
        java.lang.Object obj39 = hashMapTestDriver5.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set42 = hashMapTestDriver41.entrySet();
        experiment.util.Set set43 = hashMapTestDriver41.entrySet();
        boolean boolean44 = hashMapTestDriver40.containsKey((java.lang.Object) hashMapTestDriver41);
        hashMapTestDriver40.clear();
        experiment.util.Set set46 = hashMapTestDriver40.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        int int48 = hashMapTestDriver47.size();
        int int49 = hashMapTestDriver47.size();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set51 = hashMapTestDriver50.entrySet();
        experiment.util.Collection collection52 = hashMapTestDriver50.values();
        hashMapTestDriver50.clear();
        experiment.util.Set set54 = hashMapTestDriver50.keySet();
        java.lang.Object obj56 = hashMapTestDriver47.put((java.lang.Object) set54, (java.lang.Object) true);
        java.lang.Object obj57 = hashMapTestDriver5.put((java.lang.Object) hashMapTestDriver40, (java.lang.Object) hashMapTestDriver47);
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set59 = hashMapTestDriver58.entrySet();
        experiment.util.Collection collection60 = hashMapTestDriver58.values();
        experiment.util.Set set61 = hashMapTestDriver58.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        int int63 = hashMapTestDriver62.size();
        boolean boolean65 = hashMapTestDriver62.containsKey((java.lang.Object) (byte) 100);
        experiment.util.Set set66 = hashMapTestDriver62.keySet();
        java.lang.Object obj67 = hashMapTestDriver5.put((java.lang.Object) set61, (java.lang.Object) hashMapTestDriver62);
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        int int69 = hashMapTestDriver68.size();
        java.lang.Object obj71 = hashMapTestDriver68.remove((java.lang.Object) 10.0f);
        experiment.util.Set set72 = hashMapTestDriver68.keySet();
        java.lang.Object obj74 = hashMapTestDriver68.get((java.lang.Object) (short) -1);
        hashMapTestDriver68.clear();
        java.lang.Object obj76 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver62, (java.lang.Object) hashMapTestDriver68);
        int int77 = hashMapTestDriver68.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test207");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        hashMapTestDriver0.clear();
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        boolean boolean13 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver10);
        hashMapTestDriver9.clear();
        experiment.util.Collection collection15 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        int int18 = hashMapTestDriver17.size();
        java.lang.Object obj19 = hashMapTestDriver9.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver17);
        boolean boolean20 = hashMapTestDriver17.isEmpty();
        java.lang.Object obj21 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver17);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        int int23 = hashMapTestDriver22.size();
        java.lang.Object obj25 = hashMapTestDriver22.remove((java.lang.Object) 10.0f);
        java.lang.Object obj27 = hashMapTestDriver22.get((java.lang.Object) 100.0d);
        experiment.util.Set set28 = hashMapTestDriver22.keySet();
        java.lang.Object obj29 = hashMapTestDriver17.get((java.lang.Object) set28);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.get((java.lang.Object) 0.0d);
        boolean boolean33 = hashMapTestDriver30.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.entrySet();
        experiment.util.Set set37 = hashMapTestDriver35.entrySet();
        boolean boolean38 = hashMapTestDriver34.containsKey((java.lang.Object) hashMapTestDriver35);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set40 = hashMapTestDriver39.keySet();
        java.lang.Object obj41 = hashMapTestDriver34.get((java.lang.Object) set40);
        experiment.util.Collection collection42 = hashMapTestDriver34.values();
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        int int44 = hashMapTestDriver43.size();
        boolean boolean46 = hashMapTestDriver43.containsKey((java.lang.Object) (byte) 100);
        boolean boolean47 = hashMapTestDriver43.isEmpty();
        experiment.util.Set set48 = hashMapTestDriver43.keySet();
        java.lang.Object obj49 = hashMapTestDriver34.remove((java.lang.Object) hashMapTestDriver43);
        experiment.util.Set set50 = hashMapTestDriver34.keySet();
        java.lang.Object obj51 = hashMapTestDriver17.put((java.lang.Object) boolean33, (java.lang.Object) set50);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test208");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        hashMapTestDriver0.clear();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test209");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.entrySet();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        boolean boolean10 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set11 = hashMapTestDriver6.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        int int13 = hashMapTestDriver12.size();
        boolean boolean15 = hashMapTestDriver12.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        hashMapTestDriver16.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Collection collection24 = hashMapTestDriver22.values();
        hashMapTestDriver22.clear();
        experiment.util.Set set26 = hashMapTestDriver22.keySet();
        java.lang.Object obj27 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver22);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        boolean boolean32 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver29);
        hashMapTestDriver28.clear();
        experiment.util.Collection collection34 = hashMapTestDriver28.values();
        experiment.util.Set set35 = hashMapTestDriver28.keySet();
        java.lang.Object obj37 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver28, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.entrySet();
        experiment.util.Set set40 = hashMapTestDriver38.entrySet();
        java.lang.Object obj41 = hashMapTestDriver28.remove((java.lang.Object) set40);
        java.lang.Object obj42 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) hashMapTestDriver28);
        boolean boolean43 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver28);
        boolean boolean44 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set45 = hashMapTestDriver0.keySet();
        experiment.util.Set set46 = hashMapTestDriver0.entrySet();
        experiment.util.Set set47 = hashMapTestDriver0.entrySet();
        experiment.util.Set set48 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set48);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test210");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj13 = hashMapTestDriver7.get((java.lang.Object) 100.0d);
        experiment.util.Set set14 = hashMapTestDriver7.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        int int16 = hashMapTestDriver15.size();
        boolean boolean18 = hashMapTestDriver15.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set21 = hashMapTestDriver20.entrySet();
        experiment.util.Set set22 = hashMapTestDriver20.entrySet();
        boolean boolean23 = hashMapTestDriver19.containsKey((java.lang.Object) hashMapTestDriver20);
        hashMapTestDriver19.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Collection collection27 = hashMapTestDriver25.values();
        hashMapTestDriver25.clear();
        experiment.util.Set set29 = hashMapTestDriver25.keySet();
        java.lang.Object obj30 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver19, (java.lang.Object) hashMapTestDriver25);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set33 = hashMapTestDriver32.entrySet();
        experiment.util.Set set34 = hashMapTestDriver32.entrySet();
        boolean boolean35 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver32);
        hashMapTestDriver31.clear();
        experiment.util.Collection collection37 = hashMapTestDriver31.values();
        experiment.util.Set set38 = hashMapTestDriver31.keySet();
        java.lang.Object obj40 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver31, (java.lang.Object) '4');
        java.lang.Object obj41 = hashMapTestDriver7.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.entrySet();
        experiment.util.Set set45 = hashMapTestDriver43.entrySet();
        boolean boolean46 = hashMapTestDriver42.containsKey((java.lang.Object) hashMapTestDriver43);
        hashMapTestDriver42.clear();
        experiment.util.Set set48 = hashMapTestDriver42.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        int int50 = hashMapTestDriver49.size();
        int int51 = hashMapTestDriver49.size();
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set53 = hashMapTestDriver52.entrySet();
        experiment.util.Collection collection54 = hashMapTestDriver52.values();
        hashMapTestDriver52.clear();
        experiment.util.Set set56 = hashMapTestDriver52.keySet();
        java.lang.Object obj58 = hashMapTestDriver49.put((java.lang.Object) set56, (java.lang.Object) true);
        java.lang.Object obj59 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver42, (java.lang.Object) hashMapTestDriver49);
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set61 = hashMapTestDriver60.entrySet();
        experiment.util.Collection collection62 = hashMapTestDriver60.values();
        experiment.util.Set set63 = hashMapTestDriver60.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        int int65 = hashMapTestDriver64.size();
        boolean boolean67 = hashMapTestDriver64.containsKey((java.lang.Object) (byte) 100);
        experiment.util.Set set68 = hashMapTestDriver64.keySet();
        java.lang.Object obj69 = hashMapTestDriver7.put((java.lang.Object) set63, (java.lang.Object) hashMapTestDriver64);
        experiment.util.Set set70 = hashMapTestDriver64.entrySet();
        java.lang.Object obj71 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver64);
        boolean boolean72 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set73 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(set73);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test211");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 0.0d);
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test212");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set4 = hashMapTestDriver3.entrySet();
        experiment.util.Collection collection5 = hashMapTestDriver3.values();
        experiment.util.Set set6 = hashMapTestDriver3.keySet();
        java.lang.Object obj8 = hashMapTestDriver3.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        boolean boolean15 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver12);
        experiment.util.Set set16 = hashMapTestDriver11.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        int int18 = hashMapTestDriver17.size();
        boolean boolean20 = hashMapTestDriver17.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Set set24 = hashMapTestDriver22.entrySet();
        boolean boolean25 = hashMapTestDriver21.containsKey((java.lang.Object) hashMapTestDriver22);
        hashMapTestDriver21.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set28 = hashMapTestDriver27.entrySet();
        experiment.util.Collection collection29 = hashMapTestDriver27.values();
        hashMapTestDriver27.clear();
        experiment.util.Set set31 = hashMapTestDriver27.keySet();
        java.lang.Object obj32 = hashMapTestDriver17.put((java.lang.Object) hashMapTestDriver21, (java.lang.Object) hashMapTestDriver27);
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set35 = hashMapTestDriver34.entrySet();
        experiment.util.Set set36 = hashMapTestDriver34.entrySet();
        boolean boolean37 = hashMapTestDriver33.containsKey((java.lang.Object) hashMapTestDriver34);
        hashMapTestDriver33.clear();
        experiment.util.Collection collection39 = hashMapTestDriver33.values();
        experiment.util.Set set40 = hashMapTestDriver33.keySet();
        java.lang.Object obj42 = hashMapTestDriver17.put((java.lang.Object) hashMapTestDriver33, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.entrySet();
        experiment.util.Set set45 = hashMapTestDriver43.entrySet();
        java.lang.Object obj46 = hashMapTestDriver33.remove((java.lang.Object) set45);
        java.lang.Object obj47 = hashMapTestDriver9.put((java.lang.Object) hashMapTestDriver11, (java.lang.Object) hashMapTestDriver33);
        java.lang.Object obj48 = hashMapTestDriver3.get((java.lang.Object) hashMapTestDriver33);
        int int49 = hashMapTestDriver3.size();
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set53 = hashMapTestDriver52.entrySet();
        experiment.util.Set set54 = hashMapTestDriver52.entrySet();
        boolean boolean55 = hashMapTestDriver51.containsKey((java.lang.Object) hashMapTestDriver52);
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set57 = hashMapTestDriver56.keySet();
        java.lang.Object obj58 = hashMapTestDriver51.get((java.lang.Object) set57);
        boolean boolean59 = hashMapTestDriver51.isEmpty();
        java.lang.Object obj60 = hashMapTestDriver3.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver51);
        boolean boolean61 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver3);
        java.lang.Class<?> wildcardClass62 = hashMapTestDriver3.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test213");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = hashMapTestDriver0.values();
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test214");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) (-1));
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        int int10 = hashMapTestDriver9.size();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.entrySet();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        boolean boolean19 = hashMapTestDriver16.isEmpty();
        experiment.util.Collection collection20 = hashMapTestDriver16.values();
        java.lang.Object obj21 = hashMapTestDriver13.get((java.lang.Object) collection20);
        experiment.util.Set set22 = hashMapTestDriver13.keySet();
        boolean boolean23 = hashMapTestDriver9.containsKey((java.lang.Object) set22);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        boolean boolean28 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver25);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.keySet();
        java.lang.Object obj31 = hashMapTestDriver24.get((java.lang.Object) set30);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        int int33 = hashMapTestDriver32.size();
        java.lang.Object obj35 = hashMapTestDriver32.remove((java.lang.Object) 10.0f);
        experiment.util.Set set36 = hashMapTestDriver32.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set38 = hashMapTestDriver37.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        boolean boolean43 = hashMapTestDriver39.containsKey((java.lang.Object) hashMapTestDriver40);
        java.lang.Object obj44 = hashMapTestDriver32.put((java.lang.Object) hashMapTestDriver37, (java.lang.Object) hashMapTestDriver39);
        java.lang.Object obj46 = hashMapTestDriver32.remove((java.lang.Object) 1.0f);
        experiment.util.Collection collection47 = hashMapTestDriver32.values();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set50 = hashMapTestDriver49.entrySet();
        experiment.util.Set set51 = hashMapTestDriver49.entrySet();
        boolean boolean52 = hashMapTestDriver48.containsKey((java.lang.Object) hashMapTestDriver49);
        hashMapTestDriver48.clear();
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Class<?> wildcardClass55 = obj54.getClass();
        boolean boolean56 = hashMapTestDriver48.containsKey((java.lang.Object) wildcardClass55);
        java.lang.Object obj57 = hashMapTestDriver24.put((java.lang.Object) collection47, (java.lang.Object) hashMapTestDriver48);
        java.lang.Object obj58 = hashMapTestDriver9.get((java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set61 = hashMapTestDriver60.entrySet();
        experiment.util.Set set62 = hashMapTestDriver60.entrySet();
        boolean boolean63 = hashMapTestDriver59.containsKey((java.lang.Object) hashMapTestDriver60);
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set65 = hashMapTestDriver64.keySet();
        java.lang.Object obj66 = hashMapTestDriver59.get((java.lang.Object) set65);
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        int int68 = hashMapTestDriver67.size();
        java.lang.Object obj70 = hashMapTestDriver67.remove((java.lang.Object) 10.0f);
        experiment.util.Set set71 = hashMapTestDriver67.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set73 = hashMapTestDriver72.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver74 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver75 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set76 = hashMapTestDriver75.entrySet();
        experiment.util.Set set77 = hashMapTestDriver75.entrySet();
        boolean boolean78 = hashMapTestDriver74.containsKey((java.lang.Object) hashMapTestDriver75);
        java.lang.Object obj79 = hashMapTestDriver67.put((java.lang.Object) hashMapTestDriver72, (java.lang.Object) hashMapTestDriver74);
        java.lang.Object obj81 = hashMapTestDriver67.remove((java.lang.Object) 1.0f);
        experiment.util.Collection collection82 = hashMapTestDriver67.values();
        experiment.util.HashMapTestDriver hashMapTestDriver83 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver84 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set85 = hashMapTestDriver84.entrySet();
        experiment.util.Set set86 = hashMapTestDriver84.entrySet();
        boolean boolean87 = hashMapTestDriver83.containsKey((java.lang.Object) hashMapTestDriver84);
        hashMapTestDriver83.clear();
        java.lang.Object obj89 = new java.lang.Object();
        java.lang.Class<?> wildcardClass90 = obj89.getClass();
        boolean boolean91 = hashMapTestDriver83.containsKey((java.lang.Object) wildcardClass90);
        java.lang.Object obj92 = hashMapTestDriver59.put((java.lang.Object) collection82, (java.lang.Object) hashMapTestDriver83);
        hashMapTestDriver83.clear();
        java.lang.Object obj94 = hashMapTestDriver9.get((java.lang.Object) hashMapTestDriver83);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean95 = hashMapTestDriver0.containsKey(obj94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(wildcardClass90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test215");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.keySet();
        java.lang.Object obj15 = hashMapTestDriver8.get((java.lang.Object) set14);
        experiment.util.Set set16 = hashMapTestDriver8.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        int int18 = hashMapTestDriver17.size();
        java.lang.Object obj20 = hashMapTestDriver17.remove((java.lang.Object) 10.0f);
        java.lang.Object obj21 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) 10.0f);
        experiment.util.Set set22 = hashMapTestDriver8.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Set set26 = hashMapTestDriver24.entrySet();
        boolean boolean27 = hashMapTestDriver23.containsKey((java.lang.Object) hashMapTestDriver24);
        java.lang.Object obj29 = hashMapTestDriver23.get((java.lang.Object) 100.0d);
        experiment.util.Set set30 = hashMapTestDriver23.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        int int32 = hashMapTestDriver31.size();
        boolean boolean34 = hashMapTestDriver31.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set37 = hashMapTestDriver36.entrySet();
        experiment.util.Set set38 = hashMapTestDriver36.entrySet();
        boolean boolean39 = hashMapTestDriver35.containsKey((java.lang.Object) hashMapTestDriver36);
        hashMapTestDriver35.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set42 = hashMapTestDriver41.entrySet();
        experiment.util.Collection collection43 = hashMapTestDriver41.values();
        hashMapTestDriver41.clear();
        experiment.util.Set set45 = hashMapTestDriver41.keySet();
        java.lang.Object obj46 = hashMapTestDriver31.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) hashMapTestDriver41);
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set49 = hashMapTestDriver48.entrySet();
        experiment.util.Set set50 = hashMapTestDriver48.entrySet();
        boolean boolean51 = hashMapTestDriver47.containsKey((java.lang.Object) hashMapTestDriver48);
        hashMapTestDriver47.clear();
        experiment.util.Collection collection53 = hashMapTestDriver47.values();
        experiment.util.Set set54 = hashMapTestDriver47.keySet();
        java.lang.Object obj56 = hashMapTestDriver31.put((java.lang.Object) hashMapTestDriver47, (java.lang.Object) '4');
        java.lang.Object obj57 = hashMapTestDriver23.get((java.lang.Object) '4');
        boolean boolean58 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver23);
        experiment.util.Set set59 = hashMapTestDriver23.keySet();
        experiment.util.Set set60 = hashMapTestDriver23.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(set60);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test216");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        int int2 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set4 = hashMapTestDriver3.entrySet();
        experiment.util.Collection collection5 = hashMapTestDriver3.values();
        hashMapTestDriver3.clear();
        experiment.util.Set set7 = hashMapTestDriver3.keySet();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) set7, (java.lang.Object) true);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        int int11 = hashMapTestDriver0.size();
        experiment.util.Set set12 = hashMapTestDriver0.keySet();
        experiment.util.Set set13 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test217");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) wildcardClass7);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        boolean boolean13 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.keySet();
        java.lang.Object obj16 = hashMapTestDriver9.get((java.lang.Object) set15);
        java.lang.Object obj17 = hashMapTestDriver0.get((java.lang.Object) set15);
        boolean boolean18 = hashMapTestDriver0.isEmpty();
        int int19 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        int int21 = hashMapTestDriver20.size();
        java.lang.Object obj23 = hashMapTestDriver20.remove((java.lang.Object) 10.0f);
        experiment.util.Set set24 = hashMapTestDriver20.entrySet();
        java.lang.Object obj25 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver20);
        int int26 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test218");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        boolean boolean4 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        int int6 = hashMapTestDriver5.size();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        boolean boolean13 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver10);
        hashMapTestDriver9.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.entrySet();
        experiment.util.Collection collection17 = hashMapTestDriver15.values();
        hashMapTestDriver15.clear();
        experiment.util.Set set19 = hashMapTestDriver15.keySet();
        java.lang.Object obj20 = hashMapTestDriver5.put((java.lang.Object) hashMapTestDriver9, (java.lang.Object) hashMapTestDriver15);
        experiment.util.Collection collection21 = hashMapTestDriver9.values();
        int int22 = hashMapTestDriver9.size();
        experiment.util.Set set23 = hashMapTestDriver9.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        int int25 = hashMapTestDriver24.size();
        int int26 = hashMapTestDriver24.size();
        java.lang.Class<?> wildcardClass27 = hashMapTestDriver24.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        int int29 = hashMapTestDriver28.size();
        boolean boolean31 = hashMapTestDriver28.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set34 = hashMapTestDriver33.entrySet();
        experiment.util.Set set35 = hashMapTestDriver33.entrySet();
        boolean boolean36 = hashMapTestDriver32.containsKey((java.lang.Object) hashMapTestDriver33);
        hashMapTestDriver32.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.entrySet();
        experiment.util.Collection collection40 = hashMapTestDriver38.values();
        hashMapTestDriver38.clear();
        experiment.util.Set set42 = hashMapTestDriver38.keySet();
        java.lang.Object obj43 = hashMapTestDriver28.put((java.lang.Object) hashMapTestDriver32, (java.lang.Object) hashMapTestDriver38);
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set46 = hashMapTestDriver45.entrySet();
        experiment.util.Set set47 = hashMapTestDriver45.entrySet();
        boolean boolean48 = hashMapTestDriver44.containsKey((java.lang.Object) hashMapTestDriver45);
        hashMapTestDriver44.clear();
        experiment.util.Collection collection50 = hashMapTestDriver44.values();
        experiment.util.Set set51 = hashMapTestDriver44.keySet();
        java.lang.Object obj53 = hashMapTestDriver28.put((java.lang.Object) hashMapTestDriver44, (java.lang.Object) '4');
        java.lang.Object obj54 = hashMapTestDriver9.put((java.lang.Object) wildcardClass27, (java.lang.Object) hashMapTestDriver28);
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set57 = hashMapTestDriver56.entrySet();
        experiment.util.Set set58 = hashMapTestDriver56.entrySet();
        boolean boolean59 = hashMapTestDriver55.containsKey((java.lang.Object) hashMapTestDriver56);
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        int int61 = hashMapTestDriver60.size();
        boolean boolean63 = hashMapTestDriver60.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj66 = hashMapTestDriver64.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set68 = hashMapTestDriver67.entrySet();
        experiment.util.Set set69 = hashMapTestDriver67.entrySet();
        boolean boolean70 = hashMapTestDriver67.isEmpty();
        experiment.util.Collection collection71 = hashMapTestDriver67.values();
        java.lang.Object obj72 = hashMapTestDriver64.get((java.lang.Object) collection71);
        experiment.util.Set set73 = hashMapTestDriver64.keySet();
        boolean boolean74 = hashMapTestDriver60.containsKey((java.lang.Object) set73);
        experiment.util.HashMapTestDriver hashMapTestDriver75 = new experiment.util.HashMapTestDriver();
        int int76 = hashMapTestDriver75.size();
        java.lang.Object obj78 = hashMapTestDriver75.remove((java.lang.Object) 10.0f);
        experiment.util.Set set79 = hashMapTestDriver75.keySet();
        java.lang.Object obj81 = hashMapTestDriver75.get((java.lang.Object) (short) -1);
        hashMapTestDriver75.clear();
        java.lang.Object obj83 = hashMapTestDriver55.put((java.lang.Object) hashMapTestDriver60, (java.lang.Object) hashMapTestDriver75);
        experiment.util.HashMapTestDriver hashMapTestDriver84 = new experiment.util.HashMapTestDriver();
        int int85 = hashMapTestDriver84.size();
        java.lang.Object obj87 = hashMapTestDriver84.remove((java.lang.Object) 10.0f);
        experiment.util.Set set88 = hashMapTestDriver84.keySet();
        hashMapTestDriver84.clear();
        int int90 = hashMapTestDriver84.size();
        hashMapTestDriver84.clear();
        int int92 = hashMapTestDriver84.size();
        hashMapTestDriver84.clear();
        experiment.util.Set set94 = hashMapTestDriver84.keySet();
        experiment.util.Collection collection95 = hashMapTestDriver84.values();
        java.lang.Object obj96 = hashMapTestDriver55.get((java.lang.Object) collection95);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj97 = hashMapTestDriver0.put(obj54, (java.lang.Object) hashMapTestDriver55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertNotNull(collection95);
        org.junit.Assert.assertNull(obj96);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test219");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        int int9 = hashMapTestDriver8.size();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set12 = hashMapTestDriver11.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.remove((java.lang.Object) 1L);
        experiment.util.Set set16 = hashMapTestDriver13.entrySet();
        java.lang.Object obj17 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver11, (java.lang.Object) hashMapTestDriver13);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        int int19 = hashMapTestDriver18.size();
        boolean boolean21 = hashMapTestDriver18.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj24 = hashMapTestDriver22.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        boolean boolean28 = hashMapTestDriver25.isEmpty();
        experiment.util.Collection collection29 = hashMapTestDriver25.values();
        java.lang.Object obj30 = hashMapTestDriver22.get((java.lang.Object) collection29);
        experiment.util.Set set31 = hashMapTestDriver22.keySet();
        boolean boolean32 = hashMapTestDriver18.containsKey((java.lang.Object) set31);
        java.lang.Object obj33 = hashMapTestDriver8.remove((java.lang.Object) boolean32);
        boolean boolean34 = hashMapTestDriver8.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        int int36 = hashMapTestDriver35.size();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        int int38 = hashMapTestDriver37.size();
        boolean boolean40 = hashMapTestDriver37.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set43 = hashMapTestDriver42.entrySet();
        experiment.util.Set set44 = hashMapTestDriver42.entrySet();
        boolean boolean45 = hashMapTestDriver41.containsKey((java.lang.Object) hashMapTestDriver42);
        hashMapTestDriver41.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set48 = hashMapTestDriver47.entrySet();
        experiment.util.Collection collection49 = hashMapTestDriver47.values();
        hashMapTestDriver47.clear();
        experiment.util.Set set51 = hashMapTestDriver47.keySet();
        java.lang.Object obj52 = hashMapTestDriver37.put((java.lang.Object) hashMapTestDriver41, (java.lang.Object) hashMapTestDriver47);
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set55 = hashMapTestDriver54.entrySet();
        experiment.util.Set set56 = hashMapTestDriver54.entrySet();
        boolean boolean57 = hashMapTestDriver53.containsKey((java.lang.Object) hashMapTestDriver54);
        hashMapTestDriver53.clear();
        experiment.util.Collection collection59 = hashMapTestDriver53.values();
        experiment.util.Set set60 = hashMapTestDriver53.keySet();
        java.lang.Object obj62 = hashMapTestDriver37.put((java.lang.Object) hashMapTestDriver53, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set64 = hashMapTestDriver63.entrySet();
        experiment.util.Set set65 = hashMapTestDriver63.entrySet();
        java.lang.Object obj66 = hashMapTestDriver53.remove((java.lang.Object) set65);
        java.lang.Object obj67 = hashMapTestDriver35.remove((java.lang.Object) set65);
        boolean boolean68 = hashMapTestDriver8.containsKey((java.lang.Object) set65);
        experiment.util.Set set69 = hashMapTestDriver8.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(set69);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test220");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) 0L);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test221");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        int int6 = hashMapTestDriver5.size();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        boolean boolean15 = hashMapTestDriver12.isEmpty();
        experiment.util.Collection collection16 = hashMapTestDriver12.values();
        java.lang.Object obj17 = hashMapTestDriver9.get((java.lang.Object) collection16);
        experiment.util.Set set18 = hashMapTestDriver9.keySet();
        boolean boolean19 = hashMapTestDriver5.containsKey((java.lang.Object) set18);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        int int21 = hashMapTestDriver20.size();
        java.lang.Object obj23 = hashMapTestDriver20.remove((java.lang.Object) 10.0f);
        experiment.util.Set set24 = hashMapTestDriver20.keySet();
        java.lang.Object obj26 = hashMapTestDriver20.get((java.lang.Object) (short) -1);
        hashMapTestDriver20.clear();
        java.lang.Object obj28 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver20);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        int int30 = hashMapTestDriver29.size();
        java.lang.Object obj32 = hashMapTestDriver29.remove((java.lang.Object) 10.0f);
        experiment.util.Set set33 = hashMapTestDriver29.keySet();
        hashMapTestDriver29.clear();
        int int35 = hashMapTestDriver29.size();
        hashMapTestDriver29.clear();
        int int37 = hashMapTestDriver29.size();
        hashMapTestDriver29.clear();
        experiment.util.Set set39 = hashMapTestDriver29.keySet();
        experiment.util.Collection collection40 = hashMapTestDriver29.values();
        java.lang.Object obj41 = hashMapTestDriver0.get((java.lang.Object) collection40);
        experiment.util.Set set42 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set42);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test222");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        experiment.util.Set set7 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        int int9 = hashMapTestDriver8.size();
        boolean boolean11 = hashMapTestDriver8.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.entrySet();
        experiment.util.Set set15 = hashMapTestDriver13.entrySet();
        boolean boolean16 = hashMapTestDriver12.containsKey((java.lang.Object) hashMapTestDriver13);
        hashMapTestDriver12.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        experiment.util.Collection collection20 = hashMapTestDriver18.values();
        hashMapTestDriver18.clear();
        experiment.util.Set set22 = hashMapTestDriver18.keySet();
        java.lang.Object obj23 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver12, (java.lang.Object) hashMapTestDriver18);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Set set27 = hashMapTestDriver25.entrySet();
        boolean boolean28 = hashMapTestDriver24.containsKey((java.lang.Object) hashMapTestDriver25);
        hashMapTestDriver24.clear();
        experiment.util.Collection collection30 = hashMapTestDriver24.values();
        experiment.util.Set set31 = hashMapTestDriver24.keySet();
        java.lang.Object obj33 = hashMapTestDriver8.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) '4');
        java.lang.Object obj34 = hashMapTestDriver0.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set37 = hashMapTestDriver36.entrySet();
        experiment.util.Set set38 = hashMapTestDriver36.entrySet();
        boolean boolean39 = hashMapTestDriver35.containsKey((java.lang.Object) hashMapTestDriver36);
        hashMapTestDriver35.clear();
        experiment.util.Set set41 = hashMapTestDriver35.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        int int43 = hashMapTestDriver42.size();
        int int44 = hashMapTestDriver42.size();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set46 = hashMapTestDriver45.entrySet();
        experiment.util.Collection collection47 = hashMapTestDriver45.values();
        hashMapTestDriver45.clear();
        experiment.util.Set set49 = hashMapTestDriver45.keySet();
        java.lang.Object obj51 = hashMapTestDriver42.put((java.lang.Object) set49, (java.lang.Object) true);
        java.lang.Object obj52 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) hashMapTestDriver42);
        hashMapTestDriver42.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj56 = hashMapTestDriver54.remove((java.lang.Object) 1L);
        experiment.util.Set set57 = hashMapTestDriver54.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        int int60 = hashMapTestDriver59.size();
        java.lang.Object obj62 = hashMapTestDriver59.remove((java.lang.Object) 10.0f);
        experiment.util.Set set63 = hashMapTestDriver59.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set65 = hashMapTestDriver64.entrySet();
        experiment.util.Collection collection66 = hashMapTestDriver64.values();
        java.lang.Object obj68 = hashMapTestDriver64.remove((java.lang.Object) 10.0f);
        java.lang.Object obj69 = hashMapTestDriver59.get((java.lang.Object) hashMapTestDriver64);
        java.lang.Object obj70 = hashMapTestDriver54.put((java.lang.Object) ' ', (java.lang.Object) hashMapTestDriver64);
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set73 = hashMapTestDriver72.entrySet();
        experiment.util.Set set74 = hashMapTestDriver72.entrySet();
        boolean boolean75 = hashMapTestDriver71.containsKey((java.lang.Object) hashMapTestDriver72);
        hashMapTestDriver71.clear();
        experiment.util.Set set77 = hashMapTestDriver71.entrySet();
        java.lang.Object obj78 = hashMapTestDriver64.remove((java.lang.Object) set77);
        java.lang.Object obj79 = hashMapTestDriver42.remove((java.lang.Object) set77);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj79);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test223");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.entrySet();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        boolean boolean10 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set11 = hashMapTestDriver6.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        int int13 = hashMapTestDriver12.size();
        boolean boolean15 = hashMapTestDriver12.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        hashMapTestDriver16.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Collection collection24 = hashMapTestDriver22.values();
        hashMapTestDriver22.clear();
        experiment.util.Set set26 = hashMapTestDriver22.keySet();
        java.lang.Object obj27 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) hashMapTestDriver22);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Set set31 = hashMapTestDriver29.entrySet();
        boolean boolean32 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver29);
        hashMapTestDriver28.clear();
        experiment.util.Collection collection34 = hashMapTestDriver28.values();
        experiment.util.Set set35 = hashMapTestDriver28.keySet();
        java.lang.Object obj37 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver28, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set39 = hashMapTestDriver38.entrySet();
        experiment.util.Set set40 = hashMapTestDriver38.entrySet();
        java.lang.Object obj41 = hashMapTestDriver28.remove((java.lang.Object) set40);
        java.lang.Object obj42 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) hashMapTestDriver28);
        boolean boolean43 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver28);
        boolean boolean44 = hashMapTestDriver0.isEmpty();
        int int45 = hashMapTestDriver0.size();
        boolean boolean46 = hashMapTestDriver0.isEmpty();
        experiment.util.Collection collection47 = hashMapTestDriver0.values();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(collection47);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test224");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        hashMapTestDriver0.clear();
        java.lang.Object obj9 = hashMapTestDriver0.get((java.lang.Object) 10.0f);
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection11 = hashMapTestDriver0.values();
        boolean boolean12 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test225");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        boolean boolean6 = hashMapTestDriver0.containsKey((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.keySet();
        java.lang.Object obj14 = hashMapTestDriver7.get((java.lang.Object) set13);
        experiment.util.Collection collection15 = hashMapTestDriver7.values();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        int int17 = hashMapTestDriver16.size();
        java.lang.Object obj19 = hashMapTestDriver16.remove((java.lang.Object) 10.0f);
        experiment.util.Set set20 = hashMapTestDriver16.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set22 = hashMapTestDriver21.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Set set26 = hashMapTestDriver24.entrySet();
        boolean boolean27 = hashMapTestDriver23.containsKey((java.lang.Object) hashMapTestDriver24);
        java.lang.Object obj28 = hashMapTestDriver16.put((java.lang.Object) hashMapTestDriver21, (java.lang.Object) hashMapTestDriver23);
        java.lang.Object obj30 = hashMapTestDriver16.remove((java.lang.Object) 1.0f);
        experiment.util.Collection collection31 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set34 = hashMapTestDriver33.entrySet();
        experiment.util.Set set35 = hashMapTestDriver33.entrySet();
        boolean boolean36 = hashMapTestDriver32.containsKey((java.lang.Object) hashMapTestDriver33);
        java.lang.Object obj38 = hashMapTestDriver32.get((java.lang.Object) 100.0d);
        hashMapTestDriver32.clear();
        java.lang.Object obj41 = hashMapTestDriver32.get((java.lang.Object) 10.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        int int43 = hashMapTestDriver42.size();
        java.lang.Object obj45 = hashMapTestDriver42.remove((java.lang.Object) 10.0f);
        experiment.util.Set set46 = hashMapTestDriver42.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set48 = hashMapTestDriver47.entrySet();
        experiment.util.Collection collection49 = hashMapTestDriver47.values();
        java.lang.Object obj51 = hashMapTestDriver47.remove((java.lang.Object) 10.0f);
        java.lang.Object obj52 = hashMapTestDriver42.get((java.lang.Object) hashMapTestDriver47);
        java.lang.Object obj53 = hashMapTestDriver32.remove((java.lang.Object) hashMapTestDriver42);
        int int54 = hashMapTestDriver42.size();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set57 = hashMapTestDriver56.entrySet();
        experiment.util.Set set58 = hashMapTestDriver56.entrySet();
        boolean boolean59 = hashMapTestDriver55.containsKey((java.lang.Object) hashMapTestDriver56);
        hashMapTestDriver55.clear();
        experiment.util.Collection collection61 = hashMapTestDriver55.values();
        java.lang.Object obj62 = hashMapTestDriver42.remove((java.lang.Object) hashMapTestDriver55);
        boolean boolean63 = hashMapTestDriver42.isEmpty();
        experiment.util.Set set64 = hashMapTestDriver42.keySet();
        java.lang.Object obj65 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) set64);
        experiment.util.Set set66 = hashMapTestDriver7.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set68 = hashMapTestDriver67.entrySet();
        experiment.util.Collection collection69 = hashMapTestDriver67.values();
        experiment.util.Set set70 = hashMapTestDriver67.keySet();
        java.lang.Object obj72 = hashMapTestDriver67.get((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass73 = hashMapTestDriver67.getClass();
        java.lang.Object obj74 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver7, (java.lang.Object) wildcardClass73);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test226");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj12 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set13 = hashMapTestDriver7.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.entrySet();
        experiment.util.Collection collection16 = hashMapTestDriver14.values();
        hashMapTestDriver14.clear();
        experiment.util.Set set18 = hashMapTestDriver14.keySet();
        boolean boolean19 = hashMapTestDriver7.containsKey((java.lang.Object) set18);
        int int20 = hashMapTestDriver7.size();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Set set24 = hashMapTestDriver22.entrySet();
        boolean boolean25 = hashMapTestDriver21.containsKey((java.lang.Object) hashMapTestDriver22);
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set27 = hashMapTestDriver26.keySet();
        java.lang.Object obj28 = hashMapTestDriver21.get((java.lang.Object) set27);
        experiment.util.Collection collection29 = hashMapTestDriver21.values();
        java.lang.Class<?> wildcardClass30 = hashMapTestDriver21.getClass();
        java.lang.Object obj31 = hashMapTestDriver7.get((java.lang.Object) wildcardClass30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test227");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver10.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set17 = hashMapTestDriver16.entrySet();
        experiment.util.Set set18 = hashMapTestDriver16.entrySet();
        boolean boolean19 = hashMapTestDriver16.isEmpty();
        experiment.util.Collection collection20 = hashMapTestDriver16.values();
        java.lang.Object obj21 = hashMapTestDriver13.get((java.lang.Object) collection20);
        experiment.util.Set set22 = hashMapTestDriver13.keySet();
        java.lang.Object obj23 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver10, (java.lang.Object) hashMapTestDriver13);
        experiment.util.Collection collection24 = hashMapTestDriver13.values();
        int int25 = hashMapTestDriver13.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test228");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test229");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        boolean boolean4 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        int int6 = hashMapTestDriver5.size();
        java.lang.Object obj8 = hashMapTestDriver5.remove((java.lang.Object) 10.0f);
        java.lang.Object obj10 = hashMapTestDriver5.get((java.lang.Object) 100.0d);
        experiment.util.Set set11 = hashMapTestDriver5.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        int int13 = hashMapTestDriver12.size();
        java.lang.Object obj15 = hashMapTestDriver12.remove((java.lang.Object) 10.0f);
        experiment.util.Set set16 = hashMapTestDriver12.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set21 = hashMapTestDriver20.entrySet();
        experiment.util.Set set22 = hashMapTestDriver20.entrySet();
        boolean boolean23 = hashMapTestDriver19.containsKey((java.lang.Object) hashMapTestDriver20);
        java.lang.Object obj24 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver17, (java.lang.Object) hashMapTestDriver19);
        java.lang.Object obj26 = hashMapTestDriver12.remove((java.lang.Object) 1.0f);
        experiment.util.Collection collection27 = hashMapTestDriver12.values();
        int int28 = hashMapTestDriver12.size();
        experiment.util.Set set29 = hashMapTestDriver12.keySet();
        boolean boolean30 = hashMapTestDriver5.containsKey((java.lang.Object) hashMapTestDriver12);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set33 = hashMapTestDriver32.entrySet();
        experiment.util.Set set34 = hashMapTestDriver32.entrySet();
        boolean boolean35 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver32);
        hashMapTestDriver31.clear();
        experiment.util.Collection collection37 = hashMapTestDriver31.values();
        experiment.util.Set set38 = hashMapTestDriver31.keySet();
        experiment.util.Set set39 = hashMapTestDriver31.keySet();
        experiment.util.Collection collection40 = hashMapTestDriver31.values();
        hashMapTestDriver31.clear();
        java.lang.Object obj42 = hashMapTestDriver5.get((java.lang.Object) hashMapTestDriver31);
        experiment.util.Collection collection43 = hashMapTestDriver31.values();
        experiment.util.Collection collection44 = hashMapTestDriver31.values();
        java.lang.Object obj45 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test230");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set8 = hashMapTestDriver7.entrySet();
        experiment.util.Set set9 = hashMapTestDriver7.entrySet();
        boolean boolean10 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver7);
        java.lang.Object obj12 = hashMapTestDriver6.get((java.lang.Object) 100.0d);
        hashMapTestDriver6.clear();
        java.lang.Object obj15 = hashMapTestDriver6.get((java.lang.Object) 10.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        int int17 = hashMapTestDriver16.size();
        java.lang.Object obj19 = hashMapTestDriver16.remove((java.lang.Object) 10.0f);
        experiment.util.Set set20 = hashMapTestDriver16.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set22 = hashMapTestDriver21.entrySet();
        experiment.util.Collection collection23 = hashMapTestDriver21.values();
        java.lang.Object obj25 = hashMapTestDriver21.remove((java.lang.Object) 10.0f);
        java.lang.Object obj26 = hashMapTestDriver16.get((java.lang.Object) hashMapTestDriver21);
        java.lang.Object obj27 = hashMapTestDriver6.remove((java.lang.Object) hashMapTestDriver16);
        int int28 = hashMapTestDriver16.size();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set30 = hashMapTestDriver29.entrySet();
        experiment.util.Collection collection31 = hashMapTestDriver29.values();
        experiment.util.Set set32 = hashMapTestDriver29.keySet();
        java.lang.Object obj34 = hashMapTestDriver29.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.entrySet();
        experiment.util.Collection collection37 = hashMapTestDriver35.values();
        hashMapTestDriver35.clear();
        experiment.util.Set set39 = hashMapTestDriver35.keySet();
        java.lang.Object obj40 = hashMapTestDriver29.get((java.lang.Object) set39);
        boolean boolean41 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver29);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        int int43 = hashMapTestDriver42.size();
        boolean boolean45 = hashMapTestDriver42.containsKey((java.lang.Object) (byte) 100);
        int int46 = hashMapTestDriver42.size();
        boolean boolean47 = hashMapTestDriver16.containsKey((java.lang.Object) int46);
        boolean boolean48 = hashMapTestDriver0.containsKey((java.lang.Object) int46);
        experiment.util.Set set49 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass50 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test231");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        int int6 = hashMapTestDriver5.size();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj11 = hashMapTestDriver9.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        boolean boolean15 = hashMapTestDriver12.isEmpty();
        experiment.util.Collection collection16 = hashMapTestDriver12.values();
        java.lang.Object obj17 = hashMapTestDriver9.get((java.lang.Object) collection16);
        experiment.util.Set set18 = hashMapTestDriver9.keySet();
        boolean boolean19 = hashMapTestDriver5.containsKey((java.lang.Object) set18);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        int int21 = hashMapTestDriver20.size();
        java.lang.Object obj23 = hashMapTestDriver20.remove((java.lang.Object) 10.0f);
        experiment.util.Set set24 = hashMapTestDriver20.keySet();
        java.lang.Object obj26 = hashMapTestDriver20.get((java.lang.Object) (short) -1);
        hashMapTestDriver20.clear();
        java.lang.Object obj28 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver20);
        experiment.util.Collection collection29 = hashMapTestDriver20.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test232");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj12 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver7);
        int int13 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.entrySet();
        experiment.util.Collection collection16 = hashMapTestDriver14.values();
        hashMapTestDriver14.clear();
        experiment.util.Set set18 = hashMapTestDriver14.keySet();
        experiment.util.Collection collection19 = hashMapTestDriver14.values();
        experiment.util.Set set20 = hashMapTestDriver14.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Set set24 = hashMapTestDriver22.entrySet();
        boolean boolean25 = hashMapTestDriver21.containsKey((java.lang.Object) hashMapTestDriver22);
        hashMapTestDriver21.clear();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Class<?> wildcardClass28 = obj27.getClass();
        boolean boolean29 = hashMapTestDriver21.containsKey((java.lang.Object) wildcardClass28);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver31);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set36 = hashMapTestDriver35.keySet();
        java.lang.Object obj37 = hashMapTestDriver30.get((java.lang.Object) set36);
        java.lang.Object obj38 = hashMapTestDriver21.get((java.lang.Object) set36);
        boolean boolean39 = hashMapTestDriver21.isEmpty();
        int int40 = hashMapTestDriver21.size();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        int int42 = hashMapTestDriver41.size();
        java.lang.Object obj44 = hashMapTestDriver41.remove((java.lang.Object) 10.0f);
        experiment.util.Set set45 = hashMapTestDriver41.entrySet();
        java.lang.Object obj46 = hashMapTestDriver21.remove((java.lang.Object) hashMapTestDriver41);
        experiment.util.Collection collection47 = hashMapTestDriver21.values();
        java.lang.Object obj48 = hashMapTestDriver0.put((java.lang.Object) set20, (java.lang.Object) hashMapTestDriver21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test233");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        int int8 = hashMapTestDriver7.size();
        boolean boolean10 = hashMapTestDriver7.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        boolean boolean15 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver12);
        hashMapTestDriver11.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Collection collection19 = hashMapTestDriver17.values();
        hashMapTestDriver17.clear();
        experiment.util.Set set21 = hashMapTestDriver17.keySet();
        java.lang.Object obj22 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver11, (java.lang.Object) hashMapTestDriver17);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Set set26 = hashMapTestDriver24.entrySet();
        boolean boolean27 = hashMapTestDriver23.containsKey((java.lang.Object) hashMapTestDriver24);
        hashMapTestDriver23.clear();
        experiment.util.Collection collection29 = hashMapTestDriver23.values();
        experiment.util.Set set30 = hashMapTestDriver23.keySet();
        java.lang.Object obj32 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver23, (java.lang.Object) '4');
        java.lang.Object obj33 = hashMapTestDriver0.put((java.lang.Object) (-1.0f), (java.lang.Object) '4');
        experiment.util.Set set34 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        int int36 = hashMapTestDriver35.size();
        java.lang.Object obj38 = hashMapTestDriver35.remove((java.lang.Object) 10.0f);
        experiment.util.Set set39 = hashMapTestDriver35.keySet();
        hashMapTestDriver35.clear();
        int int41 = hashMapTestDriver35.size();
        hashMapTestDriver35.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.entrySet();
        experiment.util.Collection collection45 = hashMapTestDriver43.values();
        experiment.util.Set set46 = hashMapTestDriver43.keySet();
        boolean boolean47 = hashMapTestDriver35.containsKey((java.lang.Object) set46);
        experiment.util.Collection collection48 = hashMapTestDriver35.values();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set51 = hashMapTestDriver50.entrySet();
        experiment.util.Set set52 = hashMapTestDriver50.entrySet();
        boolean boolean53 = hashMapTestDriver49.containsKey((java.lang.Object) hashMapTestDriver50);
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set55 = hashMapTestDriver54.keySet();
        java.lang.Object obj56 = hashMapTestDriver49.get((java.lang.Object) set55);
        experiment.util.Set set57 = hashMapTestDriver49.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        int int59 = hashMapTestDriver58.size();
        java.lang.Object obj61 = hashMapTestDriver58.get((java.lang.Object) 10.0d);
        boolean boolean62 = hashMapTestDriver49.containsKey((java.lang.Object) hashMapTestDriver58);
        experiment.util.Set set63 = hashMapTestDriver49.keySet();
        experiment.util.Collection collection64 = hashMapTestDriver49.values();
        java.lang.Object obj65 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) hashMapTestDriver49);
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set68 = hashMapTestDriver67.entrySet();
        experiment.util.Set set69 = hashMapTestDriver67.entrySet();
        boolean boolean70 = hashMapTestDriver66.containsKey((java.lang.Object) hashMapTestDriver67);
        hashMapTestDriver66.clear();
        experiment.util.Collection collection72 = hashMapTestDriver66.values();
        experiment.util.HashMapTestDriver hashMapTestDriver74 = new experiment.util.HashMapTestDriver();
        int int75 = hashMapTestDriver74.size();
        java.lang.Object obj76 = hashMapTestDriver66.put((java.lang.Object) 1.0f, (java.lang.Object) hashMapTestDriver74);
        experiment.util.HashMapTestDriver hashMapTestDriver77 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set78 = hashMapTestDriver77.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver79 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj81 = hashMapTestDriver79.remove((java.lang.Object) 1L);
        experiment.util.Set set82 = hashMapTestDriver79.entrySet();
        java.lang.Object obj83 = hashMapTestDriver74.put((java.lang.Object) hashMapTestDriver77, (java.lang.Object) hashMapTestDriver79);
        int int84 = hashMapTestDriver77.size();
        java.lang.Object obj85 = hashMapTestDriver0.get((java.lang.Object) int84);
        experiment.util.Set set86 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(set86);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test234");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj13 = hashMapTestDriver7.get((java.lang.Object) 100.0d);
        experiment.util.Set set14 = hashMapTestDriver7.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        int int16 = hashMapTestDriver15.size();
        boolean boolean18 = hashMapTestDriver15.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set21 = hashMapTestDriver20.entrySet();
        experiment.util.Set set22 = hashMapTestDriver20.entrySet();
        boolean boolean23 = hashMapTestDriver19.containsKey((java.lang.Object) hashMapTestDriver20);
        hashMapTestDriver19.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.entrySet();
        experiment.util.Collection collection27 = hashMapTestDriver25.values();
        hashMapTestDriver25.clear();
        experiment.util.Set set29 = hashMapTestDriver25.keySet();
        java.lang.Object obj30 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver19, (java.lang.Object) hashMapTestDriver25);
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set33 = hashMapTestDriver32.entrySet();
        experiment.util.Set set34 = hashMapTestDriver32.entrySet();
        boolean boolean35 = hashMapTestDriver31.containsKey((java.lang.Object) hashMapTestDriver32);
        hashMapTestDriver31.clear();
        experiment.util.Collection collection37 = hashMapTestDriver31.values();
        experiment.util.Set set38 = hashMapTestDriver31.keySet();
        java.lang.Object obj40 = hashMapTestDriver15.put((java.lang.Object) hashMapTestDriver31, (java.lang.Object) '4');
        java.lang.Object obj41 = hashMapTestDriver7.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set44 = hashMapTestDriver43.entrySet();
        experiment.util.Set set45 = hashMapTestDriver43.entrySet();
        boolean boolean46 = hashMapTestDriver42.containsKey((java.lang.Object) hashMapTestDriver43);
        hashMapTestDriver42.clear();
        experiment.util.Set set48 = hashMapTestDriver42.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        int int50 = hashMapTestDriver49.size();
        int int51 = hashMapTestDriver49.size();
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set53 = hashMapTestDriver52.entrySet();
        experiment.util.Collection collection54 = hashMapTestDriver52.values();
        hashMapTestDriver52.clear();
        experiment.util.Set set56 = hashMapTestDriver52.keySet();
        java.lang.Object obj58 = hashMapTestDriver49.put((java.lang.Object) set56, (java.lang.Object) true);
        java.lang.Object obj59 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver42, (java.lang.Object) hashMapTestDriver49);
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set61 = hashMapTestDriver60.entrySet();
        experiment.util.Collection collection62 = hashMapTestDriver60.values();
        experiment.util.Set set63 = hashMapTestDriver60.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        int int65 = hashMapTestDriver64.size();
        boolean boolean67 = hashMapTestDriver64.containsKey((java.lang.Object) (byte) 100);
        experiment.util.Set set68 = hashMapTestDriver64.keySet();
        java.lang.Object obj69 = hashMapTestDriver7.put((java.lang.Object) set63, (java.lang.Object) hashMapTestDriver64);
        experiment.util.Set set70 = hashMapTestDriver64.entrySet();
        java.lang.Object obj71 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver64);
        java.lang.Class<?> wildcardClass72 = hashMapTestDriver64.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test235");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.Collection collection7 = hashMapTestDriver0.values();
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        int int9 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test236");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set5 = hashMapTestDriver4.entrySet();
        experiment.util.Set set6 = hashMapTestDriver4.entrySet();
        boolean boolean7 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver4);
        experiment.util.Set set8 = hashMapTestDriver3.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        boolean boolean13 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver10);
        java.lang.Object obj15 = hashMapTestDriver9.get((java.lang.Object) 100.0d);
        experiment.util.Set set16 = hashMapTestDriver9.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        int int18 = hashMapTestDriver17.size();
        boolean boolean20 = hashMapTestDriver17.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Set set24 = hashMapTestDriver22.entrySet();
        boolean boolean25 = hashMapTestDriver21.containsKey((java.lang.Object) hashMapTestDriver22);
        hashMapTestDriver21.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set28 = hashMapTestDriver27.entrySet();
        experiment.util.Collection collection29 = hashMapTestDriver27.values();
        hashMapTestDriver27.clear();
        experiment.util.Set set31 = hashMapTestDriver27.keySet();
        java.lang.Object obj32 = hashMapTestDriver17.put((java.lang.Object) hashMapTestDriver21, (java.lang.Object) hashMapTestDriver27);
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set35 = hashMapTestDriver34.entrySet();
        experiment.util.Set set36 = hashMapTestDriver34.entrySet();
        boolean boolean37 = hashMapTestDriver33.containsKey((java.lang.Object) hashMapTestDriver34);
        hashMapTestDriver33.clear();
        experiment.util.Collection collection39 = hashMapTestDriver33.values();
        experiment.util.Set set40 = hashMapTestDriver33.keySet();
        java.lang.Object obj42 = hashMapTestDriver17.put((java.lang.Object) hashMapTestDriver33, (java.lang.Object) '4');
        java.lang.Object obj43 = hashMapTestDriver9.get((java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set46 = hashMapTestDriver45.entrySet();
        experiment.util.Set set47 = hashMapTestDriver45.entrySet();
        boolean boolean48 = hashMapTestDriver44.containsKey((java.lang.Object) hashMapTestDriver45);
        hashMapTestDriver44.clear();
        experiment.util.Set set50 = hashMapTestDriver44.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        int int52 = hashMapTestDriver51.size();
        int int53 = hashMapTestDriver51.size();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set55 = hashMapTestDriver54.entrySet();
        experiment.util.Collection collection56 = hashMapTestDriver54.values();
        hashMapTestDriver54.clear();
        experiment.util.Set set58 = hashMapTestDriver54.keySet();
        java.lang.Object obj60 = hashMapTestDriver51.put((java.lang.Object) set58, (java.lang.Object) true);
        java.lang.Object obj61 = hashMapTestDriver9.put((java.lang.Object) hashMapTestDriver44, (java.lang.Object) hashMapTestDriver51);
        hashMapTestDriver9.clear();
        boolean boolean63 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver9);
        java.lang.Object obj64 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver9);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test237");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.Set set3 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        int int6 = hashMapTestDriver5.size();
        java.lang.Object obj8 = hashMapTestDriver5.remove((java.lang.Object) 10.0f);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        java.lang.Object obj14 = hashMapTestDriver10.remove((java.lang.Object) 10.0f);
        java.lang.Object obj15 = hashMapTestDriver5.get((java.lang.Object) hashMapTestDriver10);
        java.lang.Object obj16 = hashMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        experiment.util.Set set20 = hashMapTestDriver18.entrySet();
        boolean boolean21 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver18);
        hashMapTestDriver17.clear();
        experiment.util.Set set23 = hashMapTestDriver17.entrySet();
        java.lang.Object obj24 = hashMapTestDriver10.remove((java.lang.Object) set23);
        experiment.util.Set set25 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver10.values();
        experiment.util.Set set27 = hashMapTestDriver10.keySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test238");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        boolean boolean6 = hashMapTestDriver0.isEmpty();
        experiment.util.Collection collection7 = hashMapTestDriver0.values();
        int int8 = hashMapTestDriver0.size();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test239");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.Set set3 = hashMapTestDriver0.entrySet();
        boolean boolean4 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set7 = hashMapTestDriver6.entrySet();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        boolean boolean9 = hashMapTestDriver5.containsKey((java.lang.Object) hashMapTestDriver6);
        java.lang.Object obj11 = hashMapTestDriver5.get((java.lang.Object) 100.0d);
        hashMapTestDriver5.clear();
        java.lang.Object obj14 = hashMapTestDriver5.get((java.lang.Object) 10.0f);
        boolean boolean15 = hashMapTestDriver5.isEmpty();
        experiment.util.Set set16 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj19 = hashMapTestDriver17.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set22 = hashMapTestDriver21.entrySet();
        experiment.util.Set set23 = hashMapTestDriver21.entrySet();
        boolean boolean24 = hashMapTestDriver20.containsKey((java.lang.Object) hashMapTestDriver21);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set26 = hashMapTestDriver25.keySet();
        java.lang.Object obj27 = hashMapTestDriver20.get((java.lang.Object) set26);
        experiment.util.Set set28 = hashMapTestDriver20.entrySet();
        java.lang.Object obj30 = hashMapTestDriver17.put((java.lang.Object) set28, (java.lang.Object) 1.0d);
        hashMapTestDriver17.clear();
        java.lang.Object obj32 = hashMapTestDriver5.get((java.lang.Object) hashMapTestDriver17);
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set34 = hashMapTestDriver33.entrySet();
        experiment.util.Collection collection35 = hashMapTestDriver33.values();
        hashMapTestDriver33.clear();
        boolean boolean37 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver33);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set40 = hashMapTestDriver39.entrySet();
        experiment.util.Set set41 = hashMapTestDriver39.entrySet();
        boolean boolean42 = hashMapTestDriver38.containsKey((java.lang.Object) hashMapTestDriver39);
        java.lang.Object obj44 = hashMapTestDriver38.get((java.lang.Object) 100.0d);
        boolean boolean45 = hashMapTestDriver38.isEmpty();
        java.lang.Object obj46 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver17, (java.lang.Object) hashMapTestDriver38);
        boolean boolean47 = hashMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass48 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test240");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set13 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        int int15 = hashMapTestDriver14.size();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        hashMapTestDriver18.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver24.values();
        hashMapTestDriver24.clear();
        experiment.util.Set set28 = hashMapTestDriver24.keySet();
        java.lang.Object obj29 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver31);
        hashMapTestDriver30.clear();
        experiment.util.Collection collection36 = hashMapTestDriver30.values();
        experiment.util.Set set37 = hashMapTestDriver30.keySet();
        java.lang.Object obj39 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        java.lang.Object obj43 = hashMapTestDriver30.remove((java.lang.Object) set42);
        java.lang.Object obj44 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj45 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver30);
        int int46 = hashMapTestDriver0.size();
        int int47 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        int int49 = hashMapTestDriver48.size();
        java.lang.Object obj51 = hashMapTestDriver48.remove((java.lang.Object) 10.0f);
        experiment.util.Set set52 = hashMapTestDriver48.keySet();
        hashMapTestDriver48.clear();
        int int54 = hashMapTestDriver48.size();
        hashMapTestDriver48.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set57 = hashMapTestDriver56.entrySet();
        experiment.util.Collection collection58 = hashMapTestDriver56.values();
        experiment.util.Set set59 = hashMapTestDriver56.keySet();
        boolean boolean60 = hashMapTestDriver48.containsKey((java.lang.Object) set59);
        experiment.util.Collection collection61 = hashMapTestDriver48.values();
        java.lang.Object obj63 = hashMapTestDriver0.put((java.lang.Object) collection61, (java.lang.Object) 100.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        int int65 = hashMapTestDriver64.size();
        int int66 = hashMapTestDriver64.size();
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set68 = hashMapTestDriver67.entrySet();
        experiment.util.Collection collection69 = hashMapTestDriver67.values();
        hashMapTestDriver67.clear();
        experiment.util.Set set71 = hashMapTestDriver67.keySet();
        java.lang.Object obj73 = hashMapTestDriver64.put((java.lang.Object) set71, (java.lang.Object) true);
        experiment.util.Set set74 = hashMapTestDriver64.entrySet();
        int int75 = hashMapTestDriver64.size();
        experiment.util.Set set76 = hashMapTestDriver64.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver77 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set78 = hashMapTestDriver77.entrySet();
        experiment.util.Collection collection79 = hashMapTestDriver77.values();
        experiment.util.Set set80 = hashMapTestDriver77.keySet();
        java.lang.Object obj82 = hashMapTestDriver77.get((java.lang.Object) 0.0d);
        experiment.util.HashMapTestDriver hashMapTestDriver83 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set84 = hashMapTestDriver83.entrySet();
        experiment.util.Collection collection85 = hashMapTestDriver83.values();
        hashMapTestDriver83.clear();
        experiment.util.Set set87 = hashMapTestDriver83.keySet();
        java.lang.Object obj88 = hashMapTestDriver77.get((java.lang.Object) set87);
        java.lang.Object obj89 = hashMapTestDriver0.put((java.lang.Object) set76, (java.lang.Object) set87);
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNull(obj89);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test241");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        boolean boolean3 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test242");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj12 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver7);
        java.lang.Object obj14 = hashMapTestDriver0.remove((java.lang.Object) 1.0f);
        experiment.util.Collection collection15 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        boolean boolean20 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver17);
        hashMapTestDriver16.clear();
        experiment.util.Collection collection22 = hashMapTestDriver16.values();
        java.lang.Object obj24 = hashMapTestDriver16.remove((java.lang.Object) (-1));
        experiment.util.Collection collection25 = hashMapTestDriver16.values();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        int int27 = hashMapTestDriver26.size();
        java.lang.Object obj29 = hashMapTestDriver26.remove((java.lang.Object) 10.0f);
        experiment.util.Set set30 = hashMapTestDriver26.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Collection collection33 = hashMapTestDriver31.values();
        java.lang.Object obj35 = hashMapTestDriver31.remove((java.lang.Object) 10.0f);
        java.lang.Object obj36 = hashMapTestDriver26.get((java.lang.Object) hashMapTestDriver31);
        experiment.util.Set set37 = hashMapTestDriver26.entrySet();
        java.lang.Object obj38 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver16, (java.lang.Object) set37);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test243");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection7 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        hashMapTestDriver8.clear();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Class<?> wildcardClass15 = obj14.getClass();
        boolean boolean16 = hashMapTestDriver8.containsKey((java.lang.Object) wildcardClass15);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set19 = hashMapTestDriver18.entrySet();
        experiment.util.Set set20 = hashMapTestDriver18.entrySet();
        boolean boolean21 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver18);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.keySet();
        java.lang.Object obj24 = hashMapTestDriver17.get((java.lang.Object) set23);
        java.lang.Object obj25 = hashMapTestDriver8.get((java.lang.Object) set23);
        boolean boolean26 = hashMapTestDriver8.isEmpty();
        experiment.util.Set set27 = hashMapTestDriver8.entrySet();
        boolean boolean28 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver8);
        experiment.util.Set set29 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(set29);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test244");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set14 = hashMapTestDriver13.keySet();
        java.lang.Object obj15 = hashMapTestDriver8.get((java.lang.Object) set14);
        experiment.util.Set set16 = hashMapTestDriver8.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        int int18 = hashMapTestDriver17.size();
        java.lang.Object obj20 = hashMapTestDriver17.remove((java.lang.Object) 10.0f);
        java.lang.Object obj21 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) 10.0f);
        experiment.util.Set set22 = hashMapTestDriver8.entrySet();
        experiment.util.Collection collection23 = hashMapTestDriver8.values();
        hashMapTestDriver8.clear();
        experiment.util.Collection collection25 = hashMapTestDriver8.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection25);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test245");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.Set set7 = hashMapTestDriver5.entrySet();
        boolean boolean8 = hashMapTestDriver4.containsKey((java.lang.Object) hashMapTestDriver5);
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        hashMapTestDriver10.clear();
        experiment.util.Set set14 = hashMapTestDriver10.keySet();
        java.lang.Object obj15 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) hashMapTestDriver10);
        experiment.util.Collection collection16 = hashMapTestDriver4.values();
        int int17 = hashMapTestDriver4.size();
        experiment.util.Set set18 = hashMapTestDriver4.keySet();
        java.lang.Class<?> wildcardClass19 = hashMapTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test246");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj12 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver7);
        experiment.util.Set set13 = hashMapTestDriver7.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.entrySet();
        experiment.util.Collection collection16 = hashMapTestDriver14.values();
        hashMapTestDriver14.clear();
        experiment.util.Set set18 = hashMapTestDriver14.keySet();
        boolean boolean19 = hashMapTestDriver7.containsKey((java.lang.Object) set18);
        int int20 = hashMapTestDriver7.size();
        hashMapTestDriver7.clear();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test247");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection6 = hashMapTestDriver0.values();
        experiment.util.Collection collection7 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass8 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test248");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.Set set3 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        int int6 = hashMapTestDriver5.size();
        java.lang.Object obj8 = hashMapTestDriver5.remove((java.lang.Object) 10.0f);
        experiment.util.Set set9 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Collection collection12 = hashMapTestDriver10.values();
        java.lang.Object obj14 = hashMapTestDriver10.remove((java.lang.Object) 10.0f);
        java.lang.Object obj15 = hashMapTestDriver5.get((java.lang.Object) hashMapTestDriver10);
        java.lang.Object obj16 = hashMapTestDriver0.put((java.lang.Object) ' ', (java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Set set19 = hashMapTestDriver17.entrySet();
        java.lang.Object obj20 = hashMapTestDriver10.remove((java.lang.Object) set19);
        boolean boolean21 = hashMapTestDriver10.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test249");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Class<?> wildcardClass7 = obj6.getClass();
        boolean boolean8 = hashMapTestDriver0.containsKey((java.lang.Object) wildcardClass7);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set11 = hashMapTestDriver10.entrySet();
        experiment.util.Set set12 = hashMapTestDriver10.entrySet();
        boolean boolean13 = hashMapTestDriver9.containsKey((java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set15 = hashMapTestDriver14.keySet();
        java.lang.Object obj16 = hashMapTestDriver9.get((java.lang.Object) set15);
        java.lang.Object obj17 = hashMapTestDriver0.get((java.lang.Object) set15);
        boolean boolean18 = hashMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass19 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test250");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set13 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        int int15 = hashMapTestDriver14.size();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        hashMapTestDriver18.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver24.values();
        hashMapTestDriver24.clear();
        experiment.util.Set set28 = hashMapTestDriver24.keySet();
        java.lang.Object obj29 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver31);
        hashMapTestDriver30.clear();
        experiment.util.Collection collection36 = hashMapTestDriver30.values();
        experiment.util.Set set37 = hashMapTestDriver30.keySet();
        java.lang.Object obj39 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        java.lang.Object obj43 = hashMapTestDriver30.remove((java.lang.Object) set42);
        java.lang.Object obj44 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj45 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver30);
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set48 = hashMapTestDriver47.entrySet();
        experiment.util.Set set49 = hashMapTestDriver47.entrySet();
        boolean boolean50 = hashMapTestDriver46.containsKey((java.lang.Object) hashMapTestDriver47);
        hashMapTestDriver46.clear();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        boolean boolean54 = hashMapTestDriver46.containsKey((java.lang.Object) wildcardClass53);
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        int int56 = hashMapTestDriver55.size();
        java.lang.Object obj58 = hashMapTestDriver55.remove((java.lang.Object) 10.0f);
        experiment.util.Set set59 = hashMapTestDriver55.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set61 = hashMapTestDriver60.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set64 = hashMapTestDriver63.entrySet();
        experiment.util.Set set65 = hashMapTestDriver63.entrySet();
        boolean boolean66 = hashMapTestDriver62.containsKey((java.lang.Object) hashMapTestDriver63);
        java.lang.Object obj67 = hashMapTestDriver55.put((java.lang.Object) hashMapTestDriver60, (java.lang.Object) hashMapTestDriver62);
        java.lang.Class<?> wildcardClass68 = hashMapTestDriver60.getClass();
        java.lang.Object obj69 = hashMapTestDriver0.put((java.lang.Object) wildcardClass53, (java.lang.Object) hashMapTestDriver60);
        experiment.util.Set set70 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        int int72 = hashMapTestDriver71.size();
        java.lang.Object obj74 = hashMapTestDriver71.remove((java.lang.Object) 10.0f);
        experiment.util.Set set75 = hashMapTestDriver71.entrySet();
        experiment.util.Set set76 = hashMapTestDriver71.entrySet();
        java.lang.Object obj77 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver71);
        int int78 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test251");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set7 = hashMapTestDriver6.entrySet();
        experiment.util.Set set8 = hashMapTestDriver6.entrySet();
        boolean boolean9 = hashMapTestDriver5.containsKey((java.lang.Object) hashMapTestDriver6);
        boolean boolean11 = hashMapTestDriver5.containsKey((java.lang.Object) (short) 100);
        experiment.util.Collection collection12 = hashMapTestDriver5.values();
        java.lang.Object obj13 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver5);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        int int15 = hashMapTestDriver14.size();
        java.lang.Object obj17 = hashMapTestDriver14.remove((java.lang.Object) 10.0f);
        experiment.util.Set set18 = hashMapTestDriver14.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set23 = hashMapTestDriver22.entrySet();
        experiment.util.Set set24 = hashMapTestDriver22.entrySet();
        boolean boolean25 = hashMapTestDriver21.containsKey((java.lang.Object) hashMapTestDriver22);
        java.lang.Object obj26 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver19, (java.lang.Object) hashMapTestDriver21);
        experiment.util.Set set27 = hashMapTestDriver21.keySet();
        boolean boolean28 = hashMapTestDriver5.containsKey((java.lang.Object) set27);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test252");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver3.clear();
        experiment.util.Set set5 = hashMapTestDriver3.keySet();
        java.lang.Object obj6 = hashMapTestDriver0.remove((java.lang.Object) set5);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test253");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        int int1 = hashMapTestDriver0.size();
        java.lang.Object obj3 = hashMapTestDriver0.remove((java.lang.Object) 10.0f);
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set9 = hashMapTestDriver8.entrySet();
        experiment.util.Set set10 = hashMapTestDriver8.entrySet();
        boolean boolean11 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver8);
        java.lang.Object obj12 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver7);
        java.lang.Object obj14 = hashMapTestDriver0.remove((java.lang.Object) 1.0f);
        experiment.util.Collection collection15 = hashMapTestDriver0.values();
        int int16 = hashMapTestDriver0.size();
        experiment.util.Set set17 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass18 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test254");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = hashMapTestDriver0.remove((java.lang.Object) 100.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set10 = hashMapTestDriver9.entrySet();
        experiment.util.Set set11 = hashMapTestDriver9.entrySet();
        boolean boolean12 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set13 = hashMapTestDriver8.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        int int15 = hashMapTestDriver14.size();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set20 = hashMapTestDriver19.entrySet();
        experiment.util.Set set21 = hashMapTestDriver19.entrySet();
        boolean boolean22 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver19);
        hashMapTestDriver18.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Collection collection26 = hashMapTestDriver24.values();
        hashMapTestDriver24.clear();
        experiment.util.Set set28 = hashMapTestDriver24.keySet();
        java.lang.Object obj29 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver18, (java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set32 = hashMapTestDriver31.entrySet();
        experiment.util.Set set33 = hashMapTestDriver31.entrySet();
        boolean boolean34 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver31);
        hashMapTestDriver30.clear();
        experiment.util.Collection collection36 = hashMapTestDriver30.values();
        experiment.util.Set set37 = hashMapTestDriver30.keySet();
        java.lang.Object obj39 = hashMapTestDriver14.put((java.lang.Object) hashMapTestDriver30, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set41 = hashMapTestDriver40.entrySet();
        experiment.util.Set set42 = hashMapTestDriver40.entrySet();
        java.lang.Object obj43 = hashMapTestDriver30.remove((java.lang.Object) set42);
        java.lang.Object obj44 = hashMapTestDriver6.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj45 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver30);
        int int46 = hashMapTestDriver0.size();
        int int47 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set50 = hashMapTestDriver49.entrySet();
        experiment.util.Collection collection51 = hashMapTestDriver49.values();
        experiment.util.Set set52 = hashMapTestDriver49.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection54 = hashMapTestDriver53.values();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set57 = hashMapTestDriver56.entrySet();
        experiment.util.Set set58 = hashMapTestDriver56.entrySet();
        boolean boolean59 = hashMapTestDriver55.containsKey((java.lang.Object) hashMapTestDriver56);
        experiment.util.Set set60 = hashMapTestDriver55.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        int int62 = hashMapTestDriver61.size();
        boolean boolean64 = hashMapTestDriver61.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set67 = hashMapTestDriver66.entrySet();
        experiment.util.Set set68 = hashMapTestDriver66.entrySet();
        boolean boolean69 = hashMapTestDriver65.containsKey((java.lang.Object) hashMapTestDriver66);
        hashMapTestDriver65.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set72 = hashMapTestDriver71.entrySet();
        experiment.util.Collection collection73 = hashMapTestDriver71.values();
        hashMapTestDriver71.clear();
        experiment.util.Set set75 = hashMapTestDriver71.keySet();
        java.lang.Object obj76 = hashMapTestDriver61.put((java.lang.Object) hashMapTestDriver65, (java.lang.Object) hashMapTestDriver71);
        experiment.util.HashMapTestDriver hashMapTestDriver77 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver78 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set79 = hashMapTestDriver78.entrySet();
        experiment.util.Set set80 = hashMapTestDriver78.entrySet();
        boolean boolean81 = hashMapTestDriver77.containsKey((java.lang.Object) hashMapTestDriver78);
        hashMapTestDriver77.clear();
        experiment.util.Collection collection83 = hashMapTestDriver77.values();
        experiment.util.Set set84 = hashMapTestDriver77.keySet();
        java.lang.Object obj86 = hashMapTestDriver61.put((java.lang.Object) hashMapTestDriver77, (java.lang.Object) '4');
        experiment.util.HashMapTestDriver hashMapTestDriver87 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set88 = hashMapTestDriver87.entrySet();
        experiment.util.Set set89 = hashMapTestDriver87.entrySet();
        java.lang.Object obj90 = hashMapTestDriver77.remove((java.lang.Object) set89);
        java.lang.Object obj91 = hashMapTestDriver53.put((java.lang.Object) hashMapTestDriver55, (java.lang.Object) hashMapTestDriver77);
        boolean boolean92 = hashMapTestDriver49.containsKey((java.lang.Object) hashMapTestDriver77);
        boolean boolean93 = hashMapTestDriver49.isEmpty();
        experiment.util.Set set94 = hashMapTestDriver49.keySet();
        experiment.util.Set set95 = hashMapTestDriver49.entrySet();
        java.lang.Object obj96 = hashMapTestDriver0.put((java.lang.Object) (byte) 10, (java.lang.Object) hashMapTestDriver49);
        java.lang.Class<?> wildcardClass97 = hashMapTestDriver49.getClass();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(set94);
        org.junit.Assert.assertNotNull(set95);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test255");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        int int8 = hashMapTestDriver7.size();
        boolean boolean10 = hashMapTestDriver7.containsKey((java.lang.Object) (byte) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set13 = hashMapTestDriver12.entrySet();
        experiment.util.Set set14 = hashMapTestDriver12.entrySet();
        boolean boolean15 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver12);
        hashMapTestDriver11.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set18 = hashMapTestDriver17.entrySet();
        experiment.util.Collection collection19 = hashMapTestDriver17.values();
        hashMapTestDriver17.clear();
        experiment.util.Set set21 = hashMapTestDriver17.keySet();
        java.lang.Object obj22 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver11, (java.lang.Object) hashMapTestDriver17);
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set25 = hashMapTestDriver24.entrySet();
        experiment.util.Set set26 = hashMapTestDriver24.entrySet();
        boolean boolean27 = hashMapTestDriver23.containsKey((java.lang.Object) hashMapTestDriver24);
        hashMapTestDriver23.clear();
        experiment.util.Collection collection29 = hashMapTestDriver23.values();
        experiment.util.Set set30 = hashMapTestDriver23.keySet();
        java.lang.Object obj32 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver23, (java.lang.Object) '4');
        java.lang.Object obj33 = hashMapTestDriver0.put((java.lang.Object) (-1.0f), (java.lang.Object) '4');
        experiment.util.Set set34 = hashMapTestDriver0.entrySet();
        experiment.util.Set set35 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_54676380_1024_0.test256");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set2 = hashMapTestDriver1.entrySet();
        experiment.util.Set set3 = hashMapTestDriver1.entrySet();
        boolean boolean4 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set6 = hashMapTestDriver5.keySet();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) set6);
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        int int10 = hashMapTestDriver9.size();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) (byte) 100);
        boolean boolean13 = hashMapTestDriver9.isEmpty();
        experiment.util.Set set14 = hashMapTestDriver9.keySet();
        java.lang.Object obj15 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver9);
        experiment.util.Collection collection16 = hashMapTestDriver9.values();
        int int17 = hashMapTestDriver9.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

}
