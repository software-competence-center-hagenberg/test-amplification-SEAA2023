package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashSetTest_1321793073_32_s {

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
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test001");
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
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test002");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj6 = hashSetTestDriver4.getMatch((java.lang.Object) 'a');
        java.lang.Object obj8 = hashSetTestDriver4.getMatch((java.lang.Object) "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = hashSetTestDriver0.getMatch(obj8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test003");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (-1.0f));
        hashSetTestDriver0.clear();
        java.lang.Class<?> wildcardClass4 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test004");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) (byte) 100);
        int int3 = hashSetTestDriver0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test005");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass3 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test006");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean7 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        boolean boolean8 = hashSetTestDriver0.isEmpty();
        boolean boolean9 = hashSetTestDriver0.isEmpty();
        int int10 = hashSetTestDriver0.size();
        java.lang.Object obj11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = hashSetTestDriver0.remove(obj11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test007");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        boolean boolean8 = hashSetTestDriver0.equals_CUT((java.lang.Object) (-1.0f));
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj11 = hashSetTestDriver9.getMatch((java.lang.Object) 'a');
        experiment.util.Iterator iterator12 = hashSetTestDriver9.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj15 = hashSetTestDriver13.getMatch((java.lang.Object) 'a');
        int int16 = hashSetTestDriver13.size();
        experiment.util.HashSetTestDriver hashSetTestDriver17 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj19 = hashSetTestDriver17.getMatch((java.lang.Object) 'a');
        int int20 = hashSetTestDriver17.size();
        java.lang.Object obj21 = hashSetTestDriver13.getMatch((java.lang.Object) int20);
        experiment.util.Iterator iterator22 = hashSetTestDriver13.iterator();
        java.lang.Object obj23 = hashSetTestDriver9.getMatch((java.lang.Object) iterator22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = hashSetTestDriver0.equals_CUT(obj23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test008");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj8 = hashSetTestDriver6.getMatch((java.lang.Object) 'a');
        java.lang.Object obj9 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = obj9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test009");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        boolean boolean5 = hashSetTestDriver0.remove((java.lang.Object) (short) 10);
        java.lang.Object obj6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = hashSetTestDriver0.contains(obj6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test010");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        boolean boolean8 = hashSetTestDriver6.contains((java.lang.Object) (byte) 100);
        boolean boolean9 = hashSetTestDriver0.add((java.lang.Object) boolean8);
        int int10 = hashSetTestDriver0.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test011");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        int int7 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        java.lang.Object obj10 = hashSetTestDriver0.getMatch((java.lang.Object) 10);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test012");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        boolean boolean5 = hashSetTestDriver0.remove((java.lang.Object) (short) 10);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj9 = hashSetTestDriver7.getMatch((java.lang.Object) 'a');
        boolean boolean10 = hashSetTestDriver7.isEmpty();
        boolean boolean12 = hashSetTestDriver7.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj15 = hashSetTestDriver13.getMatch((java.lang.Object) 'a');
        java.lang.Object obj16 = hashSetTestDriver7.getMatch((java.lang.Object) hashSetTestDriver13);
        java.lang.Object obj17 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj20 = hashSetTestDriver18.getMatch((java.lang.Object) 'a');
        int int21 = hashSetTestDriver18.size();
        boolean boolean22 = hashSetTestDriver18.isEmpty();
        boolean boolean23 = hashSetTestDriver7.equals_CUT((java.lang.Object) hashSetTestDriver18);
        java.lang.Class<?> wildcardClass24 = hashSetTestDriver7.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test013");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (-1.0f));
        boolean boolean4 = hashSetTestDriver0.contains((java.lang.Object) 1);
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = hashSetTestDriver0.getMatch(obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test014");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) '#');
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        java.lang.Class<?> wildcardClass6 = iterator5.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test015");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean7 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        boolean boolean8 = hashSetTestDriver0.isEmpty();
        boolean boolean9 = hashSetTestDriver0.isEmpty();
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj13 = hashSetTestDriver11.getMatch((java.lang.Object) 'a');
        boolean boolean14 = hashSetTestDriver11.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj17 = hashSetTestDriver15.getMatch((java.lang.Object) 'a');
        experiment.util.Iterator iterator18 = hashSetTestDriver15.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj21 = hashSetTestDriver19.getMatch((java.lang.Object) 'a');
        int int22 = hashSetTestDriver19.size();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj25 = hashSetTestDriver23.getMatch((java.lang.Object) 'a');
        int int26 = hashSetTestDriver23.size();
        java.lang.Object obj27 = hashSetTestDriver19.getMatch((java.lang.Object) int26);
        experiment.util.Iterator iterator28 = hashSetTestDriver19.iterator();
        java.lang.Object obj29 = hashSetTestDriver15.getMatch((java.lang.Object) iterator28);
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj32 = hashSetTestDriver30.getMatch((java.lang.Object) 'a');
        int int33 = hashSetTestDriver30.size();
        boolean boolean34 = hashSetTestDriver15.add((java.lang.Object) int33);
        java.lang.Object obj35 = hashSetTestDriver11.getMatch((java.lang.Object) boolean34);
        boolean boolean36 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver11);
        java.lang.Class<?> wildcardClass37 = hashSetTestDriver11.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test016");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        boolean boolean5 = hashSetTestDriver0.remove((java.lang.Object) (short) 10);
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray7 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass8 = objArray7.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test017");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        boolean boolean5 = hashSetTestDriver0.remove((java.lang.Object) (short) 10);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj9 = hashSetTestDriver7.getMatch((java.lang.Object) 'a');
        boolean boolean10 = hashSetTestDriver7.isEmpty();
        boolean boolean12 = hashSetTestDriver7.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj15 = hashSetTestDriver13.getMatch((java.lang.Object) 'a');
        java.lang.Object obj16 = hashSetTestDriver7.getMatch((java.lang.Object) hashSetTestDriver13);
        java.lang.Object obj17 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj20 = hashSetTestDriver18.getMatch((java.lang.Object) 'a');
        boolean boolean21 = hashSetTestDriver18.isEmpty();
        boolean boolean23 = hashSetTestDriver18.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean25 = hashSetTestDriver18.add((java.lang.Object) 10.0d);
        boolean boolean26 = hashSetTestDriver18.isEmpty();
        boolean boolean27 = hashSetTestDriver18.isEmpty();
        java.lang.Class<?> wildcardClass28 = hashSetTestDriver18.getClass();
        boolean boolean29 = hashSetTestDriver0.contains((java.lang.Object) wildcardClass28);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test018");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        boolean boolean8 = hashSetTestDriver0.contains((java.lang.Object) (byte) 10);
        experiment.util.HashSetTestDriver hashSetTestDriver9 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj11 = hashSetTestDriver9.getMatch((java.lang.Object) 'a');
        int int12 = hashSetTestDriver9.size();
        boolean boolean14 = hashSetTestDriver9.remove((java.lang.Object) (short) 10);
        hashSetTestDriver9.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj18 = hashSetTestDriver16.getMatch((java.lang.Object) 'a');
        boolean boolean19 = hashSetTestDriver16.isEmpty();
        boolean boolean21 = hashSetTestDriver16.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj24 = hashSetTestDriver22.getMatch((java.lang.Object) 'a');
        java.lang.Object obj25 = hashSetTestDriver16.getMatch((java.lang.Object) hashSetTestDriver22);
        java.lang.Object obj26 = hashSetTestDriver9.getMatch((java.lang.Object) hashSetTestDriver16);
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj29 = hashSetTestDriver27.getMatch((java.lang.Object) 'a');
        int int30 = hashSetTestDriver27.size();
        boolean boolean32 = hashSetTestDriver27.remove((java.lang.Object) (short) 10);
        hashSetTestDriver27.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj36 = hashSetTestDriver34.getMatch((java.lang.Object) 'a');
        boolean boolean37 = hashSetTestDriver34.isEmpty();
        boolean boolean39 = hashSetTestDriver34.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj42 = hashSetTestDriver40.getMatch((java.lang.Object) 'a');
        java.lang.Object obj43 = hashSetTestDriver34.getMatch((java.lang.Object) hashSetTestDriver40);
        java.lang.Object obj44 = hashSetTestDriver27.getMatch((java.lang.Object) hashSetTestDriver34);
        java.lang.Object obj45 = hashSetTestDriver16.getMatch((java.lang.Object) hashSetTestDriver27);
        boolean boolean46 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver27);
        hashSetTestDriver27.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test019");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean7 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        boolean boolean8 = hashSetTestDriver0.isEmpty();
        boolean boolean9 = hashSetTestDriver0.isEmpty();
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj13 = hashSetTestDriver11.getMatch((java.lang.Object) 'a');
        boolean boolean14 = hashSetTestDriver11.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj17 = hashSetTestDriver15.getMatch((java.lang.Object) 'a');
        experiment.util.Iterator iterator18 = hashSetTestDriver15.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj21 = hashSetTestDriver19.getMatch((java.lang.Object) 'a');
        int int22 = hashSetTestDriver19.size();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj25 = hashSetTestDriver23.getMatch((java.lang.Object) 'a');
        int int26 = hashSetTestDriver23.size();
        java.lang.Object obj27 = hashSetTestDriver19.getMatch((java.lang.Object) int26);
        experiment.util.Iterator iterator28 = hashSetTestDriver19.iterator();
        java.lang.Object obj29 = hashSetTestDriver15.getMatch((java.lang.Object) iterator28);
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj32 = hashSetTestDriver30.getMatch((java.lang.Object) 'a');
        int int33 = hashSetTestDriver30.size();
        boolean boolean34 = hashSetTestDriver15.add((java.lang.Object) int33);
        java.lang.Object obj35 = hashSetTestDriver11.getMatch((java.lang.Object) boolean34);
        boolean boolean36 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver11);
        int int37 = hashSetTestDriver11.size();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test020");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean4 = hashSetTestDriver0.equals_CUT((java.lang.Object) '#');
        experiment.util.Iterator iterator5 = hashSetTestDriver0.iterator();
        experiment.util.Iterator iterator6 = hashSetTestDriver0.iterator();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test021");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean7 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        boolean boolean8 = hashSetTestDriver0.isEmpty();
        boolean boolean9 = hashSetTestDriver0.isEmpty();
        int int10 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj13 = hashSetTestDriver11.getMatch((java.lang.Object) 'a');
        boolean boolean14 = hashSetTestDriver11.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj17 = hashSetTestDriver15.getMatch((java.lang.Object) 'a');
        experiment.util.Iterator iterator18 = hashSetTestDriver15.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj21 = hashSetTestDriver19.getMatch((java.lang.Object) 'a');
        int int22 = hashSetTestDriver19.size();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj25 = hashSetTestDriver23.getMatch((java.lang.Object) 'a');
        int int26 = hashSetTestDriver23.size();
        java.lang.Object obj27 = hashSetTestDriver19.getMatch((java.lang.Object) int26);
        experiment.util.Iterator iterator28 = hashSetTestDriver19.iterator();
        java.lang.Object obj29 = hashSetTestDriver15.getMatch((java.lang.Object) iterator28);
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj32 = hashSetTestDriver30.getMatch((java.lang.Object) 'a');
        int int33 = hashSetTestDriver30.size();
        boolean boolean34 = hashSetTestDriver15.add((java.lang.Object) int33);
        java.lang.Object obj35 = hashSetTestDriver11.getMatch((java.lang.Object) boolean34);
        boolean boolean36 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver11);
        boolean boolean37 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test022");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean7 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        boolean boolean8 = hashSetTestDriver0.isEmpty();
        java.lang.Object[] objArray9 = hashSetTestDriver0.toArray();
        int int10 = hashSetTestDriver0.size();
        java.lang.Class<?> wildcardClass11 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[10.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test023");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        java.lang.Class<?> wildcardClass5 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test024");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean7 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        boolean boolean8 = hashSetTestDriver0.isEmpty();
        boolean boolean9 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        boolean boolean12 = hashSetTestDriver0.add((java.lang.Object) 1.0d);
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = hashSetTestDriver0.add(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test025");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean4 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj7 = hashSetTestDriver5.getMatch((java.lang.Object) 'a');
        boolean boolean8 = hashSetTestDriver5.isEmpty();
        boolean boolean10 = hashSetTestDriver5.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj13 = hashSetTestDriver11.getMatch((java.lang.Object) 'a');
        java.lang.Object obj14 = hashSetTestDriver5.getMatch((java.lang.Object) hashSetTestDriver11);
        boolean boolean15 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver5);
        hashSetTestDriver5.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test026");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        boolean boolean5 = hashSetTestDriver0.remove((java.lang.Object) (short) 10);
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray7 = hashSetTestDriver0.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj10 = hashSetTestDriver8.getMatch((java.lang.Object) 'a');
        boolean boolean11 = hashSetTestDriver8.isEmpty();
        boolean boolean13 = hashSetTestDriver8.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean15 = hashSetTestDriver8.add((java.lang.Object) 10.0d);
        boolean boolean16 = hashSetTestDriver8.isEmpty();
        int int17 = hashSetTestDriver8.size();
        hashSetTestDriver8.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj21 = hashSetTestDriver19.getMatch((java.lang.Object) 'a');
        boolean boolean22 = hashSetTestDriver19.isEmpty();
        boolean boolean24 = hashSetTestDriver19.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean26 = hashSetTestDriver19.add((java.lang.Object) 10.0d);
        boolean boolean27 = hashSetTestDriver19.isEmpty();
        int int28 = hashSetTestDriver19.size();
        boolean boolean29 = hashSetTestDriver8.equals_CUT((java.lang.Object) hashSetTestDriver19);
        boolean boolean30 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver19);
        java.lang.Class<?> wildcardClass31 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test027");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        boolean boolean5 = hashSetTestDriver0.remove((java.lang.Object) (short) 10);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj9 = hashSetTestDriver7.getMatch((java.lang.Object) 'a');
        boolean boolean10 = hashSetTestDriver7.isEmpty();
        boolean boolean12 = hashSetTestDriver7.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj15 = hashSetTestDriver13.getMatch((java.lang.Object) 'a');
        java.lang.Object obj16 = hashSetTestDriver7.getMatch((java.lang.Object) hashSetTestDriver13);
        java.lang.Object obj17 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver7);
        hashSetTestDriver7.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj21 = hashSetTestDriver19.getMatch((java.lang.Object) 'a');
        experiment.util.Iterator iterator22 = hashSetTestDriver19.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj25 = hashSetTestDriver23.getMatch((java.lang.Object) 'a');
        int int26 = hashSetTestDriver23.size();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj29 = hashSetTestDriver27.getMatch((java.lang.Object) 'a');
        int int30 = hashSetTestDriver27.size();
        java.lang.Object obj31 = hashSetTestDriver23.getMatch((java.lang.Object) int30);
        experiment.util.Iterator iterator32 = hashSetTestDriver23.iterator();
        java.lang.Object obj33 = hashSetTestDriver19.getMatch((java.lang.Object) iterator32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = hashSetTestDriver7.equals_CUT(obj33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test028");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        boolean boolean5 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test029");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        boolean boolean5 = hashSetTestDriver0.remove((java.lang.Object) (short) 10);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj9 = hashSetTestDriver7.getMatch((java.lang.Object) 'a');
        boolean boolean10 = hashSetTestDriver7.isEmpty();
        boolean boolean12 = hashSetTestDriver7.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj15 = hashSetTestDriver13.getMatch((java.lang.Object) 'a');
        java.lang.Object obj16 = hashSetTestDriver7.getMatch((java.lang.Object) hashSetTestDriver13);
        java.lang.Object obj17 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj20 = hashSetTestDriver18.getMatch((java.lang.Object) 'a');
        int int21 = hashSetTestDriver18.size();
        boolean boolean22 = hashSetTestDriver18.isEmpty();
        boolean boolean23 = hashSetTestDriver7.equals_CUT((java.lang.Object) hashSetTestDriver18);
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj26 = hashSetTestDriver24.getMatch((java.lang.Object) 'a');
        int int27 = hashSetTestDriver24.size();
        boolean boolean29 = hashSetTestDriver24.remove((java.lang.Object) (short) 10);
        hashSetTestDriver24.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj33 = hashSetTestDriver31.getMatch((java.lang.Object) 'a');
        boolean boolean34 = hashSetTestDriver31.isEmpty();
        boolean boolean36 = hashSetTestDriver31.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj39 = hashSetTestDriver37.getMatch((java.lang.Object) 'a');
        java.lang.Object obj40 = hashSetTestDriver31.getMatch((java.lang.Object) hashSetTestDriver37);
        java.lang.Object obj41 = hashSetTestDriver24.getMatch((java.lang.Object) hashSetTestDriver31);
        experiment.util.HashSetTestDriver hashSetTestDriver42 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj44 = hashSetTestDriver42.getMatch((java.lang.Object) 'a');
        int int45 = hashSetTestDriver42.size();
        boolean boolean47 = hashSetTestDriver42.remove((java.lang.Object) (short) 10);
        hashSetTestDriver42.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver49 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj51 = hashSetTestDriver49.getMatch((java.lang.Object) 'a');
        boolean boolean52 = hashSetTestDriver49.isEmpty();
        boolean boolean54 = hashSetTestDriver49.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver55 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj57 = hashSetTestDriver55.getMatch((java.lang.Object) 'a');
        java.lang.Object obj58 = hashSetTestDriver49.getMatch((java.lang.Object) hashSetTestDriver55);
        java.lang.Object obj59 = hashSetTestDriver42.getMatch((java.lang.Object) hashSetTestDriver49);
        java.lang.Object obj60 = hashSetTestDriver31.getMatch((java.lang.Object) hashSetTestDriver42);
        java.lang.Object obj61 = hashSetTestDriver18.getMatch((java.lang.Object) hashSetTestDriver42);
        hashSetTestDriver18.clear();
        java.lang.Object[] objArray63 = hashSetTestDriver18.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver64 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj66 = hashSetTestDriver64.getMatch((java.lang.Object) 'a');
        boolean boolean67 = hashSetTestDriver64.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver68 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj70 = hashSetTestDriver68.getMatch((java.lang.Object) 'a');
        int int71 = hashSetTestDriver68.size();
        boolean boolean73 = hashSetTestDriver68.remove((java.lang.Object) (short) 10);
        hashSetTestDriver68.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver75 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj77 = hashSetTestDriver75.getMatch((java.lang.Object) 'a');
        boolean boolean78 = hashSetTestDriver75.isEmpty();
        boolean boolean80 = hashSetTestDriver75.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver81 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj83 = hashSetTestDriver81.getMatch((java.lang.Object) 'a');
        java.lang.Object obj84 = hashSetTestDriver75.getMatch((java.lang.Object) hashSetTestDriver81);
        java.lang.Object obj85 = hashSetTestDriver68.getMatch((java.lang.Object) hashSetTestDriver75);
        experiment.util.HashSetTestDriver hashSetTestDriver86 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj88 = hashSetTestDriver86.getMatch((java.lang.Object) 'a');
        int int89 = hashSetTestDriver86.size();
        boolean boolean90 = hashSetTestDriver86.isEmpty();
        boolean boolean91 = hashSetTestDriver75.equals_CUT((java.lang.Object) hashSetTestDriver86);
        boolean boolean92 = hashSetTestDriver64.equals_CUT((java.lang.Object) hashSetTestDriver86);
        java.lang.Object obj93 = hashSetTestDriver18.getMatch((java.lang.Object) hashSetTestDriver86);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNull(obj93);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test030");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        boolean boolean5 = hashSetTestDriver0.remove((java.lang.Object) (short) 10);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj9 = hashSetTestDriver7.getMatch((java.lang.Object) 'a');
        boolean boolean10 = hashSetTestDriver7.isEmpty();
        boolean boolean12 = hashSetTestDriver7.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj15 = hashSetTestDriver13.getMatch((java.lang.Object) 'a');
        java.lang.Object obj16 = hashSetTestDriver7.getMatch((java.lang.Object) hashSetTestDriver13);
        java.lang.Object obj17 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver7);
        hashSetTestDriver7.clear();
        experiment.util.Iterator iterator19 = hashSetTestDriver7.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj22 = hashSetTestDriver20.getMatch((java.lang.Object) 'a');
        int int23 = hashSetTestDriver20.size();
        boolean boolean25 = hashSetTestDriver20.remove((java.lang.Object) (short) 10);
        hashSetTestDriver20.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver27 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj29 = hashSetTestDriver27.getMatch((java.lang.Object) 'a');
        boolean boolean30 = hashSetTestDriver27.isEmpty();
        boolean boolean32 = hashSetTestDriver27.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver33 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj35 = hashSetTestDriver33.getMatch((java.lang.Object) 'a');
        java.lang.Object obj36 = hashSetTestDriver27.getMatch((java.lang.Object) hashSetTestDriver33);
        java.lang.Object obj37 = hashSetTestDriver20.getMatch((java.lang.Object) hashSetTestDriver27);
        hashSetTestDriver27.clear();
        experiment.util.Iterator iterator39 = hashSetTestDriver27.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver40 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj42 = hashSetTestDriver40.getMatch((java.lang.Object) 'a');
        int int43 = hashSetTestDriver40.size();
        boolean boolean45 = hashSetTestDriver40.remove((java.lang.Object) (short) 10);
        hashSetTestDriver40.clear();
        experiment.util.Iterator iterator47 = hashSetTestDriver40.iterator();
        boolean boolean48 = hashSetTestDriver27.contains((java.lang.Object) iterator47);
        boolean boolean49 = hashSetTestDriver7.equals_CUT((java.lang.Object) iterator47);
        experiment.util.HashSetTestDriver hashSetTestDriver50 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj52 = hashSetTestDriver50.getMatch((java.lang.Object) 'a');
        boolean boolean53 = hashSetTestDriver50.isEmpty();
        boolean boolean54 = hashSetTestDriver7.remove((java.lang.Object) boolean53);
        java.lang.Class<?> wildcardClass55 = hashSetTestDriver7.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(iterator47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test031");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean6 = hashSetTestDriver0.isEmpty();
        int int7 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj10 = hashSetTestDriver8.getMatch((java.lang.Object) 'a');
        boolean boolean11 = hashSetTestDriver8.isEmpty();
        boolean boolean13 = hashSetTestDriver8.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver14 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj16 = hashSetTestDriver14.getMatch((java.lang.Object) 'a');
        java.lang.Object obj17 = hashSetTestDriver8.getMatch((java.lang.Object) hashSetTestDriver14);
        java.lang.Class<?> wildcardClass18 = hashSetTestDriver14.getClass();
        boolean boolean19 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver14);
        experiment.util.HashSetTestDriver hashSetTestDriver20 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj22 = hashSetTestDriver20.getMatch((java.lang.Object) 'a');
        boolean boolean24 = hashSetTestDriver20.equals_CUT((java.lang.Object) '#');
        boolean boolean25 = hashSetTestDriver14.add((java.lang.Object) '#');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test032");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        boolean boolean5 = hashSetTestDriver0.remove((java.lang.Object) (short) 10);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj9 = hashSetTestDriver7.getMatch((java.lang.Object) 'a');
        boolean boolean10 = hashSetTestDriver7.isEmpty();
        boolean boolean12 = hashSetTestDriver7.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver13 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj15 = hashSetTestDriver13.getMatch((java.lang.Object) 'a');
        java.lang.Object obj16 = hashSetTestDriver7.getMatch((java.lang.Object) hashSetTestDriver13);
        java.lang.Object obj17 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj20 = hashSetTestDriver18.getMatch((java.lang.Object) 'a');
        int int21 = hashSetTestDriver18.size();
        boolean boolean22 = hashSetTestDriver18.isEmpty();
        boolean boolean23 = hashSetTestDriver7.equals_CUT((java.lang.Object) hashSetTestDriver18);
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj26 = hashSetTestDriver24.getMatch((java.lang.Object) 'a');
        int int27 = hashSetTestDriver24.size();
        boolean boolean29 = hashSetTestDriver24.remove((java.lang.Object) (short) 10);
        hashSetTestDriver24.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj33 = hashSetTestDriver31.getMatch((java.lang.Object) 'a');
        boolean boolean34 = hashSetTestDriver31.isEmpty();
        boolean boolean36 = hashSetTestDriver31.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj39 = hashSetTestDriver37.getMatch((java.lang.Object) 'a');
        java.lang.Object obj40 = hashSetTestDriver31.getMatch((java.lang.Object) hashSetTestDriver37);
        java.lang.Object obj41 = hashSetTestDriver24.getMatch((java.lang.Object) hashSetTestDriver31);
        experiment.util.HashSetTestDriver hashSetTestDriver42 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj44 = hashSetTestDriver42.getMatch((java.lang.Object) 'a');
        int int45 = hashSetTestDriver42.size();
        boolean boolean47 = hashSetTestDriver42.remove((java.lang.Object) (short) 10);
        hashSetTestDriver42.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver49 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj51 = hashSetTestDriver49.getMatch((java.lang.Object) 'a');
        boolean boolean52 = hashSetTestDriver49.isEmpty();
        boolean boolean54 = hashSetTestDriver49.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver55 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj57 = hashSetTestDriver55.getMatch((java.lang.Object) 'a');
        java.lang.Object obj58 = hashSetTestDriver49.getMatch((java.lang.Object) hashSetTestDriver55);
        java.lang.Object obj59 = hashSetTestDriver42.getMatch((java.lang.Object) hashSetTestDriver49);
        java.lang.Object obj60 = hashSetTestDriver31.getMatch((java.lang.Object) hashSetTestDriver42);
        java.lang.Object obj61 = hashSetTestDriver18.getMatch((java.lang.Object) hashSetTestDriver42);
        hashSetTestDriver18.clear();
        java.lang.Class<?> wildcardClass63 = hashSetTestDriver18.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

}
