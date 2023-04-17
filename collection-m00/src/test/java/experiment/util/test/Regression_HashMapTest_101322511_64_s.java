package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashMapTest_101322511_64_s {

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

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test017");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver2.containsKey((java.lang.Object) "");
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver2);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        boolean boolean10 = hashMapTestDriver8.containsKey((java.lang.Object) "");
        java.lang.Object obj11 = hashMapTestDriver6.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set12 = hashMapTestDriver6.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        boolean boolean15 = hashMapTestDriver13.containsKey((java.lang.Object) "");
        experiment.util.Collection collection16 = hashMapTestDriver13.values();
        experiment.util.Collection collection17 = hashMapTestDriver13.values();
        experiment.util.Set set18 = hashMapTestDriver13.entrySet();
        boolean boolean20 = hashMapTestDriver13.containsKey((java.lang.Object) 100.0d);
        boolean boolean21 = hashMapTestDriver6.containsKey((java.lang.Object) 100.0d);
        java.lang.Object obj22 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test018");
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
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        boolean boolean45 = hashMapTestDriver43.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        boolean boolean50 = hashMapTestDriver48.containsKey((java.lang.Object) "");
        java.lang.Object obj51 = hashMapTestDriver46.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean52 = hashMapTestDriver43.containsKey((java.lang.Object) hashMapTestDriver46);
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        boolean boolean57 = hashMapTestDriver55.containsKey((java.lang.Object) "");
        java.lang.Object obj58 = hashMapTestDriver53.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set59 = hashMapTestDriver53.entrySet();
        boolean boolean60 = hashMapTestDriver46.containsKey((java.lang.Object) set59);
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        boolean boolean64 = hashMapTestDriver62.containsKey((java.lang.Object) "");
        experiment.util.Collection collection65 = hashMapTestDriver62.values();
        java.lang.Object obj66 = new java.lang.Object();
        java.lang.Class<?> wildcardClass67 = obj66.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        boolean boolean70 = hashMapTestDriver68.containsKey((java.lang.Object) "");
        experiment.util.Collection collection71 = hashMapTestDriver68.values();
        experiment.util.Collection collection72 = hashMapTestDriver68.values();
        experiment.util.Set set73 = hashMapTestDriver68.entrySet();
        java.lang.Object obj74 = hashMapTestDriver62.put((java.lang.Object) wildcardClass67, (java.lang.Object) hashMapTestDriver68);
        experiment.util.Set set75 = hashMapTestDriver62.entrySet();
        java.lang.Object obj76 = hashMapTestDriver46.put((java.lang.Object) 0, (java.lang.Object) set75);
        java.lang.Object obj78 = hashMapTestDriver0.put((java.lang.Object) 0, (java.lang.Object) 100);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test019");
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
        java.lang.Class<?> wildcardClass18 = set16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test020");
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
        hashMapTestDriver22.clear();
        hashMapTestDriver22.clear();
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
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test021");
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
        hashMapTestDriver22.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        boolean boolean42 = hashMapTestDriver40.containsKey((java.lang.Object) "");
        java.lang.Object obj43 = hashMapTestDriver38.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set44 = hashMapTestDriver38.entrySet();
        java.lang.Object obj45 = hashMapTestDriver22.put((java.lang.Object) 100, (java.lang.Object) hashMapTestDriver38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass46 = obj45.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test022");
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
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        boolean boolean31 = hashMapTestDriver29.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        boolean boolean36 = hashMapTestDriver34.containsKey((java.lang.Object) "");
        java.lang.Object obj37 = hashMapTestDriver32.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean38 = hashMapTestDriver29.containsKey((java.lang.Object) hashMapTestDriver32);
        experiment.util.Set set39 = hashMapTestDriver29.keySet();
        boolean boolean40 = hashMapTestDriver29.isEmpty();
        boolean boolean41 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver29);
        java.lang.Class<?> wildcardClass42 = hashMapTestDriver16.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test023");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        java.lang.Class<?> wildcardClass3 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test024");
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
        experiment.util.Collection collection47 = hashMapTestDriver44.values();
        experiment.util.Collection collection48 = hashMapTestDriver44.values();
        experiment.util.Set set49 = hashMapTestDriver44.entrySet();
        boolean boolean51 = hashMapTestDriver44.containsKey((java.lang.Object) 100.0d);
        int int52 = hashMapTestDriver44.size();
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        boolean boolean55 = hashMapTestDriver53.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        boolean boolean60 = hashMapTestDriver58.containsKey((java.lang.Object) "");
        java.lang.Object obj61 = hashMapTestDriver56.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean62 = hashMapTestDriver53.containsKey((java.lang.Object) hashMapTestDriver56);
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        boolean boolean67 = hashMapTestDriver65.containsKey((java.lang.Object) "");
        java.lang.Object obj68 = hashMapTestDriver63.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set69 = hashMapTestDriver63.entrySet();
        boolean boolean70 = hashMapTestDriver56.containsKey((java.lang.Object) set69);
        experiment.util.Set set71 = hashMapTestDriver56.entrySet();
        boolean boolean72 = hashMapTestDriver56.isEmpty();
        java.lang.Class<?> wildcardClass73 = hashMapTestDriver56.getClass();
        java.lang.Object obj74 = hashMapTestDriver44.remove((java.lang.Object) wildcardClass73);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean75 = hashMapTestDriver40.containsKey(obj74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(set71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNull(obj74);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test025");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver5.containsKey((java.lang.Object) "");
        java.lang.Object obj8 = hashMapTestDriver3.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver3);
        experiment.util.Set set10 = hashMapTestDriver3.entrySet();
        experiment.util.Set set11 = hashMapTestDriver3.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        boolean boolean14 = hashMapTestDriver12.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        boolean boolean19 = hashMapTestDriver17.containsKey((java.lang.Object) "");
        java.lang.Object obj20 = hashMapTestDriver15.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean21 = hashMapTestDriver12.containsKey((java.lang.Object) hashMapTestDriver15);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        boolean boolean26 = hashMapTestDriver24.containsKey((java.lang.Object) "");
        java.lang.Object obj27 = hashMapTestDriver22.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set28 = hashMapTestDriver22.entrySet();
        boolean boolean29 = hashMapTestDriver15.containsKey((java.lang.Object) set28);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        boolean boolean32 = hashMapTestDriver30.containsKey((java.lang.Object) "");
        experiment.util.Collection collection33 = hashMapTestDriver30.values();
        experiment.util.Collection collection34 = hashMapTestDriver30.values();
        java.lang.Object obj36 = hashMapTestDriver15.put((java.lang.Object) collection34, (java.lang.Object) 10.0d);
        java.lang.Object obj38 = hashMapTestDriver15.get((java.lang.Object) false);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        boolean boolean41 = hashMapTestDriver39.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        boolean boolean46 = hashMapTestDriver44.containsKey((java.lang.Object) "");
        java.lang.Object obj47 = hashMapTestDriver42.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean48 = hashMapTestDriver39.containsKey((java.lang.Object) hashMapTestDriver42);
        experiment.util.Set set49 = hashMapTestDriver39.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        boolean boolean52 = hashMapTestDriver50.containsKey((java.lang.Object) "");
        boolean boolean53 = hashMapTestDriver39.containsKey((java.lang.Object) boolean52);
        java.lang.Object obj54 = new java.lang.Object();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        boolean boolean57 = hashMapTestDriver55.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        boolean boolean62 = hashMapTestDriver60.containsKey((java.lang.Object) "");
        java.lang.Object obj63 = hashMapTestDriver58.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean64 = hashMapTestDriver55.containsKey((java.lang.Object) hashMapTestDriver58);
        experiment.util.Set set65 = hashMapTestDriver55.keySet();
        java.lang.Object obj66 = hashMapTestDriver39.put(obj54, (java.lang.Object) hashMapTestDriver55);
        java.lang.Object obj67 = hashMapTestDriver3.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) hashMapTestDriver39);
        hashMapTestDriver39.clear();
        java.lang.Class<?> wildcardClass69 = hashMapTestDriver39.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test026");
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
        java.lang.Class<?> wildcardClass16 = hashMapTestDriver3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test027");
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
        boolean boolean29 = hashMapTestDriver16.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test028");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        hashMapTestDriver0.clear();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass5 = collection4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test029");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        hashMapTestDriver0.clear();
        boolean boolean4 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver5.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        boolean boolean12 = hashMapTestDriver10.containsKey((java.lang.Object) "");
        java.lang.Object obj13 = hashMapTestDriver8.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean14 = hashMapTestDriver5.containsKey((java.lang.Object) hashMapTestDriver8);
        boolean boolean16 = hashMapTestDriver8.containsKey((java.lang.Object) (short) -1);
        hashMapTestDriver8.clear();
        java.lang.Object obj19 = hashMapTestDriver8.get((java.lang.Object) (short) -1);
        experiment.util.Set set20 = hashMapTestDriver8.entrySet();
        experiment.util.Set set21 = hashMapTestDriver8.entrySet();
        java.lang.Object obj22 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver8);
        java.lang.Class<?> wildcardClass23 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test030");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver2.containsKey((java.lang.Object) "");
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test031");
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
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        boolean boolean45 = hashMapTestDriver43.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        boolean boolean50 = hashMapTestDriver48.containsKey((java.lang.Object) "");
        java.lang.Object obj51 = hashMapTestDriver46.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean52 = hashMapTestDriver43.containsKey((java.lang.Object) hashMapTestDriver46);
        boolean boolean54 = hashMapTestDriver46.containsKey((java.lang.Object) (short) -1);
        experiment.util.Set set55 = hashMapTestDriver46.keySet();
        java.lang.Object obj56 = hashMapTestDriver40.remove((java.lang.Object) set55);
        java.lang.Object obj57 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = hashMapTestDriver40.containsKey(obj57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test032");
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
        boolean boolean17 = hashMapTestDriver9.containsKey((java.lang.Object) (short) -1);
        boolean boolean18 = hashMapTestDriver0.containsKey((java.lang.Object) (short) -1);
        experiment.util.Set set19 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection20 = hashMapTestDriver0.values();
        experiment.util.Set set21 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test033");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver2.containsKey((java.lang.Object) "");
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) (-1.0f));
        experiment.util.Set set9 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        boolean boolean13 = hashMapTestDriver11.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver16.containsKey((java.lang.Object) "");
        java.lang.Object obj19 = hashMapTestDriver14.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean20 = hashMapTestDriver11.containsKey((java.lang.Object) hashMapTestDriver14);
        experiment.util.Set set21 = hashMapTestDriver11.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        boolean boolean24 = hashMapTestDriver22.containsKey((java.lang.Object) "");
        boolean boolean25 = hashMapTestDriver11.containsKey((java.lang.Object) boolean24);
        java.lang.Object obj26 = new java.lang.Object();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        boolean boolean29 = hashMapTestDriver27.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        boolean boolean34 = hashMapTestDriver32.containsKey((java.lang.Object) "");
        java.lang.Object obj35 = hashMapTestDriver30.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean36 = hashMapTestDriver27.containsKey((java.lang.Object) hashMapTestDriver30);
        experiment.util.Set set37 = hashMapTestDriver27.keySet();
        java.lang.Object obj38 = hashMapTestDriver11.put(obj26, (java.lang.Object) hashMapTestDriver27);
        experiment.util.Set set39 = hashMapTestDriver27.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        boolean boolean42 = hashMapTestDriver40.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        boolean boolean47 = hashMapTestDriver45.containsKey((java.lang.Object) "");
        java.lang.Object obj48 = hashMapTestDriver43.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean49 = hashMapTestDriver40.containsKey((java.lang.Object) hashMapTestDriver43);
        experiment.util.Set set50 = hashMapTestDriver40.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        boolean boolean53 = hashMapTestDriver51.containsKey((java.lang.Object) "");
        boolean boolean54 = hashMapTestDriver40.containsKey((java.lang.Object) boolean53);
        java.lang.Object obj55 = new java.lang.Object();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        boolean boolean58 = hashMapTestDriver56.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        boolean boolean63 = hashMapTestDriver61.containsKey((java.lang.Object) "");
        java.lang.Object obj64 = hashMapTestDriver59.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean65 = hashMapTestDriver56.containsKey((java.lang.Object) hashMapTestDriver59);
        experiment.util.Set set66 = hashMapTestDriver56.keySet();
        java.lang.Object obj67 = hashMapTestDriver40.put(obj55, (java.lang.Object) hashMapTestDriver56);
        experiment.util.Set set68 = hashMapTestDriver56.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver69 = new experiment.util.HashMapTestDriver();
        boolean boolean71 = hashMapTestDriver69.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver74 = new experiment.util.HashMapTestDriver();
        boolean boolean76 = hashMapTestDriver74.containsKey((java.lang.Object) "");
        java.lang.Object obj77 = hashMapTestDriver72.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean78 = hashMapTestDriver69.containsKey((java.lang.Object) hashMapTestDriver72);
        experiment.util.Set set79 = hashMapTestDriver69.keySet();
        boolean boolean80 = hashMapTestDriver69.isEmpty();
        boolean boolean81 = hashMapTestDriver56.containsKey((java.lang.Object) hashMapTestDriver69);
        java.lang.Object obj82 = hashMapTestDriver27.remove((java.lang.Object) hashMapTestDriver56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj83 = hashMapTestDriver0.put((java.lang.Object) 100, obj82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test034");
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
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        java.lang.Object obj18 = hashMapTestDriver0.put((java.lang.Object) 0.0f, (java.lang.Object) collection17);
        boolean boolean19 = hashMapTestDriver0.isEmpty();
        boolean boolean20 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean23 = hashMapTestDriver21.containsKey((java.lang.Object) "");
        hashMapTestDriver21.clear();
        boolean boolean25 = hashMapTestDriver21.isEmpty();
        boolean boolean26 = hashMapTestDriver21.isEmpty();
        java.lang.Class<?> wildcardClass27 = hashMapTestDriver21.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        java.lang.Object obj30 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver21, (java.lang.Object) collection29);
        java.lang.Object obj32 = hashMapTestDriver21.remove((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test035");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        hashMapTestDriver0.clear();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test036");
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
        experiment.util.Collection collection39 = hashMapTestDriver36.values();
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        boolean boolean44 = hashMapTestDriver42.containsKey((java.lang.Object) "");
        experiment.util.Collection collection45 = hashMapTestDriver42.values();
        experiment.util.Collection collection46 = hashMapTestDriver42.values();
        experiment.util.Set set47 = hashMapTestDriver42.entrySet();
        java.lang.Object obj48 = hashMapTestDriver36.put((java.lang.Object) wildcardClass41, (java.lang.Object) hashMapTestDriver42);
        boolean boolean49 = hashMapTestDriver22.containsKey((java.lang.Object) hashMapTestDriver42);
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        boolean boolean52 = hashMapTestDriver50.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        boolean boolean57 = hashMapTestDriver55.containsKey((java.lang.Object) "");
        java.lang.Object obj58 = hashMapTestDriver53.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean59 = hashMapTestDriver50.containsKey((java.lang.Object) hashMapTestDriver53);
        java.lang.Object obj60 = hashMapTestDriver22.remove((java.lang.Object) hashMapTestDriver53);
        int int61 = hashMapTestDriver53.size();
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
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test037");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver2.containsKey((java.lang.Object) "");
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj9 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        int int10 = hashMapTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test038");
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
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        java.lang.Object obj18 = hashMapTestDriver0.put((java.lang.Object) 0.0f, (java.lang.Object) collection17);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        boolean boolean21 = hashMapTestDriver19.containsKey((java.lang.Object) "");
        hashMapTestDriver19.clear();
        boolean boolean23 = hashMapTestDriver19.isEmpty();
        boolean boolean24 = hashMapTestDriver19.isEmpty();
        experiment.util.Set set25 = hashMapTestDriver19.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        boolean boolean28 = hashMapTestDriver26.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        boolean boolean33 = hashMapTestDriver31.containsKey((java.lang.Object) "");
        java.lang.Object obj34 = hashMapTestDriver29.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean35 = hashMapTestDriver26.containsKey((java.lang.Object) hashMapTestDriver29);
        boolean boolean37 = hashMapTestDriver29.containsKey((java.lang.Object) (short) -1);
        boolean boolean38 = hashMapTestDriver29.isEmpty();
        java.lang.Object obj39 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver19, (java.lang.Object) boolean38);
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        boolean boolean42 = hashMapTestDriver40.containsKey((java.lang.Object) "");
        experiment.util.Collection collection43 = hashMapTestDriver40.values();
        boolean boolean45 = hashMapTestDriver40.containsKey((java.lang.Object) (-1.0d));
        experiment.util.Collection collection46 = hashMapTestDriver40.values();
        java.lang.Object obj47 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass48 = obj47.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test039");
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
        experiment.util.Set set13 = hashMapTestDriver0.keySet();
        int int14 = hashMapTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test040");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass3 = collection2.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test041");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver5.containsKey((java.lang.Object) "");
        java.lang.Object obj8 = hashMapTestDriver3.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver3);
        experiment.util.Set set10 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass11 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test042");
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
        experiment.util.Set set43 = hashMapTestDriver40.keySet();
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
        org.junit.Assert.assertNotNull(set43);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test043");
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
        experiment.util.Collection collection39 = hashMapTestDriver36.values();
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Class<?> wildcardClass41 = obj40.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        boolean boolean44 = hashMapTestDriver42.containsKey((java.lang.Object) "");
        experiment.util.Collection collection45 = hashMapTestDriver42.values();
        experiment.util.Collection collection46 = hashMapTestDriver42.values();
        experiment.util.Set set47 = hashMapTestDriver42.entrySet();
        java.lang.Object obj48 = hashMapTestDriver36.put((java.lang.Object) wildcardClass41, (java.lang.Object) hashMapTestDriver42);
        boolean boolean49 = hashMapTestDriver22.containsKey((java.lang.Object) hashMapTestDriver42);
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        boolean boolean52 = hashMapTestDriver50.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        boolean boolean57 = hashMapTestDriver55.containsKey((java.lang.Object) "");
        java.lang.Object obj58 = hashMapTestDriver53.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean59 = hashMapTestDriver50.containsKey((java.lang.Object) hashMapTestDriver53);
        java.lang.Object obj60 = hashMapTestDriver22.remove((java.lang.Object) hashMapTestDriver53);
        experiment.util.Collection collection61 = hashMapTestDriver53.values();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        boolean boolean64 = hashMapTestDriver62.containsKey((java.lang.Object) "");
        hashMapTestDriver62.clear();
        boolean boolean66 = hashMapTestDriver62.isEmpty();
        boolean boolean67 = hashMapTestDriver62.isEmpty();
        experiment.util.Set set68 = hashMapTestDriver62.keySet();
        java.lang.Object obj69 = hashMapTestDriver53.remove((java.lang.Object) set68);
        experiment.util.HashMapTestDriver hashMapTestDriver70 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection71 = hashMapTestDriver70.values();
        experiment.util.Collection collection72 = hashMapTestDriver70.values();
        experiment.util.HashMapTestDriver hashMapTestDriver73 = new experiment.util.HashMapTestDriver();
        boolean boolean75 = hashMapTestDriver73.containsKey((java.lang.Object) "");
        experiment.util.Collection collection76 = hashMapTestDriver73.values();
        java.lang.Object obj77 = new java.lang.Object();
        java.lang.Class<?> wildcardClass78 = obj77.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver79 = new experiment.util.HashMapTestDriver();
        boolean boolean81 = hashMapTestDriver79.containsKey((java.lang.Object) "");
        experiment.util.Collection collection82 = hashMapTestDriver79.values();
        experiment.util.Collection collection83 = hashMapTestDriver79.values();
        experiment.util.Set set84 = hashMapTestDriver79.entrySet();
        java.lang.Object obj85 = hashMapTestDriver73.put((java.lang.Object) wildcardClass78, (java.lang.Object) hashMapTestDriver79);
        experiment.util.Set set86 = hashMapTestDriver73.entrySet();
        experiment.util.Collection collection87 = hashMapTestDriver73.values();
        java.lang.Object obj88 = hashMapTestDriver70.get((java.lang.Object) hashMapTestDriver73);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj89 = hashMapTestDriver53.remove(obj88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNotNull(wildcardClass78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(collection82);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test044");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver3.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        boolean boolean10 = hashMapTestDriver8.containsKey((java.lang.Object) "");
        java.lang.Object obj11 = hashMapTestDriver6.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean12 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver6);
        boolean boolean14 = hashMapTestDriver6.containsKey((java.lang.Object) (short) -1);
        hashMapTestDriver6.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver16.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean23 = hashMapTestDriver21.containsKey((java.lang.Object) "");
        java.lang.Object obj24 = hashMapTestDriver19.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean25 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver19);
        experiment.util.Set set26 = hashMapTestDriver16.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        boolean boolean29 = hashMapTestDriver27.containsKey((java.lang.Object) "");
        boolean boolean30 = hashMapTestDriver16.containsKey((java.lang.Object) boolean29);
        java.lang.Object obj31 = new java.lang.Object();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        boolean boolean34 = hashMapTestDriver32.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        boolean boolean39 = hashMapTestDriver37.containsKey((java.lang.Object) "");
        java.lang.Object obj40 = hashMapTestDriver35.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean41 = hashMapTestDriver32.containsKey((java.lang.Object) hashMapTestDriver35);
        experiment.util.Set set42 = hashMapTestDriver32.keySet();
        java.lang.Object obj43 = hashMapTestDriver16.put(obj31, (java.lang.Object) hashMapTestDriver32);
        experiment.util.Set set44 = hashMapTestDriver32.entrySet();
        java.lang.Object obj45 = hashMapTestDriver6.get((java.lang.Object) set44);
        java.lang.Class<?> wildcardClass46 = set44.getClass();
        java.lang.Object obj47 = hashMapTestDriver0.get((java.lang.Object) set44);
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        boolean boolean50 = hashMapTestDriver48.containsKey((java.lang.Object) "");
        experiment.util.Collection collection51 = hashMapTestDriver48.values();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        boolean boolean56 = hashMapTestDriver54.containsKey((java.lang.Object) "");
        experiment.util.Collection collection57 = hashMapTestDriver54.values();
        experiment.util.Collection collection58 = hashMapTestDriver54.values();
        experiment.util.Set set59 = hashMapTestDriver54.entrySet();
        java.lang.Object obj60 = hashMapTestDriver48.put((java.lang.Object) wildcardClass53, (java.lang.Object) hashMapTestDriver54);
        experiment.util.Set set61 = hashMapTestDriver54.entrySet();
        java.lang.Object obj62 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver54);
        hashMapTestDriver54.clear();
        experiment.util.Collection collection64 = hashMapTestDriver54.values();
        hashMapTestDriver54.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(collection64);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test045");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver3.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        boolean boolean10 = hashMapTestDriver8.containsKey((java.lang.Object) "");
        java.lang.Object obj11 = hashMapTestDriver6.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean12 = hashMapTestDriver3.containsKey((java.lang.Object) hashMapTestDriver6);
        boolean boolean14 = hashMapTestDriver6.containsKey((java.lang.Object) (short) -1);
        hashMapTestDriver6.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver16.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean23 = hashMapTestDriver21.containsKey((java.lang.Object) "");
        java.lang.Object obj24 = hashMapTestDriver19.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean25 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver19);
        experiment.util.Set set26 = hashMapTestDriver16.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        boolean boolean29 = hashMapTestDriver27.containsKey((java.lang.Object) "");
        boolean boolean30 = hashMapTestDriver16.containsKey((java.lang.Object) boolean29);
        java.lang.Object obj31 = new java.lang.Object();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        boolean boolean34 = hashMapTestDriver32.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        boolean boolean39 = hashMapTestDriver37.containsKey((java.lang.Object) "");
        java.lang.Object obj40 = hashMapTestDriver35.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean41 = hashMapTestDriver32.containsKey((java.lang.Object) hashMapTestDriver35);
        experiment.util.Set set42 = hashMapTestDriver32.keySet();
        java.lang.Object obj43 = hashMapTestDriver16.put(obj31, (java.lang.Object) hashMapTestDriver32);
        experiment.util.Set set44 = hashMapTestDriver32.entrySet();
        java.lang.Object obj45 = hashMapTestDriver6.get((java.lang.Object) set44);
        java.lang.Class<?> wildcardClass46 = set44.getClass();
        java.lang.Object obj47 = hashMapTestDriver0.get((java.lang.Object) set44);
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        boolean boolean50 = hashMapTestDriver48.containsKey((java.lang.Object) "");
        experiment.util.Collection collection51 = hashMapTestDriver48.values();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        boolean boolean56 = hashMapTestDriver54.containsKey((java.lang.Object) "");
        experiment.util.Collection collection57 = hashMapTestDriver54.values();
        experiment.util.Collection collection58 = hashMapTestDriver54.values();
        experiment.util.Set set59 = hashMapTestDriver54.entrySet();
        java.lang.Object obj60 = hashMapTestDriver48.put((java.lang.Object) wildcardClass53, (java.lang.Object) hashMapTestDriver54);
        experiment.util.Set set61 = hashMapTestDriver54.entrySet();
        java.lang.Object obj62 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver54);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        boolean boolean66 = hashMapTestDriver64.containsKey((java.lang.Object) "");
        experiment.util.Collection collection67 = hashMapTestDriver64.values();
        experiment.util.Collection collection68 = hashMapTestDriver64.values();
        experiment.util.Set set69 = hashMapTestDriver64.entrySet();
        boolean boolean70 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver64);
        boolean boolean71 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test046");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver2.containsKey((java.lang.Object) "");
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver2);
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        boolean boolean9 = hashMapTestDriver7.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        boolean boolean14 = hashMapTestDriver12.containsKey((java.lang.Object) "");
        java.lang.Object obj15 = hashMapTestDriver10.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean16 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver10);
        experiment.util.Set set17 = hashMapTestDriver7.keySet();
        boolean boolean18 = hashMapTestDriver7.isEmpty();
        int int19 = hashMapTestDriver7.size();
        java.lang.Object obj20 = hashMapTestDriver0.get((java.lang.Object) int19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test047");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        hashMapTestDriver0.clear();
        boolean boolean4 = hashMapTestDriver0.isEmpty();
        boolean boolean5 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set6 = hashMapTestDriver0.keySet();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test048");
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
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        java.lang.Object obj18 = hashMapTestDriver0.put((java.lang.Object) 0.0f, (java.lang.Object) collection17);
        experiment.util.Set set19 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass20 = set19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test049");
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
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        java.lang.Object obj18 = hashMapTestDriver0.put((java.lang.Object) 0.0f, (java.lang.Object) collection17);
        boolean boolean19 = hashMapTestDriver0.isEmpty();
        boolean boolean20 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver21.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        boolean boolean25 = hashMapTestDriver23.containsKey((java.lang.Object) "");
        java.lang.Object obj26 = hashMapTestDriver21.get((java.lang.Object) hashMapTestDriver23);
        java.lang.Object obj27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver23, obj27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test050");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver2.containsKey((java.lang.Object) "");
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        boolean boolean9 = hashMapTestDriver7.containsKey((java.lang.Object) "");
        experiment.util.Collection collection10 = hashMapTestDriver7.values();
        experiment.util.Collection collection11 = hashMapTestDriver7.values();
        experiment.util.Set set12 = hashMapTestDriver7.entrySet();
        boolean boolean14 = hashMapTestDriver7.containsKey((java.lang.Object) 100.0d);
        boolean boolean15 = hashMapTestDriver0.containsKey((java.lang.Object) 100.0d);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        boolean boolean19 = hashMapTestDriver17.containsKey((java.lang.Object) "");
        experiment.util.Collection collection20 = hashMapTestDriver17.values();
        experiment.util.Collection collection21 = hashMapTestDriver17.values();
        experiment.util.Set set22 = hashMapTestDriver17.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        boolean boolean25 = hashMapTestDriver23.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        boolean boolean30 = hashMapTestDriver28.containsKey((java.lang.Object) "");
        java.lang.Object obj31 = hashMapTestDriver26.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean32 = hashMapTestDriver23.containsKey((java.lang.Object) hashMapTestDriver26);
        experiment.util.Set set33 = hashMapTestDriver23.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        boolean boolean36 = hashMapTestDriver34.containsKey((java.lang.Object) "");
        boolean boolean37 = hashMapTestDriver23.containsKey((java.lang.Object) boolean36);
        java.lang.Object obj38 = new java.lang.Object();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        boolean boolean41 = hashMapTestDriver39.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        boolean boolean46 = hashMapTestDriver44.containsKey((java.lang.Object) "");
        java.lang.Object obj47 = hashMapTestDriver42.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean48 = hashMapTestDriver39.containsKey((java.lang.Object) hashMapTestDriver42);
        experiment.util.Set set49 = hashMapTestDriver39.keySet();
        java.lang.Object obj50 = hashMapTestDriver23.put(obj38, (java.lang.Object) hashMapTestDriver39);
        experiment.util.Set set51 = hashMapTestDriver39.entrySet();
        boolean boolean52 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver39);
        hashMapTestDriver39.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        boolean boolean59 = hashMapTestDriver57.containsKey((java.lang.Object) "");
        java.lang.Object obj60 = hashMapTestDriver55.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set61 = hashMapTestDriver55.entrySet();
        java.lang.Object obj62 = hashMapTestDriver39.put((java.lang.Object) 100, (java.lang.Object) hashMapTestDriver55);
        experiment.util.Collection collection63 = hashMapTestDriver39.values();
        hashMapTestDriver39.clear();
        experiment.util.Set set65 = hashMapTestDriver39.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver66 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection67 = hashMapTestDriver66.values();
        boolean boolean68 = hashMapTestDriver39.containsKey((java.lang.Object) collection67);
        hashMapTestDriver39.clear();
        hashMapTestDriver39.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection72 = hashMapTestDriver71.values();
        experiment.util.Collection collection73 = hashMapTestDriver71.values();
        experiment.util.HashMapTestDriver hashMapTestDriver74 = new experiment.util.HashMapTestDriver();
        boolean boolean76 = hashMapTestDriver74.containsKey((java.lang.Object) "");
        experiment.util.Collection collection77 = hashMapTestDriver74.values();
        java.lang.Object obj78 = new java.lang.Object();
        java.lang.Class<?> wildcardClass79 = obj78.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver80 = new experiment.util.HashMapTestDriver();
        boolean boolean82 = hashMapTestDriver80.containsKey((java.lang.Object) "");
        experiment.util.Collection collection83 = hashMapTestDriver80.values();
        experiment.util.Collection collection84 = hashMapTestDriver80.values();
        experiment.util.Set set85 = hashMapTestDriver80.entrySet();
        java.lang.Object obj86 = hashMapTestDriver74.put((java.lang.Object) wildcardClass79, (java.lang.Object) hashMapTestDriver80);
        experiment.util.Set set87 = hashMapTestDriver74.entrySet();
        experiment.util.Collection collection88 = hashMapTestDriver74.values();
        java.lang.Object obj89 = hashMapTestDriver71.get((java.lang.Object) hashMapTestDriver74);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj90 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver39, obj89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(collection72);
        org.junit.Assert.assertNotNull(collection73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNotNull(wildcardClass79);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNotNull(collection88);
        org.junit.Assert.assertNull(obj89);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test051");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        hashMapTestDriver0.clear();
        boolean boolean4 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        boolean boolean9 = hashMapTestDriver7.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        boolean boolean14 = hashMapTestDriver12.containsKey((java.lang.Object) "");
        java.lang.Object obj15 = hashMapTestDriver10.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean16 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        boolean boolean19 = hashMapTestDriver17.containsKey((java.lang.Object) "");
        experiment.util.Collection collection20 = hashMapTestDriver17.values();
        experiment.util.Collection collection21 = hashMapTestDriver17.values();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        boolean boolean24 = hashMapTestDriver22.containsKey((java.lang.Object) "");
        hashMapTestDriver22.clear();
        boolean boolean26 = hashMapTestDriver22.isEmpty();
        java.lang.Object obj27 = hashMapTestDriver7.put((java.lang.Object) hashMapTestDriver17, (java.lang.Object) hashMapTestDriver22);
        java.lang.Object obj28 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver17);
        java.lang.Object obj29 = null;
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        boolean boolean34 = hashMapTestDriver32.containsKey((java.lang.Object) "");
        java.lang.Object obj35 = hashMapTestDriver30.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set36 = hashMapTestDriver30.entrySet();
        java.lang.Object obj38 = hashMapTestDriver30.remove((java.lang.Object) (-1.0f));
        hashMapTestDriver30.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj40 = hashMapTestDriver0.put(obj29, (java.lang.Object) hashMapTestDriver30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test052");
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
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        boolean boolean45 = hashMapTestDriver43.containsKey((java.lang.Object) "");
        hashMapTestDriver43.clear();
        java.lang.Object obj48 = hashMapTestDriver43.remove((java.lang.Object) 100);
        experiment.util.Set set49 = hashMapTestDriver43.keySet();
        experiment.util.Set set50 = hashMapTestDriver43.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        boolean boolean53 = hashMapTestDriver51.containsKey((java.lang.Object) "");
        experiment.util.Collection collection54 = hashMapTestDriver51.values();
        java.lang.Object obj55 = new java.lang.Object();
        java.lang.Class<?> wildcardClass56 = obj55.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver57 = new experiment.util.HashMapTestDriver();
        boolean boolean59 = hashMapTestDriver57.containsKey((java.lang.Object) "");
        experiment.util.Collection collection60 = hashMapTestDriver57.values();
        experiment.util.Collection collection61 = hashMapTestDriver57.values();
        experiment.util.Set set62 = hashMapTestDriver57.entrySet();
        java.lang.Object obj63 = hashMapTestDriver51.put((java.lang.Object) wildcardClass56, (java.lang.Object) hashMapTestDriver57);
        experiment.util.Set set64 = hashMapTestDriver57.entrySet();
        experiment.util.Collection collection65 = hashMapTestDriver57.values();
        boolean boolean67 = hashMapTestDriver57.containsKey((java.lang.Object) 10L);
        hashMapTestDriver57.clear();
        java.lang.Object obj69 = hashMapTestDriver36.put((java.lang.Object) set50, (java.lang.Object) hashMapTestDriver57);
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test053");
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
        experiment.util.Collection collection39 = hashMapTestDriver36.values();
        experiment.util.Collection collection40 = hashMapTestDriver36.values();
        experiment.util.Set set41 = hashMapTestDriver36.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        boolean boolean44 = hashMapTestDriver42.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        boolean boolean49 = hashMapTestDriver47.containsKey((java.lang.Object) "");
        java.lang.Object obj50 = hashMapTestDriver45.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean51 = hashMapTestDriver42.containsKey((java.lang.Object) hashMapTestDriver45);
        boolean boolean53 = hashMapTestDriver45.containsKey((java.lang.Object) (short) -1);
        boolean boolean54 = hashMapTestDriver36.containsKey((java.lang.Object) (short) -1);
        experiment.util.Set set55 = hashMapTestDriver36.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        boolean boolean58 = hashMapTestDriver56.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        boolean boolean63 = hashMapTestDriver61.containsKey((java.lang.Object) "");
        java.lang.Object obj64 = hashMapTestDriver59.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean65 = hashMapTestDriver56.containsKey((java.lang.Object) hashMapTestDriver59);
        experiment.util.Set set66 = hashMapTestDriver56.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        boolean boolean69 = hashMapTestDriver67.containsKey((java.lang.Object) "");
        boolean boolean70 = hashMapTestDriver56.containsKey((java.lang.Object) boolean69);
        java.lang.Object obj71 = new java.lang.Object();
        experiment.util.HashMapTestDriver hashMapTestDriver72 = new experiment.util.HashMapTestDriver();
        boolean boolean74 = hashMapTestDriver72.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver75 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver77 = new experiment.util.HashMapTestDriver();
        boolean boolean79 = hashMapTestDriver77.containsKey((java.lang.Object) "");
        java.lang.Object obj80 = hashMapTestDriver75.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean81 = hashMapTestDriver72.containsKey((java.lang.Object) hashMapTestDriver75);
        experiment.util.Set set82 = hashMapTestDriver72.keySet();
        java.lang.Object obj83 = hashMapTestDriver56.put(obj71, (java.lang.Object) hashMapTestDriver72);
        experiment.util.Set set84 = hashMapTestDriver72.entrySet();
        experiment.util.Set set85 = hashMapTestDriver72.keySet();
        java.lang.Object obj86 = hashMapTestDriver22.put((java.lang.Object) set55, (java.lang.Object) set85);
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
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(set85);
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test054");
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
        boolean boolean17 = hashMapTestDriver9.containsKey((java.lang.Object) (short) -1);
        boolean boolean18 = hashMapTestDriver0.containsKey((java.lang.Object) (short) -1);
        experiment.util.Set set19 = hashMapTestDriver0.entrySet();
        boolean boolean20 = hashMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass21 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test055");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver5.containsKey((java.lang.Object) "");
        java.lang.Object obj8 = hashMapTestDriver3.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean9 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver3);
        boolean boolean11 = hashMapTestDriver3.containsKey((java.lang.Object) (short) -1);
        boolean boolean12 = hashMapTestDriver3.isEmpty();
        hashMapTestDriver3.clear();
        java.lang.Class<?> wildcardClass14 = hashMapTestDriver3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test056");
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
        experiment.util.Set set18 = hashMapTestDriver3.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        boolean boolean21 = hashMapTestDriver19.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        boolean boolean26 = hashMapTestDriver24.containsKey((java.lang.Object) "");
        java.lang.Object obj27 = hashMapTestDriver22.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean28 = hashMapTestDriver19.containsKey((java.lang.Object) hashMapTestDriver22);
        experiment.util.Set set29 = hashMapTestDriver19.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        boolean boolean32 = hashMapTestDriver30.containsKey((java.lang.Object) "");
        boolean boolean33 = hashMapTestDriver19.containsKey((java.lang.Object) boolean32);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection36 = hashMapTestDriver35.values();
        java.lang.Object obj37 = hashMapTestDriver19.put((java.lang.Object) 0.0f, (java.lang.Object) collection36);
        experiment.util.Set set38 = hashMapTestDriver19.keySet();
        java.lang.Object obj39 = hashMapTestDriver3.get((java.lang.Object) hashMapTestDriver19);
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        boolean boolean42 = hashMapTestDriver40.containsKey((java.lang.Object) "");
        experiment.util.Collection collection43 = hashMapTestDriver40.values();
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Class<?> wildcardClass45 = obj44.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        boolean boolean48 = hashMapTestDriver46.containsKey((java.lang.Object) "");
        experiment.util.Collection collection49 = hashMapTestDriver46.values();
        experiment.util.Collection collection50 = hashMapTestDriver46.values();
        experiment.util.Set set51 = hashMapTestDriver46.entrySet();
        java.lang.Object obj52 = hashMapTestDriver40.put((java.lang.Object) wildcardClass45, (java.lang.Object) hashMapTestDriver46);
        experiment.util.Set set53 = hashMapTestDriver40.entrySet();
        experiment.util.Collection collection54 = hashMapTestDriver40.values();
        int int55 = hashMapTestDriver40.size();
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        boolean boolean58 = hashMapTestDriver56.containsKey((java.lang.Object) "");
        experiment.util.Collection collection59 = hashMapTestDriver56.values();
        experiment.util.Collection collection60 = hashMapTestDriver56.values();
        experiment.util.Collection collection61 = hashMapTestDriver56.values();
        java.lang.Object obj62 = hashMapTestDriver40.remove((java.lang.Object) hashMapTestDriver56);
        java.lang.Object obj63 = hashMapTestDriver19.remove((java.lang.Object) hashMapTestDriver40);
        hashMapTestDriver40.clear();
        boolean boolean65 = hashMapTestDriver40.isEmpty();
        java.lang.Class<?> wildcardClass66 = hashMapTestDriver40.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test057");
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
        experiment.util.Set set13 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection14 = hashMapTestDriver0.values();
        int int15 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver16.containsKey((java.lang.Object) "");
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        experiment.util.Collection collection20 = hashMapTestDriver16.values();
        experiment.util.Collection collection21 = hashMapTestDriver16.values();
        java.lang.Object obj22 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver16);
        experiment.util.Set set23 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test058");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver0.containsKey((java.lang.Object) "");
        hashMapTestDriver0.clear();
        boolean boolean4 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver5.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        boolean boolean12 = hashMapTestDriver10.containsKey((java.lang.Object) "");
        java.lang.Object obj13 = hashMapTestDriver8.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean14 = hashMapTestDriver5.containsKey((java.lang.Object) hashMapTestDriver8);
        boolean boolean16 = hashMapTestDriver8.containsKey((java.lang.Object) (short) -1);
        experiment.util.Set set17 = hashMapTestDriver8.keySet();
        java.lang.Object obj19 = hashMapTestDriver8.remove((java.lang.Object) (short) 0);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        boolean boolean24 = hashMapTestDriver22.containsKey((java.lang.Object) "");
        java.lang.Object obj25 = hashMapTestDriver20.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set26 = hashMapTestDriver20.entrySet();
        java.lang.Object obj28 = hashMapTestDriver20.remove((java.lang.Object) (-1.0f));
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        boolean boolean33 = hashMapTestDriver31.containsKey((java.lang.Object) "");
        java.lang.Object obj34 = hashMapTestDriver29.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set35 = hashMapTestDriver29.entrySet();
        java.lang.Object obj36 = hashMapTestDriver20.remove((java.lang.Object) hashMapTestDriver29);
        java.lang.Object obj37 = hashMapTestDriver8.get((java.lang.Object) hashMapTestDriver20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj38 = hashMapTestDriver0.get(obj37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test059");
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
        experiment.util.Set set13 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection14 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        boolean boolean17 = hashMapTestDriver15.containsKey((java.lang.Object) "");
        experiment.util.Collection collection18 = hashMapTestDriver15.values();
        experiment.util.Collection collection19 = hashMapTestDriver15.values();
        experiment.util.Set set20 = hashMapTestDriver15.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean23 = hashMapTestDriver21.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        boolean boolean28 = hashMapTestDriver26.containsKey((java.lang.Object) "");
        java.lang.Object obj29 = hashMapTestDriver24.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean30 = hashMapTestDriver21.containsKey((java.lang.Object) hashMapTestDriver24);
        experiment.util.Set set31 = hashMapTestDriver21.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        boolean boolean34 = hashMapTestDriver32.containsKey((java.lang.Object) "");
        boolean boolean35 = hashMapTestDriver21.containsKey((java.lang.Object) boolean34);
        java.lang.Object obj36 = new java.lang.Object();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        boolean boolean39 = hashMapTestDriver37.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        boolean boolean44 = hashMapTestDriver42.containsKey((java.lang.Object) "");
        java.lang.Object obj45 = hashMapTestDriver40.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean46 = hashMapTestDriver37.containsKey((java.lang.Object) hashMapTestDriver40);
        experiment.util.Set set47 = hashMapTestDriver37.keySet();
        java.lang.Object obj48 = hashMapTestDriver21.put(obj36, (java.lang.Object) hashMapTestDriver37);
        experiment.util.Set set49 = hashMapTestDriver37.entrySet();
        boolean boolean50 = hashMapTestDriver15.containsKey((java.lang.Object) hashMapTestDriver37);
        hashMapTestDriver37.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver53 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        boolean boolean57 = hashMapTestDriver55.containsKey((java.lang.Object) "");
        java.lang.Object obj58 = hashMapTestDriver53.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set59 = hashMapTestDriver53.entrySet();
        java.lang.Object obj60 = hashMapTestDriver37.put((java.lang.Object) 100, (java.lang.Object) hashMapTestDriver53);
        experiment.util.Collection collection61 = hashMapTestDriver37.values();
        hashMapTestDriver37.clear();
        experiment.util.Set set63 = hashMapTestDriver37.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection65 = hashMapTestDriver64.values();
        boolean boolean66 = hashMapTestDriver37.containsKey((java.lang.Object) collection65);
        hashMapTestDriver37.clear();
        java.lang.Object obj68 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver37);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test060");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver2.containsKey((java.lang.Object) "");
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) (-1.0f));
        experiment.util.Set set9 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection10 = hashMapTestDriver0.values();
        int int11 = hashMapTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test061");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver2.containsKey((java.lang.Object) "");
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        boolean boolean9 = hashMapTestDriver7.containsKey((java.lang.Object) "");
        experiment.util.Collection collection10 = hashMapTestDriver7.values();
        experiment.util.Collection collection11 = hashMapTestDriver7.values();
        experiment.util.Set set12 = hashMapTestDriver7.entrySet();
        boolean boolean14 = hashMapTestDriver7.containsKey((java.lang.Object) 100.0d);
        boolean boolean15 = hashMapTestDriver0.containsKey((java.lang.Object) 100.0d);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        boolean boolean19 = hashMapTestDriver17.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        boolean boolean24 = hashMapTestDriver22.containsKey((java.lang.Object) "");
        java.lang.Object obj25 = hashMapTestDriver20.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean26 = hashMapTestDriver17.containsKey((java.lang.Object) hashMapTestDriver20);
        experiment.util.Set set27 = hashMapTestDriver17.keySet();
        java.lang.Object obj28 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver17);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        boolean boolean31 = hashMapTestDriver29.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        boolean boolean36 = hashMapTestDriver34.containsKey((java.lang.Object) "");
        java.lang.Object obj37 = hashMapTestDriver32.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean38 = hashMapTestDriver29.containsKey((java.lang.Object) hashMapTestDriver32);
        experiment.util.Set set39 = hashMapTestDriver29.keySet();
        boolean boolean40 = hashMapTestDriver29.isEmpty();
        boolean boolean41 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver29);
        hashMapTestDriver29.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test062");
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
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        boolean boolean31 = hashMapTestDriver29.containsKey((java.lang.Object) "");
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        boolean boolean36 = hashMapTestDriver34.containsKey((java.lang.Object) "");
        java.lang.Object obj37 = hashMapTestDriver32.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        boolean boolean38 = hashMapTestDriver29.containsKey((java.lang.Object) hashMapTestDriver32);
        experiment.util.Set set39 = hashMapTestDriver29.keySet();
        boolean boolean40 = hashMapTestDriver29.isEmpty();
        boolean boolean41 = hashMapTestDriver16.containsKey((java.lang.Object) hashMapTestDriver29);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        boolean boolean44 = hashMapTestDriver42.containsKey((java.lang.Object) "");
        hashMapTestDriver42.clear();
        boolean boolean46 = hashMapTestDriver42.isEmpty();
        int int47 = hashMapTestDriver42.size();
        boolean boolean48 = hashMapTestDriver29.containsKey((java.lang.Object) hashMapTestDriver42);
        experiment.util.Set set49 = hashMapTestDriver42.keySet();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(set49);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test063");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver2.containsKey((java.lang.Object) "");
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        boolean boolean9 = hashMapTestDriver7.containsKey((java.lang.Object) "");
        experiment.util.Collection collection10 = hashMapTestDriver7.values();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        boolean boolean15 = hashMapTestDriver13.containsKey((java.lang.Object) "");
        experiment.util.Collection collection16 = hashMapTestDriver13.values();
        experiment.util.Collection collection17 = hashMapTestDriver13.values();
        experiment.util.Set set18 = hashMapTestDriver13.entrySet();
        java.lang.Object obj19 = hashMapTestDriver7.put((java.lang.Object) wildcardClass12, (java.lang.Object) hashMapTestDriver13);
        boolean boolean21 = hashMapTestDriver13.containsKey((java.lang.Object) 0.0d);
        java.lang.Object obj23 = hashMapTestDriver0.put((java.lang.Object) boolean21, (java.lang.Object) (byte) -1);
        experiment.util.Collection collection24 = hashMapTestDriver0.values();
        experiment.util.Set set25 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_101322511_1024_0.test064");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver2.containsKey((java.lang.Object) "");
        java.lang.Object obj5 = hashMapTestDriver0.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set6 = hashMapTestDriver0.entrySet();
        boolean boolean7 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set8 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        boolean boolean13 = hashMapTestDriver11.containsKey((java.lang.Object) "");
        java.lang.Object obj14 = hashMapTestDriver9.put((java.lang.Object) (short) -1, (java.lang.Object) "");
        experiment.util.Set set15 = hashMapTestDriver9.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver16.containsKey((java.lang.Object) "");
        experiment.util.Collection collection19 = hashMapTestDriver16.values();
        java.lang.Object obj20 = new java.lang.Object();
        java.lang.Class<?> wildcardClass21 = obj20.getClass();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        boolean boolean24 = hashMapTestDriver22.containsKey((java.lang.Object) "");
        experiment.util.Collection collection25 = hashMapTestDriver22.values();
        experiment.util.Collection collection26 = hashMapTestDriver22.values();
        experiment.util.Set set27 = hashMapTestDriver22.entrySet();
        java.lang.Object obj28 = hashMapTestDriver16.put((java.lang.Object) wildcardClass21, (java.lang.Object) hashMapTestDriver22);
        boolean boolean30 = hashMapTestDriver22.containsKey((java.lang.Object) 0.0d);
        java.lang.Object obj32 = hashMapTestDriver9.put((java.lang.Object) boolean30, (java.lang.Object) (byte) -1);
        experiment.util.Collection collection33 = hashMapTestDriver9.values();
        java.lang.Object obj34 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver9);
        int int35 = hashMapTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

}
