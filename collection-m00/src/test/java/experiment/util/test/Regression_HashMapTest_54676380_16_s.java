package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashMapTest_54676380_16_s {

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

}
