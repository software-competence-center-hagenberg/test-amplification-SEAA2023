package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashSetTest_1191369007_64_s {

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
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test001");
        experiment.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver(collection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test002");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        java.lang.Object obj8 = hashSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        int int9 = hashSetTestDriver4.size();
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver4);
        java.lang.Object[] objArray11 = hashSetTestDriver4.toArray();
        boolean boolean12 = hashSetTestDriver4.isEmpty();
        boolean boolean14 = hashSetTestDriver4.add((java.lang.Object) 100.0f);
        java.lang.Class<?> wildcardClass15 = hashSetTestDriver4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test003");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        boolean boolean8 = hashSetTestDriver4.remove((java.lang.Object) 100.0f);
        boolean boolean9 = hashSetTestDriver0.contains((java.lang.Object) 100.0f);
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.contains((java.lang.Object) "hi!");
        java.lang.Object obj15 = hashSetTestDriver11.getMatch((java.lang.Object) (-1.0f));
        int int16 = hashSetTestDriver11.size();
        java.lang.Object obj17 = new java.lang.Object();
        java.lang.Object obj18 = hashSetTestDriver11.getMatch(obj17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = hashSetTestDriver0.contains(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test004");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        java.lang.Object obj8 = hashSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        int int9 = hashSetTestDriver4.size();
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver4);
        java.lang.Object[] objArray11 = hashSetTestDriver4.toArray();
        boolean boolean12 = hashSetTestDriver4.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Class<?> wildcardClass14 = hashSetTestDriver13.getClass();
        boolean boolean15 = hashSetTestDriver4.remove((java.lang.Object) wildcardClass14);
        experiment.util.Iterator iterator16 = hashSetTestDriver4.iterator();
        java.lang.Class<?> wildcardClass17 = iterator16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test005");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass2 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test006");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0L);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = hashSetTestDriver0.add(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test007");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        java.lang.Object obj8 = hashSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        int int9 = hashSetTestDriver4.size();
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver4);
        java.lang.Object[] objArray11 = hashSetTestDriver4.toArray();
        boolean boolean12 = hashSetTestDriver4.isEmpty();
        boolean boolean14 = hashSetTestDriver4.add((java.lang.Object) 100.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver15.contains((java.lang.Object) "hi!");
        int int18 = hashSetTestDriver15.size();
        java.lang.Object obj19 = new java.lang.Object();
        boolean boolean20 = hashSetTestDriver15.equals_CUT(obj19);
        int int21 = hashSetTestDriver15.size();
        java.lang.Object[] objArray22 = hashSetTestDriver15.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver23.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator26 = hashSetTestDriver23.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.contains((java.lang.Object) "hi!");
        java.lang.Object obj31 = hashSetTestDriver27.getMatch((java.lang.Object) (-1.0f));
        int int32 = hashSetTestDriver27.size();
        boolean boolean33 = hashSetTestDriver23.contains((java.lang.Object) hashSetTestDriver27);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator37 = hashSetTestDriver34.iterator();
        boolean boolean38 = hashSetTestDriver23.contains((java.lang.Object) iterator37);
        boolean boolean39 = hashSetTestDriver15.add((java.lang.Object) hashSetTestDriver23);
        boolean boolean40 = hashSetTestDriver4.equals_CUT((java.lang.Object) hashSetTestDriver15);
        java.lang.Class<?> wildcardClass41 = hashSetTestDriver15.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test008");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean5 = hashSetTestDriver0.add((java.lang.Object) (-1));
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.contains((java.lang.Object) "hi!");
        hashSetTestDriver6.clear();
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj12 = hashSetTestDriver0.getMatch(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test009");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        java.lang.Object obj8 = hashSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        int int9 = hashSetTestDriver4.size();
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver4);
        java.lang.Object[] objArray11 = hashSetTestDriver4.toArray();
        boolean boolean12 = hashSetTestDriver4.isEmpty();
        hashSetTestDriver4.clear();
        java.lang.Object[] objArray14 = hashSetTestDriver4.toArray();
        java.lang.Object obj15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = hashSetTestDriver4.remove(obj15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test010");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        java.lang.Object obj8 = hashSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        int int9 = hashSetTestDriver4.size();
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver4);
        java.lang.Object[] objArray11 = hashSetTestDriver4.toArray();
        boolean boolean12 = hashSetTestDriver4.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Class<?> wildcardClass14 = hashSetTestDriver13.getClass();
        boolean boolean15 = hashSetTestDriver4.remove((java.lang.Object) wildcardClass14);
        experiment.util.Iterator iterator16 = hashSetTestDriver4.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator20 = hashSetTestDriver17.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.contains((java.lang.Object) "hi!");
        java.lang.Object obj25 = hashSetTestDriver21.getMatch((java.lang.Object) (-1.0f));
        int int26 = hashSetTestDriver21.size();
        boolean boolean27 = hashSetTestDriver17.contains((java.lang.Object) hashSetTestDriver21);
        java.lang.Object[] objArray28 = hashSetTestDriver21.toArray();
        boolean boolean29 = hashSetTestDriver21.isEmpty();
        boolean boolean31 = hashSetTestDriver21.add((java.lang.Object) 100.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver32 = new experiment.util.HashSetTestDriver();
        boolean boolean34 = hashSetTestDriver32.contains((java.lang.Object) "hi!");
        int int35 = hashSetTestDriver32.size();
        java.lang.Object obj36 = new java.lang.Object();
        boolean boolean37 = hashSetTestDriver32.equals_CUT(obj36);
        int int38 = hashSetTestDriver32.size();
        java.lang.Object[] objArray39 = hashSetTestDriver32.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        boolean boolean42 = hashSetTestDriver40.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator43 = hashSetTestDriver40.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver44 = new experiment.util.HashSetTestDriver();
        boolean boolean46 = hashSetTestDriver44.contains((java.lang.Object) "hi!");
        java.lang.Object obj48 = hashSetTestDriver44.getMatch((java.lang.Object) (-1.0f));
        int int49 = hashSetTestDriver44.size();
        boolean boolean50 = hashSetTestDriver40.contains((java.lang.Object) hashSetTestDriver44);
        experiment.util.HashSetTestDriver hashSetTestDriver51 = new experiment.util.HashSetTestDriver();
        boolean boolean53 = hashSetTestDriver51.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator54 = hashSetTestDriver51.iterator();
        boolean boolean55 = hashSetTestDriver40.contains((java.lang.Object) iterator54);
        boolean boolean56 = hashSetTestDriver32.add((java.lang.Object) hashSetTestDriver40);
        boolean boolean57 = hashSetTestDriver21.equals_CUT((java.lang.Object) hashSetTestDriver32);
        boolean boolean59 = hashSetTestDriver32.remove((java.lang.Object) (short) -1);
        hashSetTestDriver32.clear();
        boolean boolean61 = hashSetTestDriver4.equals_CUT((java.lang.Object) hashSetTestDriver32);
        experiment.util.HashSetTestDriver hashSetTestDriver62 = new experiment.util.HashSetTestDriver();
        boolean boolean64 = hashSetTestDriver62.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator65 = hashSetTestDriver62.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver66 = new experiment.util.HashSetTestDriver();
        boolean boolean68 = hashSetTestDriver66.contains((java.lang.Object) "hi!");
        java.lang.Object obj70 = hashSetTestDriver66.getMatch((java.lang.Object) (-1.0f));
        int int71 = hashSetTestDriver66.size();
        boolean boolean72 = hashSetTestDriver62.contains((java.lang.Object) hashSetTestDriver66);
        java.lang.Object[] objArray73 = hashSetTestDriver66.toArray();
        boolean boolean74 = hashSetTestDriver4.equals_CUT((java.lang.Object) objArray73);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(iterator65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test011");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        java.lang.Object obj8 = hashSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        int int9 = hashSetTestDriver4.size();
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver4);
        java.lang.Object[] objArray11 = hashSetTestDriver4.toArray();
        boolean boolean12 = hashSetTestDriver4.isEmpty();
        boolean boolean13 = hashSetTestDriver4.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test012");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        int int5 = hashSetTestDriver0.size();
        java.lang.Object obj6 = new java.lang.Object();
        java.lang.Object obj7 = hashSetTestDriver0.getMatch(obj6);
        experiment.util.Iterator iterator8 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test013");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = hashSetTestDriver0.equals_CUT(obj4);
        int int6 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.isEmpty();
        int int8 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.contains((java.lang.Object) "hi!");
        boolean boolean13 = hashSetTestDriver9.equals_CUT((java.lang.Object) 0L);
        boolean boolean14 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver9);
        java.lang.Class<?> wildcardClass15 = hashSetTestDriver9.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test014");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = hashSetTestDriver0.equals_CUT(obj4);
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver10.contains((java.lang.Object) "hi!");
        java.lang.Object obj14 = hashSetTestDriver10.getMatch((java.lang.Object) (-1.0f));
        int int15 = hashSetTestDriver10.size();
        boolean boolean16 = hashSetTestDriver6.contains((java.lang.Object) hashSetTestDriver10);
        java.lang.Object[] objArray17 = hashSetTestDriver10.toArray();
        java.lang.Object[] objArray18 = hashSetTestDriver10.toArray();
        boolean boolean19 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver10);
        boolean boolean21 = hashSetTestDriver0.remove((java.lang.Object) '#');
        java.lang.Object obj22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = hashSetTestDriver0.contains(obj22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test015");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean5 = hashSetTestDriver0.add((java.lang.Object) (-1));
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver10.contains((java.lang.Object) "hi!");
        java.lang.Object obj14 = hashSetTestDriver10.getMatch((java.lang.Object) (-1.0f));
        int int15 = hashSetTestDriver10.size();
        boolean boolean16 = hashSetTestDriver6.contains((java.lang.Object) hashSetTestDriver10);
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator20 = hashSetTestDriver17.iterator();
        boolean boolean21 = hashSetTestDriver6.contains((java.lang.Object) iterator20);
        java.lang.Object obj22 = hashSetTestDriver0.getMatch((java.lang.Object) iterator20);
        java.lang.Class<?> wildcardClass23 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test016");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0L);
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test017");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        java.lang.Object[] objArray4 = hashSetTestDriver0.toArray();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass7 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test018");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = hashSetTestDriver0.equals_CUT(obj4);
        int int6 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.isEmpty();
        int int8 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator12 = hashSetTestDriver9.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.contains((java.lang.Object) "hi!");
        java.lang.Object obj17 = hashSetTestDriver13.getMatch((java.lang.Object) (-1.0f));
        int int18 = hashSetTestDriver13.size();
        boolean boolean19 = hashSetTestDriver9.contains((java.lang.Object) hashSetTestDriver13);
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean22 = hashSetTestDriver20.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator23 = hashSetTestDriver20.iterator();
        boolean boolean24 = hashSetTestDriver9.contains((java.lang.Object) iterator23);
        boolean boolean25 = hashSetTestDriver0.contains((java.lang.Object) iterator23);
        experiment.util.Iterator iterator26 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator26);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test019");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = hashSetTestDriver0.getMatch(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test020");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = hashSetTestDriver0.equals_CUT(obj4);
        int int6 = hashSetTestDriver0.size();
        java.lang.Object[] objArray7 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator11 = hashSetTestDriver8.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.contains((java.lang.Object) "hi!");
        java.lang.Object obj16 = hashSetTestDriver12.getMatch((java.lang.Object) (-1.0f));
        int int17 = hashSetTestDriver12.size();
        boolean boolean18 = hashSetTestDriver8.contains((java.lang.Object) hashSetTestDriver12);
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator22 = hashSetTestDriver19.iterator();
        boolean boolean23 = hashSetTestDriver8.contains((java.lang.Object) iterator22);
        boolean boolean24 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver8);
        int int25 = hashSetTestDriver8.size();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver26.contains((java.lang.Object) "hi!");
        java.lang.Object obj30 = hashSetTestDriver26.getMatch((java.lang.Object) (-1.0f));
        int int31 = hashSetTestDriver26.size();
        boolean boolean33 = hashSetTestDriver26.remove((java.lang.Object) "");
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.contains((java.lang.Object) "hi!");
        boolean boolean38 = hashSetTestDriver34.equals_CUT((java.lang.Object) 0L);
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver39.contains((java.lang.Object) "hi!");
        hashSetTestDriver39.clear();
        boolean boolean43 = hashSetTestDriver34.add((java.lang.Object) hashSetTestDriver39);
        hashSetTestDriver39.clear();
        boolean boolean45 = hashSetTestDriver26.remove((java.lang.Object) hashSetTestDriver39);
        boolean boolean46 = hashSetTestDriver8.remove((java.lang.Object) hashSetTestDriver26);
        experiment.util.HashSetTestDriver hashSetTestDriver47 = new experiment.util.HashSetTestDriver();
        boolean boolean49 = hashSetTestDriver47.contains((java.lang.Object) "hi!");
        java.lang.Object obj51 = hashSetTestDriver47.getMatch((java.lang.Object) (-1.0f));
        int int52 = hashSetTestDriver47.size();
        boolean boolean53 = hashSetTestDriver26.equals_CUT((java.lang.Object) hashSetTestDriver47);
        java.lang.Class<?> wildcardClass54 = hashSetTestDriver47.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test021");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = hashSetTestDriver0.equals_CUT(obj4);
        int int6 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.isEmpty();
        int int8 = hashSetTestDriver0.size();
        boolean boolean9 = hashSetTestDriver0.isEmpty();
        int int10 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        int int12 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.contains((java.lang.Object) "hi!");
        int int16 = hashSetTestDriver13.size();
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = hashSetTestDriver13.equals_CUT(obj17);
        int int19 = hashSetTestDriver13.size();
        boolean boolean20 = hashSetTestDriver13.isEmpty();
        boolean boolean21 = hashSetTestDriver0.remove((java.lang.Object) boolean20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test022");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        java.lang.Object obj8 = hashSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        int int9 = hashSetTestDriver4.size();
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver4);
        java.lang.Object[] objArray11 = hashSetTestDriver4.toArray();
        boolean boolean12 = hashSetTestDriver4.isEmpty();
        boolean boolean14 = hashSetTestDriver4.add((java.lang.Object) 100.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean16 = hashSetTestDriver15.isEmpty();
        experiment.util.Iterator iterator17 = hashSetTestDriver15.iterator();
        boolean boolean18 = hashSetTestDriver4.equals_CUT((java.lang.Object) iterator17);
        hashSetTestDriver4.clear();
        experiment.util.Iterator iterator20 = hashSetTestDriver4.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator24 = hashSetTestDriver21.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean27 = hashSetTestDriver25.contains((java.lang.Object) "hi!");
        java.lang.Object obj29 = hashSetTestDriver25.getMatch((java.lang.Object) (-1.0f));
        int int30 = hashSetTestDriver25.size();
        boolean boolean31 = hashSetTestDriver21.contains((java.lang.Object) hashSetTestDriver25);
        java.lang.Object[] objArray32 = hashSetTestDriver25.toArray();
        boolean boolean33 = hashSetTestDriver25.isEmpty();
        boolean boolean35 = hashSetTestDriver25.add((java.lang.Object) 100.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver36 = new experiment.util.HashSetTestDriver();
        boolean boolean38 = hashSetTestDriver36.contains((java.lang.Object) "hi!");
        int int39 = hashSetTestDriver36.size();
        java.lang.Object obj40 = new java.lang.Object();
        boolean boolean41 = hashSetTestDriver36.equals_CUT(obj40);
        int int42 = hashSetTestDriver36.size();
        java.lang.Object[] objArray43 = hashSetTestDriver36.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver44 = new experiment.util.HashSetTestDriver();
        boolean boolean46 = hashSetTestDriver44.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator47 = hashSetTestDriver44.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver48 = new experiment.util.HashSetTestDriver();
        boolean boolean50 = hashSetTestDriver48.contains((java.lang.Object) "hi!");
        java.lang.Object obj52 = hashSetTestDriver48.getMatch((java.lang.Object) (-1.0f));
        int int53 = hashSetTestDriver48.size();
        boolean boolean54 = hashSetTestDriver44.contains((java.lang.Object) hashSetTestDriver48);
        experiment.util.HashSetTestDriver hashSetTestDriver55 = new experiment.util.HashSetTestDriver();
        boolean boolean57 = hashSetTestDriver55.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator58 = hashSetTestDriver55.iterator();
        boolean boolean59 = hashSetTestDriver44.contains((java.lang.Object) iterator58);
        boolean boolean60 = hashSetTestDriver36.add((java.lang.Object) hashSetTestDriver44);
        boolean boolean61 = hashSetTestDriver25.equals_CUT((java.lang.Object) hashSetTestDriver36);
        boolean boolean63 = hashSetTestDriver36.remove((java.lang.Object) (short) -1);
        boolean boolean64 = hashSetTestDriver4.contains((java.lang.Object) boolean63);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(iterator58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test023");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        boolean boolean3 = hashSetTestDriver1.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator4 = hashSetTestDriver1.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.contains((java.lang.Object) "hi!");
        java.lang.Object obj9 = hashSetTestDriver5.getMatch((java.lang.Object) (-1.0f));
        int int10 = hashSetTestDriver5.size();
        boolean boolean11 = hashSetTestDriver1.contains((java.lang.Object) hashSetTestDriver5);
        java.lang.Object[] objArray12 = hashSetTestDriver5.toArray();
        boolean boolean13 = hashSetTestDriver5.isEmpty();
        boolean boolean15 = hashSetTestDriver5.add((java.lang.Object) 100.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver16.isEmpty();
        experiment.util.Iterator iterator18 = hashSetTestDriver16.iterator();
        boolean boolean19 = hashSetTestDriver5.equals_CUT((java.lang.Object) iterator18);
        boolean boolean20 = hashSetTestDriver0.equals_CUT((java.lang.Object) boolean19);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test024");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0L);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = hashSetTestDriver0.remove(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test025");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean5 = hashSetTestDriver0.add((java.lang.Object) (-1));
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.contains((java.lang.Object) "hi!");
        int int9 = hashSetTestDriver6.size();
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = hashSetTestDriver6.equals_CUT(obj10);
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator15 = hashSetTestDriver12.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean18 = hashSetTestDriver16.contains((java.lang.Object) "hi!");
        java.lang.Object obj20 = hashSetTestDriver16.getMatch((java.lang.Object) (-1.0f));
        int int21 = hashSetTestDriver16.size();
        boolean boolean22 = hashSetTestDriver12.contains((java.lang.Object) hashSetTestDriver16);
        java.lang.Object[] objArray23 = hashSetTestDriver16.toArray();
        java.lang.Object[] objArray24 = hashSetTestDriver16.toArray();
        boolean boolean25 = hashSetTestDriver6.remove((java.lang.Object) hashSetTestDriver16);
        hashSetTestDriver6.clear();
        hashSetTestDriver6.clear();
        boolean boolean28 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver6);
        java.lang.Object obj29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = hashSetTestDriver0.remove(obj29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test026");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        hashSetTestDriver0.clear();
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) 1L);
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass7 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test027");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) 10.0f);
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        boolean boolean7 = hashSetTestDriver0.equals_CUT((java.lang.Object) false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test028");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = hashSetTestDriver0.equals_CUT(obj4);
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver10.contains((java.lang.Object) "hi!");
        java.lang.Object obj14 = hashSetTestDriver10.getMatch((java.lang.Object) (-1.0f));
        int int15 = hashSetTestDriver10.size();
        boolean boolean16 = hashSetTestDriver6.contains((java.lang.Object) hashSetTestDriver10);
        java.lang.Object[] objArray17 = hashSetTestDriver10.toArray();
        java.lang.Object[] objArray18 = hashSetTestDriver10.toArray();
        boolean boolean19 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver10);
        hashSetTestDriver0.clear();
        hashSetTestDriver0.clear();
        hashSetTestDriver0.clear();
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test029");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        java.lang.Object obj8 = hashSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        int int9 = hashSetTestDriver4.size();
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver4);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator14 = hashSetTestDriver11.iterator();
        boolean boolean15 = hashSetTestDriver0.contains((java.lang.Object) iterator14);
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean18 = hashSetTestDriver16.contains((java.lang.Object) "hi!");
        int int19 = hashSetTestDriver16.size();
        java.lang.Object obj20 = new java.lang.Object();
        boolean boolean21 = hashSetTestDriver16.equals_CUT(obj20);
        int int22 = hashSetTestDriver16.size();
        boolean boolean23 = hashSetTestDriver16.isEmpty();
        int int24 = hashSetTestDriver16.size();
        hashSetTestDriver16.clear();
        java.lang.Object obj26 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver16);
        hashSetTestDriver16.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test030");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator1 = hashSetTestDriver0.iterator();
        java.lang.Object obj2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = hashSetTestDriver0.add(obj2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test031");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        boolean boolean8 = hashSetTestDriver4.remove((java.lang.Object) 100.0f);
        boolean boolean9 = hashSetTestDriver0.contains((java.lang.Object) 100.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver10.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator13 = hashSetTestDriver10.iterator();
        boolean boolean15 = hashSetTestDriver10.add((java.lang.Object) (-1));
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean18 = hashSetTestDriver16.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator19 = hashSetTestDriver16.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean22 = hashSetTestDriver20.contains((java.lang.Object) "hi!");
        java.lang.Object obj24 = hashSetTestDriver20.getMatch((java.lang.Object) (-1.0f));
        int int25 = hashSetTestDriver20.size();
        boolean boolean26 = hashSetTestDriver16.contains((java.lang.Object) hashSetTestDriver20);
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator30 = hashSetTestDriver27.iterator();
        boolean boolean31 = hashSetTestDriver16.contains((java.lang.Object) iterator30);
        java.lang.Object obj32 = hashSetTestDriver10.getMatch((java.lang.Object) iterator30);
        boolean boolean33 = hashSetTestDriver0.contains((java.lang.Object) iterator30);
        boolean boolean34 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        boolean boolean37 = hashSetTestDriver35.contains((java.lang.Object) "hi!");
        boolean boolean39 = hashSetTestDriver35.remove((java.lang.Object) 100.0f);
        boolean boolean40 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver35);
        java.lang.Object[] objArray41 = hashSetTestDriver35.toArray();
        java.lang.Object obj42 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = hashSetTestDriver35.contains(obj42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test032");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = hashSetTestDriver0.equals_CUT(obj4);
        int int6 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.isEmpty();
        int int8 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        boolean boolean11 = hashSetTestDriver9.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator12 = hashSetTestDriver9.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.contains((java.lang.Object) "hi!");
        java.lang.Object obj17 = hashSetTestDriver13.getMatch((java.lang.Object) (-1.0f));
        int int18 = hashSetTestDriver13.size();
        boolean boolean19 = hashSetTestDriver9.contains((java.lang.Object) hashSetTestDriver13);
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean22 = hashSetTestDriver20.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator23 = hashSetTestDriver20.iterator();
        boolean boolean24 = hashSetTestDriver9.contains((java.lang.Object) iterator23);
        boolean boolean25 = hashSetTestDriver0.contains((java.lang.Object) iterator23);
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver26.contains((java.lang.Object) "hi!");
        boolean boolean30 = hashSetTestDriver26.equals_CUT((java.lang.Object) 0L);
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        boolean boolean33 = hashSetTestDriver31.contains((java.lang.Object) "hi!");
        hashSetTestDriver31.clear();
        boolean boolean35 = hashSetTestDriver26.add((java.lang.Object) hashSetTestDriver31);
        hashSetTestDriver31.clear();
        java.lang.Object obj37 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver31);
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        boolean boolean40 = hashSetTestDriver38.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator41 = hashSetTestDriver38.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver42 = new experiment.util.HashSetTestDriver();
        boolean boolean44 = hashSetTestDriver42.contains((java.lang.Object) "hi!");
        boolean boolean46 = hashSetTestDriver42.remove((java.lang.Object) 100.0f);
        boolean boolean47 = hashSetTestDriver38.contains((java.lang.Object) 100.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver48 = new experiment.util.HashSetTestDriver();
        boolean boolean50 = hashSetTestDriver48.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator51 = hashSetTestDriver48.iterator();
        boolean boolean53 = hashSetTestDriver48.add((java.lang.Object) (-1));
        experiment.util.HashSetTestDriver hashSetTestDriver54 = new experiment.util.HashSetTestDriver();
        boolean boolean56 = hashSetTestDriver54.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator57 = hashSetTestDriver54.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver58 = new experiment.util.HashSetTestDriver();
        boolean boolean60 = hashSetTestDriver58.contains((java.lang.Object) "hi!");
        java.lang.Object obj62 = hashSetTestDriver58.getMatch((java.lang.Object) (-1.0f));
        int int63 = hashSetTestDriver58.size();
        boolean boolean64 = hashSetTestDriver54.contains((java.lang.Object) hashSetTestDriver58);
        experiment.util.HashSetTestDriver hashSetTestDriver65 = new experiment.util.HashSetTestDriver();
        boolean boolean67 = hashSetTestDriver65.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator68 = hashSetTestDriver65.iterator();
        boolean boolean69 = hashSetTestDriver54.contains((java.lang.Object) iterator68);
        java.lang.Object obj70 = hashSetTestDriver48.getMatch((java.lang.Object) iterator68);
        boolean boolean71 = hashSetTestDriver38.contains((java.lang.Object) iterator68);
        experiment.util.HashSetTestDriver hashSetTestDriver72 = new experiment.util.HashSetTestDriver();
        boolean boolean74 = hashSetTestDriver72.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator75 = hashSetTestDriver72.iterator();
        boolean boolean77 = hashSetTestDriver72.add((java.lang.Object) (-1));
        experiment.util.HashSetTestDriver hashSetTestDriver78 = new experiment.util.HashSetTestDriver();
        boolean boolean80 = hashSetTestDriver78.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator81 = hashSetTestDriver78.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver82 = new experiment.util.HashSetTestDriver();
        boolean boolean84 = hashSetTestDriver82.contains((java.lang.Object) "hi!");
        java.lang.Object obj86 = hashSetTestDriver82.getMatch((java.lang.Object) (-1.0f));
        int int87 = hashSetTestDriver82.size();
        boolean boolean88 = hashSetTestDriver78.contains((java.lang.Object) hashSetTestDriver82);
        experiment.util.HashSetTestDriver hashSetTestDriver89 = new experiment.util.HashSetTestDriver();
        boolean boolean91 = hashSetTestDriver89.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator92 = hashSetTestDriver89.iterator();
        boolean boolean93 = hashSetTestDriver78.contains((java.lang.Object) iterator92);
        java.lang.Object obj94 = hashSetTestDriver72.getMatch((java.lang.Object) iterator92);
        boolean boolean95 = hashSetTestDriver38.add((java.lang.Object) hashSetTestDriver72);
        java.lang.Object obj96 = hashSetTestDriver31.getMatch((java.lang.Object) hashSetTestDriver38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass97 = obj96.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(iterator75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(iterator81);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(iterator92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNull(obj96);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test033");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean1 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        boolean boolean4 = hashSetTestDriver2.contains((java.lang.Object) "hi!");
        hashSetTestDriver2.clear();
        java.lang.Object obj7 = hashSetTestDriver2.getMatch((java.lang.Object) 1L);
        int int8 = hashSetTestDriver2.size();
        boolean boolean9 = hashSetTestDriver0.remove((java.lang.Object) int8);
        java.lang.Class<?> wildcardClass10 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test034");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = hashSetTestDriver0.equals_CUT(obj4);
        int int6 = hashSetTestDriver0.size();
        java.lang.Object[] objArray7 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator11 = hashSetTestDriver8.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.contains((java.lang.Object) "hi!");
        java.lang.Object obj16 = hashSetTestDriver12.getMatch((java.lang.Object) (-1.0f));
        int int17 = hashSetTestDriver12.size();
        boolean boolean18 = hashSetTestDriver8.contains((java.lang.Object) hashSetTestDriver12);
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator22 = hashSetTestDriver19.iterator();
        boolean boolean23 = hashSetTestDriver8.contains((java.lang.Object) iterator22);
        boolean boolean24 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver8);
        int int25 = hashSetTestDriver0.size();
        experiment.util.Iterator iterator26 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass27 = iterator26.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test035");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        hashSetTestDriver0.clear();
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) 1L);
        int int6 = hashSetTestDriver0.size();
        int int7 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator11 = hashSetTestDriver8.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.contains((java.lang.Object) "hi!");
        boolean boolean16 = hashSetTestDriver12.remove((java.lang.Object) 100.0f);
        boolean boolean17 = hashSetTestDriver8.contains((java.lang.Object) 100.0f);
        int int18 = hashSetTestDriver8.size();
        boolean boolean19 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver8);
        java.lang.Class<?> wildcardClass20 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test036");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        java.lang.Object obj8 = hashSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        int int9 = hashSetTestDriver4.size();
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver4);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator14 = hashSetTestDriver11.iterator();
        boolean boolean15 = hashSetTestDriver0.contains((java.lang.Object) iterator14);
        experiment.util.Iterator iterator16 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass17 = iterator16.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test037");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0L);
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.contains((java.lang.Object) "hi!");
        hashSetTestDriver5.clear();
        boolean boolean9 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver5);
        java.lang.Class<?> wildcardClass10 = hashSetTestDriver5.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test038");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = hashSetTestDriver0.remove(obj4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test039");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator7 = hashSetTestDriver4.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.contains((java.lang.Object) "hi!");
        java.lang.Object obj12 = hashSetTestDriver8.getMatch((java.lang.Object) (-1.0f));
        int int13 = hashSetTestDriver8.size();
        boolean boolean14 = hashSetTestDriver4.contains((java.lang.Object) hashSetTestDriver8);
        boolean boolean15 = hashSetTestDriver0.remove((java.lang.Object) boolean14);
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean18 = hashSetTestDriver16.contains((java.lang.Object) "hi!");
        int int19 = hashSetTestDriver16.size();
        java.lang.Object obj20 = new java.lang.Object();
        boolean boolean21 = hashSetTestDriver16.equals_CUT(obj20);
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        boolean boolean24 = hashSetTestDriver22.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator25 = hashSetTestDriver22.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver26.contains((java.lang.Object) "hi!");
        java.lang.Object obj30 = hashSetTestDriver26.getMatch((java.lang.Object) (-1.0f));
        int int31 = hashSetTestDriver26.size();
        boolean boolean32 = hashSetTestDriver22.contains((java.lang.Object) hashSetTestDriver26);
        java.lang.Object[] objArray33 = hashSetTestDriver26.toArray();
        java.lang.Object[] objArray34 = hashSetTestDriver26.toArray();
        boolean boolean35 = hashSetTestDriver16.remove((java.lang.Object) hashSetTestDriver26);
        hashSetTestDriver16.clear();
        boolean boolean37 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver16);
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        boolean boolean40 = hashSetTestDriver38.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator41 = hashSetTestDriver38.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver42 = new experiment.util.HashSetTestDriver();
        boolean boolean44 = hashSetTestDriver42.contains((java.lang.Object) "hi!");
        boolean boolean46 = hashSetTestDriver42.remove((java.lang.Object) 100.0f);
        boolean boolean47 = hashSetTestDriver38.contains((java.lang.Object) 100.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver48 = new experiment.util.HashSetTestDriver();
        boolean boolean50 = hashSetTestDriver48.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator51 = hashSetTestDriver48.iterator();
        boolean boolean53 = hashSetTestDriver48.add((java.lang.Object) (-1));
        experiment.util.HashSetTestDriver hashSetTestDriver54 = new experiment.util.HashSetTestDriver();
        boolean boolean56 = hashSetTestDriver54.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator57 = hashSetTestDriver54.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver58 = new experiment.util.HashSetTestDriver();
        boolean boolean60 = hashSetTestDriver58.contains((java.lang.Object) "hi!");
        java.lang.Object obj62 = hashSetTestDriver58.getMatch((java.lang.Object) (-1.0f));
        int int63 = hashSetTestDriver58.size();
        boolean boolean64 = hashSetTestDriver54.contains((java.lang.Object) hashSetTestDriver58);
        experiment.util.HashSetTestDriver hashSetTestDriver65 = new experiment.util.HashSetTestDriver();
        boolean boolean67 = hashSetTestDriver65.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator68 = hashSetTestDriver65.iterator();
        boolean boolean69 = hashSetTestDriver54.contains((java.lang.Object) iterator68);
        java.lang.Object obj70 = hashSetTestDriver48.getMatch((java.lang.Object) iterator68);
        boolean boolean71 = hashSetTestDriver38.contains((java.lang.Object) iterator68);
        boolean boolean72 = hashSetTestDriver38.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver73 = new experiment.util.HashSetTestDriver();
        boolean boolean75 = hashSetTestDriver73.contains((java.lang.Object) "hi!");
        boolean boolean77 = hashSetTestDriver73.remove((java.lang.Object) 100.0f);
        boolean boolean78 = hashSetTestDriver38.add((java.lang.Object) hashSetTestDriver73);
        java.lang.Object[] objArray79 = hashSetTestDriver73.toArray();
        boolean boolean80 = hashSetTestDriver0.add((java.lang.Object) objArray79);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(iterator51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray79), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray79), "[]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test040");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        java.lang.Object obj8 = hashSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        int int9 = hashSetTestDriver4.size();
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver4);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator14 = hashSetTestDriver11.iterator();
        boolean boolean15 = hashSetTestDriver0.contains((java.lang.Object) iterator14);
        experiment.util.Iterator iterator16 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator20 = hashSetTestDriver17.iterator();
        boolean boolean21 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test041");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        boolean boolean5 = hashSetTestDriver0.add((java.lang.Object) (-1));
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver10.contains((java.lang.Object) "hi!");
        java.lang.Object obj14 = hashSetTestDriver10.getMatch((java.lang.Object) (-1.0f));
        int int15 = hashSetTestDriver10.size();
        boolean boolean16 = hashSetTestDriver6.contains((java.lang.Object) hashSetTestDriver10);
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator20 = hashSetTestDriver17.iterator();
        boolean boolean21 = hashSetTestDriver6.contains((java.lang.Object) iterator20);
        java.lang.Object obj22 = hashSetTestDriver0.getMatch((java.lang.Object) iterator20);
        experiment.util.Iterator iterator23 = hashSetTestDriver0.iterator();
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(iterator23);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test042");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        java.lang.Object obj8 = hashSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        int int9 = hashSetTestDriver4.size();
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver4);
        java.lang.Object[] objArray11 = hashSetTestDriver4.toArray();
        boolean boolean12 = hashSetTestDriver4.isEmpty();
        boolean boolean14 = hashSetTestDriver4.add((java.lang.Object) 100.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver15.contains((java.lang.Object) "hi!");
        int int18 = hashSetTestDriver15.size();
        java.lang.Object obj19 = new java.lang.Object();
        boolean boolean20 = hashSetTestDriver15.equals_CUT(obj19);
        int int21 = hashSetTestDriver15.size();
        java.lang.Object[] objArray22 = hashSetTestDriver15.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver23.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator26 = hashSetTestDriver23.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.contains((java.lang.Object) "hi!");
        java.lang.Object obj31 = hashSetTestDriver27.getMatch((java.lang.Object) (-1.0f));
        int int32 = hashSetTestDriver27.size();
        boolean boolean33 = hashSetTestDriver23.contains((java.lang.Object) hashSetTestDriver27);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator37 = hashSetTestDriver34.iterator();
        boolean boolean38 = hashSetTestDriver23.contains((java.lang.Object) iterator37);
        boolean boolean39 = hashSetTestDriver15.add((java.lang.Object) hashSetTestDriver23);
        boolean boolean40 = hashSetTestDriver4.equals_CUT((java.lang.Object) hashSetTestDriver15);
        boolean boolean42 = hashSetTestDriver15.remove((java.lang.Object) (short) -1);
        hashSetTestDriver15.clear();
        boolean boolean44 = hashSetTestDriver15.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver45 = new experiment.util.HashSetTestDriver();
        boolean boolean47 = hashSetTestDriver45.contains((java.lang.Object) "hi!");
        int int48 = hashSetTestDriver45.size();
        java.lang.Object obj49 = new java.lang.Object();
        boolean boolean50 = hashSetTestDriver45.equals_CUT(obj49);
        int int51 = hashSetTestDriver45.size();
        boolean boolean52 = hashSetTestDriver45.isEmpty();
        int int53 = hashSetTestDriver45.size();
        boolean boolean54 = hashSetTestDriver45.isEmpty();
        int int55 = hashSetTestDriver45.size();
        hashSetTestDriver45.clear();
        int int57 = hashSetTestDriver45.size();
        boolean boolean58 = hashSetTestDriver15.remove((java.lang.Object) int57);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test043");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        java.lang.Object obj8 = hashSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        int int9 = hashSetTestDriver4.size();
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver4);
        java.lang.Object[] objArray11 = hashSetTestDriver4.toArray();
        boolean boolean12 = hashSetTestDriver4.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Class<?> wildcardClass14 = hashSetTestDriver13.getClass();
        boolean boolean15 = hashSetTestDriver4.remove((java.lang.Object) wildcardClass14);
        boolean boolean16 = hashSetTestDriver4.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator20 = hashSetTestDriver17.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.contains((java.lang.Object) "hi!");
        java.lang.Object obj25 = hashSetTestDriver21.getMatch((java.lang.Object) (-1.0f));
        int int26 = hashSetTestDriver21.size();
        boolean boolean27 = hashSetTestDriver17.contains((java.lang.Object) hashSetTestDriver21);
        java.lang.Object[] objArray28 = hashSetTestDriver21.toArray();
        boolean boolean29 = hashSetTestDriver21.isEmpty();
        hashSetTestDriver21.clear();
        java.lang.Object[] objArray31 = hashSetTestDriver21.toArray();
        boolean boolean32 = hashSetTestDriver4.add((java.lang.Object) objArray31);
        java.lang.Class<?> wildcardClass33 = objArray31.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test044");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        boolean boolean8 = hashSetTestDriver4.remove((java.lang.Object) 100.0f);
        boolean boolean9 = hashSetTestDriver0.contains((java.lang.Object) 100.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver10.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator13 = hashSetTestDriver10.iterator();
        boolean boolean15 = hashSetTestDriver10.add((java.lang.Object) (-1));
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean18 = hashSetTestDriver16.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator19 = hashSetTestDriver16.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean22 = hashSetTestDriver20.contains((java.lang.Object) "hi!");
        java.lang.Object obj24 = hashSetTestDriver20.getMatch((java.lang.Object) (-1.0f));
        int int25 = hashSetTestDriver20.size();
        boolean boolean26 = hashSetTestDriver16.contains((java.lang.Object) hashSetTestDriver20);
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator30 = hashSetTestDriver27.iterator();
        boolean boolean31 = hashSetTestDriver16.contains((java.lang.Object) iterator30);
        java.lang.Object obj32 = hashSetTestDriver10.getMatch((java.lang.Object) iterator30);
        boolean boolean33 = hashSetTestDriver0.contains((java.lang.Object) iterator30);
        boolean boolean34 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        boolean boolean37 = hashSetTestDriver35.contains((java.lang.Object) "hi!");
        boolean boolean39 = hashSetTestDriver35.remove((java.lang.Object) 100.0f);
        boolean boolean40 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver35);
        boolean boolean41 = hashSetTestDriver35.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test045");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0L);
        java.lang.Class<?> wildcardClass5 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test046");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        int int5 = hashSetTestDriver0.size();
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) (short) 0);
        int int9 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver10.contains((java.lang.Object) "hi!");
        java.lang.Object obj14 = hashSetTestDriver10.getMatch((java.lang.Object) (-1.0f));
        int int15 = hashSetTestDriver10.size();
        boolean boolean17 = hashSetTestDriver10.remove((java.lang.Object) "");
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        boolean boolean20 = hashSetTestDriver18.contains((java.lang.Object) "hi!");
        boolean boolean22 = hashSetTestDriver18.equals_CUT((java.lang.Object) 0L);
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver23.contains((java.lang.Object) "hi!");
        hashSetTestDriver23.clear();
        boolean boolean27 = hashSetTestDriver18.add((java.lang.Object) hashSetTestDriver23);
        hashSetTestDriver23.clear();
        boolean boolean29 = hashSetTestDriver10.remove((java.lang.Object) hashSetTestDriver23);
        boolean boolean30 = hashSetTestDriver0.contains((java.lang.Object) boolean29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test047");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        hashSetTestDriver0.clear();
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) 1L);
        int int6 = hashSetTestDriver0.size();
        int int7 = hashSetTestDriver0.size();
        java.lang.Class<?> wildcardClass8 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test048");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        boolean boolean8 = hashSetTestDriver4.remove((java.lang.Object) 100.0f);
        boolean boolean9 = hashSetTestDriver0.contains((java.lang.Object) 100.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver10.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator13 = hashSetTestDriver10.iterator();
        boolean boolean15 = hashSetTestDriver10.add((java.lang.Object) (-1));
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean18 = hashSetTestDriver16.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator19 = hashSetTestDriver16.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        boolean boolean22 = hashSetTestDriver20.contains((java.lang.Object) "hi!");
        java.lang.Object obj24 = hashSetTestDriver20.getMatch((java.lang.Object) (-1.0f));
        int int25 = hashSetTestDriver20.size();
        boolean boolean26 = hashSetTestDriver16.contains((java.lang.Object) hashSetTestDriver20);
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator30 = hashSetTestDriver27.iterator();
        boolean boolean31 = hashSetTestDriver16.contains((java.lang.Object) iterator30);
        java.lang.Object obj32 = hashSetTestDriver10.getMatch((java.lang.Object) iterator30);
        boolean boolean33 = hashSetTestDriver0.contains((java.lang.Object) iterator30);
        boolean boolean34 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        boolean boolean37 = hashSetTestDriver35.contains((java.lang.Object) "hi!");
        boolean boolean39 = hashSetTestDriver35.remove((java.lang.Object) 100.0f);
        boolean boolean40 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver35);
        hashSetTestDriver35.clear();
        experiment.util.Iterator iterator42 = hashSetTestDriver35.iterator();
        boolean boolean43 = hashSetTestDriver35.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test049");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        boolean boolean7 = hashSetTestDriver5.contains((java.lang.Object) "hi!");
        int int8 = hashSetTestDriver5.size();
        java.lang.Object obj9 = new java.lang.Object();
        boolean boolean10 = hashSetTestDriver5.equals_CUT(obj9);
        int int11 = hashSetTestDriver5.size();
        java.lang.Object[] objArray12 = hashSetTestDriver5.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        boolean boolean15 = hashSetTestDriver13.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator16 = hashSetTestDriver13.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        boolean boolean19 = hashSetTestDriver17.contains((java.lang.Object) "hi!");
        java.lang.Object obj21 = hashSetTestDriver17.getMatch((java.lang.Object) (-1.0f));
        int int22 = hashSetTestDriver17.size();
        boolean boolean23 = hashSetTestDriver13.contains((java.lang.Object) hashSetTestDriver17);
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        boolean boolean26 = hashSetTestDriver24.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator27 = hashSetTestDriver24.iterator();
        boolean boolean28 = hashSetTestDriver13.contains((java.lang.Object) iterator27);
        boolean boolean29 = hashSetTestDriver5.add((java.lang.Object) hashSetTestDriver13);
        int int30 = hashSetTestDriver13.size();
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        boolean boolean33 = hashSetTestDriver31.contains((java.lang.Object) "hi!");
        java.lang.Object obj35 = hashSetTestDriver31.getMatch((java.lang.Object) (-1.0f));
        int int36 = hashSetTestDriver31.size();
        boolean boolean38 = hashSetTestDriver31.remove((java.lang.Object) "");
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver39.contains((java.lang.Object) "hi!");
        boolean boolean43 = hashSetTestDriver39.equals_CUT((java.lang.Object) 0L);
        experiment.util.HashSetTestDriver hashSetTestDriver44 = new experiment.util.HashSetTestDriver();
        boolean boolean46 = hashSetTestDriver44.contains((java.lang.Object) "hi!");
        hashSetTestDriver44.clear();
        boolean boolean48 = hashSetTestDriver39.add((java.lang.Object) hashSetTestDriver44);
        hashSetTestDriver44.clear();
        boolean boolean50 = hashSetTestDriver31.remove((java.lang.Object) hashSetTestDriver44);
        boolean boolean51 = hashSetTestDriver13.remove((java.lang.Object) hashSetTestDriver31);
        java.lang.Object obj52 = hashSetTestDriver0.getMatch((java.lang.Object) boolean51);
        java.lang.Object[] objArray53 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[]");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test050");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = hashSetTestDriver0.equals_CUT(obj4);
        int int6 = hashSetTestDriver0.size();
        java.lang.Object[] objArray7 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator11 = hashSetTestDriver8.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.contains((java.lang.Object) "hi!");
        java.lang.Object obj16 = hashSetTestDriver12.getMatch((java.lang.Object) (-1.0f));
        int int17 = hashSetTestDriver12.size();
        boolean boolean18 = hashSetTestDriver8.contains((java.lang.Object) hashSetTestDriver12);
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator22 = hashSetTestDriver19.iterator();
        boolean boolean23 = hashSetTestDriver8.contains((java.lang.Object) iterator22);
        boolean boolean24 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver8);
        int int25 = hashSetTestDriver8.size();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver26.contains((java.lang.Object) "hi!");
        java.lang.Object obj30 = hashSetTestDriver26.getMatch((java.lang.Object) (-1.0f));
        int int31 = hashSetTestDriver26.size();
        boolean boolean33 = hashSetTestDriver26.remove((java.lang.Object) "");
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.contains((java.lang.Object) "hi!");
        boolean boolean38 = hashSetTestDriver34.equals_CUT((java.lang.Object) 0L);
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver39.contains((java.lang.Object) "hi!");
        hashSetTestDriver39.clear();
        boolean boolean43 = hashSetTestDriver34.add((java.lang.Object) hashSetTestDriver39);
        hashSetTestDriver39.clear();
        boolean boolean45 = hashSetTestDriver26.remove((java.lang.Object) hashSetTestDriver39);
        boolean boolean46 = hashSetTestDriver8.remove((java.lang.Object) hashSetTestDriver26);
        experiment.util.HashSetTestDriver hashSetTestDriver47 = new experiment.util.HashSetTestDriver();
        boolean boolean49 = hashSetTestDriver47.contains((java.lang.Object) "hi!");
        java.lang.Object obj51 = hashSetTestDriver47.getMatch((java.lang.Object) (-1.0f));
        int int52 = hashSetTestDriver47.size();
        boolean boolean53 = hashSetTestDriver26.equals_CUT((java.lang.Object) hashSetTestDriver47);
        experiment.util.Iterator iterator54 = hashSetTestDriver47.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterator54);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test051");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = hashSetTestDriver0.equals_CUT(obj4);
        int int6 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver7.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator10 = hashSetTestDriver7.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.contains((java.lang.Object) "hi!");
        java.lang.Object obj15 = hashSetTestDriver11.getMatch((java.lang.Object) (-1.0f));
        int int16 = hashSetTestDriver11.size();
        boolean boolean17 = hashSetTestDriver7.contains((java.lang.Object) hashSetTestDriver11);
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        boolean boolean20 = hashSetTestDriver18.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator21 = hashSetTestDriver18.iterator();
        boolean boolean22 = hashSetTestDriver7.contains((java.lang.Object) iterator21);
        experiment.util.Iterator iterator23 = hashSetTestDriver7.iterator();
        boolean boolean24 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean27 = hashSetTestDriver25.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator28 = hashSetTestDriver25.iterator();
        boolean boolean30 = hashSetTestDriver25.add((java.lang.Object) (-1));
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        boolean boolean33 = hashSetTestDriver31.contains((java.lang.Object) "hi!");
        int int34 = hashSetTestDriver31.size();
        java.lang.Object obj35 = new java.lang.Object();
        boolean boolean36 = hashSetTestDriver31.equals_CUT(obj35);
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        boolean boolean39 = hashSetTestDriver37.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator40 = hashSetTestDriver37.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        boolean boolean43 = hashSetTestDriver41.contains((java.lang.Object) "hi!");
        java.lang.Object obj45 = hashSetTestDriver41.getMatch((java.lang.Object) (-1.0f));
        int int46 = hashSetTestDriver41.size();
        boolean boolean47 = hashSetTestDriver37.contains((java.lang.Object) hashSetTestDriver41);
        java.lang.Object[] objArray48 = hashSetTestDriver41.toArray();
        java.lang.Object[] objArray49 = hashSetTestDriver41.toArray();
        boolean boolean50 = hashSetTestDriver31.remove((java.lang.Object) hashSetTestDriver41);
        hashSetTestDriver31.clear();
        hashSetTestDriver31.clear();
        boolean boolean53 = hashSetTestDriver25.contains((java.lang.Object) hashSetTestDriver31);
        java.lang.Class<?> wildcardClass54 = hashSetTestDriver25.getClass();
        java.lang.Object obj55 = hashSetTestDriver7.getMatch((java.lang.Object) wildcardClass54);
        experiment.util.HashSetTestDriver hashSetTestDriver56 = new experiment.util.HashSetTestDriver();
        boolean boolean58 = hashSetTestDriver56.contains((java.lang.Object) "hi!");
        java.lang.Object obj60 = hashSetTestDriver56.getMatch((java.lang.Object) (-1.0f));
        int int61 = hashSetTestDriver56.size();
        boolean boolean63 = hashSetTestDriver56.remove((java.lang.Object) "");
        experiment.util.HashSetTestDriver hashSetTestDriver64 = new experiment.util.HashSetTestDriver();
        boolean boolean66 = hashSetTestDriver64.contains((java.lang.Object) "hi!");
        boolean boolean68 = hashSetTestDriver64.equals_CUT((java.lang.Object) 0L);
        experiment.util.HashSetTestDriver hashSetTestDriver69 = new experiment.util.HashSetTestDriver();
        boolean boolean71 = hashSetTestDriver69.contains((java.lang.Object) "hi!");
        hashSetTestDriver69.clear();
        boolean boolean73 = hashSetTestDriver64.add((java.lang.Object) hashSetTestDriver69);
        hashSetTestDriver69.clear();
        boolean boolean75 = hashSetTestDriver56.remove((java.lang.Object) hashSetTestDriver69);
        boolean boolean76 = hashSetTestDriver7.remove((java.lang.Object) boolean75);
        experiment.util.HashSetTestDriver hashSetTestDriver77 = new experiment.util.HashSetTestDriver();
        experiment.util.Iterator iterator78 = hashSetTestDriver77.iterator();
        experiment.util.Iterator iterator79 = hashSetTestDriver77.iterator();
        boolean boolean80 = hashSetTestDriver7.contains((java.lang.Object) iterator79);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(iterator40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(iterator78);
        org.junit.Assert.assertNotNull(iterator79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test052");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator7 = hashSetTestDriver4.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.contains((java.lang.Object) "hi!");
        java.lang.Object obj12 = hashSetTestDriver8.getMatch((java.lang.Object) (-1.0f));
        int int13 = hashSetTestDriver8.size();
        boolean boolean14 = hashSetTestDriver4.contains((java.lang.Object) hashSetTestDriver8);
        boolean boolean15 = hashSetTestDriver0.remove((java.lang.Object) boolean14);
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean18 = hashSetTestDriver16.contains((java.lang.Object) "hi!");
        int int19 = hashSetTestDriver16.size();
        java.lang.Object obj20 = new java.lang.Object();
        boolean boolean21 = hashSetTestDriver16.equals_CUT(obj20);
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        boolean boolean24 = hashSetTestDriver22.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator25 = hashSetTestDriver22.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver26.contains((java.lang.Object) "hi!");
        java.lang.Object obj30 = hashSetTestDriver26.getMatch((java.lang.Object) (-1.0f));
        int int31 = hashSetTestDriver26.size();
        boolean boolean32 = hashSetTestDriver22.contains((java.lang.Object) hashSetTestDriver26);
        java.lang.Object[] objArray33 = hashSetTestDriver26.toArray();
        java.lang.Object[] objArray34 = hashSetTestDriver26.toArray();
        boolean boolean35 = hashSetTestDriver16.remove((java.lang.Object) hashSetTestDriver26);
        hashSetTestDriver16.clear();
        boolean boolean37 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver16);
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        boolean boolean40 = hashSetTestDriver38.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator41 = hashSetTestDriver38.iterator();
        java.lang.Object[] objArray42 = hashSetTestDriver38.toArray();
        boolean boolean43 = hashSetTestDriver16.add((java.lang.Object) objArray42);
        int int44 = hashSetTestDriver16.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test053");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = hashSetTestDriver0.equals_CUT(obj4);
        int int6 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.isEmpty();
        int int8 = hashSetTestDriver0.size();
        boolean boolean9 = hashSetTestDriver0.isEmpty();
        boolean boolean10 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray11 = hashSetTestDriver0.toArray();
        int int12 = hashSetTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test054");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.contains((java.lang.Object) "hi!");
        int int9 = hashSetTestDriver6.size();
        java.lang.Object obj10 = new java.lang.Object();
        boolean boolean11 = hashSetTestDriver6.equals_CUT(obj10);
        int int12 = hashSetTestDriver6.size();
        java.lang.Object[] objArray13 = hashSetTestDriver6.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        boolean boolean16 = hashSetTestDriver14.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator17 = hashSetTestDriver14.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        boolean boolean20 = hashSetTestDriver18.contains((java.lang.Object) "hi!");
        java.lang.Object obj22 = hashSetTestDriver18.getMatch((java.lang.Object) (-1.0f));
        int int23 = hashSetTestDriver18.size();
        boolean boolean24 = hashSetTestDriver14.contains((java.lang.Object) hashSetTestDriver18);
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        boolean boolean27 = hashSetTestDriver25.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator28 = hashSetTestDriver25.iterator();
        boolean boolean29 = hashSetTestDriver14.contains((java.lang.Object) iterator28);
        boolean boolean30 = hashSetTestDriver6.add((java.lang.Object) hashSetTestDriver14);
        java.lang.Object obj31 = hashSetTestDriver0.getMatch((java.lang.Object) boolean30);
        boolean boolean32 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test055");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = hashSetTestDriver0.equals_CUT(obj4);
        int int6 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.isEmpty();
        int int8 = hashSetTestDriver0.size();
        boolean boolean9 = hashSetTestDriver0.isEmpty();
        int int10 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        int int12 = hashSetTestDriver0.size();
        boolean boolean13 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test056");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = hashSetTestDriver0.equals_CUT(obj4);
        int int6 = hashSetTestDriver0.size();
        java.lang.Object[] objArray7 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        boolean boolean10 = hashSetTestDriver8.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator11 = hashSetTestDriver8.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.contains((java.lang.Object) "hi!");
        java.lang.Object obj16 = hashSetTestDriver12.getMatch((java.lang.Object) (-1.0f));
        int int17 = hashSetTestDriver12.size();
        boolean boolean18 = hashSetTestDriver8.contains((java.lang.Object) hashSetTestDriver12);
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        boolean boolean21 = hashSetTestDriver19.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator22 = hashSetTestDriver19.iterator();
        boolean boolean23 = hashSetTestDriver8.contains((java.lang.Object) iterator22);
        boolean boolean24 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver8);
        int int25 = hashSetTestDriver8.size();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        boolean boolean28 = hashSetTestDriver26.contains((java.lang.Object) "hi!");
        java.lang.Object obj30 = hashSetTestDriver26.getMatch((java.lang.Object) (-1.0f));
        int int31 = hashSetTestDriver26.size();
        boolean boolean33 = hashSetTestDriver26.remove((java.lang.Object) "");
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.contains((java.lang.Object) "hi!");
        boolean boolean38 = hashSetTestDriver34.equals_CUT((java.lang.Object) 0L);
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        boolean boolean41 = hashSetTestDriver39.contains((java.lang.Object) "hi!");
        hashSetTestDriver39.clear();
        boolean boolean43 = hashSetTestDriver34.add((java.lang.Object) hashSetTestDriver39);
        hashSetTestDriver39.clear();
        boolean boolean45 = hashSetTestDriver26.remove((java.lang.Object) hashSetTestDriver39);
        boolean boolean46 = hashSetTestDriver8.remove((java.lang.Object) hashSetTestDriver26);
        experiment.util.HashSetTestDriver hashSetTestDriver47 = new experiment.util.HashSetTestDriver();
        boolean boolean49 = hashSetTestDriver47.contains((java.lang.Object) "hi!");
        java.lang.Object obj51 = hashSetTestDriver47.getMatch((java.lang.Object) (-1.0f));
        int int52 = hashSetTestDriver47.size();
        boolean boolean53 = hashSetTestDriver26.equals_CUT((java.lang.Object) hashSetTestDriver47);
        experiment.util.HashSetTestDriver hashSetTestDriver54 = new experiment.util.HashSetTestDriver();
        boolean boolean56 = hashSetTestDriver54.contains((java.lang.Object) "hi!");
        boolean boolean58 = hashSetTestDriver54.equals_CUT((java.lang.Object) 0L);
        experiment.util.HashSetTestDriver hashSetTestDriver59 = new experiment.util.HashSetTestDriver();
        boolean boolean61 = hashSetTestDriver59.contains((java.lang.Object) "hi!");
        hashSetTestDriver59.clear();
        boolean boolean63 = hashSetTestDriver54.add((java.lang.Object) hashSetTestDriver59);
        java.lang.Object[] objArray64 = hashSetTestDriver59.toArray();
        boolean boolean65 = hashSetTestDriver26.contains((java.lang.Object) objArray64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test057");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        java.lang.Object obj8 = hashSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        int int9 = hashSetTestDriver4.size();
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver4);
        int int11 = hashSetTestDriver4.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test058");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        hashSetTestDriver4.clear();
        java.lang.Object obj9 = hashSetTestDriver4.getMatch((java.lang.Object) 1L);
        int int10 = hashSetTestDriver4.size();
        int int11 = hashSetTestDriver4.size();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        boolean boolean14 = hashSetTestDriver12.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator15 = hashSetTestDriver12.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        boolean boolean18 = hashSetTestDriver16.contains((java.lang.Object) "hi!");
        java.lang.Object obj20 = hashSetTestDriver16.getMatch((java.lang.Object) (-1.0f));
        int int21 = hashSetTestDriver16.size();
        boolean boolean22 = hashSetTestDriver12.contains((java.lang.Object) hashSetTestDriver16);
        java.lang.Object[] objArray23 = hashSetTestDriver16.toArray();
        boolean boolean24 = hashSetTestDriver16.isEmpty();
        hashSetTestDriver16.clear();
        java.lang.Object[] objArray26 = hashSetTestDriver16.toArray();
        boolean boolean27 = hashSetTestDriver4.add((java.lang.Object) hashSetTestDriver16);
        boolean boolean28 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver4);
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        boolean boolean31 = hashSetTestDriver29.contains((java.lang.Object) "hi!");
        hashSetTestDriver29.clear();
        java.lang.Object obj34 = hashSetTestDriver29.getMatch((java.lang.Object) 1L);
        experiment.util.Iterator iterator35 = hashSetTestDriver29.iterator();
        int int36 = hashSetTestDriver29.size();
        java.lang.Class<?> wildcardClass37 = hashSetTestDriver29.getClass();
        boolean boolean38 = hashSetTestDriver4.remove((java.lang.Object) hashSetTestDriver29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test059");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        boolean boolean6 = hashSetTestDriver4.contains((java.lang.Object) "hi!");
        java.lang.Object obj8 = hashSetTestDriver4.getMatch((java.lang.Object) (-1.0f));
        int int9 = hashSetTestDriver4.size();
        boolean boolean10 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver4);
        java.lang.Object[] objArray11 = hashSetTestDriver4.toArray();
        boolean boolean12 = hashSetTestDriver4.isEmpty();
        boolean boolean14 = hashSetTestDriver4.add((java.lang.Object) 100.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        boolean boolean17 = hashSetTestDriver15.contains((java.lang.Object) "hi!");
        int int18 = hashSetTestDriver15.size();
        java.lang.Object obj19 = new java.lang.Object();
        boolean boolean20 = hashSetTestDriver15.equals_CUT(obj19);
        int int21 = hashSetTestDriver15.size();
        java.lang.Object[] objArray22 = hashSetTestDriver15.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        boolean boolean25 = hashSetTestDriver23.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator26 = hashSetTestDriver23.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        boolean boolean29 = hashSetTestDriver27.contains((java.lang.Object) "hi!");
        java.lang.Object obj31 = hashSetTestDriver27.getMatch((java.lang.Object) (-1.0f));
        int int32 = hashSetTestDriver27.size();
        boolean boolean33 = hashSetTestDriver23.contains((java.lang.Object) hashSetTestDriver27);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator37 = hashSetTestDriver34.iterator();
        boolean boolean38 = hashSetTestDriver23.contains((java.lang.Object) iterator37);
        boolean boolean39 = hashSetTestDriver15.add((java.lang.Object) hashSetTestDriver23);
        boolean boolean40 = hashSetTestDriver4.equals_CUT((java.lang.Object) hashSetTestDriver15);
        boolean boolean42 = hashSetTestDriver15.remove((java.lang.Object) (short) -1);
        hashSetTestDriver15.clear();
        hashSetTestDriver15.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test060");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = hashSetTestDriver0.equals_CUT(obj4);
        int int6 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.isEmpty();
        int int8 = hashSetTestDriver0.size();
        experiment.util.Iterator iterator9 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator10 = hashSetTestDriver0.iterator();
        java.lang.Object[] objArray11 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test061");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        int int3 = hashSetTestDriver0.size();
        java.lang.Object obj4 = new java.lang.Object();
        boolean boolean5 = hashSetTestDriver0.equals_CUT(obj4);
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator9 = hashSetTestDriver6.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        boolean boolean12 = hashSetTestDriver10.contains((java.lang.Object) "hi!");
        java.lang.Object obj14 = hashSetTestDriver10.getMatch((java.lang.Object) (-1.0f));
        int int15 = hashSetTestDriver10.size();
        boolean boolean16 = hashSetTestDriver6.contains((java.lang.Object) hashSetTestDriver10);
        java.lang.Object[] objArray17 = hashSetTestDriver10.toArray();
        java.lang.Object[] objArray18 = hashSetTestDriver10.toArray();
        boolean boolean19 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver10);
        boolean boolean21 = hashSetTestDriver0.remove((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass22 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test062");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        hashSetTestDriver0.clear();
        java.lang.Object obj5 = hashSetTestDriver0.getMatch((java.lang.Object) 1L);
        int int6 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver7.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator10 = hashSetTestDriver7.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        boolean boolean13 = hashSetTestDriver11.contains((java.lang.Object) "hi!");
        java.lang.Object obj15 = hashSetTestDriver11.getMatch((java.lang.Object) (-1.0f));
        int int16 = hashSetTestDriver11.size();
        boolean boolean17 = hashSetTestDriver7.contains((java.lang.Object) hashSetTestDriver11);
        java.lang.Object[] objArray18 = hashSetTestDriver11.toArray();
        boolean boolean19 = hashSetTestDriver0.contains((java.lang.Object) objArray18);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        boolean boolean23 = hashSetTestDriver21.contains((java.lang.Object) "hi!");
        int int24 = hashSetTestDriver21.size();
        java.lang.Object obj25 = new java.lang.Object();
        boolean boolean26 = hashSetTestDriver21.equals_CUT(obj25);
        int int27 = hashSetTestDriver21.size();
        boolean boolean28 = hashSetTestDriver21.isEmpty();
        int int29 = hashSetTestDriver21.size();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        boolean boolean32 = hashSetTestDriver30.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator33 = hashSetTestDriver30.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        boolean boolean36 = hashSetTestDriver34.contains((java.lang.Object) "hi!");
        java.lang.Object obj38 = hashSetTestDriver34.getMatch((java.lang.Object) (-1.0f));
        int int39 = hashSetTestDriver34.size();
        boolean boolean40 = hashSetTestDriver30.contains((java.lang.Object) hashSetTestDriver34);
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        boolean boolean43 = hashSetTestDriver41.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator44 = hashSetTestDriver41.iterator();
        boolean boolean45 = hashSetTestDriver30.contains((java.lang.Object) iterator44);
        boolean boolean46 = hashSetTestDriver21.contains((java.lang.Object) iterator44);
        experiment.util.HashSetTestDriver hashSetTestDriver47 = new experiment.util.HashSetTestDriver();
        boolean boolean49 = hashSetTestDriver47.contains((java.lang.Object) "hi!");
        boolean boolean51 = hashSetTestDriver47.equals_CUT((java.lang.Object) 0L);
        experiment.util.HashSetTestDriver hashSetTestDriver52 = new experiment.util.HashSetTestDriver();
        boolean boolean54 = hashSetTestDriver52.contains((java.lang.Object) "hi!");
        hashSetTestDriver52.clear();
        boolean boolean56 = hashSetTestDriver47.add((java.lang.Object) hashSetTestDriver52);
        hashSetTestDriver52.clear();
        java.lang.Object obj58 = hashSetTestDriver21.getMatch((java.lang.Object) hashSetTestDriver52);
        java.lang.Object obj59 = new java.lang.Object();
        boolean boolean60 = hashSetTestDriver52.remove(obj59);
        experiment.util.HashSetTestDriver hashSetTestDriver61 = new experiment.util.HashSetTestDriver();
        boolean boolean63 = hashSetTestDriver61.contains((java.lang.Object) "hi!");
        experiment.util.Iterator iterator64 = hashSetTestDriver61.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver65 = new experiment.util.HashSetTestDriver();
        boolean boolean67 = hashSetTestDriver65.contains((java.lang.Object) "hi!");
        java.lang.Object obj69 = hashSetTestDriver65.getMatch((java.lang.Object) (-1.0f));
        int int70 = hashSetTestDriver65.size();
        boolean boolean71 = hashSetTestDriver61.contains((java.lang.Object) hashSetTestDriver65);
        boolean boolean73 = hashSetTestDriver61.remove((java.lang.Object) 1.0f);
        experiment.util.HashSetTestDriver hashSetTestDriver74 = new experiment.util.HashSetTestDriver();
        boolean boolean76 = hashSetTestDriver74.contains((java.lang.Object) "hi!");
        java.lang.Object obj78 = hashSetTestDriver74.getMatch((java.lang.Object) (-1.0f));
        int int79 = hashSetTestDriver74.size();
        boolean boolean81 = hashSetTestDriver74.remove((java.lang.Object) "");
        experiment.util.HashSetTestDriver hashSetTestDriver82 = new experiment.util.HashSetTestDriver();
        boolean boolean84 = hashSetTestDriver82.contains((java.lang.Object) "hi!");
        boolean boolean86 = hashSetTestDriver82.equals_CUT((java.lang.Object) 0L);
        experiment.util.HashSetTestDriver hashSetTestDriver87 = new experiment.util.HashSetTestDriver();
        boolean boolean89 = hashSetTestDriver87.contains((java.lang.Object) "hi!");
        hashSetTestDriver87.clear();
        boolean boolean91 = hashSetTestDriver82.add((java.lang.Object) hashSetTestDriver87);
        hashSetTestDriver87.clear();
        boolean boolean93 = hashSetTestDriver74.remove((java.lang.Object) hashSetTestDriver87);
        boolean boolean94 = hashSetTestDriver61.remove((java.lang.Object) hashSetTestDriver74);
        boolean boolean95 = hashSetTestDriver52.add((java.lang.Object) hashSetTestDriver74);
        boolean boolean96 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver52);
        hashSetTestDriver52.clear();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(iterator64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test063");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) 10.0f);
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        boolean boolean9 = hashSetTestDriver7.contains((java.lang.Object) "hi!");
        int int10 = hashSetTestDriver7.size();
        java.lang.Object obj11 = new java.lang.Object();
        boolean boolean12 = hashSetTestDriver7.equals_CUT(obj11);
        int int13 = hashSetTestDriver7.size();
        boolean boolean14 = hashSetTestDriver7.isEmpty();
        int int15 = hashSetTestDriver7.size();
        experiment.util.Iterator iterator16 = hashSetTestDriver7.iterator();
        boolean boolean17 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1191369007_1024_0.test064");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) "hi!");
        java.lang.Object obj4 = hashSetTestDriver0.getMatch((java.lang.Object) (-1.0f));
        int int5 = hashSetTestDriver0.size();
        java.lang.Object[] objArray6 = hashSetTestDriver0.toArray();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) (short) 0);
        boolean boolean9 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

}
