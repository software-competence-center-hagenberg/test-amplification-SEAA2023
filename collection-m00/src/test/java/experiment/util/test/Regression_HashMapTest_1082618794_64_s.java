package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashMapTest_1082618794_64_s {

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
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test002");
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
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test003");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test004");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = hashMapTestDriver0.containsKey(obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(set1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test005");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver2 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj4 = hashMapTestDriver2.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        boolean boolean8 = hashMapTestDriver6.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        boolean boolean14 = hashMapTestDriver11.containsKey((java.lang.Object) true);
        java.lang.Object obj15 = hashMapTestDriver6.put((java.lang.Object) collection10, (java.lang.Object) boolean14);
        java.lang.Object obj16 = hashMapTestDriver2.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = hashMapTestDriver0.remove(obj16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test006");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean11 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        java.lang.Object obj18 = hashMapTestDriver9.put((java.lang.Object) collection13, (java.lang.Object) boolean17);
        java.lang.Object obj19 = hashMapTestDriver5.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver9);
        boolean boolean20 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 1);
        boolean boolean22 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        java.lang.Class<?> wildcardClass23 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test007");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        boolean boolean6 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) true);
        java.lang.Object obj13 = hashMapTestDriver4.put((java.lang.Object) collection8, (java.lang.Object) boolean12);
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        boolean boolean21 = hashMapTestDriver19.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        boolean boolean27 = hashMapTestDriver24.containsKey((java.lang.Object) true);
        java.lang.Object obj28 = hashMapTestDriver19.put((java.lang.Object) collection23, (java.lang.Object) boolean27);
        java.lang.Object obj29 = hashMapTestDriver15.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver19);
        experiment.util.Set set30 = hashMapTestDriver15.entrySet();
        java.lang.Object obj31 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver15);
        experiment.util.Set set32 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass33 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test008");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        boolean boolean5 = hashMapTestDriver3.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver3.remove((java.lang.Object) ' ');
        hashMapTestDriver3.clear();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        boolean boolean13 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver11.remove((java.lang.Object) ' ');
        java.lang.Object obj17 = hashMapTestDriver3.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.Collection collection18 = hashMapTestDriver3.values();
        int int19 = hashMapTestDriver3.size();
        experiment.util.Set set20 = hashMapTestDriver3.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        boolean boolean27 = hashMapTestDriver25.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection31 = hashMapTestDriver30.values();
        boolean boolean33 = hashMapTestDriver30.containsKey((java.lang.Object) true);
        java.lang.Object obj34 = hashMapTestDriver25.put((java.lang.Object) collection29, (java.lang.Object) boolean33);
        java.lang.Object obj35 = hashMapTestDriver21.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver25);
        experiment.util.Set set36 = hashMapTestDriver21.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection38 = hashMapTestDriver37.values();
        boolean boolean40 = hashMapTestDriver37.containsKey((java.lang.Object) true);
        java.lang.Object obj42 = hashMapTestDriver37.get((java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj45 = hashMapTestDriver43.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver47 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection48 = hashMapTestDriver47.values();
        boolean boolean49 = hashMapTestDriver47.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver50 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection51 = hashMapTestDriver50.values();
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection53 = hashMapTestDriver52.values();
        boolean boolean55 = hashMapTestDriver52.containsKey((java.lang.Object) true);
        java.lang.Object obj56 = hashMapTestDriver47.put((java.lang.Object) collection51, (java.lang.Object) boolean55);
        java.lang.Object obj57 = hashMapTestDriver43.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver47);
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj60 = hashMapTestDriver58.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection63 = hashMapTestDriver62.values();
        boolean boolean64 = hashMapTestDriver62.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection66 = hashMapTestDriver65.values();
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection68 = hashMapTestDriver67.values();
        boolean boolean70 = hashMapTestDriver67.containsKey((java.lang.Object) true);
        java.lang.Object obj71 = hashMapTestDriver62.put((java.lang.Object) collection66, (java.lang.Object) boolean70);
        java.lang.Object obj72 = hashMapTestDriver58.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver62);
        experiment.util.Set set73 = hashMapTestDriver58.entrySet();
        java.lang.Object obj74 = hashMapTestDriver43.remove((java.lang.Object) hashMapTestDriver58);
        int int75 = hashMapTestDriver58.size();
        hashMapTestDriver58.clear();
        java.lang.Object obj77 = hashMapTestDriver37.remove((java.lang.Object) hashMapTestDriver58);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj78 = hashMapTestDriver3.put((java.lang.Object) hashMapTestDriver21, obj77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test009");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        java.lang.Class<?> wildcardClass3 = set2.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test010");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        boolean boolean5 = hashMapTestDriver3.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver3.remove((java.lang.Object) ' ');
        hashMapTestDriver3.clear();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        boolean boolean13 = hashMapTestDriver11.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        experiment.util.HashMapTestDriver hashMapTestDriver16 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection17 = hashMapTestDriver16.values();
        boolean boolean19 = hashMapTestDriver16.containsKey((java.lang.Object) true);
        java.lang.Object obj20 = hashMapTestDriver11.put((java.lang.Object) collection15, (java.lang.Object) boolean19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = hashMapTestDriver0.put(obj20, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test011");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        boolean boolean5 = hashMapTestDriver3.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver3.remove((java.lang.Object) ' ');
        hashMapTestDriver3.clear();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        boolean boolean13 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver11.remove((java.lang.Object) ' ');
        java.lang.Object obj17 = hashMapTestDriver3.put((java.lang.Object) ' ', (java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = obj17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test012");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        boolean boolean6 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) true);
        java.lang.Object obj13 = hashMapTestDriver4.put((java.lang.Object) collection8, (java.lang.Object) boolean12);
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver4);
        experiment.util.Set set15 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass16 = set15.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test013");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        boolean boolean12 = hashMapTestDriver10.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        boolean boolean18 = hashMapTestDriver15.containsKey((java.lang.Object) true);
        java.lang.Object obj19 = hashMapTestDriver10.put((java.lang.Object) collection14, (java.lang.Object) boolean18);
        java.lang.Object obj20 = hashMapTestDriver6.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        boolean boolean27 = hashMapTestDriver25.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection31 = hashMapTestDriver30.values();
        boolean boolean33 = hashMapTestDriver30.containsKey((java.lang.Object) true);
        java.lang.Object obj34 = hashMapTestDriver25.put((java.lang.Object) collection29, (java.lang.Object) boolean33);
        java.lang.Object obj35 = hashMapTestDriver21.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver25);
        experiment.util.Set set36 = hashMapTestDriver21.entrySet();
        java.lang.Object obj37 = hashMapTestDriver6.remove((java.lang.Object) hashMapTestDriver21);
        int int38 = hashMapTestDriver21.size();
        hashMapTestDriver21.clear();
        java.lang.Object obj40 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver21);
        java.lang.Object obj41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = hashMapTestDriver0.get(obj41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test014");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.get((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj12 = hashMapTestDriver10.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean16 = hashMapTestDriver14.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection18 = hashMapTestDriver17.values();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        boolean boolean22 = hashMapTestDriver19.containsKey((java.lang.Object) true);
        java.lang.Object obj23 = hashMapTestDriver14.put((java.lang.Object) collection18, (java.lang.Object) boolean22);
        java.lang.Object obj24 = hashMapTestDriver10.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver14);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj27 = hashMapTestDriver25.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection30 = hashMapTestDriver29.values();
        boolean boolean31 = hashMapTestDriver29.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection33 = hashMapTestDriver32.values();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection35 = hashMapTestDriver34.values();
        boolean boolean37 = hashMapTestDriver34.containsKey((java.lang.Object) true);
        java.lang.Object obj38 = hashMapTestDriver29.put((java.lang.Object) collection33, (java.lang.Object) boolean37);
        java.lang.Object obj39 = hashMapTestDriver25.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver29);
        experiment.util.Set set40 = hashMapTestDriver25.entrySet();
        java.lang.Object obj41 = hashMapTestDriver10.remove((java.lang.Object) hashMapTestDriver25);
        int int42 = hashMapTestDriver25.size();
        hashMapTestDriver25.clear();
        boolean boolean44 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver25);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection50 = hashMapTestDriver49.values();
        boolean boolean51 = hashMapTestDriver49.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection53 = hashMapTestDriver52.values();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection55 = hashMapTestDriver54.values();
        boolean boolean57 = hashMapTestDriver54.containsKey((java.lang.Object) true);
        java.lang.Object obj58 = hashMapTestDriver49.put((java.lang.Object) collection53, (java.lang.Object) boolean57);
        java.lang.Object obj59 = hashMapTestDriver45.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = hashMapTestDriver8.get(obj59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test015");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        experiment.util.Set set8 = hashMapTestDriver6.keySet();
        experiment.util.Collection collection9 = hashMapTestDriver6.values();
        java.lang.Object obj10 = hashMapTestDriver0.get((java.lang.Object) collection9);
        java.lang.Class<?> wildcardClass11 = collection9.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test016");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        boolean boolean5 = hashMapTestDriver3.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver3.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj10 = hashMapTestDriver8.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        boolean boolean14 = hashMapTestDriver12.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection18 = hashMapTestDriver17.values();
        boolean boolean20 = hashMapTestDriver17.containsKey((java.lang.Object) true);
        java.lang.Object obj21 = hashMapTestDriver12.put((java.lang.Object) collection16, (java.lang.Object) boolean20);
        java.lang.Object obj22 = hashMapTestDriver8.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver12);
        boolean boolean23 = hashMapTestDriver3.containsKey((java.lang.Object) (byte) 1);
        int int24 = hashMapTestDriver3.size();
        int int25 = hashMapTestDriver3.size();
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.get((java.lang.Object) (short) 10);
        hashMapTestDriver26.clear();
        experiment.util.Set set30 = hashMapTestDriver26.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection32 = hashMapTestDriver31.values();
        experiment.util.Set set33 = hashMapTestDriver31.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj36 = hashMapTestDriver34.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection38 = hashMapTestDriver37.values();
        boolean boolean39 = hashMapTestDriver37.isEmpty();
        java.lang.Object obj41 = hashMapTestDriver37.remove((java.lang.Object) ' ');
        hashMapTestDriver37.clear();
        java.lang.Object obj44 = hashMapTestDriver34.put((java.lang.Object) hashMapTestDriver37, (java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection46 = hashMapTestDriver45.values();
        boolean boolean47 = hashMapTestDriver45.isEmpty();
        java.lang.Object obj49 = hashMapTestDriver45.remove((java.lang.Object) ' ');
        java.lang.Object obj51 = hashMapTestDriver37.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.Collection collection52 = hashMapTestDriver37.values();
        int int53 = hashMapTestDriver37.size();
        experiment.util.Set set54 = hashMapTestDriver37.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver55 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection56 = hashMapTestDriver55.values();
        boolean boolean58 = hashMapTestDriver55.containsKey((java.lang.Object) true);
        java.lang.Object obj60 = hashMapTestDriver55.get((java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj63 = hashMapTestDriver61.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection66 = hashMapTestDriver65.values();
        boolean boolean67 = hashMapTestDriver65.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver68 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection69 = hashMapTestDriver68.values();
        experiment.util.HashMapTestDriver hashMapTestDriver70 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection71 = hashMapTestDriver70.values();
        boolean boolean73 = hashMapTestDriver70.containsKey((java.lang.Object) true);
        java.lang.Object obj74 = hashMapTestDriver65.put((java.lang.Object) collection69, (java.lang.Object) boolean73);
        java.lang.Object obj75 = hashMapTestDriver61.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver65);
        experiment.util.HashMapTestDriver hashMapTestDriver76 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj78 = hashMapTestDriver76.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver80 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection81 = hashMapTestDriver80.values();
        boolean boolean82 = hashMapTestDriver80.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver83 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection84 = hashMapTestDriver83.values();
        experiment.util.HashMapTestDriver hashMapTestDriver85 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection86 = hashMapTestDriver85.values();
        boolean boolean88 = hashMapTestDriver85.containsKey((java.lang.Object) true);
        java.lang.Object obj89 = hashMapTestDriver80.put((java.lang.Object) collection84, (java.lang.Object) boolean88);
        java.lang.Object obj90 = hashMapTestDriver76.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver80);
        experiment.util.Set set91 = hashMapTestDriver76.entrySet();
        java.lang.Object obj92 = hashMapTestDriver61.remove((java.lang.Object) hashMapTestDriver76);
        int int93 = hashMapTestDriver76.size();
        hashMapTestDriver76.clear();
        java.lang.Object obj95 = hashMapTestDriver55.remove((java.lang.Object) hashMapTestDriver76);
        java.lang.Object obj96 = hashMapTestDriver31.put((java.lang.Object) hashMapTestDriver37, (java.lang.Object) hashMapTestDriver55);
        boolean boolean97 = hashMapTestDriver31.isEmpty();
        java.lang.Object obj98 = hashMapTestDriver3.put((java.lang.Object) set30, (java.lang.Object) hashMapTestDriver31);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean99 = hashMapTestDriver0.containsKey(obj98);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertNotNull(collection71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(collection84);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertNotNull(set91);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 1 + "'", int93 == 1);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNull(obj96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNull(obj98);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test017");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        int int2 = hashMapTestDriver0.size();
        java.lang.Object obj3 = null;
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        boolean boolean9 = hashMapTestDriver7.isEmpty();
        java.lang.Object obj11 = hashMapTestDriver7.remove((java.lang.Object) ' ');
        hashMapTestDriver7.clear();
        java.lang.Object obj14 = hashMapTestDriver4.put((java.lang.Object) hashMapTestDriver7, (java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        boolean boolean21 = hashMapTestDriver19.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        boolean boolean27 = hashMapTestDriver24.containsKey((java.lang.Object) true);
        java.lang.Object obj28 = hashMapTestDriver19.put((java.lang.Object) collection23, (java.lang.Object) boolean27);
        java.lang.Object obj29 = hashMapTestDriver15.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver19);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection35 = hashMapTestDriver34.values();
        boolean boolean36 = hashMapTestDriver34.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection38 = hashMapTestDriver37.values();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection40 = hashMapTestDriver39.values();
        boolean boolean42 = hashMapTestDriver39.containsKey((java.lang.Object) true);
        java.lang.Object obj43 = hashMapTestDriver34.put((java.lang.Object) collection38, (java.lang.Object) boolean42);
        java.lang.Object obj44 = hashMapTestDriver30.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver34);
        experiment.util.Set set45 = hashMapTestDriver30.entrySet();
        java.lang.Object obj46 = hashMapTestDriver15.remove((java.lang.Object) hashMapTestDriver30);
        boolean boolean47 = hashMapTestDriver7.containsKey((java.lang.Object) hashMapTestDriver30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = hashMapTestDriver0.put(obj3, (java.lang.Object) boolean47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test018");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        boolean boolean1 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test019");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj5 = hashMapTestDriver3.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        boolean boolean8 = hashMapTestDriver6.isEmpty();
        java.lang.Object obj10 = hashMapTestDriver6.remove((java.lang.Object) ' ');
        hashMapTestDriver6.clear();
        java.lang.Object obj13 = hashMapTestDriver3.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean16 = hashMapTestDriver14.isEmpty();
        java.lang.Object obj18 = hashMapTestDriver14.remove((java.lang.Object) ' ');
        java.lang.Object obj20 = hashMapTestDriver6.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.Collection collection21 = hashMapTestDriver6.values();
        int int22 = hashMapTestDriver6.size();
        experiment.util.Set set23 = hashMapTestDriver6.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        boolean boolean27 = hashMapTestDriver24.containsKey((java.lang.Object) true);
        java.lang.Object obj29 = hashMapTestDriver24.get((java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection35 = hashMapTestDriver34.values();
        boolean boolean36 = hashMapTestDriver34.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection38 = hashMapTestDriver37.values();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection40 = hashMapTestDriver39.values();
        boolean boolean42 = hashMapTestDriver39.containsKey((java.lang.Object) true);
        java.lang.Object obj43 = hashMapTestDriver34.put((java.lang.Object) collection38, (java.lang.Object) boolean42);
        java.lang.Object obj44 = hashMapTestDriver30.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver34);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection50 = hashMapTestDriver49.values();
        boolean boolean51 = hashMapTestDriver49.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection53 = hashMapTestDriver52.values();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection55 = hashMapTestDriver54.values();
        boolean boolean57 = hashMapTestDriver54.containsKey((java.lang.Object) true);
        java.lang.Object obj58 = hashMapTestDriver49.put((java.lang.Object) collection53, (java.lang.Object) boolean57);
        java.lang.Object obj59 = hashMapTestDriver45.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver49);
        experiment.util.Set set60 = hashMapTestDriver45.entrySet();
        java.lang.Object obj61 = hashMapTestDriver30.remove((java.lang.Object) hashMapTestDriver45);
        int int62 = hashMapTestDriver45.size();
        hashMapTestDriver45.clear();
        java.lang.Object obj64 = hashMapTestDriver24.remove((java.lang.Object) hashMapTestDriver45);
        java.lang.Object obj65 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) hashMapTestDriver24);
        java.lang.Class<?> wildcardClass66 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test020");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.get((java.lang.Object) (byte) 10);
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        boolean boolean12 = hashMapTestDriver10.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        boolean boolean18 = hashMapTestDriver15.containsKey((java.lang.Object) true);
        java.lang.Object obj19 = hashMapTestDriver10.put((java.lang.Object) collection14, (java.lang.Object) boolean18);
        java.lang.Object obj20 = hashMapTestDriver6.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        boolean boolean27 = hashMapTestDriver25.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection31 = hashMapTestDriver30.values();
        boolean boolean33 = hashMapTestDriver30.containsKey((java.lang.Object) true);
        java.lang.Object obj34 = hashMapTestDriver25.put((java.lang.Object) collection29, (java.lang.Object) boolean33);
        java.lang.Object obj35 = hashMapTestDriver21.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver25);
        experiment.util.Set set36 = hashMapTestDriver21.entrySet();
        java.lang.Object obj37 = hashMapTestDriver6.remove((java.lang.Object) hashMapTestDriver21);
        int int38 = hashMapTestDriver21.size();
        hashMapTestDriver21.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver40 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj42 = hashMapTestDriver40.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection44 = hashMapTestDriver43.values();
        boolean boolean45 = hashMapTestDriver43.isEmpty();
        java.lang.Object obj47 = hashMapTestDriver43.remove((java.lang.Object) ' ');
        hashMapTestDriver43.clear();
        java.lang.Object obj50 = hashMapTestDriver40.put((java.lang.Object) hashMapTestDriver43, (java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver51 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection52 = hashMapTestDriver51.values();
        boolean boolean53 = hashMapTestDriver51.isEmpty();
        java.lang.Object obj55 = hashMapTestDriver51.remove((java.lang.Object) ' ');
        java.lang.Object obj57 = hashMapTestDriver43.put((java.lang.Object) ' ', (java.lang.Object) 0);
        java.lang.Object obj60 = hashMapTestDriver43.put((java.lang.Object) (-1L), (java.lang.Object) 1.0f);
        java.lang.Object obj61 = hashMapTestDriver21.remove((java.lang.Object) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj62 = hashMapTestDriver0.get(obj61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test021");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        hashMapTestDriver0.clear();
        int int4 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        java.lang.Object obj7 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver5);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection9 = hashMapTestDriver8.values();
        boolean boolean10 = hashMapTestDriver8.isEmpty();
        java.lang.Object obj12 = hashMapTestDriver8.remove((java.lang.Object) ' ');
        hashMapTestDriver8.clear();
        hashMapTestDriver8.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set16 = hashMapTestDriver15.keySet();
        java.lang.Object obj17 = hashMapTestDriver8.get((java.lang.Object) set16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = hashMapTestDriver0.containsKey(obj17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test022");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.get((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver8);
        experiment.util.Set set10 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection11 = hashMapTestDriver0.values();
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test023");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        experiment.util.Collection collection3 = hashMapTestDriver0.values();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        boolean boolean7 = hashMapTestDriver4.containsKey((java.lang.Object) true);
        java.lang.Object obj9 = hashMapTestDriver4.get((java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj12 = hashMapTestDriver10.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean16 = hashMapTestDriver14.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection18 = hashMapTestDriver17.values();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        boolean boolean22 = hashMapTestDriver19.containsKey((java.lang.Object) true);
        java.lang.Object obj23 = hashMapTestDriver14.put((java.lang.Object) collection18, (java.lang.Object) boolean22);
        java.lang.Object obj24 = hashMapTestDriver10.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver14);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj27 = hashMapTestDriver25.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection30 = hashMapTestDriver29.values();
        boolean boolean31 = hashMapTestDriver29.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection33 = hashMapTestDriver32.values();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection35 = hashMapTestDriver34.values();
        boolean boolean37 = hashMapTestDriver34.containsKey((java.lang.Object) true);
        java.lang.Object obj38 = hashMapTestDriver29.put((java.lang.Object) collection33, (java.lang.Object) boolean37);
        java.lang.Object obj39 = hashMapTestDriver25.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver29);
        experiment.util.Set set40 = hashMapTestDriver25.entrySet();
        java.lang.Object obj41 = hashMapTestDriver10.remove((java.lang.Object) hashMapTestDriver25);
        int int42 = hashMapTestDriver25.size();
        hashMapTestDriver25.clear();
        java.lang.Object obj44 = hashMapTestDriver4.remove((java.lang.Object) hashMapTestDriver25);
        java.lang.Object obj45 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass46 = obj45.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test024");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) (-1L));
        experiment.util.Set set4 = hashMapTestDriver0.keySet();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = hashMapTestDriver0.remove(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test025");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        boolean boolean5 = hashMapTestDriver3.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver3.remove((java.lang.Object) ' ');
        hashMapTestDriver3.clear();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        boolean boolean13 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver11.remove((java.lang.Object) ' ');
        java.lang.Object obj17 = hashMapTestDriver3.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.Collection collection18 = hashMapTestDriver3.values();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        boolean boolean21 = hashMapTestDriver19.isEmpty();
        java.lang.Object obj23 = hashMapTestDriver19.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj26 = hashMapTestDriver24.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        boolean boolean30 = hashMapTestDriver28.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection32 = hashMapTestDriver31.values();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection34 = hashMapTestDriver33.values();
        boolean boolean36 = hashMapTestDriver33.containsKey((java.lang.Object) true);
        java.lang.Object obj37 = hashMapTestDriver28.put((java.lang.Object) collection32, (java.lang.Object) boolean36);
        java.lang.Object obj38 = hashMapTestDriver24.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver28);
        boolean boolean39 = hashMapTestDriver19.containsKey((java.lang.Object) (byte) 1);
        int int40 = hashMapTestDriver19.size();
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj42 = hashMapTestDriver3.put((java.lang.Object) hashMapTestDriver19, (java.lang.Object) hashMapTestDriver41);
        java.lang.Object obj43 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = hashMapTestDriver3.get(obj43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test026");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        boolean boolean6 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) true);
        java.lang.Object obj13 = hashMapTestDriver4.put((java.lang.Object) collection8, (java.lang.Object) boolean12);
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        boolean boolean21 = hashMapTestDriver19.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        boolean boolean27 = hashMapTestDriver24.containsKey((java.lang.Object) true);
        java.lang.Object obj28 = hashMapTestDriver19.put((java.lang.Object) collection23, (java.lang.Object) boolean27);
        java.lang.Object obj29 = hashMapTestDriver15.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver19);
        experiment.util.Set set30 = hashMapTestDriver15.entrySet();
        java.lang.Object obj31 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver15);
        int int32 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        boolean boolean34 = hashMapTestDriver15.isEmpty();
        java.lang.Class<?> wildcardClass35 = hashMapTestDriver15.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test027");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj6 = hashMapTestDriver4.get((java.lang.Object) (short) 10);
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = hashMapTestDriver0.put(obj6, obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test028");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        hashMapTestDriver0.clear();
        int int4 = hashMapTestDriver0.size();
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = hashMapTestDriver0.get(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test029");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        boolean boolean5 = hashMapTestDriver3.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver3.remove((java.lang.Object) ' ');
        hashMapTestDriver3.clear();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) 100L);
        experiment.util.Set set11 = hashMapTestDriver0.entrySet();
        java.lang.Class<?> wildcardClass12 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test030");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.get((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver8);
        experiment.util.Set set10 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj13 = hashMapTestDriver11.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        boolean boolean17 = hashMapTestDriver15.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver18 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection19 = hashMapTestDriver18.values();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection21 = hashMapTestDriver20.values();
        boolean boolean23 = hashMapTestDriver20.containsKey((java.lang.Object) true);
        java.lang.Object obj24 = hashMapTestDriver15.put((java.lang.Object) collection19, (java.lang.Object) boolean23);
        java.lang.Object obj25 = hashMapTestDriver11.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver15);
        experiment.util.HashMapTestDriver hashMapTestDriver26 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj28 = hashMapTestDriver26.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection31 = hashMapTestDriver30.values();
        boolean boolean32 = hashMapTestDriver30.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection34 = hashMapTestDriver33.values();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection36 = hashMapTestDriver35.values();
        boolean boolean38 = hashMapTestDriver35.containsKey((java.lang.Object) true);
        java.lang.Object obj39 = hashMapTestDriver30.put((java.lang.Object) collection34, (java.lang.Object) boolean38);
        java.lang.Object obj40 = hashMapTestDriver26.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver30);
        experiment.util.Set set41 = hashMapTestDriver26.entrySet();
        java.lang.Object obj42 = hashMapTestDriver11.remove((java.lang.Object) hashMapTestDriver26);
        experiment.util.Set set43 = hashMapTestDriver11.entrySet();
        hashMapTestDriver11.clear();
        int int45 = hashMapTestDriver11.size();
        experiment.util.Set set46 = hashMapTestDriver11.keySet();
        boolean boolean47 = hashMapTestDriver0.containsKey((java.lang.Object) set46);
        java.lang.Class<?> wildcardClass48 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test031");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        boolean boolean6 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) true);
        java.lang.Object obj13 = hashMapTestDriver4.put((java.lang.Object) collection8, (java.lang.Object) boolean12);
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        boolean boolean21 = hashMapTestDriver19.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        boolean boolean27 = hashMapTestDriver24.containsKey((java.lang.Object) true);
        java.lang.Object obj28 = hashMapTestDriver19.put((java.lang.Object) collection23, (java.lang.Object) boolean27);
        java.lang.Object obj29 = hashMapTestDriver15.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver19);
        experiment.util.Set set30 = hashMapTestDriver15.entrySet();
        java.lang.Object obj31 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver15);
        int int32 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        java.lang.Object obj35 = hashMapTestDriver15.get((java.lang.Object) (short) 100);
        experiment.util.HashMapTestDriver hashMapTestDriver36 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set37 = hashMapTestDriver36.keySet();
        boolean boolean38 = hashMapTestDriver15.containsKey((java.lang.Object) set37);
        int int39 = hashMapTestDriver15.size();
        int int40 = hashMapTestDriver15.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test032");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        boolean boolean8 = hashMapTestDriver5.containsKey((java.lang.Object) true);
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) collection4, (java.lang.Object) boolean8);
        int int10 = hashMapTestDriver0.size();
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = hashMapTestDriver0.remove(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test033");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        boolean boolean6 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) true);
        java.lang.Object obj13 = hashMapTestDriver4.put((java.lang.Object) collection8, (java.lang.Object) boolean12);
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        boolean boolean21 = hashMapTestDriver19.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        boolean boolean27 = hashMapTestDriver24.containsKey((java.lang.Object) true);
        java.lang.Object obj28 = hashMapTestDriver19.put((java.lang.Object) collection23, (java.lang.Object) boolean27);
        java.lang.Object obj29 = hashMapTestDriver15.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver19);
        experiment.util.Set set30 = hashMapTestDriver15.entrySet();
        java.lang.Object obj31 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver15);
        int int32 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        java.lang.Object obj35 = hashMapTestDriver15.get((java.lang.Object) (short) 100);
        java.lang.Object obj37 = hashMapTestDriver15.remove((java.lang.Object) 10.0d);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass38 = obj37.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test034");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj5 = hashMapTestDriver3.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection7 = hashMapTestDriver6.values();
        boolean boolean8 = hashMapTestDriver6.isEmpty();
        java.lang.Object obj10 = hashMapTestDriver6.remove((java.lang.Object) ' ');
        hashMapTestDriver6.clear();
        java.lang.Object obj13 = hashMapTestDriver3.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean16 = hashMapTestDriver14.isEmpty();
        java.lang.Object obj18 = hashMapTestDriver14.remove((java.lang.Object) ' ');
        java.lang.Object obj20 = hashMapTestDriver6.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.Collection collection21 = hashMapTestDriver6.values();
        int int22 = hashMapTestDriver6.size();
        experiment.util.Set set23 = hashMapTestDriver6.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        boolean boolean27 = hashMapTestDriver24.containsKey((java.lang.Object) true);
        java.lang.Object obj29 = hashMapTestDriver24.get((java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj32 = hashMapTestDriver30.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection35 = hashMapTestDriver34.values();
        boolean boolean36 = hashMapTestDriver34.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection38 = hashMapTestDriver37.values();
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection40 = hashMapTestDriver39.values();
        boolean boolean42 = hashMapTestDriver39.containsKey((java.lang.Object) true);
        java.lang.Object obj43 = hashMapTestDriver34.put((java.lang.Object) collection38, (java.lang.Object) boolean42);
        java.lang.Object obj44 = hashMapTestDriver30.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver34);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection50 = hashMapTestDriver49.values();
        boolean boolean51 = hashMapTestDriver49.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection53 = hashMapTestDriver52.values();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection55 = hashMapTestDriver54.values();
        boolean boolean57 = hashMapTestDriver54.containsKey((java.lang.Object) true);
        java.lang.Object obj58 = hashMapTestDriver49.put((java.lang.Object) collection53, (java.lang.Object) boolean57);
        java.lang.Object obj59 = hashMapTestDriver45.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver49);
        experiment.util.Set set60 = hashMapTestDriver45.entrySet();
        java.lang.Object obj61 = hashMapTestDriver30.remove((java.lang.Object) hashMapTestDriver45);
        int int62 = hashMapTestDriver45.size();
        hashMapTestDriver45.clear();
        java.lang.Object obj64 = hashMapTestDriver24.remove((java.lang.Object) hashMapTestDriver45);
        java.lang.Object obj65 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver6, (java.lang.Object) hashMapTestDriver24);
        experiment.util.Collection collection66 = hashMapTestDriver6.values();
        java.lang.Class<?> wildcardClass67 = hashMapTestDriver6.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test035");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.get((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj12 = hashMapTestDriver10.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean16 = hashMapTestDriver14.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection18 = hashMapTestDriver17.values();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        boolean boolean22 = hashMapTestDriver19.containsKey((java.lang.Object) true);
        java.lang.Object obj23 = hashMapTestDriver14.put((java.lang.Object) collection18, (java.lang.Object) boolean22);
        java.lang.Object obj24 = hashMapTestDriver10.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver14);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj27 = hashMapTestDriver25.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection30 = hashMapTestDriver29.values();
        boolean boolean31 = hashMapTestDriver29.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection33 = hashMapTestDriver32.values();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection35 = hashMapTestDriver34.values();
        boolean boolean37 = hashMapTestDriver34.containsKey((java.lang.Object) true);
        java.lang.Object obj38 = hashMapTestDriver29.put((java.lang.Object) collection33, (java.lang.Object) boolean37);
        java.lang.Object obj39 = hashMapTestDriver25.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver29);
        experiment.util.Set set40 = hashMapTestDriver25.entrySet();
        java.lang.Object obj41 = hashMapTestDriver10.remove((java.lang.Object) hashMapTestDriver25);
        int int42 = hashMapTestDriver25.size();
        hashMapTestDriver25.clear();
        boolean boolean44 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver25);
        java.lang.Object obj46 = hashMapTestDriver8.get((java.lang.Object) 0);
        hashMapTestDriver8.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test036");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        boolean boolean12 = hashMapTestDriver10.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        boolean boolean18 = hashMapTestDriver15.containsKey((java.lang.Object) true);
        java.lang.Object obj19 = hashMapTestDriver10.put((java.lang.Object) collection14, (java.lang.Object) boolean18);
        java.lang.Object obj20 = hashMapTestDriver6.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        boolean boolean27 = hashMapTestDriver25.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection31 = hashMapTestDriver30.values();
        boolean boolean33 = hashMapTestDriver30.containsKey((java.lang.Object) true);
        java.lang.Object obj34 = hashMapTestDriver25.put((java.lang.Object) collection29, (java.lang.Object) boolean33);
        java.lang.Object obj35 = hashMapTestDriver21.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver25);
        experiment.util.Set set36 = hashMapTestDriver21.entrySet();
        java.lang.Object obj37 = hashMapTestDriver6.remove((java.lang.Object) hashMapTestDriver21);
        int int38 = hashMapTestDriver21.size();
        hashMapTestDriver21.clear();
        java.lang.Object obj40 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver21);
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test037");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        int int2 = hashMapTestDriver0.size();
        java.lang.Class<?> wildcardClass3 = hashMapTestDriver0.getClass();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test038");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean11 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        java.lang.Object obj18 = hashMapTestDriver9.put((java.lang.Object) collection13, (java.lang.Object) boolean17);
        java.lang.Object obj19 = hashMapTestDriver5.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver9);
        boolean boolean20 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 1);
        int int21 = hashMapTestDriver0.size();
        int int22 = hashMapTestDriver0.size();
        int int23 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj26 = hashMapTestDriver24.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        boolean boolean30 = hashMapTestDriver28.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection32 = hashMapTestDriver31.values();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection34 = hashMapTestDriver33.values();
        boolean boolean36 = hashMapTestDriver33.containsKey((java.lang.Object) true);
        java.lang.Object obj37 = hashMapTestDriver28.put((java.lang.Object) collection32, (java.lang.Object) boolean36);
        java.lang.Object obj38 = hashMapTestDriver24.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver28);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj41 = hashMapTestDriver39.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection44 = hashMapTestDriver43.values();
        boolean boolean45 = hashMapTestDriver43.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection47 = hashMapTestDriver46.values();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection49 = hashMapTestDriver48.values();
        boolean boolean51 = hashMapTestDriver48.containsKey((java.lang.Object) true);
        java.lang.Object obj52 = hashMapTestDriver43.put((java.lang.Object) collection47, (java.lang.Object) boolean51);
        java.lang.Object obj53 = hashMapTestDriver39.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver43);
        experiment.util.Set set54 = hashMapTestDriver39.entrySet();
        java.lang.Object obj55 = hashMapTestDriver24.remove((java.lang.Object) hashMapTestDriver39);
        int int56 = hashMapTestDriver39.size();
        hashMapTestDriver39.clear();
        java.lang.Object obj58 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass59 = obj58.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test039");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        boolean boolean5 = hashMapTestDriver3.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver3.remove((java.lang.Object) ' ');
        hashMapTestDriver3.clear();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        boolean boolean13 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver11.remove((java.lang.Object) ' ');
        java.lang.Object obj17 = hashMapTestDriver3.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.Collection collection18 = hashMapTestDriver3.values();
        experiment.util.Set set19 = hashMapTestDriver3.keySet();
        experiment.util.Set set20 = hashMapTestDriver3.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test040");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        boolean boolean6 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) true);
        java.lang.Object obj13 = hashMapTestDriver4.put((java.lang.Object) collection8, (java.lang.Object) boolean12);
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        boolean boolean17 = hashMapTestDriver15.isEmpty();
        java.lang.Object obj19 = hashMapTestDriver15.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        boolean boolean26 = hashMapTestDriver24.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection28 = hashMapTestDriver27.values();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection30 = hashMapTestDriver29.values();
        boolean boolean32 = hashMapTestDriver29.containsKey((java.lang.Object) true);
        java.lang.Object obj33 = hashMapTestDriver24.put((java.lang.Object) collection28, (java.lang.Object) boolean32);
        java.lang.Object obj34 = hashMapTestDriver20.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver24);
        boolean boolean35 = hashMapTestDriver15.containsKey((java.lang.Object) (byte) 1);
        boolean boolean37 = hashMapTestDriver15.containsKey((java.lang.Object) (short) 10);
        boolean boolean38 = hashMapTestDriver15.isEmpty();
        boolean boolean39 = hashMapTestDriver4.containsKey((java.lang.Object) boolean38);
        experiment.util.Set set40 = hashMapTestDriver4.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(set40);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test041");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set1 = hashMapTestDriver0.keySet();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(set1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test042");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        boolean boolean6 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) true);
        java.lang.Object obj13 = hashMapTestDriver4.put((java.lang.Object) collection8, (java.lang.Object) boolean12);
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        boolean boolean21 = hashMapTestDriver19.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        boolean boolean27 = hashMapTestDriver24.containsKey((java.lang.Object) true);
        java.lang.Object obj28 = hashMapTestDriver19.put((java.lang.Object) collection23, (java.lang.Object) boolean27);
        java.lang.Object obj29 = hashMapTestDriver15.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver19);
        experiment.util.Set set30 = hashMapTestDriver15.entrySet();
        java.lang.Object obj31 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver15);
        int int32 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj36 = hashMapTestDriver34.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection38 = hashMapTestDriver37.values();
        boolean boolean39 = hashMapTestDriver37.isEmpty();
        java.lang.Object obj41 = hashMapTestDriver37.remove((java.lang.Object) ' ');
        hashMapTestDriver37.clear();
        java.lang.Object obj44 = hashMapTestDriver34.put((java.lang.Object) hashMapTestDriver37, (java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection46 = hashMapTestDriver45.values();
        boolean boolean47 = hashMapTestDriver45.isEmpty();
        java.lang.Object obj49 = hashMapTestDriver45.remove((java.lang.Object) ' ');
        java.lang.Object obj51 = hashMapTestDriver37.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.Collection collection52 = hashMapTestDriver37.values();
        java.lang.Class<?> wildcardClass53 = collection52.getClass();
        boolean boolean54 = hashMapTestDriver15.containsKey((java.lang.Object) collection52);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(collection52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test043");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection4 = hashMapTestDriver3.values();
        boolean boolean5 = hashMapTestDriver3.isEmpty();
        java.lang.Object obj7 = hashMapTestDriver3.remove((java.lang.Object) ' ');
        hashMapTestDriver3.clear();
        java.lang.Object obj10 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver3, (java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver11 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection12 = hashMapTestDriver11.values();
        boolean boolean13 = hashMapTestDriver11.isEmpty();
        java.lang.Object obj15 = hashMapTestDriver11.remove((java.lang.Object) ' ');
        java.lang.Object obj17 = hashMapTestDriver3.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.Collection collection18 = hashMapTestDriver3.values();
        experiment.util.Set set19 = hashMapTestDriver3.keySet();
        java.lang.Class<?> wildcardClass20 = set19.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test044");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        hashMapTestDriver0.clear();
        int int4 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection6 = hashMapTestDriver5.values();
        java.lang.Object obj7 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = obj7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test045");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.Set set3 = hashMapTestDriver0.keySet();
        experiment.util.Set set4 = hashMapTestDriver0.entrySet();
        experiment.util.Collection collection5 = hashMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test046");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean11 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        java.lang.Object obj18 = hashMapTestDriver9.put((java.lang.Object) collection13, (java.lang.Object) boolean17);
        java.lang.Object obj19 = hashMapTestDriver5.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver9);
        boolean boolean20 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 1);
        int int21 = hashMapTestDriver0.size();
        int int22 = hashMapTestDriver0.size();
        int int23 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj26 = hashMapTestDriver24.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        boolean boolean30 = hashMapTestDriver28.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection32 = hashMapTestDriver31.values();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection34 = hashMapTestDriver33.values();
        boolean boolean36 = hashMapTestDriver33.containsKey((java.lang.Object) true);
        java.lang.Object obj37 = hashMapTestDriver28.put((java.lang.Object) collection32, (java.lang.Object) boolean36);
        java.lang.Object obj38 = hashMapTestDriver24.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver28);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj41 = hashMapTestDriver39.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection44 = hashMapTestDriver43.values();
        boolean boolean45 = hashMapTestDriver43.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection47 = hashMapTestDriver46.values();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection49 = hashMapTestDriver48.values();
        boolean boolean51 = hashMapTestDriver48.containsKey((java.lang.Object) true);
        java.lang.Object obj52 = hashMapTestDriver43.put((java.lang.Object) collection47, (java.lang.Object) boolean51);
        java.lang.Object obj53 = hashMapTestDriver39.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver43);
        experiment.util.Set set54 = hashMapTestDriver39.entrySet();
        java.lang.Object obj55 = hashMapTestDriver24.remove((java.lang.Object) hashMapTestDriver39);
        int int56 = hashMapTestDriver39.size();
        hashMapTestDriver39.clear();
        java.lang.Object obj58 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver39);
        int int59 = hashMapTestDriver0.size();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test047");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        experiment.util.Set set6 = hashMapTestDriver4.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        boolean boolean10 = hashMapTestDriver7.containsKey((java.lang.Object) true);
        java.lang.Object obj12 = hashMapTestDriver7.get((java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection18 = hashMapTestDriver17.values();
        boolean boolean19 = hashMapTestDriver17.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection21 = hashMapTestDriver20.values();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        boolean boolean25 = hashMapTestDriver22.containsKey((java.lang.Object) true);
        java.lang.Object obj26 = hashMapTestDriver17.put((java.lang.Object) collection21, (java.lang.Object) boolean25);
        java.lang.Object obj27 = hashMapTestDriver13.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver17);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver28.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection33 = hashMapTestDriver32.values();
        boolean boolean34 = hashMapTestDriver32.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection36 = hashMapTestDriver35.values();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection38 = hashMapTestDriver37.values();
        boolean boolean40 = hashMapTestDriver37.containsKey((java.lang.Object) true);
        java.lang.Object obj41 = hashMapTestDriver32.put((java.lang.Object) collection36, (java.lang.Object) boolean40);
        java.lang.Object obj42 = hashMapTestDriver28.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver32);
        experiment.util.Set set43 = hashMapTestDriver28.entrySet();
        java.lang.Object obj44 = hashMapTestDriver13.remove((java.lang.Object) hashMapTestDriver28);
        int int45 = hashMapTestDriver28.size();
        hashMapTestDriver28.clear();
        java.lang.Object obj47 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver28);
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set49 = hashMapTestDriver48.keySet();
        java.lang.Object obj50 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver48);
        experiment.util.Collection collection51 = hashMapTestDriver7.values();
        boolean boolean52 = hashMapTestDriver7.isEmpty();
        java.lang.Object obj53 = hashMapTestDriver0.put((java.lang.Object) set6, (java.lang.Object) hashMapTestDriver7);
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test048");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        boolean boolean6 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) true);
        java.lang.Object obj13 = hashMapTestDriver4.put((java.lang.Object) collection8, (java.lang.Object) boolean12);
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        experiment.util.Set set17 = hashMapTestDriver15.keySet();
        java.lang.Object obj19 = hashMapTestDriver15.get((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        boolean boolean26 = hashMapTestDriver24.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection28 = hashMapTestDriver27.values();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection30 = hashMapTestDriver29.values();
        boolean boolean32 = hashMapTestDriver29.containsKey((java.lang.Object) true);
        java.lang.Object obj33 = hashMapTestDriver24.put((java.lang.Object) collection28, (java.lang.Object) boolean32);
        java.lang.Object obj34 = hashMapTestDriver20.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver24);
        experiment.util.Set set35 = hashMapTestDriver20.entrySet();
        java.lang.Object obj36 = hashMapTestDriver0.put((java.lang.Object) (byte) 10, (java.lang.Object) hashMapTestDriver20);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj39 = hashMapTestDriver37.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection42 = hashMapTestDriver41.values();
        boolean boolean43 = hashMapTestDriver41.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection45 = hashMapTestDriver44.values();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection47 = hashMapTestDriver46.values();
        boolean boolean49 = hashMapTestDriver46.containsKey((java.lang.Object) true);
        java.lang.Object obj50 = hashMapTestDriver41.put((java.lang.Object) collection45, (java.lang.Object) boolean49);
        java.lang.Object obj51 = hashMapTestDriver37.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver41);
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj54 = hashMapTestDriver52.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection57 = hashMapTestDriver56.values();
        boolean boolean58 = hashMapTestDriver56.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection60 = hashMapTestDriver59.values();
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection62 = hashMapTestDriver61.values();
        boolean boolean64 = hashMapTestDriver61.containsKey((java.lang.Object) true);
        java.lang.Object obj65 = hashMapTestDriver56.put((java.lang.Object) collection60, (java.lang.Object) boolean64);
        java.lang.Object obj66 = hashMapTestDriver52.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver56);
        experiment.util.Set set67 = hashMapTestDriver52.entrySet();
        java.lang.Object obj68 = hashMapTestDriver37.remove((java.lang.Object) hashMapTestDriver52);
        java.lang.Object obj69 = hashMapTestDriver20.remove((java.lang.Object) hashMapTestDriver37);
        int int70 = hashMapTestDriver20.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test049");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        boolean boolean6 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj8 = hashMapTestDriver4.remove((java.lang.Object) ' ');
        hashMapTestDriver4.clear();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) "");
        int int12 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection18 = hashMapTestDriver17.values();
        boolean boolean19 = hashMapTestDriver17.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection21 = hashMapTestDriver20.values();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        boolean boolean25 = hashMapTestDriver22.containsKey((java.lang.Object) true);
        java.lang.Object obj26 = hashMapTestDriver17.put((java.lang.Object) collection21, (java.lang.Object) boolean25);
        java.lang.Object obj27 = hashMapTestDriver13.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver17);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver28.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection33 = hashMapTestDriver32.values();
        boolean boolean34 = hashMapTestDriver32.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection36 = hashMapTestDriver35.values();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection38 = hashMapTestDriver37.values();
        boolean boolean40 = hashMapTestDriver37.containsKey((java.lang.Object) true);
        java.lang.Object obj41 = hashMapTestDriver32.put((java.lang.Object) collection36, (java.lang.Object) boolean40);
        java.lang.Object obj42 = hashMapTestDriver28.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver32);
        experiment.util.Set set43 = hashMapTestDriver28.entrySet();
        java.lang.Object obj44 = hashMapTestDriver13.remove((java.lang.Object) hashMapTestDriver28);
        experiment.util.Set set45 = hashMapTestDriver13.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj48 = hashMapTestDriver46.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection50 = hashMapTestDriver49.values();
        boolean boolean51 = hashMapTestDriver49.isEmpty();
        java.lang.Object obj53 = hashMapTestDriver49.remove((java.lang.Object) ' ');
        hashMapTestDriver49.clear();
        java.lang.Object obj56 = hashMapTestDriver46.put((java.lang.Object) hashMapTestDriver49, (java.lang.Object) 100L);
        java.lang.Object obj57 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver13, (java.lang.Object) hashMapTestDriver46);
        experiment.util.Set set58 = hashMapTestDriver46.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(set58);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test050");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        java.lang.Object obj4 = hashMapTestDriver0.get((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver8 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj9 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver5, (java.lang.Object) hashMapTestDriver8);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj12 = hashMapTestDriver10.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean16 = hashMapTestDriver14.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection18 = hashMapTestDriver17.values();
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        boolean boolean22 = hashMapTestDriver19.containsKey((java.lang.Object) true);
        java.lang.Object obj23 = hashMapTestDriver14.put((java.lang.Object) collection18, (java.lang.Object) boolean22);
        java.lang.Object obj24 = hashMapTestDriver10.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver14);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj27 = hashMapTestDriver25.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection30 = hashMapTestDriver29.values();
        boolean boolean31 = hashMapTestDriver29.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection33 = hashMapTestDriver32.values();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection35 = hashMapTestDriver34.values();
        boolean boolean37 = hashMapTestDriver34.containsKey((java.lang.Object) true);
        java.lang.Object obj38 = hashMapTestDriver29.put((java.lang.Object) collection33, (java.lang.Object) boolean37);
        java.lang.Object obj39 = hashMapTestDriver25.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver29);
        experiment.util.Set set40 = hashMapTestDriver25.entrySet();
        java.lang.Object obj41 = hashMapTestDriver10.remove((java.lang.Object) hashMapTestDriver25);
        int int42 = hashMapTestDriver25.size();
        hashMapTestDriver25.clear();
        boolean boolean44 = hashMapTestDriver8.containsKey((java.lang.Object) hashMapTestDriver25);
        java.lang.Object obj46 = hashMapTestDriver8.get((java.lang.Object) 0);
        java.lang.Object obj47 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = hashMapTestDriver8.remove(obj47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test051");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        experiment.util.Set set6 = hashMapTestDriver4.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        boolean boolean10 = hashMapTestDriver7.containsKey((java.lang.Object) true);
        java.lang.Object obj12 = hashMapTestDriver7.get((java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection18 = hashMapTestDriver17.values();
        boolean boolean19 = hashMapTestDriver17.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection21 = hashMapTestDriver20.values();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        boolean boolean25 = hashMapTestDriver22.containsKey((java.lang.Object) true);
        java.lang.Object obj26 = hashMapTestDriver17.put((java.lang.Object) collection21, (java.lang.Object) boolean25);
        java.lang.Object obj27 = hashMapTestDriver13.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver17);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver28.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection33 = hashMapTestDriver32.values();
        boolean boolean34 = hashMapTestDriver32.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection36 = hashMapTestDriver35.values();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection38 = hashMapTestDriver37.values();
        boolean boolean40 = hashMapTestDriver37.containsKey((java.lang.Object) true);
        java.lang.Object obj41 = hashMapTestDriver32.put((java.lang.Object) collection36, (java.lang.Object) boolean40);
        java.lang.Object obj42 = hashMapTestDriver28.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver32);
        experiment.util.Set set43 = hashMapTestDriver28.entrySet();
        java.lang.Object obj44 = hashMapTestDriver13.remove((java.lang.Object) hashMapTestDriver28);
        int int45 = hashMapTestDriver28.size();
        hashMapTestDriver28.clear();
        java.lang.Object obj47 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver28);
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set49 = hashMapTestDriver48.keySet();
        java.lang.Object obj50 = hashMapTestDriver7.remove((java.lang.Object) hashMapTestDriver48);
        experiment.util.Collection collection51 = hashMapTestDriver7.values();
        boolean boolean52 = hashMapTestDriver7.isEmpty();
        java.lang.Object obj53 = hashMapTestDriver0.put((java.lang.Object) set6, (java.lang.Object) hashMapTestDriver7);
        int int54 = hashMapTestDriver7.size();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(collection51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test052");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        boolean boolean6 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) true);
        java.lang.Object obj13 = hashMapTestDriver4.put((java.lang.Object) collection8, (java.lang.Object) boolean12);
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        boolean boolean21 = hashMapTestDriver19.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        boolean boolean27 = hashMapTestDriver24.containsKey((java.lang.Object) true);
        java.lang.Object obj28 = hashMapTestDriver19.put((java.lang.Object) collection23, (java.lang.Object) boolean27);
        java.lang.Object obj29 = hashMapTestDriver15.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver19);
        experiment.util.Set set30 = hashMapTestDriver15.entrySet();
        java.lang.Object obj31 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver15);
        int int32 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj36 = hashMapTestDriver34.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection38 = hashMapTestDriver37.values();
        boolean boolean39 = hashMapTestDriver37.isEmpty();
        java.lang.Object obj41 = hashMapTestDriver37.remove((java.lang.Object) ' ');
        hashMapTestDriver37.clear();
        java.lang.Object obj44 = hashMapTestDriver34.put((java.lang.Object) hashMapTestDriver37, (java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection50 = hashMapTestDriver49.values();
        boolean boolean51 = hashMapTestDriver49.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection53 = hashMapTestDriver52.values();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection55 = hashMapTestDriver54.values();
        boolean boolean57 = hashMapTestDriver54.containsKey((java.lang.Object) true);
        java.lang.Object obj58 = hashMapTestDriver49.put((java.lang.Object) collection53, (java.lang.Object) boolean57);
        java.lang.Object obj59 = hashMapTestDriver45.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver49);
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj62 = hashMapTestDriver60.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection65 = hashMapTestDriver64.values();
        boolean boolean66 = hashMapTestDriver64.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection68 = hashMapTestDriver67.values();
        experiment.util.HashMapTestDriver hashMapTestDriver69 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection70 = hashMapTestDriver69.values();
        boolean boolean72 = hashMapTestDriver69.containsKey((java.lang.Object) true);
        java.lang.Object obj73 = hashMapTestDriver64.put((java.lang.Object) collection68, (java.lang.Object) boolean72);
        java.lang.Object obj74 = hashMapTestDriver60.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver64);
        experiment.util.Set set75 = hashMapTestDriver60.entrySet();
        java.lang.Object obj76 = hashMapTestDriver45.remove((java.lang.Object) hashMapTestDriver60);
        boolean boolean77 = hashMapTestDriver37.containsKey((java.lang.Object) hashMapTestDriver60);
        java.lang.Object obj78 = hashMapTestDriver15.get((java.lang.Object) hashMapTestDriver60);
        java.lang.Object obj79 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean80 = hashMapTestDriver60.containsKey(obj79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(obj78);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test053");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        experiment.util.Set set2 = hashMapTestDriver0.keySet();
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test054");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        boolean boolean6 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) true);
        java.lang.Object obj13 = hashMapTestDriver4.put((java.lang.Object) collection8, (java.lang.Object) boolean12);
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj17 = hashMapTestDriver15.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver19 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection20 = hashMapTestDriver19.values();
        boolean boolean21 = hashMapTestDriver19.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        boolean boolean27 = hashMapTestDriver24.containsKey((java.lang.Object) true);
        java.lang.Object obj28 = hashMapTestDriver19.put((java.lang.Object) collection23, (java.lang.Object) boolean27);
        java.lang.Object obj29 = hashMapTestDriver15.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver19);
        experiment.util.Set set30 = hashMapTestDriver15.entrySet();
        java.lang.Object obj31 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver15);
        int int32 = hashMapTestDriver15.size();
        hashMapTestDriver15.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj36 = hashMapTestDriver34.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection38 = hashMapTestDriver37.values();
        boolean boolean39 = hashMapTestDriver37.isEmpty();
        java.lang.Object obj41 = hashMapTestDriver37.remove((java.lang.Object) ' ');
        hashMapTestDriver37.clear();
        java.lang.Object obj44 = hashMapTestDriver34.put((java.lang.Object) hashMapTestDriver37, (java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection50 = hashMapTestDriver49.values();
        boolean boolean51 = hashMapTestDriver49.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection53 = hashMapTestDriver52.values();
        experiment.util.HashMapTestDriver hashMapTestDriver54 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection55 = hashMapTestDriver54.values();
        boolean boolean57 = hashMapTestDriver54.containsKey((java.lang.Object) true);
        java.lang.Object obj58 = hashMapTestDriver49.put((java.lang.Object) collection53, (java.lang.Object) boolean57);
        java.lang.Object obj59 = hashMapTestDriver45.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver49);
        experiment.util.HashMapTestDriver hashMapTestDriver60 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj62 = hashMapTestDriver60.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver64 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection65 = hashMapTestDriver64.values();
        boolean boolean66 = hashMapTestDriver64.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection68 = hashMapTestDriver67.values();
        experiment.util.HashMapTestDriver hashMapTestDriver69 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection70 = hashMapTestDriver69.values();
        boolean boolean72 = hashMapTestDriver69.containsKey((java.lang.Object) true);
        java.lang.Object obj73 = hashMapTestDriver64.put((java.lang.Object) collection68, (java.lang.Object) boolean72);
        java.lang.Object obj74 = hashMapTestDriver60.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver64);
        experiment.util.Set set75 = hashMapTestDriver60.entrySet();
        java.lang.Object obj76 = hashMapTestDriver45.remove((java.lang.Object) hashMapTestDriver60);
        boolean boolean77 = hashMapTestDriver37.containsKey((java.lang.Object) hashMapTestDriver60);
        java.lang.Object obj78 = hashMapTestDriver15.get((java.lang.Object) hashMapTestDriver60);
        experiment.util.Set set79 = hashMapTestDriver15.keySet();
        int int80 = hashMapTestDriver15.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test055");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean11 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        java.lang.Object obj18 = hashMapTestDriver9.put((java.lang.Object) collection13, (java.lang.Object) boolean17);
        java.lang.Object obj19 = hashMapTestDriver5.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver9);
        boolean boolean20 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 1);
        boolean boolean22 = hashMapTestDriver0.containsKey((java.lang.Object) (short) 10);
        boolean boolean23 = hashMapTestDriver0.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        boolean boolean28 = hashMapTestDriver25.containsKey((java.lang.Object) true);
        java.lang.Object obj29 = hashMapTestDriver24.get((java.lang.Object) boolean28);
        experiment.util.Set set30 = hashMapTestDriver24.keySet();
        java.lang.Object obj31 = hashMapTestDriver0.get((java.lang.Object) hashMapTestDriver24);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj34 = hashMapTestDriver32.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection36 = hashMapTestDriver35.values();
        boolean boolean37 = hashMapTestDriver35.isEmpty();
        java.lang.Object obj39 = hashMapTestDriver35.remove((java.lang.Object) ' ');
        hashMapTestDriver35.clear();
        java.lang.Object obj42 = hashMapTestDriver32.put((java.lang.Object) hashMapTestDriver35, (java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection44 = hashMapTestDriver43.values();
        boolean boolean45 = hashMapTestDriver43.isEmpty();
        java.lang.Object obj47 = hashMapTestDriver43.remove((java.lang.Object) ' ');
        java.lang.Object obj49 = hashMapTestDriver35.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.Collection collection50 = hashMapTestDriver35.values();
        experiment.util.Set set51 = hashMapTestDriver35.keySet();
        java.lang.Object obj52 = hashMapTestDriver24.get((java.lang.Object) set51);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNull(obj52);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test056");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        boolean boolean6 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj8 = hashMapTestDriver4.remove((java.lang.Object) ' ');
        hashMapTestDriver4.clear();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) "");
        int int12 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj15 = hashMapTestDriver13.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver17 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection18 = hashMapTestDriver17.values();
        boolean boolean19 = hashMapTestDriver17.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection21 = hashMapTestDriver20.values();
        experiment.util.HashMapTestDriver hashMapTestDriver22 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection23 = hashMapTestDriver22.values();
        boolean boolean25 = hashMapTestDriver22.containsKey((java.lang.Object) true);
        java.lang.Object obj26 = hashMapTestDriver17.put((java.lang.Object) collection21, (java.lang.Object) boolean25);
        java.lang.Object obj27 = hashMapTestDriver13.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver17);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj30 = hashMapTestDriver28.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver32 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection33 = hashMapTestDriver32.values();
        boolean boolean34 = hashMapTestDriver32.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver35 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection36 = hashMapTestDriver35.values();
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection38 = hashMapTestDriver37.values();
        boolean boolean40 = hashMapTestDriver37.containsKey((java.lang.Object) true);
        java.lang.Object obj41 = hashMapTestDriver32.put((java.lang.Object) collection36, (java.lang.Object) boolean40);
        java.lang.Object obj42 = hashMapTestDriver28.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver32);
        experiment.util.Set set43 = hashMapTestDriver28.entrySet();
        java.lang.Object obj44 = hashMapTestDriver13.remove((java.lang.Object) hashMapTestDriver28);
        experiment.util.Set set45 = hashMapTestDriver13.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj48 = hashMapTestDriver46.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection50 = hashMapTestDriver49.values();
        boolean boolean51 = hashMapTestDriver49.isEmpty();
        java.lang.Object obj53 = hashMapTestDriver49.remove((java.lang.Object) ' ');
        hashMapTestDriver49.clear();
        java.lang.Object obj56 = hashMapTestDriver46.put((java.lang.Object) hashMapTestDriver49, (java.lang.Object) 100L);
        java.lang.Object obj57 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver13, (java.lang.Object) hashMapTestDriver46);
        experiment.util.Collection collection58 = hashMapTestDriver0.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test057");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        hashMapTestDriver0.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        boolean boolean6 = hashMapTestDriver4.isEmpty();
        java.lang.Object obj8 = hashMapTestDriver4.remove((java.lang.Object) ' ');
        hashMapTestDriver4.clear();
        java.lang.Object obj11 = hashMapTestDriver0.put((java.lang.Object) hashMapTestDriver4, (java.lang.Object) "");
        experiment.util.Set set12 = hashMapTestDriver0.entrySet();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test058");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        boolean boolean6 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) true);
        java.lang.Object obj13 = hashMapTestDriver4.put((java.lang.Object) collection8, (java.lang.Object) boolean12);
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        experiment.util.Set set17 = hashMapTestDriver15.keySet();
        java.lang.Object obj19 = hashMapTestDriver15.get((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        boolean boolean26 = hashMapTestDriver24.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection28 = hashMapTestDriver27.values();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection30 = hashMapTestDriver29.values();
        boolean boolean32 = hashMapTestDriver29.containsKey((java.lang.Object) true);
        java.lang.Object obj33 = hashMapTestDriver24.put((java.lang.Object) collection28, (java.lang.Object) boolean32);
        java.lang.Object obj34 = hashMapTestDriver20.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver24);
        experiment.util.Set set35 = hashMapTestDriver20.entrySet();
        java.lang.Object obj36 = hashMapTestDriver0.put((java.lang.Object) (byte) 10, (java.lang.Object) hashMapTestDriver20);
        int int37 = hashMapTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test059");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver4 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection5 = hashMapTestDriver4.values();
        boolean boolean6 = hashMapTestDriver4.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver7 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection8 = hashMapTestDriver7.values();
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean12 = hashMapTestDriver9.containsKey((java.lang.Object) true);
        java.lang.Object obj13 = hashMapTestDriver4.put((java.lang.Object) collection8, (java.lang.Object) boolean12);
        java.lang.Object obj14 = hashMapTestDriver0.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver4);
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        experiment.util.Set set17 = hashMapTestDriver15.keySet();
        java.lang.Object obj19 = hashMapTestDriver15.get((java.lang.Object) (byte) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver20 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj22 = hashMapTestDriver20.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection25 = hashMapTestDriver24.values();
        boolean boolean26 = hashMapTestDriver24.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver27 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection28 = hashMapTestDriver27.values();
        experiment.util.HashMapTestDriver hashMapTestDriver29 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection30 = hashMapTestDriver29.values();
        boolean boolean32 = hashMapTestDriver29.containsKey((java.lang.Object) true);
        java.lang.Object obj33 = hashMapTestDriver24.put((java.lang.Object) collection28, (java.lang.Object) boolean32);
        java.lang.Object obj34 = hashMapTestDriver20.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver24);
        experiment.util.Set set35 = hashMapTestDriver20.entrySet();
        java.lang.Object obj36 = hashMapTestDriver0.put((java.lang.Object) (byte) 10, (java.lang.Object) hashMapTestDriver20);
        experiment.util.HashMapTestDriver hashMapTestDriver37 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj39 = hashMapTestDriver37.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection42 = hashMapTestDriver41.values();
        boolean boolean43 = hashMapTestDriver41.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver44 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection45 = hashMapTestDriver44.values();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection47 = hashMapTestDriver46.values();
        boolean boolean49 = hashMapTestDriver46.containsKey((java.lang.Object) true);
        java.lang.Object obj50 = hashMapTestDriver41.put((java.lang.Object) collection45, (java.lang.Object) boolean49);
        java.lang.Object obj51 = hashMapTestDriver37.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver41);
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj54 = hashMapTestDriver52.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver56 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection57 = hashMapTestDriver56.values();
        boolean boolean58 = hashMapTestDriver56.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver59 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection60 = hashMapTestDriver59.values();
        experiment.util.HashMapTestDriver hashMapTestDriver61 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection62 = hashMapTestDriver61.values();
        boolean boolean64 = hashMapTestDriver61.containsKey((java.lang.Object) true);
        java.lang.Object obj65 = hashMapTestDriver56.put((java.lang.Object) collection60, (java.lang.Object) boolean64);
        java.lang.Object obj66 = hashMapTestDriver52.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver56);
        experiment.util.Set set67 = hashMapTestDriver52.entrySet();
        java.lang.Object obj68 = hashMapTestDriver37.remove((java.lang.Object) hashMapTestDriver52);
        java.lang.Object obj69 = hashMapTestDriver20.remove((java.lang.Object) hashMapTestDriver37);
        experiment.util.Collection collection70 = hashMapTestDriver37.values();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNotNull(collection62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(collection70);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test060");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj2 = hashMapTestDriver0.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver3 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set4 = hashMapTestDriver3.keySet();
        boolean boolean5 = hashMapTestDriver0.containsKey((java.lang.Object) hashMapTestDriver3);
        hashMapTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test061");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        boolean boolean12 = hashMapTestDriver10.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        boolean boolean18 = hashMapTestDriver15.containsKey((java.lang.Object) true);
        java.lang.Object obj19 = hashMapTestDriver10.put((java.lang.Object) collection14, (java.lang.Object) boolean18);
        java.lang.Object obj20 = hashMapTestDriver6.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        boolean boolean27 = hashMapTestDriver25.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection31 = hashMapTestDriver30.values();
        boolean boolean33 = hashMapTestDriver30.containsKey((java.lang.Object) true);
        java.lang.Object obj34 = hashMapTestDriver25.put((java.lang.Object) collection29, (java.lang.Object) boolean33);
        java.lang.Object obj35 = hashMapTestDriver21.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver25);
        experiment.util.Set set36 = hashMapTestDriver21.entrySet();
        java.lang.Object obj37 = hashMapTestDriver6.remove((java.lang.Object) hashMapTestDriver21);
        int int38 = hashMapTestDriver21.size();
        hashMapTestDriver21.clear();
        java.lang.Object obj40 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver21);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set42 = hashMapTestDriver41.keySet();
        java.lang.Object obj43 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver41);
        boolean boolean44 = hashMapTestDriver41.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver45 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj47 = hashMapTestDriver45.get((java.lang.Object) (short) 10);
        hashMapTestDriver45.clear();
        experiment.util.HashMapTestDriver hashMapTestDriver49 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection50 = hashMapTestDriver49.values();
        boolean boolean51 = hashMapTestDriver49.isEmpty();
        java.lang.Object obj53 = hashMapTestDriver49.remove((java.lang.Object) ' ');
        hashMapTestDriver49.clear();
        java.lang.Object obj56 = hashMapTestDriver45.put((java.lang.Object) hashMapTestDriver49, (java.lang.Object) "");
        int int57 = hashMapTestDriver49.size();
        boolean boolean58 = hashMapTestDriver49.isEmpty();
        java.lang.Object obj59 = hashMapTestDriver41.get((java.lang.Object) boolean58);
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test062");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean3 = hashMapTestDriver0.containsKey((java.lang.Object) true);
        java.lang.Object obj5 = hashMapTestDriver0.get((java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver6 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj8 = hashMapTestDriver6.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver10 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection11 = hashMapTestDriver10.values();
        boolean boolean12 = hashMapTestDriver10.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver13 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection14 = hashMapTestDriver13.values();
        experiment.util.HashMapTestDriver hashMapTestDriver15 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection16 = hashMapTestDriver15.values();
        boolean boolean18 = hashMapTestDriver15.containsKey((java.lang.Object) true);
        java.lang.Object obj19 = hashMapTestDriver10.put((java.lang.Object) collection14, (java.lang.Object) boolean18);
        java.lang.Object obj20 = hashMapTestDriver6.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver10);
        experiment.util.HashMapTestDriver hashMapTestDriver21 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj23 = hashMapTestDriver21.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver25 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection26 = hashMapTestDriver25.values();
        boolean boolean27 = hashMapTestDriver25.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        experiment.util.HashMapTestDriver hashMapTestDriver30 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection31 = hashMapTestDriver30.values();
        boolean boolean33 = hashMapTestDriver30.containsKey((java.lang.Object) true);
        java.lang.Object obj34 = hashMapTestDriver25.put((java.lang.Object) collection29, (java.lang.Object) boolean33);
        java.lang.Object obj35 = hashMapTestDriver21.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver25);
        experiment.util.Set set36 = hashMapTestDriver21.entrySet();
        java.lang.Object obj37 = hashMapTestDriver6.remove((java.lang.Object) hashMapTestDriver21);
        int int38 = hashMapTestDriver21.size();
        hashMapTestDriver21.clear();
        java.lang.Object obj40 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver21);
        experiment.util.HashMapTestDriver hashMapTestDriver41 = new experiment.util.HashMapTestDriver();
        experiment.util.Set set42 = hashMapTestDriver41.keySet();
        java.lang.Object obj43 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver41);
        boolean boolean44 = hashMapTestDriver41.isEmpty();
        java.lang.Object obj45 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj46 = hashMapTestDriver41.remove(obj45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test063");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean11 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        java.lang.Object obj18 = hashMapTestDriver9.put((java.lang.Object) collection13, (java.lang.Object) boolean17);
        java.lang.Object obj19 = hashMapTestDriver5.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver9);
        boolean boolean20 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 1);
        int int21 = hashMapTestDriver0.size();
        int int22 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver23 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj25 = hashMapTestDriver23.get((java.lang.Object) (short) 10);
        hashMapTestDriver23.clear();
        experiment.util.Set set27 = hashMapTestDriver23.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        experiment.util.Set set30 = hashMapTestDriver28.keySet();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj33 = hashMapTestDriver31.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver34 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection35 = hashMapTestDriver34.values();
        boolean boolean36 = hashMapTestDriver34.isEmpty();
        java.lang.Object obj38 = hashMapTestDriver34.remove((java.lang.Object) ' ');
        hashMapTestDriver34.clear();
        java.lang.Object obj41 = hashMapTestDriver31.put((java.lang.Object) hashMapTestDriver34, (java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver42 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection43 = hashMapTestDriver42.values();
        boolean boolean44 = hashMapTestDriver42.isEmpty();
        java.lang.Object obj46 = hashMapTestDriver42.remove((java.lang.Object) ' ');
        java.lang.Object obj48 = hashMapTestDriver34.put((java.lang.Object) ' ', (java.lang.Object) 0);
        experiment.util.Collection collection49 = hashMapTestDriver34.values();
        int int50 = hashMapTestDriver34.size();
        experiment.util.Set set51 = hashMapTestDriver34.entrySet();
        experiment.util.HashMapTestDriver hashMapTestDriver52 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection53 = hashMapTestDriver52.values();
        boolean boolean55 = hashMapTestDriver52.containsKey((java.lang.Object) true);
        java.lang.Object obj57 = hashMapTestDriver52.get((java.lang.Object) 100L);
        experiment.util.HashMapTestDriver hashMapTestDriver58 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj60 = hashMapTestDriver58.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver62 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection63 = hashMapTestDriver62.values();
        boolean boolean64 = hashMapTestDriver62.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver65 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection66 = hashMapTestDriver65.values();
        experiment.util.HashMapTestDriver hashMapTestDriver67 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection68 = hashMapTestDriver67.values();
        boolean boolean70 = hashMapTestDriver67.containsKey((java.lang.Object) true);
        java.lang.Object obj71 = hashMapTestDriver62.put((java.lang.Object) collection66, (java.lang.Object) boolean70);
        java.lang.Object obj72 = hashMapTestDriver58.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver62);
        experiment.util.HashMapTestDriver hashMapTestDriver73 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj75 = hashMapTestDriver73.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver77 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection78 = hashMapTestDriver77.values();
        boolean boolean79 = hashMapTestDriver77.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver80 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection81 = hashMapTestDriver80.values();
        experiment.util.HashMapTestDriver hashMapTestDriver82 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection83 = hashMapTestDriver82.values();
        boolean boolean85 = hashMapTestDriver82.containsKey((java.lang.Object) true);
        java.lang.Object obj86 = hashMapTestDriver77.put((java.lang.Object) collection81, (java.lang.Object) boolean85);
        java.lang.Object obj87 = hashMapTestDriver73.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver77);
        experiment.util.Set set88 = hashMapTestDriver73.entrySet();
        java.lang.Object obj89 = hashMapTestDriver58.remove((java.lang.Object) hashMapTestDriver73);
        int int90 = hashMapTestDriver73.size();
        hashMapTestDriver73.clear();
        java.lang.Object obj92 = hashMapTestDriver52.remove((java.lang.Object) hashMapTestDriver73);
        java.lang.Object obj93 = hashMapTestDriver28.put((java.lang.Object) hashMapTestDriver34, (java.lang.Object) hashMapTestDriver52);
        boolean boolean94 = hashMapTestDriver28.isEmpty();
        java.lang.Object obj95 = hashMapTestDriver0.put((java.lang.Object) set27, (java.lang.Object) hashMapTestDriver28);
        experiment.util.Collection collection96 = hashMapTestDriver0.values();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(collection68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNotNull(collection83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNotNull(collection96);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashMapTest_1082618794_1024_0.test064");
        experiment.util.HashMapTestDriver hashMapTestDriver0 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection1 = hashMapTestDriver0.values();
        boolean boolean2 = hashMapTestDriver0.isEmpty();
        java.lang.Object obj4 = hashMapTestDriver0.remove((java.lang.Object) ' ');
        experiment.util.HashMapTestDriver hashMapTestDriver5 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj7 = hashMapTestDriver5.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver9 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection10 = hashMapTestDriver9.values();
        boolean boolean11 = hashMapTestDriver9.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver12 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection13 = hashMapTestDriver12.values();
        experiment.util.HashMapTestDriver hashMapTestDriver14 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection15 = hashMapTestDriver14.values();
        boolean boolean17 = hashMapTestDriver14.containsKey((java.lang.Object) true);
        java.lang.Object obj18 = hashMapTestDriver9.put((java.lang.Object) collection13, (java.lang.Object) boolean17);
        java.lang.Object obj19 = hashMapTestDriver5.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver9);
        boolean boolean20 = hashMapTestDriver0.containsKey((java.lang.Object) (byte) 1);
        int int21 = hashMapTestDriver0.size();
        int int22 = hashMapTestDriver0.size();
        int int23 = hashMapTestDriver0.size();
        experiment.util.HashMapTestDriver hashMapTestDriver24 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj26 = hashMapTestDriver24.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver28 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection29 = hashMapTestDriver28.values();
        boolean boolean30 = hashMapTestDriver28.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver31 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection32 = hashMapTestDriver31.values();
        experiment.util.HashMapTestDriver hashMapTestDriver33 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection34 = hashMapTestDriver33.values();
        boolean boolean36 = hashMapTestDriver33.containsKey((java.lang.Object) true);
        java.lang.Object obj37 = hashMapTestDriver28.put((java.lang.Object) collection32, (java.lang.Object) boolean36);
        java.lang.Object obj38 = hashMapTestDriver24.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver28);
        experiment.util.HashMapTestDriver hashMapTestDriver39 = new experiment.util.HashMapTestDriver();
        java.lang.Object obj41 = hashMapTestDriver39.get((java.lang.Object) (short) 10);
        experiment.util.HashMapTestDriver hashMapTestDriver43 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection44 = hashMapTestDriver43.values();
        boolean boolean45 = hashMapTestDriver43.isEmpty();
        experiment.util.HashMapTestDriver hashMapTestDriver46 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection47 = hashMapTestDriver46.values();
        experiment.util.HashMapTestDriver hashMapTestDriver48 = new experiment.util.HashMapTestDriver();
        experiment.util.Collection collection49 = hashMapTestDriver48.values();
        boolean boolean51 = hashMapTestDriver48.containsKey((java.lang.Object) true);
        java.lang.Object obj52 = hashMapTestDriver43.put((java.lang.Object) collection47, (java.lang.Object) boolean51);
        java.lang.Object obj53 = hashMapTestDriver39.put((java.lang.Object) (byte) 1, (java.lang.Object) hashMapTestDriver43);
        experiment.util.Set set54 = hashMapTestDriver39.entrySet();
        java.lang.Object obj55 = hashMapTestDriver24.remove((java.lang.Object) hashMapTestDriver39);
        int int56 = hashMapTestDriver39.size();
        hashMapTestDriver39.clear();
        java.lang.Object obj58 = hashMapTestDriver0.remove((java.lang.Object) hashMapTestDriver39);
        experiment.util.Set set59 = hashMapTestDriver39.keySet();
        boolean boolean60 = hashMapTestDriver39.isEmpty();
        org.junit.Assert.assertNotNull(collection1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

}
