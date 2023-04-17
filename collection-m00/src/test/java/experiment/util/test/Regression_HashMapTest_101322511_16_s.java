package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashMapTest_101322511_16_s {

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
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test002");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Class<?> wildcardClass1 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test003");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver5.containsKey((java.lang.Object) "");
        java.lang.Object obj8 = hashMapTestDriver3.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver3);
        boolean boolean11 = hashMapTestDriver3.containsKey((java.lang.Object) (short) -1);
        hashMapTestDriver3.clear();
        java.lang.Class<?> wildcardClass13 = hashMapTestDriver3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test004");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = hashMapTestDriver0.remove(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test005");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        boolean boolean8 = hashMapTestDriver6.containsKey((java.lang.Object) "");
        experiment.util.Collection collection9 = hashMapTestDriver6.values();
        experiment.util.Collection collection10 = hashMapTestDriver6.values();
        experiment.util.Set set11 = hashMapTestDriver6.entrySet();
        java.lang.Object obj12 = hashMapTestDriver0.put((java.lang.Object) wildcardClass5, (java.lang.Object) hashMapTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = obj12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test006");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver5.containsKey((java.lang.Object) "");
        java.lang.Object obj8 = hashMapTestDriver3.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver3);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        boolean boolean14 = hashMapTestDriver12.containsKey((java.lang.Object) "");
        java.lang.Object obj15 = hashMapTestDriver10.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set16 = hashMapTestDriver10.entrySet();
        boolean boolean17 = hashMapTestDriver3.containsKey((java.lang.Object) set16);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        boolean boolean20 = hashMapTestDriver18.containsKey((java.lang.Object) "");
        experiment.util.Collection collection21 = hashMapTestDriver18.values();
        experiment.util.Collection collection22 = hashMapTestDriver18.values();
        java.lang.Object obj24 = hashMapTestDriver3.put((java.lang.Object) collection22, (java.lang.Object) 10.0d);
        java.lang.Object obj25 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = hashMapTestDriver3.remove(obj25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test007");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver5.containsKey((java.lang.Object) "");
        java.lang.Object obj8 = hashMapTestDriver3.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver3);
        experiment.util.Set set10 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        boolean boolean13 = hashMapTestDriver11.containsKey((java.lang.Object) "");
        boolean boolean14 = hashMapTestDriver0.containsKey((java.lang.Object) boolean13);
        java.lang.Object obj15 = new java.lang.Object();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver16.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean23 = hashMapTestDriver21.containsKey((java.lang.Object) "");
        java.lang.Object obj24 = hashMapTestDriver19.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean25 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver19);
        experiment.util.Set set26 = hashMapTestDriver16.keySet();
        java.lang.Object obj27 = hashMapTestDriver0.put(obj15, (java.lang.Object) hashMapTestDriver16);
        experiment.util.Set set28 = hashMapTestDriver16.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        boolean boolean31 = hashMapTestDriver29.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        boolean boolean36 = hashMapTestDriver34.containsKey((java.lang.Object) "");
        java.lang.Object obj37 = hashMapTestDriver32.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean38 = hashMapTestDriver29.containsKey((java.lang.Object) hashMapTestDriver32);
        experiment.util.Set set39 = hashMapTestDriver29.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        boolean boolean42 = hashMapTestDriver40.containsKey((java.lang.Object) "");
        boolean boolean43 = hashMapTestDriver29.containsKey((java.lang.Object) boolean42);
        java.lang.Object obj44 = new java.lang.Object();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        boolean boolean47 = hashMapTestDriver45.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        boolean boolean52 = hashMapTestDriver50.containsKey((java.lang.Object) "");
        java.lang.Object obj53 = hashMapTestDriver48.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean54 = hashMapTestDriver45.containsKey((java.lang.Object) hashMapTestDriver48);
        experiment.util.Set set55 = hashMapTestDriver45.keySet();
        java.lang.Object obj56 = hashMapTestDriver29.put(obj44, (java.lang.Object) hashMapTestDriver45);
        experiment.util.Set set57 = hashMapTestDriver45.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        boolean boolean60 = hashMapTestDriver58.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        boolean boolean65 = hashMapTestDriver63.containsKey((java.lang.Object) "");
        java.lang.Object obj66 = hashMapTestDriver61.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean67 = hashMapTestDriver58.containsKey((java.lang.Object) hashMapTestDriver61);
        experiment.util.Set set68 = hashMapTestDriver58.keySet();
        boolean boolean69 = hashMapTestDriver58.isEmpty();
        boolean boolean70 = hashMapTestDriver45.containsKey((java.lang.Object) hashMapTestDriver58);
        java.lang.Object obj71 = hashMapTestDriver16.remove((java.lang.Object) hashMapTestDriver45);
        java.lang.Class<?> wildcardClass72 = hashMapTestDriver16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test008");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        boolean boolean8 = hashMapTestDriver6.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        boolean boolean13 = hashMapTestDriver11.containsKey((java.lang.Object) "");
        java.lang.Object obj14 = hashMapTestDriver9.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean15 = hashMapTestDriver6.containsKey((java.lang.Object) hashMapTestDriver9);
        experiment.util.Set set16 = hashMapTestDriver6.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        boolean boolean19 = hashMapTestDriver17.containsKey((java.lang.Object) "");
        boolean boolean20 = hashMapTestDriver6.containsKey((java.lang.Object) boolean19);
        java.lang.Object obj21 = new java.lang.Object();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        boolean boolean24 = hashMapTestDriver22.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        boolean boolean29 = hashMapTestDriver27.containsKey((java.lang.Object) "");
        java.lang.Object obj30 = hashMapTestDriver25.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean31 = hashMapTestDriver22.containsKey((java.lang.Object) hashMapTestDriver25);
        experiment.util.Set set32 = hashMapTestDriver22.keySet();
        java.lang.Object obj33 = hashMapTestDriver6.put(obj21, (java.lang.Object) hashMapTestDriver22);
        experiment.util.Set set34 = hashMapTestDriver22.entrySet();
        boolean boolean35 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver22);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        boolean boolean38 = hashMapTestDriver36.containsKey((java.lang.Object) "");
        hashMapTestDriver36.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection41 = hashMapTestDriver40.values();
        java.lang.Object obj42 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver36, (java.lang.Object) hashMapTestDriver40);
        experiment.util.Collection collection43 = hashMapTestDriver40.values();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        boolean boolean46 = hashMapTestDriver44.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        boolean boolean51 = hashMapTestDriver49.containsKey((java.lang.Object) "");
        java.lang.Object obj52 = hashMapTestDriver47.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean53 = hashMapTestDriver44.containsKey((java.lang.Object) hashMapTestDriver47);
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        boolean boolean58 = hashMapTestDriver56.containsKey((java.lang.Object) "");
        java.lang.Object obj59 = hashMapTestDriver54.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set60 = hashMapTestDriver54.entrySet();
        boolean boolean61 = hashMapTestDriver47.containsKey((java.lang.Object) set60);
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        boolean boolean64 = hashMapTestDriver62.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        boolean boolean69 = hashMapTestDriver67.containsKey((java.lang.Object) "");
        java.lang.Object obj70 = hashMapTestDriver65.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean71 = hashMapTestDriver62.containsKey((java.lang.Object) hashMapTestDriver65);
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver74 = new experiment.util.HashMapTestDriver();
        boolean boolean76 = hashMapTestDriver74.containsKey((java.lang.Object) "");
        java.lang.Object obj77 = hashMapTestDriver72.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set78 = hashMapTestDriver72.entrySet();
        boolean boolean79 = hashMapTestDriver65.containsKey((java.lang.Object) set78);
        experiment.util.HashMapTestDriver hashMapTestDriver80 = new experiment.util.HashMapTestDriver();
        boolean boolean82 = hashMapTestDriver80.containsKey((java.lang.Object) "");
        experiment.util.Collection collection83 = hashMapTestDriver80.values();
        experiment.util.Collection collection84 = hashMapTestDriver80.values();
        java.lang.Object obj86 = hashMapTestDriver65.put((java.lang.Object) collection84, (java.lang.Object) 10.0d);
        java.lang.Object obj88 = hashMapTestDriver65.get((java.lang.Object) false);
        java.lang.Object obj89 = hashMapTestDriver47.get((java.lang.Object) false);
        boolean boolean91 = hashMapTestDriver47.containsKey((java.lang.Object) 10L);
        boolean boolean92 = hashMapTestDriver40.containsKey((java.lang.Object) 10L);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(set78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test009");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        hashMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass3 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test010");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver5.containsKey((java.lang.Object) "");
        java.lang.Object obj8 = hashMapTestDriver3.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver3);
        experiment.util.Set set10 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        boolean boolean13 = hashMapTestDriver11.containsKey((java.lang.Object) "");
        boolean boolean14 = hashMapTestDriver0.containsKey((java.lang.Object) boolean13);
        java.lang.Object obj15 = new java.lang.Object();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver16.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean23 = hashMapTestDriver21.containsKey((java.lang.Object) "");
        java.lang.Object obj24 = hashMapTestDriver19.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean25 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver19);
        experiment.util.Set set26 = hashMapTestDriver16.keySet();
        java.lang.Object obj27 = hashMapTestDriver0.put(obj15, (java.lang.Object) hashMapTestDriver16);
        experiment.util.Set set28 = hashMapTestDriver16.keySet();
        java.lang.Class<?> wildcardClass29 = set28.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test011");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver2.containsKey((java.lang.Object) "");
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set8 = hashMapTestDriver0.keySet();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = hashMapTestDriver0.containsKey(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test012");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver2.containsKey((java.lang.Object) "");
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set8 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        boolean boolean11 = hashMapTestDriver9.containsKey((java.lang.Object) "");
        experiment.util.Collection collection12 = hashMapTestDriver9.values();
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver9, obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test013");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver2.containsKey((java.lang.Object) "");
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass8 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test014");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        java.lang.Object obj4 = new java.lang.Object();
        java.lang.Class<?> wildcardClass5 = obj4.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        boolean boolean8 = hashMapTestDriver6.containsKey((java.lang.Object) "");
        experiment.util.Collection collection9 = hashMapTestDriver6.values();
        experiment.util.Collection collection10 = hashMapTestDriver6.values();
        experiment.util.Set set11 = hashMapTestDriver6.entrySet();
        java.lang.Object obj12 = hashMapTestDriver0.put((java.lang.Object) wildcardClass5, (java.lang.Object) hashMapTestDriver6);
        boolean boolean14 = hashMapTestDriver6.containsKey((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass15 = hashMapTestDriver6.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test015");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver5.containsKey((java.lang.Object) "");
        java.lang.Object obj8 = hashMapTestDriver3.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver3);
        experiment.util.Set set10 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        boolean boolean13 = hashMapTestDriver11.containsKey((java.lang.Object) "");
        boolean boolean14 = hashMapTestDriver0.containsKey((java.lang.Object) boolean13);
        java.lang.Object obj15 = new java.lang.Object();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver16.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean23 = hashMapTestDriver21.containsKey((java.lang.Object) "");
        java.lang.Object obj24 = hashMapTestDriver19.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean25 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver19);
        experiment.util.Set set26 = hashMapTestDriver16.keySet();
        java.lang.Object obj27 = hashMapTestDriver0.put(obj15, (java.lang.Object) hashMapTestDriver16);
        experiment.util.Set set28 = hashMapTestDriver16.entrySet();
        experiment.util.Set set29 = hashMapTestDriver16.keySet();
        boolean boolean31 = hashMapTestDriver16.containsKey((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test016");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver5.containsKey((java.lang.Object) "");
        java.lang.Object obj8 = hashMapTestDriver3.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver3);
        boolean boolean11 = hashMapTestDriver3.containsKey((java.lang.Object) (short) -1);
        hashMapTestDriver3.clear();
        java.lang.Object obj14 = hashMapTestDriver3.get((java.lang.Object) (short) -1);
        experiment.util.Set set15 = hashMapTestDriver3.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver16.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean23 = hashMapTestDriver21.containsKey((java.lang.Object) "");
        java.lang.Object obj24 = hashMapTestDriver19.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean25 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver19);
        experiment.util.Set set26 = hashMapTestDriver19.entrySet();
        experiment.util.Set set27 = hashMapTestDriver19.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        boolean boolean30 = hashMapTestDriver28.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        boolean boolean35 = hashMapTestDriver33.containsKey((java.lang.Object) "");
        java.lang.Object obj36 = hashMapTestDriver31.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean37 = hashMapTestDriver28.containsKey((java.lang.Object) hashMapTestDriver31);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        boolean boolean42 = hashMapTestDriver40.containsKey((java.lang.Object) "");
        java.lang.Object obj43 = hashMapTestDriver38.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set44 = hashMapTestDriver38.entrySet();
        boolean boolean45 = hashMapTestDriver31.containsKey((java.lang.Object) set44);
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        boolean boolean48 = hashMapTestDriver46.containsKey((java.lang.Object) "");
        experiment.util.Collection collection49 = hashMapTestDriver46.values();
        experiment.util.Collection collection50 = hashMapTestDriver46.values();
        java.lang.Object obj52 = hashMapTestDriver31.put((java.lang.Object) collection50, (java.lang.Object) 10.0d);
        java.lang.Object obj54 = hashMapTestDriver31.get((java.lang.Object) false);
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        boolean boolean57 = hashMapTestDriver55.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        boolean boolean62 = hashMapTestDriver60.containsKey((java.lang.Object) "");
        java.lang.Object obj63 = hashMapTestDriver58.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean64 = hashMapTestDriver55.containsKey((java.lang.Object) hashMapTestDriver58);
        experiment.util.Set set65 = hashMapTestDriver55.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        boolean boolean68 = hashMapTestDriver66.containsKey((java.lang.Object) "");
        boolean boolean69 = hashMapTestDriver55.containsKey((java.lang.Object) boolean68);
        java.lang.Object obj70 = new java.lang.Object();
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        boolean boolean73 = hashMapTestDriver71.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver74 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver76 = new experiment.util.HashMapTestDriver();
        boolean boolean78 = hashMapTestDriver76.containsKey((java.lang.Object) "");
        java.lang.Object obj79 = hashMapTestDriver74.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean80 = hashMapTestDriver71.containsKey((java.lang.Object) hashMapTestDriver74);
        experiment.util.Set set81 = hashMapTestDriver71.keySet();
        java.lang.Object obj82 = hashMapTestDriver55.put(obj70, (java.lang.Object) hashMapTestDriver71);
        java.lang.Object obj83 = hashMapTestDriver19.put((java.lang.Object) hashMapTestDriver31, (java.lang.Object) hashMapTestDriver55);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj84 = hashMapTestDriver3.remove(obj83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj83);
    }

}
