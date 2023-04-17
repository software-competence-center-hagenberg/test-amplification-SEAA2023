package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashSetTest_379375655_8_s {

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
            System.out.format("%n%s%n", "Regression_HashSetTest_379375655_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_HashSetTest_379375655_1024_0.test002");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = hashSetTestDriver0.remove(obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_379375655_1024_0.test003");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray2 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver3.clear();
        java.lang.Object[] objArray5 = hashSetTestDriver3.toArray();
        boolean boolean6 = hashSetTestDriver0.remove((java.lang.Object) objArray5);
        java.lang.Class<?> wildcardClass7 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_379375655_1024_0.test004");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray2 = hashSetTestDriver0.toArray();
        java.lang.Object[] objArray3 = hashSetTestDriver0.toArray();
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver5.clear();
        java.lang.Object[] objArray7 = hashSetTestDriver5.toArray();
        java.lang.Object[] objArray8 = hashSetTestDriver5.toArray();
        experiment.util.Iterator iterator9 = hashSetTestDriver5.iterator();
        boolean boolean10 = hashSetTestDriver0.remove((java.lang.Object) iterator9);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver12 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver12.clear();
        java.lang.Object[] objArray14 = hashSetTestDriver12.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver15.clear();
        java.lang.Object[] objArray17 = hashSetTestDriver15.toArray();
        boolean boolean18 = hashSetTestDriver12.add((java.lang.Object) objArray17);
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver19.clear();
        java.lang.Object[] objArray21 = hashSetTestDriver19.toArray();
        java.lang.Object[] objArray22 = hashSetTestDriver19.toArray();
        java.lang.Object[] objArray23 = hashSetTestDriver19.toArray();
        java.lang.Object obj24 = hashSetTestDriver12.getMatch((java.lang.Object) objArray23);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = hashSetTestDriver0.equals_CUT(obj24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_379375655_1024_0.test005");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray2 = hashSetTestDriver0.toArray();
        java.lang.Object[] objArray3 = hashSetTestDriver0.toArray();
        int int4 = hashSetTestDriver0.size();
        int int5 = hashSetTestDriver0.size();
        boolean boolean7 = hashSetTestDriver0.equals_CUT((java.lang.Object) (-1.0f));
        boolean boolean9 = hashSetTestDriver0.remove((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass10 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_379375655_1024_0.test006");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray2 = hashSetTestDriver0.toArray();
        java.lang.Object[] objArray3 = hashSetTestDriver0.toArray();
        int int4 = hashSetTestDriver0.size();
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver6.clear();
        java.lang.Object[] objArray8 = hashSetTestDriver6.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver9.clear();
        java.lang.Object[] objArray11 = hashSetTestDriver9.toArray();
        boolean boolean12 = hashSetTestDriver6.add((java.lang.Object) objArray11);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver13.clear();
        java.lang.Object[] objArray15 = hashSetTestDriver13.toArray();
        java.lang.Object[] objArray16 = hashSetTestDriver13.toArray();
        java.lang.Object[] objArray17 = hashSetTestDriver13.toArray();
        java.lang.Object obj18 = hashSetTestDriver6.getMatch((java.lang.Object) objArray17);
        experiment.util.Iterator iterator19 = hashSetTestDriver6.iterator();
        boolean boolean20 = hashSetTestDriver0.equals_CUT((java.lang.Object) iterator19);
        java.lang.Class<?> wildcardClass21 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_379375655_1024_0.test007");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray2 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver3 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver3.clear();
        java.lang.Object[] objArray5 = hashSetTestDriver3.toArray();
        boolean boolean6 = hashSetTestDriver0.remove((java.lang.Object) objArray5);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver8.clear();
        java.lang.Object[] objArray10 = hashSetTestDriver8.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver11.clear();
        java.lang.Object[] objArray13 = hashSetTestDriver11.toArray();
        boolean boolean14 = hashSetTestDriver8.add((java.lang.Object) objArray13);
        boolean boolean15 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver8);
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver16.clear();
        java.lang.Object[] objArray18 = hashSetTestDriver16.toArray();
        java.lang.Object[] objArray19 = hashSetTestDriver16.toArray();
        int int20 = hashSetTestDriver16.size();
        experiment.util.Iterator iterator21 = hashSetTestDriver16.iterator();
        boolean boolean22 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver16);
        experiment.util.Iterator iterator23 = hashSetTestDriver16.iterator();
        hashSetTestDriver16.clear();
        java.lang.Class<?> wildcardClass25 = hashSetTestDriver16.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_379375655_1024_0.test008");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray2 = hashSetTestDriver0.toArray();
        java.lang.Object[] objArray3 = hashSetTestDriver0.toArray();
        java.lang.Object[] objArray4 = hashSetTestDriver0.toArray();
        hashSetTestDriver0.clear();
        boolean boolean7 = hashSetTestDriver0.equals_CUT((java.lang.Object) 0L);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

}
