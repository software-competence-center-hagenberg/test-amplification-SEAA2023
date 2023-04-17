package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashMapTest_1321793073_32_s {

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
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test002");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        experiment.util.Set set3 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass4 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test003");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        int int3 = hashMapTestDriver0.size();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass5 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test004");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        java.lang.Object obj3 = hashMapTestDriver0.get((java.lang.Object) 'a');
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 100.0d);
        java.lang.Object obj12 = hashMapTestDriver4.remove((java.lang.Object) 1L);
        experiment.util.Set set13 = hashMapTestDriver4.keySet();
        java.lang.Object obj15 = hashMapTestDriver4.remove((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = hashMapTestDriver0.put(obj15, (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "" + "'", obj12, "");
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test005");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (-1.0f));
        int int3 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        experiment.util.Collection collection6 = hashMapTestDriver4.values();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) collection6);
        boolean boolean8 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = hashMapTestDriver0.get(obj9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test006");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        hashMapTestDriver0.clear();
        java.lang.Object obj9 = hashMapTestDriver0.remove((java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = obj9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test007");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass3 = collection2.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test008");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 1.0f);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver7.remove((java.lang.Object) (-1.0f));
        int int10 = hashMapTestDriver7.size();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        boolean boolean12 = hashMapTestDriver11.isEmpty();
        experiment.util.Collection collection13 = hashMapTestDriver11.values();
        java.lang.Object obj14 = hashMapTestDriver7.get((java.lang.Object) collection13);
        experiment.util.Set set15 = hashMapTestDriver7.keySet();
        java.lang.Object obj16 = hashMapTestDriver0.remove((java.lang.Object) set15);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test009");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        int int3 = hashMapTestDriver0.size();
        experiment.util.Collection collection4 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass5 = collection4.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test010");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass2 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test011");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        hashMapTestDriver0.clear();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        boolean boolean10 = hashMapTestDriver9.isEmpty();
        java.lang.Object obj13 = hashMapTestDriver9.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj15 = hashMapTestDriver9.get((java.lang.Object) 100.0d);
        java.lang.Object obj17 = hashMapTestDriver9.remove((java.lang.Object) 1L);
        experiment.util.Collection collection18 = hashMapTestDriver9.values();
        experiment.util.Set set19 = hashMapTestDriver9.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean22 = hashMapTestDriver21.isEmpty();
        experiment.util.Collection collection23 = hashMapTestDriver21.values();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        boolean boolean25 = hashMapTestDriver24.isEmpty();
        java.lang.Object obj28 = hashMapTestDriver24.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj30 = hashMapTestDriver24.get((java.lang.Object) 100.0d);
        hashMapTestDriver24.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        boolean boolean33 = hashMapTestDriver32.isEmpty();
        java.lang.Object obj36 = hashMapTestDriver32.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj38 = hashMapTestDriver32.get((java.lang.Object) 100.0d);
        java.lang.Object obj40 = hashMapTestDriver32.remove((java.lang.Object) 1L);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        boolean boolean43 = hashMapTestDriver42.isEmpty();
        experiment.util.Set set44 = hashMapTestDriver42.keySet();
        int int45 = hashMapTestDriver42.size();
        experiment.util.Set set46 = hashMapTestDriver42.keySet();
        java.lang.Object obj48 = hashMapTestDriver42.remove((java.lang.Object) 0.0d);
        int int49 = hashMapTestDriver42.size();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        boolean boolean51 = hashMapTestDriver50.isEmpty();
        experiment.util.Set set52 = hashMapTestDriver50.keySet();
        int int53 = hashMapTestDriver50.size();
        java.lang.Object obj55 = hashMapTestDriver50.get((java.lang.Object) (byte) 10);
        hashMapTestDriver50.clear();
        boolean boolean57 = hashMapTestDriver42.containsKey((java.lang.Object) hashMapTestDriver50);
        java.lang.Object obj58 = hashMapTestDriver32.put((java.lang.Object) true, (java.lang.Object) boolean57);
        java.lang.Object obj59 = hashMapTestDriver21.put((java.lang.Object) hashMapTestDriver24, (java.lang.Object) true);
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        boolean boolean61 = hashMapTestDriver60.isEmpty();
        experiment.util.Set set62 = hashMapTestDriver60.keySet();
        int int63 = hashMapTestDriver60.size();
        experiment.util.Set set64 = hashMapTestDriver60.keySet();
        java.lang.Object obj66 = hashMapTestDriver60.remove((java.lang.Object) 0.0d);
        int int67 = hashMapTestDriver60.size();
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        boolean boolean69 = hashMapTestDriver68.isEmpty();
        hashMapTestDriver68.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver71 = new experiment.util.HashMapTestDriver();
        boolean boolean72 = hashMapTestDriver71.isEmpty();
        hashMapTestDriver71.clear();
        experiment.util.Set set74 = hashMapTestDriver71.entrySet();
        java.lang.Object obj75 = hashMapTestDriver60.put((java.lang.Object) hashMapTestDriver68, (java.lang.Object) hashMapTestDriver71);
        experiment.util.Collection collection76 = hashMapTestDriver60.values();
        java.lang.Object obj77 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver21, (java.lang.Object) collection76);
        java.lang.Object obj78 = hashMapTestDriver9.get((java.lang.Object) hashMapTestDriver21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = hashMapTestDriver0.containsKey(obj78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "" + "'", obj17, "");
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "" + "'", obj40, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test012");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.remove((java.lang.Object) (-1.0f));
        int int3 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        experiment.util.Collection collection6 = hashMapTestDriver4.values();
        java.lang.Object obj7 = hashMapTestDriver0.get((java.lang.Object) collection6);
        int int8 = hashMapTestDriver0.size();
        boolean boolean9 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test013");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) 1L, (java.lang.Object) "");
        experiment.util.Set set5 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass6 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test014");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver1.isEmpty();
        experiment.util.Collection collection3 = hashMapTestDriver1.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        boolean boolean5 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj8 = hashMapTestDriver4.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj10 = hashMapTestDriver4.get((java.lang.Object) 100.0d);
        hashMapTestDriver4.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        boolean boolean13 = hashMapTestDriver12.isEmpty();
        java.lang.Object obj16 = hashMapTestDriver12.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj18 = hashMapTestDriver12.get((java.lang.Object) 100.0d);
        java.lang.Object obj20 = hashMapTestDriver12.remove((java.lang.Object) 1L);
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        boolean boolean23 = hashMapTestDriver22.isEmpty();
        experiment.util.Set set24 = hashMapTestDriver22.keySet();
        int int25 = hashMapTestDriver22.size();
        experiment.util.Set set26 = hashMapTestDriver22.keySet();
        java.lang.Object obj28 = hashMapTestDriver22.remove((java.lang.Object) 0.0d);
        int int29 = hashMapTestDriver22.size();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        boolean boolean31 = hashMapTestDriver30.isEmpty();
        experiment.util.Set set32 = hashMapTestDriver30.keySet();
        int int33 = hashMapTestDriver30.size();
        java.lang.Object obj35 = hashMapTestDriver30.get((java.lang.Object) (byte) 10);
        hashMapTestDriver30.clear();
        boolean boolean37 = hashMapTestDriver22.containsKey((java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj38 = hashMapTestDriver12.put((java.lang.Object) true, (java.lang.Object) boolean37);
        java.lang.Object obj39 = hashMapTestDriver1.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) true);
        experiment.util.Collection collection40 = hashMapTestDriver1.values();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        boolean boolean42 = hashMapTestDriver41.isEmpty();
        experiment.util.Set set43 = hashMapTestDriver41.keySet();
        hashMapTestDriver41.clear();
        experiment.util.Set set45 = hashMapTestDriver41.keySet();
        java.lang.Object obj47 = hashMapTestDriver41.remove((java.lang.Object) (short) 0);
        java.lang.Object obj48 = hashMapTestDriver1.remove((java.lang.Object) hashMapTestDriver41);
        boolean boolean49 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver41);
        experiment.util.Set set50 = hashMapTestDriver0.keySet();
        experiment.util.Set set51 = hashMapTestDriver0.entrySet();
        java.lang.Object obj52 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = hashMapTestDriver0.containsKey(obj52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "" + "'", obj20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNotNull(set51);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test015");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass6 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test016");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        int int3 = hashMapTestDriver0.size();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        java.lang.Object obj6 = hashMapTestDriver0.remove((java.lang.Object) 0.0d);
        int int7 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        boolean boolean9 = hashMapTestDriver8.isEmpty();
        hashMapTestDriver8.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        boolean boolean12 = hashMapTestDriver11.isEmpty();
        hashMapTestDriver11.clear();
        experiment.util.Set set14 = hashMapTestDriver11.entrySet();
        java.lang.Object obj15 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) hashMapTestDriver11);
        boolean boolean16 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        java.lang.Class<?> wildcardClass18 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test017");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        experiment.util.Collection collection2 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        boolean boolean4 = hashMapTestDriver3.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver3.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj9 = hashMapTestDriver3.get((java.lang.Object) 100.0d);
        hashMapTestDriver3.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        boolean boolean12 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver11.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj17 = hashMapTestDriver11.get((java.lang.Object) 100.0d);
        java.lang.Object obj19 = hashMapTestDriver11.remove((java.lang.Object) 1L);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean22 = hashMapTestDriver21.isEmpty();
        experiment.util.Set set23 = hashMapTestDriver21.keySet();
        int int24 = hashMapTestDriver21.size();
        experiment.util.Set set25 = hashMapTestDriver21.keySet();
        java.lang.Object obj27 = hashMapTestDriver21.remove((java.lang.Object) 0.0d);
        int int28 = hashMapTestDriver21.size();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        boolean boolean30 = hashMapTestDriver29.isEmpty();
        experiment.util.Set set31 = hashMapTestDriver29.keySet();
        int int32 = hashMapTestDriver29.size();
        java.lang.Object obj34 = hashMapTestDriver29.get((java.lang.Object) (byte) 10);
        hashMapTestDriver29.clear();
        boolean boolean36 = hashMapTestDriver21.containsKey((java.lang.Object) hashMapTestDriver29);
        java.lang.Object obj37 = hashMapTestDriver11.put((java.lang.Object) true, (java.lang.Object) boolean36);
        java.lang.Object obj38 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) true);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        boolean boolean40 = hashMapTestDriver39.isEmpty();
        experiment.util.Set set41 = hashMapTestDriver39.keySet();
        java.lang.Object obj42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj43 = hashMapTestDriver3.put((java.lang.Object) hashMapTestDriver39, obj42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "" + "'", obj19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(set41);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test018");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver1 = new experiment.util.HashMapTestDriver();
        boolean boolean2 = hashMapTestDriver1.isEmpty();
        experiment.util.Set set3 = hashMapTestDriver1.keySet();
        int int4 = hashMapTestDriver1.size();
        experiment.util.Set set5 = hashMapTestDriver1.keySet();
        boolean boolean6 = hashMapTestDriver1.isEmpty();
        boolean boolean7 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver1);
        experiment.util.Set set8 = hashMapTestDriver1.entrySet();
        java.lang.Class<?> wildcardClass9 = set8.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test019");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 1.0f);
        hashMapTestDriver0.clear();
        experiment.util.Collection collection8 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass9 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test020");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        int int3 = hashMapTestDriver0.size();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        java.lang.Object obj6 = hashMapTestDriver0.remove((java.lang.Object) 0.0d);
        experiment.util.Collection collection7 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        boolean boolean9 = hashMapTestDriver8.isEmpty();
        java.lang.Object obj12 = hashMapTestDriver8.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj14 = hashMapTestDriver8.get((java.lang.Object) 100.0d);
        java.lang.Object obj16 = hashMapTestDriver8.remove((java.lang.Object) 1L);
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        boolean boolean19 = hashMapTestDriver18.isEmpty();
        experiment.util.Set set20 = hashMapTestDriver18.keySet();
        int int21 = hashMapTestDriver18.size();
        experiment.util.Set set22 = hashMapTestDriver18.keySet();
        java.lang.Object obj24 = hashMapTestDriver18.remove((java.lang.Object) 0.0d);
        int int25 = hashMapTestDriver18.size();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        boolean boolean27 = hashMapTestDriver26.isEmpty();
        experiment.util.Set set28 = hashMapTestDriver26.keySet();
        int int29 = hashMapTestDriver26.size();
        java.lang.Object obj31 = hashMapTestDriver26.get((java.lang.Object) (byte) 10);
        hashMapTestDriver26.clear();
        boolean boolean33 = hashMapTestDriver18.containsKey((java.lang.Object) hashMapTestDriver26);
        java.lang.Object obj34 = hashMapTestDriver8.put((java.lang.Object) true, (java.lang.Object) boolean33);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj37 = hashMapTestDriver35.remove((java.lang.Object) (-1.0f));
        int int38 = hashMapTestDriver35.size();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        boolean boolean40 = hashMapTestDriver39.isEmpty();
        experiment.util.Collection collection41 = hashMapTestDriver39.values();
        java.lang.Object obj42 = hashMapTestDriver35.get((java.lang.Object) collection41);
        experiment.util.Set set43 = hashMapTestDriver35.keySet();
        java.lang.Object obj44 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver8, (java.lang.Object) set43);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        boolean boolean46 = hashMapTestDriver45.isEmpty();
        experiment.util.Set set47 = hashMapTestDriver45.keySet();
        hashMapTestDriver45.clear();
        experiment.util.Set set49 = hashMapTestDriver45.keySet();
        experiment.util.Set set50 = hashMapTestDriver45.keySet();
        int int51 = hashMapTestDriver45.size();
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        boolean boolean53 = hashMapTestDriver52.isEmpty();
        experiment.util.Set set54 = hashMapTestDriver52.keySet();
        int int55 = hashMapTestDriver52.size();
        experiment.util.Set set56 = hashMapTestDriver52.keySet();
        java.lang.Object obj58 = hashMapTestDriver52.remove((java.lang.Object) 0.0d);
        experiment.util.Collection collection59 = hashMapTestDriver52.values();
        java.lang.Object obj60 = hashMapTestDriver45.remove((java.lang.Object) collection59);
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        boolean boolean62 = hashMapTestDriver61.isEmpty();
        experiment.util.Set set63 = hashMapTestDriver61.keySet();
        int int64 = hashMapTestDriver61.size();
        experiment.util.Set set65 = hashMapTestDriver61.keySet();
        java.lang.Object obj67 = hashMapTestDriver61.remove((java.lang.Object) 0.0d);
        int int68 = hashMapTestDriver61.size();
        experiment.util.Collection collection69 = hashMapTestDriver61.values();
        int int70 = hashMapTestDriver61.size();
        experiment.util.Set set71 = hashMapTestDriver61.keySet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj72 = hashMapTestDriver8.put(obj60, (java.lang.Object) hashMapTestDriver61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "" + "'", obj16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(set71);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test021");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        java.lang.Object obj3 = hashMapTestDriver0.get((java.lang.Object) 'a');
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = hashMapTestDriver0.containsKey(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test022");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        hashMapTestDriver0.clear();
        java.lang.Object obj8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = hashMapTestDriver0.get(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test023");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver12.clear();
        java.lang.Object obj15 = hashMapTestDriver12.get((java.lang.Object) 'a');
        experiment.util.Set set16 = hashMapTestDriver12.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        boolean boolean18 = hashMapTestDriver17.isEmpty();
        experiment.util.Collection collection19 = hashMapTestDriver17.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        boolean boolean21 = hashMapTestDriver20.isEmpty();
        java.lang.Object obj24 = hashMapTestDriver20.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj26 = hashMapTestDriver20.get((java.lang.Object) 100.0d);
        hashMapTestDriver20.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        boolean boolean29 = hashMapTestDriver28.isEmpty();
        java.lang.Object obj32 = hashMapTestDriver28.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj34 = hashMapTestDriver28.get((java.lang.Object) 100.0d);
        java.lang.Object obj36 = hashMapTestDriver28.remove((java.lang.Object) 1L);
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        boolean boolean39 = hashMapTestDriver38.isEmpty();
        experiment.util.Set set40 = hashMapTestDriver38.keySet();
        int int41 = hashMapTestDriver38.size();
        experiment.util.Set set42 = hashMapTestDriver38.keySet();
        java.lang.Object obj44 = hashMapTestDriver38.remove((java.lang.Object) 0.0d);
        int int45 = hashMapTestDriver38.size();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        boolean boolean47 = hashMapTestDriver46.isEmpty();
        experiment.util.Set set48 = hashMapTestDriver46.keySet();
        int int49 = hashMapTestDriver46.size();
        java.lang.Object obj51 = hashMapTestDriver46.get((java.lang.Object) (byte) 10);
        hashMapTestDriver46.clear();
        boolean boolean53 = hashMapTestDriver38.containsKey((java.lang.Object) hashMapTestDriver46);
        java.lang.Object obj54 = hashMapTestDriver28.put((java.lang.Object) true, (java.lang.Object) boolean53);
        java.lang.Object obj55 = hashMapTestDriver17.put((java.lang.Object) hashMapTestDriver20, (java.lang.Object) true);
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj58 = hashMapTestDriver56.remove((java.lang.Object) (-1.0f));
        int int59 = hashMapTestDriver56.size();
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        boolean boolean61 = hashMapTestDriver60.isEmpty();
        experiment.util.Collection collection62 = hashMapTestDriver60.values();
        java.lang.Object obj63 = hashMapTestDriver56.get((java.lang.Object) collection62);
        boolean boolean64 = hashMapTestDriver20.containsKey((java.lang.Object) collection62);
        java.lang.Class<?> wildcardClass65 = collection62.getClass();
        java.lang.Object obj66 = hashMapTestDriver12.remove((java.lang.Object) wildcardClass65);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean67 = hashMapTestDriver0.containsKey(obj66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + "" + "'", obj36, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNull(obj66);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test024");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        java.lang.Object obj3 = hashMapTestDriver0.get((java.lang.Object) 'a');
        int int4 = hashMapTestDriver0.size();
        int int5 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        boolean boolean7 = hashMapTestDriver6.isEmpty();
        java.lang.Object obj10 = hashMapTestDriver6.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj12 = hashMapTestDriver6.get((java.lang.Object) 100.0d);
        java.lang.Object obj14 = hashMapTestDriver6.remove((java.lang.Object) 1L);
        experiment.util.Set set15 = hashMapTestDriver6.keySet();
        java.lang.Object obj17 = hashMapTestDriver6.remove((java.lang.Object) '#');
        int int18 = hashMapTestDriver6.size();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        boolean boolean21 = hashMapTestDriver20.isEmpty();
        experiment.util.Collection collection22 = hashMapTestDriver20.values();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        boolean boolean24 = hashMapTestDriver23.isEmpty();
        java.lang.Object obj27 = hashMapTestDriver23.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj29 = hashMapTestDriver23.get((java.lang.Object) 100.0d);
        hashMapTestDriver23.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        boolean boolean32 = hashMapTestDriver31.isEmpty();
        java.lang.Object obj35 = hashMapTestDriver31.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj37 = hashMapTestDriver31.get((java.lang.Object) 100.0d);
        java.lang.Object obj39 = hashMapTestDriver31.remove((java.lang.Object) 1L);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        boolean boolean42 = hashMapTestDriver41.isEmpty();
        experiment.util.Set set43 = hashMapTestDriver41.keySet();
        int int44 = hashMapTestDriver41.size();
        experiment.util.Set set45 = hashMapTestDriver41.keySet();
        java.lang.Object obj47 = hashMapTestDriver41.remove((java.lang.Object) 0.0d);
        int int48 = hashMapTestDriver41.size();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        boolean boolean50 = hashMapTestDriver49.isEmpty();
        experiment.util.Set set51 = hashMapTestDriver49.keySet();
        int int52 = hashMapTestDriver49.size();
        java.lang.Object obj54 = hashMapTestDriver49.get((java.lang.Object) (byte) 10);
        hashMapTestDriver49.clear();
        boolean boolean56 = hashMapTestDriver41.containsKey((java.lang.Object) hashMapTestDriver49);
        java.lang.Object obj57 = hashMapTestDriver31.put((java.lang.Object) true, (java.lang.Object) boolean56);
        java.lang.Object obj58 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver23, (java.lang.Object) true);
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        boolean boolean60 = hashMapTestDriver59.isEmpty();
        experiment.util.Set set61 = hashMapTestDriver59.keySet();
        int int62 = hashMapTestDriver59.size();
        experiment.util.Set set63 = hashMapTestDriver59.keySet();
        java.lang.Object obj65 = hashMapTestDriver59.remove((java.lang.Object) 0.0d);
        int int66 = hashMapTestDriver59.size();
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        boolean boolean68 = hashMapTestDriver67.isEmpty();
        hashMapTestDriver67.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver70 = new experiment.util.HashMapTestDriver();
        boolean boolean71 = hashMapTestDriver70.isEmpty();
        hashMapTestDriver70.clear();
        experiment.util.Set set73 = hashMapTestDriver70.entrySet();
        java.lang.Object obj74 = hashMapTestDriver59.put((java.lang.Object) hashMapTestDriver67, (java.lang.Object) hashMapTestDriver70);
        experiment.util.Collection collection75 = hashMapTestDriver59.values();
        java.lang.Object obj76 = hashMapTestDriver19.put((java.lang.Object) hashMapTestDriver20, (java.lang.Object) collection75);
        boolean boolean77 = hashMapTestDriver20.isEmpty();
        experiment.util.Collection collection78 = hashMapTestDriver20.values();
        experiment.util.HashMapTestDriver hashMapTestDriver79 = new experiment.util.HashMapTestDriver();
        boolean boolean80 = hashMapTestDriver79.isEmpty();
        experiment.util.Set set81 = hashMapTestDriver79.keySet();
        hashMapTestDriver79.clear();
        experiment.util.Set set83 = hashMapTestDriver79.keySet();
        experiment.util.Set set84 = hashMapTestDriver79.keySet();
        int int85 = hashMapTestDriver79.size();
        experiment.util.HashMapTestDriver hashMapTestDriver86 = new experiment.util.HashMapTestDriver();
        boolean boolean87 = hashMapTestDriver86.isEmpty();
        experiment.util.Set set88 = hashMapTestDriver86.keySet();
        int int89 = hashMapTestDriver86.size();
        experiment.util.Set set90 = hashMapTestDriver86.keySet();
        java.lang.Object obj92 = hashMapTestDriver86.remove((java.lang.Object) 0.0d);
        experiment.util.Collection collection93 = hashMapTestDriver86.values();
        java.lang.Object obj94 = hashMapTestDriver79.remove((java.lang.Object) collection93);
        java.lang.Object obj95 = hashMapTestDriver6.put((java.lang.Object) collection78, (java.lang.Object) collection93);
        boolean boolean96 = hashMapTestDriver0.containsKey((java.lang.Object) collection78);
        boolean boolean97 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "" + "'", obj14, "");
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "" + "'", obj39, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertNotNull(set90);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(collection93);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test025");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        experiment.util.Set set5 = hashMapTestDriver0.keySet();
        int int6 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver7.clear();
        java.lang.Object obj10 = hashMapTestDriver7.get((java.lang.Object) 'a');
        int int11 = hashMapTestDriver7.size();
        int int12 = hashMapTestDriver7.size();
        boolean boolean13 = hashMapTestDriver7.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        boolean boolean15 = hashMapTestDriver14.isEmpty();
        java.lang.Object obj18 = hashMapTestDriver14.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj20 = hashMapTestDriver14.get((java.lang.Object) 100.0d);
        hashMapTestDriver14.clear();
        java.lang.Object obj22 = hashMapTestDriver0.put((java.lang.Object) boolean13, (java.lang.Object) hashMapTestDriver14);
        experiment.util.Collection collection23 = hashMapTestDriver0.values();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        boolean boolean26 = hashMapTestDriver25.isEmpty();
        experiment.util.Set set27 = hashMapTestDriver25.keySet();
        int int28 = hashMapTestDriver25.size();
        experiment.util.Set set29 = hashMapTestDriver25.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        boolean boolean31 = hashMapTestDriver30.isEmpty();
        experiment.util.Set set32 = hashMapTestDriver30.keySet();
        int int33 = hashMapTestDriver30.size();
        java.lang.Object obj35 = hashMapTestDriver30.get((java.lang.Object) (byte) 10);
        hashMapTestDriver30.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        boolean boolean38 = hashMapTestDriver37.isEmpty();
        experiment.util.Set set39 = hashMapTestDriver37.keySet();
        hashMapTestDriver37.clear();
        experiment.util.Set set41 = hashMapTestDriver37.keySet();
        experiment.util.Set set42 = hashMapTestDriver37.keySet();
        boolean boolean43 = hashMapTestDriver30.containsKey((java.lang.Object) hashMapTestDriver37);
        java.lang.Object obj44 = hashMapTestDriver25.get((java.lang.Object) boolean43);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = hashMapTestDriver0.containsKey(obj44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test026");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        java.lang.Object obj3 = hashMapTestDriver0.get((java.lang.Object) 'a');
        int int4 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        boolean boolean6 = hashMapTestDriver5.isEmpty();
        experiment.util.Set set7 = hashMapTestDriver5.keySet();
        int int8 = hashMapTestDriver5.size();
        experiment.util.Set set9 = hashMapTestDriver5.keySet();
        java.lang.Object obj11 = hashMapTestDriver5.remove((java.lang.Object) 0.0d);
        int int12 = hashMapTestDriver5.size();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        boolean boolean14 = hashMapTestDriver13.isEmpty();
        hashMapTestDriver13.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        boolean boolean17 = hashMapTestDriver16.isEmpty();
        hashMapTestDriver16.clear();
        experiment.util.Set set19 = hashMapTestDriver16.entrySet();
        java.lang.Object obj20 = hashMapTestDriver5.put((java.lang.Object) hashMapTestDriver13, (java.lang.Object) hashMapTestDriver16);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        boolean boolean22 = hashMapTestDriver21.isEmpty();
        java.lang.Object obj25 = hashMapTestDriver21.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj27 = hashMapTestDriver21.get((java.lang.Object) 100.0d);
        hashMapTestDriver21.clear();
        experiment.util.Set set29 = hashMapTestDriver21.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        boolean boolean31 = hashMapTestDriver30.isEmpty();
        experiment.util.Set set32 = hashMapTestDriver30.keySet();
        int int33 = hashMapTestDriver30.size();
        experiment.util.Set set34 = hashMapTestDriver30.keySet();
        java.lang.Object obj36 = hashMapTestDriver30.remove((java.lang.Object) 0.0d);
        int int37 = hashMapTestDriver30.size();
        experiment.util.HashMapTestDriver hashMapTestDriver38 = new experiment.util.HashMapTestDriver();
        boolean boolean39 = hashMapTestDriver38.isEmpty();
        hashMapTestDriver38.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        boolean boolean42 = hashMapTestDriver41.isEmpty();
        hashMapTestDriver41.clear();
        experiment.util.Set set44 = hashMapTestDriver41.entrySet();
        java.lang.Object obj45 = hashMapTestDriver30.put((java.lang.Object) hashMapTestDriver38, (java.lang.Object) hashMapTestDriver41);
        experiment.util.Collection collection46 = hashMapTestDriver30.values();
        java.lang.Object obj47 = hashMapTestDriver16.put((java.lang.Object) set29, (java.lang.Object) hashMapTestDriver30);
        java.lang.Object obj48 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver16);
        experiment.util.Set set49 = hashMapTestDriver0.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(set49);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test027");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        boolean boolean13 = hashMapTestDriver12.isEmpty();
        experiment.util.Collection collection14 = hashMapTestDriver12.values();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        boolean boolean16 = hashMapTestDriver15.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver15.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj21 = hashMapTestDriver15.get((java.lang.Object) 100.0d);
        hashMapTestDriver15.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        boolean boolean24 = hashMapTestDriver23.isEmpty();
        java.lang.Object obj27 = hashMapTestDriver23.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj29 = hashMapTestDriver23.get((java.lang.Object) 100.0d);
        java.lang.Object obj31 = hashMapTestDriver23.remove((java.lang.Object) 1L);
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        boolean boolean34 = hashMapTestDriver33.isEmpty();
        experiment.util.Set set35 = hashMapTestDriver33.keySet();
        int int36 = hashMapTestDriver33.size();
        experiment.util.Set set37 = hashMapTestDriver33.keySet();
        java.lang.Object obj39 = hashMapTestDriver33.remove((java.lang.Object) 0.0d);
        int int40 = hashMapTestDriver33.size();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        boolean boolean42 = hashMapTestDriver41.isEmpty();
        experiment.util.Set set43 = hashMapTestDriver41.keySet();
        int int44 = hashMapTestDriver41.size();
        java.lang.Object obj46 = hashMapTestDriver41.get((java.lang.Object) (byte) 10);
        hashMapTestDriver41.clear();
        boolean boolean48 = hashMapTestDriver33.containsKey((java.lang.Object) hashMapTestDriver41);
        java.lang.Object obj49 = hashMapTestDriver23.put((java.lang.Object) true, (java.lang.Object) boolean48);
        java.lang.Object obj50 = hashMapTestDriver12.put((java.lang.Object) hashMapTestDriver15, (java.lang.Object) true);
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        boolean boolean52 = hashMapTestDriver51.isEmpty();
        experiment.util.Set set53 = hashMapTestDriver51.keySet();
        int int54 = hashMapTestDriver51.size();
        experiment.util.Set set55 = hashMapTestDriver51.keySet();
        java.lang.Object obj57 = hashMapTestDriver51.remove((java.lang.Object) 0.0d);
        int int58 = hashMapTestDriver51.size();
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        boolean boolean60 = hashMapTestDriver59.isEmpty();
        hashMapTestDriver59.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        boolean boolean63 = hashMapTestDriver62.isEmpty();
        hashMapTestDriver62.clear();
        experiment.util.Set set65 = hashMapTestDriver62.entrySet();
        java.lang.Object obj66 = hashMapTestDriver51.put((java.lang.Object) hashMapTestDriver59, (java.lang.Object) hashMapTestDriver62);
        experiment.util.Collection collection67 = hashMapTestDriver51.values();
        java.lang.Object obj68 = hashMapTestDriver11.put((java.lang.Object) hashMapTestDriver12, (java.lang.Object) collection67);
        java.lang.Object obj69 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver12);
        experiment.util.Set set70 = hashMapTestDriver12.entrySet();
        java.lang.Class<?> wildcardClass71 = hashMapTestDriver12.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + "" + "'", obj31, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test028");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver0.clear();
        java.lang.Object obj3 = hashMapTestDriver0.get((java.lang.Object) 'a');
        int int4 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        boolean boolean6 = hashMapTestDriver5.isEmpty();
        experiment.util.Set set7 = hashMapTestDriver5.keySet();
        int int8 = hashMapTestDriver5.size();
        java.lang.Object obj9 = hashMapTestDriver0.get((java.lang.Object) int8);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test029");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        experiment.util.Set set11 = hashMapTestDriver0.keySet();
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = hashMapTestDriver0.remove(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test030");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj4 = hashMapTestDriver0.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj6 = hashMapTestDriver0.get((java.lang.Object) 100.0d);
        java.lang.Object obj8 = hashMapTestDriver0.remove((java.lang.Object) 1L);
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        experiment.util.Set set10 = hashMapTestDriver0.entrySet();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        boolean boolean13 = hashMapTestDriver12.isEmpty();
        experiment.util.Set set14 = hashMapTestDriver12.keySet();
        int int15 = hashMapTestDriver12.size();
        experiment.util.Set set16 = hashMapTestDriver12.keySet();
        java.lang.Object obj18 = hashMapTestDriver12.remove((java.lang.Object) 0.0d);
        int int19 = hashMapTestDriver12.size();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        boolean boolean21 = hashMapTestDriver20.isEmpty();
        experiment.util.Set set22 = hashMapTestDriver20.keySet();
        int int23 = hashMapTestDriver20.size();
        java.lang.Object obj25 = hashMapTestDriver20.get((java.lang.Object) (byte) 10);
        hashMapTestDriver20.clear();
        boolean boolean27 = hashMapTestDriver12.containsKey((java.lang.Object) hashMapTestDriver20);
        boolean boolean28 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver20);
        java.lang.Class<?> wildcardClass29 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + "" + "'", obj8, "");
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test031");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        int int3 = hashMapTestDriver0.size();
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) (byte) 10);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        boolean boolean8 = hashMapTestDriver7.isEmpty();
        experiment.util.Set set9 = hashMapTestDriver7.keySet();
        hashMapTestDriver7.clear();
        experiment.util.Set set11 = hashMapTestDriver7.keySet();
        experiment.util.Set set12 = hashMapTestDriver7.keySet();
        boolean boolean13 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver7);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        hashMapTestDriver15.clear();
        java.lang.Object obj18 = hashMapTestDriver15.get((java.lang.Object) 'a');
        experiment.util.Set set19 = hashMapTestDriver15.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        boolean boolean21 = hashMapTestDriver20.isEmpty();
        experiment.util.Collection collection22 = hashMapTestDriver20.values();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        boolean boolean24 = hashMapTestDriver23.isEmpty();
        java.lang.Object obj27 = hashMapTestDriver23.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj29 = hashMapTestDriver23.get((java.lang.Object) 100.0d);
        hashMapTestDriver23.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        boolean boolean32 = hashMapTestDriver31.isEmpty();
        java.lang.Object obj35 = hashMapTestDriver31.put((java.lang.Object) 1L, (java.lang.Object) "");
        java.lang.Object obj37 = hashMapTestDriver31.get((java.lang.Object) 100.0d);
        java.lang.Object obj39 = hashMapTestDriver31.remove((java.lang.Object) 1L);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        boolean boolean42 = hashMapTestDriver41.isEmpty();
        experiment.util.Set set43 = hashMapTestDriver41.keySet();
        int int44 = hashMapTestDriver41.size();
        experiment.util.Set set45 = hashMapTestDriver41.keySet();
        java.lang.Object obj47 = hashMapTestDriver41.remove((java.lang.Object) 0.0d);
        int int48 = hashMapTestDriver41.size();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        boolean boolean50 = hashMapTestDriver49.isEmpty();
        experiment.util.Set set51 = hashMapTestDriver49.keySet();
        int int52 = hashMapTestDriver49.size();
        java.lang.Object obj54 = hashMapTestDriver49.get((java.lang.Object) (byte) 10);
        hashMapTestDriver49.clear();
        boolean boolean56 = hashMapTestDriver41.containsKey((java.lang.Object) hashMapTestDriver49);
        java.lang.Object obj57 = hashMapTestDriver31.put((java.lang.Object) true, (java.lang.Object) boolean56);
        java.lang.Object obj58 = hashMapTestDriver20.put((java.lang.Object) hashMapTestDriver23, (java.lang.Object) true);
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj61 = hashMapTestDriver59.remove((java.lang.Object) (-1.0f));
        int int62 = hashMapTestDriver59.size();
        experiment.util.HashMapTestDriver hashMapTestDriver63 = new experiment.util.HashMapTestDriver();
        boolean boolean64 = hashMapTestDriver63.isEmpty();
        experiment.util.Collection collection65 = hashMapTestDriver63.values();
        java.lang.Object obj66 = hashMapTestDriver59.get((java.lang.Object) collection65);
        boolean boolean67 = hashMapTestDriver23.containsKey((java.lang.Object) collection65);
        java.lang.Class<?> wildcardClass68 = collection65.getClass();
        java.lang.Object obj69 = hashMapTestDriver15.remove((java.lang.Object) wildcardClass68);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj70 = hashMapTestDriver7.put((java.lang.Object) '4', obj69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + "" + "'", obj39, "");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1321793073_1024_0.test032");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        int int3 = hashMapTestDriver0.size();
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        java.lang.Object obj6 = hashMapTestDriver0.remove((java.lang.Object) 0.0d);
        experiment.util.Collection collection7 = hashMapTestDriver0.values();
        experiment.util.Set set8 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection9 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass10 = collection9.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

}
