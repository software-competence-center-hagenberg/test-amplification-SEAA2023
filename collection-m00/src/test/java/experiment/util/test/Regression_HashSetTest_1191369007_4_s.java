package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashSetTest_1191369007_4_s {

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

}
