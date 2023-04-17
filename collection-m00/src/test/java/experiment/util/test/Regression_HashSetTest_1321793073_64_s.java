package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_HashSetTest_1321793073_64_s {

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

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test033");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj6 = hashSetTestDriver4.getMatch((java.lang.Object) 'a');
        int int7 = hashSetTestDriver4.size();
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) int7);
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
        boolean boolean27 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver9);
        boolean boolean29 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 10);
        boolean boolean30 = hashSetTestDriver0.isEmpty();
        boolean boolean31 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver32 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj34 = hashSetTestDriver32.getMatch((java.lang.Object) 'a');
        int int35 = hashSetTestDriver32.size();
        experiment.util.HashSetTestDriver hashSetTestDriver36 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj38 = hashSetTestDriver36.getMatch((java.lang.Object) 'a');
        int int39 = hashSetTestDriver36.size();
        boolean boolean40 = hashSetTestDriver32.remove((java.lang.Object) int39);
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj43 = hashSetTestDriver41.getMatch((java.lang.Object) 'a');
        int int44 = hashSetTestDriver41.size();
        boolean boolean46 = hashSetTestDriver41.remove((java.lang.Object) (short) 10);
        hashSetTestDriver41.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver48 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj50 = hashSetTestDriver48.getMatch((java.lang.Object) 'a');
        boolean boolean51 = hashSetTestDriver48.isEmpty();
        boolean boolean53 = hashSetTestDriver48.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver54 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj56 = hashSetTestDriver54.getMatch((java.lang.Object) 'a');
        java.lang.Object obj57 = hashSetTestDriver48.getMatch((java.lang.Object) hashSetTestDriver54);
        java.lang.Object obj58 = hashSetTestDriver41.getMatch((java.lang.Object) hashSetTestDriver48);
        boolean boolean59 = hashSetTestDriver32.remove((java.lang.Object) hashSetTestDriver41);
        int int60 = hashSetTestDriver41.size();
        java.lang.Object[] objArray61 = hashSetTestDriver41.toArray();
        java.lang.Class<?> wildcardClass62 = hashSetTestDriver41.getClass();
        boolean boolean63 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver41);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test034");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.remove((java.lang.Object) (-1.0f));
        java.lang.Class<?> wildcardClass3 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test035");
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
        experiment.util.Iterator iterator24 = hashSetTestDriver18.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj27 = hashSetTestDriver25.getMatch((java.lang.Object) 'a');
        experiment.util.Iterator iterator28 = hashSetTestDriver25.iterator();
        boolean boolean29 = hashSetTestDriver18.add((java.lang.Object) hashSetTestDriver25);
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj32 = hashSetTestDriver30.getMatch((java.lang.Object) 'a');
        int int33 = hashSetTestDriver30.size();
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj36 = hashSetTestDriver34.getMatch((java.lang.Object) 'a');
        int int37 = hashSetTestDriver34.size();
        boolean boolean38 = hashSetTestDriver30.remove((java.lang.Object) int37);
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj41 = hashSetTestDriver39.getMatch((java.lang.Object) 'a');
        int int42 = hashSetTestDriver39.size();
        boolean boolean44 = hashSetTestDriver39.remove((java.lang.Object) (short) 10);
        hashSetTestDriver39.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver46 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj48 = hashSetTestDriver46.getMatch((java.lang.Object) 'a');
        boolean boolean49 = hashSetTestDriver46.isEmpty();
        boolean boolean51 = hashSetTestDriver46.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver52 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj54 = hashSetTestDriver52.getMatch((java.lang.Object) 'a');
        java.lang.Object obj55 = hashSetTestDriver46.getMatch((java.lang.Object) hashSetTestDriver52);
        java.lang.Object obj56 = hashSetTestDriver39.getMatch((java.lang.Object) hashSetTestDriver46);
        boolean boolean57 = hashSetTestDriver30.remove((java.lang.Object) hashSetTestDriver39);
        int int58 = hashSetTestDriver39.size();
        java.lang.Object[] objArray59 = hashSetTestDriver39.toArray();
        java.lang.Class<?> wildcardClass60 = hashSetTestDriver39.getClass();
        boolean boolean61 = hashSetTestDriver18.contains((java.lang.Object) hashSetTestDriver39);
        experiment.util.HashSetTestDriver hashSetTestDriver62 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj64 = hashSetTestDriver62.getMatch((java.lang.Object) 'a');
        boolean boolean65 = hashSetTestDriver62.isEmpty();
        boolean boolean67 = hashSetTestDriver62.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean69 = hashSetTestDriver62.add((java.lang.Object) 10.0d);
        boolean boolean70 = hashSetTestDriver62.isEmpty();
        boolean boolean71 = hashSetTestDriver62.isEmpty();
        boolean boolean72 = hashSetTestDriver62.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver73 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj75 = hashSetTestDriver73.getMatch((java.lang.Object) 'a');
        boolean boolean76 = hashSetTestDriver73.isEmpty();
        hashSetTestDriver73.clear();
        hashSetTestDriver73.clear();
        boolean boolean79 = hashSetTestDriver62.equals_CUT((java.lang.Object) hashSetTestDriver73);
        boolean boolean80 = hashSetTestDriver18.add((java.lang.Object) hashSetTestDriver62);
        boolean boolean82 = hashSetTestDriver62.equals_CUT((java.lang.Object) 0L);
        boolean boolean84 = hashSetTestDriver62.equals_CUT((java.lang.Object) 100.0f);
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
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertNotNull(wildcardClass60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test036");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver1 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj3 = hashSetTestDriver1.getMatch((java.lang.Object) 'a');
        int int4 = hashSetTestDriver1.size();
        boolean boolean5 = hashSetTestDriver1.isEmpty();
        boolean boolean6 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver1);
        hashSetTestDriver0.clear();
        java.lang.Class<?> wildcardClass8 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test037");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj8 = hashSetTestDriver6.getMatch((java.lang.Object) 'a');
        boolean boolean9 = hashSetTestDriver6.isEmpty();
        boolean boolean11 = hashSetTestDriver6.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean13 = hashSetTestDriver6.add((java.lang.Object) 10.0d);
        boolean boolean14 = hashSetTestDriver6.isEmpty();
        int int15 = hashSetTestDriver6.size();
        hashSetTestDriver6.clear();
        java.lang.Object obj17 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver6);
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        experiment.util.HashSetTestDriver hashSetTestDriver19 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj21 = hashSetTestDriver19.getMatch((java.lang.Object) 'a');
        boolean boolean22 = hashSetTestDriver19.isEmpty();
        boolean boolean24 = hashSetTestDriver19.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean26 = hashSetTestDriver19.add((java.lang.Object) 10.0d);
        boolean boolean27 = hashSetTestDriver19.isEmpty();
        int int28 = hashSetTestDriver19.size();
        java.lang.Class<?> wildcardClass29 = hashSetTestDriver19.getClass();
        boolean boolean30 = hashSetTestDriver18.contains((java.lang.Object) hashSetTestDriver19);
        boolean boolean31 = hashSetTestDriver0.contains((java.lang.Object) boolean30);
        java.lang.Class<?> wildcardClass32 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test038");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj6 = hashSetTestDriver4.getMatch((java.lang.Object) 'a');
        int int7 = hashSetTestDriver4.size();
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) int7);
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
        boolean boolean27 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver9);
        boolean boolean28 = hashSetTestDriver9.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj31 = hashSetTestDriver29.getMatch((java.lang.Object) 'a');
        boolean boolean32 = hashSetTestDriver29.isEmpty();
        boolean boolean34 = hashSetTestDriver29.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator35 = hashSetTestDriver29.iterator();
        boolean boolean36 = hashSetTestDriver9.contains((java.lang.Object) iterator35);
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj39 = hashSetTestDriver37.getMatch((java.lang.Object) 'a');
        boolean boolean40 = hashSetTestDriver37.isEmpty();
        boolean boolean42 = hashSetTestDriver37.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean44 = hashSetTestDriver37.add((java.lang.Object) 10.0d);
        boolean boolean45 = hashSetTestDriver37.isEmpty();
        java.lang.Object[] objArray46 = hashSetTestDriver37.toArray();
        int int47 = hashSetTestDriver37.size();
        experiment.util.HashSetTestDriver hashSetTestDriver48 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj50 = hashSetTestDriver48.getMatch((java.lang.Object) 'a');
        int int51 = hashSetTestDriver48.size();
        experiment.util.HashSetTestDriver hashSetTestDriver52 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj54 = hashSetTestDriver52.getMatch((java.lang.Object) 'a');
        int int55 = hashSetTestDriver52.size();
        boolean boolean56 = hashSetTestDriver48.remove((java.lang.Object) int55);
        experiment.util.HashSetTestDriver hashSetTestDriver57 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj59 = hashSetTestDriver57.getMatch((java.lang.Object) 'a');
        int int60 = hashSetTestDriver57.size();
        boolean boolean62 = hashSetTestDriver57.remove((java.lang.Object) (short) 10);
        hashSetTestDriver57.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver64 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj66 = hashSetTestDriver64.getMatch((java.lang.Object) 'a');
        boolean boolean67 = hashSetTestDriver64.isEmpty();
        boolean boolean69 = hashSetTestDriver64.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver70 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj72 = hashSetTestDriver70.getMatch((java.lang.Object) 'a');
        java.lang.Object obj73 = hashSetTestDriver64.getMatch((java.lang.Object) hashSetTestDriver70);
        java.lang.Object obj74 = hashSetTestDriver57.getMatch((java.lang.Object) hashSetTestDriver64);
        boolean boolean75 = hashSetTestDriver48.remove((java.lang.Object) hashSetTestDriver57);
        boolean boolean77 = hashSetTestDriver48.equals_CUT((java.lang.Object) (byte) 10);
        boolean boolean78 = hashSetTestDriver48.isEmpty();
        boolean boolean79 = hashSetTestDriver48.isEmpty();
        boolean boolean80 = hashSetTestDriver37.contains((java.lang.Object) hashSetTestDriver48);
        boolean boolean81 = hashSetTestDriver9.remove((java.lang.Object) boolean80);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(iterator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[10.0]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test039");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        boolean boolean5 = hashSetTestDriver0.remove((java.lang.Object) (short) 10);
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj9 = hashSetTestDriver7.getMatch((java.lang.Object) 'a');
        boolean boolean10 = hashSetTestDriver7.isEmpty();
        boolean boolean12 = hashSetTestDriver7.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator13 = hashSetTestDriver7.iterator();
        boolean boolean15 = hashSetTestDriver7.contains((java.lang.Object) (byte) 10);
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj18 = hashSetTestDriver16.getMatch((java.lang.Object) 'a');
        int int19 = hashSetTestDriver16.size();
        boolean boolean21 = hashSetTestDriver16.remove((java.lang.Object) (short) 10);
        hashSetTestDriver16.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj25 = hashSetTestDriver23.getMatch((java.lang.Object) 'a');
        boolean boolean26 = hashSetTestDriver23.isEmpty();
        boolean boolean28 = hashSetTestDriver23.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj31 = hashSetTestDriver29.getMatch((java.lang.Object) 'a');
        java.lang.Object obj32 = hashSetTestDriver23.getMatch((java.lang.Object) hashSetTestDriver29);
        java.lang.Object obj33 = hashSetTestDriver16.getMatch((java.lang.Object) hashSetTestDriver23);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj36 = hashSetTestDriver34.getMatch((java.lang.Object) 'a');
        int int37 = hashSetTestDriver34.size();
        boolean boolean39 = hashSetTestDriver34.remove((java.lang.Object) (short) 10);
        hashSetTestDriver34.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver41 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj43 = hashSetTestDriver41.getMatch((java.lang.Object) 'a');
        boolean boolean44 = hashSetTestDriver41.isEmpty();
        boolean boolean46 = hashSetTestDriver41.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver47 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj49 = hashSetTestDriver47.getMatch((java.lang.Object) 'a');
        java.lang.Object obj50 = hashSetTestDriver41.getMatch((java.lang.Object) hashSetTestDriver47);
        java.lang.Object obj51 = hashSetTestDriver34.getMatch((java.lang.Object) hashSetTestDriver41);
        java.lang.Object obj52 = hashSetTestDriver23.getMatch((java.lang.Object) hashSetTestDriver34);
        boolean boolean53 = hashSetTestDriver7.remove((java.lang.Object) hashSetTestDriver34);
        experiment.util.HashSetTestDriver hashSetTestDriver54 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj56 = hashSetTestDriver54.getMatch((java.lang.Object) 'a');
        int int57 = hashSetTestDriver54.size();
        experiment.util.HashSetTestDriver hashSetTestDriver58 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj60 = hashSetTestDriver58.getMatch((java.lang.Object) 'a');
        int int61 = hashSetTestDriver58.size();
        boolean boolean62 = hashSetTestDriver54.remove((java.lang.Object) int61);
        experiment.util.HashSetTestDriver hashSetTestDriver63 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj65 = hashSetTestDriver63.getMatch((java.lang.Object) 'a');
        int int66 = hashSetTestDriver63.size();
        boolean boolean68 = hashSetTestDriver63.remove((java.lang.Object) (short) 10);
        hashSetTestDriver63.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver70 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj72 = hashSetTestDriver70.getMatch((java.lang.Object) 'a');
        boolean boolean73 = hashSetTestDriver70.isEmpty();
        boolean boolean75 = hashSetTestDriver70.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver76 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj78 = hashSetTestDriver76.getMatch((java.lang.Object) 'a');
        java.lang.Object obj79 = hashSetTestDriver70.getMatch((java.lang.Object) hashSetTestDriver76);
        java.lang.Object obj80 = hashSetTestDriver63.getMatch((java.lang.Object) hashSetTestDriver70);
        boolean boolean81 = hashSetTestDriver54.remove((java.lang.Object) hashSetTestDriver63);
        boolean boolean83 = hashSetTestDriver54.equals_CUT((java.lang.Object) (byte) 10);
        boolean boolean85 = hashSetTestDriver54.remove((java.lang.Object) (short) -1);
        boolean boolean86 = hashSetTestDriver7.contains((java.lang.Object) hashSetTestDriver54);
        boolean boolean87 = hashSetTestDriver0.add((java.lang.Object) boolean86);
        java.lang.Class<?> wildcardClass88 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test040");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        boolean boolean5 = hashSetTestDriver0.remove((java.lang.Object) (short) 10);
        experiment.util.HashSetTestDriver hashSetTestDriver6 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj8 = hashSetTestDriver6.getMatch((java.lang.Object) 'a');
        boolean boolean9 = hashSetTestDriver6.isEmpty();
        boolean boolean11 = hashSetTestDriver6.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean13 = hashSetTestDriver6.add((java.lang.Object) 10.0d);
        boolean boolean14 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        hashSetTestDriver0.clear();
        boolean boolean16 = hashSetTestDriver0.isEmpty();
        boolean boolean17 = hashSetTestDriver0.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test041");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean7 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        boolean boolean8 = hashSetTestDriver0.isEmpty();
        boolean boolean9 = hashSetTestDriver0.isEmpty();
        boolean boolean10 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj13 = hashSetTestDriver11.getMatch((java.lang.Object) 'a');
        boolean boolean14 = hashSetTestDriver11.isEmpty();
        hashSetTestDriver11.clear();
        hashSetTestDriver11.clear();
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver11);
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj20 = hashSetTestDriver18.getMatch((java.lang.Object) 'a');
        experiment.util.Iterator iterator21 = hashSetTestDriver18.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj24 = hashSetTestDriver22.getMatch((java.lang.Object) 'a');
        int int25 = hashSetTestDriver22.size();
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj28 = hashSetTestDriver26.getMatch((java.lang.Object) 'a');
        int int29 = hashSetTestDriver26.size();
        java.lang.Object obj30 = hashSetTestDriver22.getMatch((java.lang.Object) int29);
        experiment.util.Iterator iterator31 = hashSetTestDriver22.iterator();
        java.lang.Object obj32 = hashSetTestDriver18.getMatch((java.lang.Object) iterator31);
        experiment.util.HashSetTestDriver hashSetTestDriver33 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj35 = hashSetTestDriver33.getMatch((java.lang.Object) 'a');
        experiment.util.Iterator iterator36 = hashSetTestDriver33.iterator();
        boolean boolean37 = hashSetTestDriver18.contains((java.lang.Object) hashSetTestDriver33);
        hashSetTestDriver33.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj41 = hashSetTestDriver39.getMatch((java.lang.Object) 'a');
        boolean boolean42 = hashSetTestDriver39.isEmpty();
        hashSetTestDriver39.clear();
        java.lang.Object[] objArray44 = hashSetTestDriver39.toArray();
        java.lang.Object[] objArray45 = hashSetTestDriver39.toArray();
        boolean boolean46 = hashSetTestDriver33.remove((java.lang.Object) objArray45);
        experiment.util.HashSetTestDriver hashSetTestDriver47 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj49 = hashSetTestDriver47.getMatch((java.lang.Object) 'a');
        int int50 = hashSetTestDriver47.size();
        experiment.util.HashSetTestDriver hashSetTestDriver51 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj53 = hashSetTestDriver51.getMatch((java.lang.Object) 'a');
        int int54 = hashSetTestDriver51.size();
        boolean boolean55 = hashSetTestDriver47.remove((java.lang.Object) int54);
        experiment.util.HashSetTestDriver hashSetTestDriver56 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj58 = hashSetTestDriver56.getMatch((java.lang.Object) 'a');
        int int59 = hashSetTestDriver56.size();
        boolean boolean61 = hashSetTestDriver56.remove((java.lang.Object) (short) 10);
        hashSetTestDriver56.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver63 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj65 = hashSetTestDriver63.getMatch((java.lang.Object) 'a');
        boolean boolean66 = hashSetTestDriver63.isEmpty();
        boolean boolean68 = hashSetTestDriver63.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver69 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj71 = hashSetTestDriver69.getMatch((java.lang.Object) 'a');
        java.lang.Object obj72 = hashSetTestDriver63.getMatch((java.lang.Object) hashSetTestDriver69);
        java.lang.Object obj73 = hashSetTestDriver56.getMatch((java.lang.Object) hashSetTestDriver63);
        boolean boolean74 = hashSetTestDriver47.remove((java.lang.Object) hashSetTestDriver56);
        experiment.util.Iterator iterator75 = hashSetTestDriver47.iterator();
        boolean boolean76 = hashSetTestDriver33.remove((java.lang.Object) hashSetTestDriver47);
        experiment.util.Iterator iterator77 = hashSetTestDriver47.iterator();
        boolean boolean78 = hashSetTestDriver11.add((java.lang.Object) iterator77);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(iterator75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(iterator77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test042");
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
        boolean boolean23 = hashSetTestDriver18.remove((java.lang.Object) (short) 10);
        hashSetTestDriver18.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj27 = hashSetTestDriver25.getMatch((java.lang.Object) 'a');
        boolean boolean28 = hashSetTestDriver25.isEmpty();
        boolean boolean30 = hashSetTestDriver25.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj33 = hashSetTestDriver31.getMatch((java.lang.Object) 'a');
        java.lang.Object obj34 = hashSetTestDriver25.getMatch((java.lang.Object) hashSetTestDriver31);
        java.lang.Object obj35 = hashSetTestDriver18.getMatch((java.lang.Object) hashSetTestDriver25);
        java.lang.Object obj36 = hashSetTestDriver7.getMatch((java.lang.Object) hashSetTestDriver18);
        experiment.util.Iterator iterator37 = hashSetTestDriver7.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj40 = hashSetTestDriver38.getMatch((java.lang.Object) 'a');
        int int41 = hashSetTestDriver38.size();
        boolean boolean43 = hashSetTestDriver38.remove((java.lang.Object) (short) 10);
        hashSetTestDriver38.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver45 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj47 = hashSetTestDriver45.getMatch((java.lang.Object) 'a');
        boolean boolean48 = hashSetTestDriver45.isEmpty();
        boolean boolean50 = hashSetTestDriver45.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver51 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj53 = hashSetTestDriver51.getMatch((java.lang.Object) 'a');
        java.lang.Object obj54 = hashSetTestDriver45.getMatch((java.lang.Object) hashSetTestDriver51);
        java.lang.Object obj55 = hashSetTestDriver38.getMatch((java.lang.Object) hashSetTestDriver45);
        experiment.util.HashSetTestDriver hashSetTestDriver56 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj58 = hashSetTestDriver56.getMatch((java.lang.Object) 'a');
        int int59 = hashSetTestDriver56.size();
        boolean boolean61 = hashSetTestDriver56.remove((java.lang.Object) (short) 10);
        hashSetTestDriver56.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver63 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj65 = hashSetTestDriver63.getMatch((java.lang.Object) 'a');
        boolean boolean66 = hashSetTestDriver63.isEmpty();
        boolean boolean68 = hashSetTestDriver63.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver69 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj71 = hashSetTestDriver69.getMatch((java.lang.Object) 'a');
        java.lang.Object obj72 = hashSetTestDriver63.getMatch((java.lang.Object) hashSetTestDriver69);
        java.lang.Object obj73 = hashSetTestDriver56.getMatch((java.lang.Object) hashSetTestDriver63);
        java.lang.Object obj74 = hashSetTestDriver45.getMatch((java.lang.Object) hashSetTestDriver56);
        experiment.util.Iterator iterator75 = hashSetTestDriver45.iterator();
        java.lang.Object[] objArray76 = hashSetTestDriver45.toArray();
        boolean boolean77 = hashSetTestDriver7.add((java.lang.Object) objArray76);
        boolean boolean78 = hashSetTestDriver7.isEmpty();
        hashSetTestDriver7.clear();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(iterator75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray76), "[]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test043");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        java.lang.Object[] objArray5 = hashSetTestDriver0.toArray();
        int int6 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver7 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj9 = hashSetTestDriver7.getMatch((java.lang.Object) 'a');
        int int10 = hashSetTestDriver7.size();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj13 = hashSetTestDriver11.getMatch((java.lang.Object) 'a');
        int int14 = hashSetTestDriver11.size();
        java.lang.Object obj15 = hashSetTestDriver7.getMatch((java.lang.Object) int14);
        experiment.util.Iterator iterator16 = hashSetTestDriver7.iterator();
        boolean boolean17 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver7);
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj20 = hashSetTestDriver18.getMatch((java.lang.Object) 'a');
        int int21 = hashSetTestDriver18.size();
        boolean boolean23 = hashSetTestDriver18.remove((java.lang.Object) (short) 10);
        java.lang.Object[] objArray24 = hashSetTestDriver18.toArray();
        boolean boolean25 = hashSetTestDriver7.equals_CUT((java.lang.Object) hashSetTestDriver18);
        experiment.util.HashSetTestDriver hashSetTestDriver26 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj28 = hashSetTestDriver26.getMatch((java.lang.Object) 'a');
        int int29 = hashSetTestDriver26.size();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj32 = hashSetTestDriver30.getMatch((java.lang.Object) 'a');
        int int33 = hashSetTestDriver30.size();
        boolean boolean34 = hashSetTestDriver26.remove((java.lang.Object) int33);
        experiment.util.HashSetTestDriver hashSetTestDriver35 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj37 = hashSetTestDriver35.getMatch((java.lang.Object) 'a');
        int int38 = hashSetTestDriver35.size();
        boolean boolean40 = hashSetTestDriver35.remove((java.lang.Object) (short) 10);
        hashSetTestDriver35.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver42 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj44 = hashSetTestDriver42.getMatch((java.lang.Object) 'a');
        boolean boolean45 = hashSetTestDriver42.isEmpty();
        boolean boolean47 = hashSetTestDriver42.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver48 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj50 = hashSetTestDriver48.getMatch((java.lang.Object) 'a');
        java.lang.Object obj51 = hashSetTestDriver42.getMatch((java.lang.Object) hashSetTestDriver48);
        java.lang.Object obj52 = hashSetTestDriver35.getMatch((java.lang.Object) hashSetTestDriver42);
        boolean boolean53 = hashSetTestDriver26.remove((java.lang.Object) hashSetTestDriver35);
        experiment.util.Iterator iterator54 = hashSetTestDriver35.iterator();
        java.lang.Class<?> wildcardClass55 = hashSetTestDriver35.getClass();
        boolean boolean56 = hashSetTestDriver7.remove((java.lang.Object) wildcardClass55);
        boolean boolean58 = hashSetTestDriver7.contains((java.lang.Object) false);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test044");
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
        boolean boolean23 = hashSetTestDriver18.remove((java.lang.Object) (short) 10);
        hashSetTestDriver18.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj27 = hashSetTestDriver25.getMatch((java.lang.Object) 'a');
        boolean boolean28 = hashSetTestDriver25.isEmpty();
        boolean boolean30 = hashSetTestDriver25.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj33 = hashSetTestDriver31.getMatch((java.lang.Object) 'a');
        java.lang.Object obj34 = hashSetTestDriver25.getMatch((java.lang.Object) hashSetTestDriver31);
        java.lang.Object obj35 = hashSetTestDriver18.getMatch((java.lang.Object) hashSetTestDriver25);
        java.lang.Object obj36 = hashSetTestDriver7.getMatch((java.lang.Object) hashSetTestDriver18);
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj39 = hashSetTestDriver37.getMatch((java.lang.Object) 'a');
        int int40 = hashSetTestDriver37.size();
        experiment.util.Iterator iterator41 = hashSetTestDriver37.iterator();
        boolean boolean42 = hashSetTestDriver18.add((java.lang.Object) hashSetTestDriver37);
        java.lang.Class<?> wildcardClass43 = hashSetTestDriver18.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test045");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj6 = hashSetTestDriver4.getMatch((java.lang.Object) 'a');
        int int7 = hashSetTestDriver4.size();
        java.lang.Object obj8 = hashSetTestDriver0.getMatch((java.lang.Object) int7);
        experiment.util.Iterator iterator9 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver10 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj12 = hashSetTestDriver10.getMatch((java.lang.Object) 'a');
        boolean boolean13 = hashSetTestDriver10.isEmpty();
        boolean boolean15 = hashSetTestDriver10.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.Iterator iterator16 = hashSetTestDriver10.iterator();
        boolean boolean17 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver10);
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj20 = hashSetTestDriver18.getMatch((java.lang.Object) 'a');
        int int21 = hashSetTestDriver18.size();
        boolean boolean23 = hashSetTestDriver18.remove((java.lang.Object) (short) 10);
        boolean boolean24 = hashSetTestDriver18.isEmpty();
        boolean boolean26 = hashSetTestDriver18.equals_CUT((java.lang.Object) (-1L));
        java.lang.Object obj27 = hashSetTestDriver10.getMatch((java.lang.Object) (-1L));
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test046");
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
        int int55 = hashSetTestDriver7.size();
        experiment.util.HashSetTestDriver hashSetTestDriver56 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj58 = hashSetTestDriver56.getMatch((java.lang.Object) 'a');
        boolean boolean59 = hashSetTestDriver56.isEmpty();
        hashSetTestDriver56.clear();
        java.lang.Object[] objArray61 = hashSetTestDriver56.toArray();
        experiment.util.Iterator iterator62 = hashSetTestDriver56.iterator();
        boolean boolean63 = hashSetTestDriver7.equals_CUT((java.lang.Object) iterator62);
        java.lang.Class<?> wildcardClass64 = hashSetTestDriver7.getClass();
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray61), "[]");
        org.junit.Assert.assertNotNull(iterator62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test047");
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
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj39 = hashSetTestDriver37.getMatch((java.lang.Object) 'a');
        int int40 = hashSetTestDriver37.size();
        boolean boolean42 = hashSetTestDriver37.remove((java.lang.Object) (short) 10);
        hashSetTestDriver37.clear();
        java.lang.Object[] objArray44 = hashSetTestDriver37.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver45 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj47 = hashSetTestDriver45.getMatch((java.lang.Object) 'a');
        boolean boolean48 = hashSetTestDriver45.isEmpty();
        boolean boolean50 = hashSetTestDriver45.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean52 = hashSetTestDriver45.add((java.lang.Object) 10.0d);
        boolean boolean53 = hashSetTestDriver45.isEmpty();
        int int54 = hashSetTestDriver45.size();
        hashSetTestDriver45.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver56 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj58 = hashSetTestDriver56.getMatch((java.lang.Object) 'a');
        boolean boolean59 = hashSetTestDriver56.isEmpty();
        boolean boolean61 = hashSetTestDriver56.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean63 = hashSetTestDriver56.add((java.lang.Object) 10.0d);
        boolean boolean64 = hashSetTestDriver56.isEmpty();
        int int65 = hashSetTestDriver56.size();
        boolean boolean66 = hashSetTestDriver45.equals_CUT((java.lang.Object) hashSetTestDriver56);
        boolean boolean67 = hashSetTestDriver37.contains((java.lang.Object) hashSetTestDriver56);
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
        experiment.util.Iterator iterator86 = hashSetTestDriver68.iterator();
        java.lang.Class<?> wildcardClass87 = hashSetTestDriver68.getClass();
        boolean boolean88 = hashSetTestDriver37.contains((java.lang.Object) wildcardClass87);
        boolean boolean89 = hashSetTestDriver0.add((java.lang.Object) wildcardClass87);
        experiment.util.Iterator iterator90 = hashSetTestDriver0.iterator();
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
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[]");
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(iterator86);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(iterator90);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test048");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj6 = hashSetTestDriver4.getMatch((java.lang.Object) 'a');
        int int7 = hashSetTestDriver4.size();
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) int7);
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
        boolean boolean27 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver9);
        int int28 = hashSetTestDriver9.size();
        java.lang.Object obj30 = hashSetTestDriver9.getMatch((java.lang.Object) (short) 1);
        java.lang.Object obj32 = hashSetTestDriver9.getMatch((java.lang.Object) '4');
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test049");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        experiment.util.Iterator iterator3 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj6 = hashSetTestDriver4.getMatch((java.lang.Object) 'a');
        int int7 = hashSetTestDriver4.size();
        experiment.util.HashSetTestDriver hashSetTestDriver8 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj10 = hashSetTestDriver8.getMatch((java.lang.Object) 'a');
        int int11 = hashSetTestDriver8.size();
        java.lang.Object obj12 = hashSetTestDriver4.getMatch((java.lang.Object) int11);
        experiment.util.Iterator iterator13 = hashSetTestDriver4.iterator();
        java.lang.Object obj14 = hashSetTestDriver0.getMatch((java.lang.Object) iterator13);
        experiment.util.HashSetTestDriver hashSetTestDriver15 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj17 = hashSetTestDriver15.getMatch((java.lang.Object) 'a');
        experiment.util.Iterator iterator18 = hashSetTestDriver15.iterator();
        boolean boolean19 = hashSetTestDriver0.contains((java.lang.Object) hashSetTestDriver15);
        hashSetTestDriver15.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver21 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj23 = hashSetTestDriver21.getMatch((java.lang.Object) 'a');
        boolean boolean24 = hashSetTestDriver21.isEmpty();
        hashSetTestDriver21.clear();
        java.lang.Object[] objArray26 = hashSetTestDriver21.toArray();
        java.lang.Object[] objArray27 = hashSetTestDriver21.toArray();
        boolean boolean28 = hashSetTestDriver15.remove((java.lang.Object) objArray27);
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj31 = hashSetTestDriver29.getMatch((java.lang.Object) 'a');
        int int32 = hashSetTestDriver29.size();
        experiment.util.HashSetTestDriver hashSetTestDriver33 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj35 = hashSetTestDriver33.getMatch((java.lang.Object) 'a');
        int int36 = hashSetTestDriver33.size();
        boolean boolean37 = hashSetTestDriver29.remove((java.lang.Object) int36);
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj40 = hashSetTestDriver38.getMatch((java.lang.Object) 'a');
        int int41 = hashSetTestDriver38.size();
        boolean boolean43 = hashSetTestDriver38.remove((java.lang.Object) (short) 10);
        hashSetTestDriver38.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver45 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj47 = hashSetTestDriver45.getMatch((java.lang.Object) 'a');
        boolean boolean48 = hashSetTestDriver45.isEmpty();
        boolean boolean50 = hashSetTestDriver45.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver51 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj53 = hashSetTestDriver51.getMatch((java.lang.Object) 'a');
        java.lang.Object obj54 = hashSetTestDriver45.getMatch((java.lang.Object) hashSetTestDriver51);
        java.lang.Object obj55 = hashSetTestDriver38.getMatch((java.lang.Object) hashSetTestDriver45);
        boolean boolean56 = hashSetTestDriver29.remove((java.lang.Object) hashSetTestDriver38);
        experiment.util.Iterator iterator57 = hashSetTestDriver29.iterator();
        boolean boolean58 = hashSetTestDriver15.remove((java.lang.Object) hashSetTestDriver29);
        boolean boolean59 = hashSetTestDriver29.isEmpty();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(iterator57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test050");
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
        boolean boolean23 = hashSetTestDriver18.remove((java.lang.Object) (short) 10);
        hashSetTestDriver18.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj27 = hashSetTestDriver25.getMatch((java.lang.Object) 'a');
        boolean boolean28 = hashSetTestDriver25.isEmpty();
        boolean boolean30 = hashSetTestDriver25.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj33 = hashSetTestDriver31.getMatch((java.lang.Object) 'a');
        java.lang.Object obj34 = hashSetTestDriver25.getMatch((java.lang.Object) hashSetTestDriver31);
        java.lang.Object obj35 = hashSetTestDriver18.getMatch((java.lang.Object) hashSetTestDriver25);
        java.lang.Object obj36 = hashSetTestDriver7.getMatch((java.lang.Object) hashSetTestDriver18);
        experiment.util.HashSetTestDriver hashSetTestDriver37 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj39 = hashSetTestDriver37.getMatch((java.lang.Object) 'a');
        int int40 = hashSetTestDriver37.size();
        experiment.util.Iterator iterator41 = hashSetTestDriver37.iterator();
        boolean boolean42 = hashSetTestDriver18.add((java.lang.Object) hashSetTestDriver37);
        java.lang.Class<?> wildcardClass43 = hashSetTestDriver37.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test051");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        experiment.util.Iterator iterator4 = hashSetTestDriver0.iterator();
        experiment.util.HashSetTestDriver hashSetTestDriver5 = new experiment.util.HashSetTestDriver();
        int int6 = hashSetTestDriver5.size();
        java.lang.Object obj7 = hashSetTestDriver0.getMatch((java.lang.Object) hashSetTestDriver5);
        java.lang.Class<?> wildcardClass8 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test052");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean7 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        boolean boolean8 = hashSetTestDriver0.isEmpty();
        boolean boolean9 = hashSetTestDriver0.isEmpty();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj13 = hashSetTestDriver11.getMatch((java.lang.Object) 'a');
        int int14 = hashSetTestDriver11.size();
        boolean boolean16 = hashSetTestDriver11.remove((java.lang.Object) (short) 10);
        hashSetTestDriver11.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver18 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj20 = hashSetTestDriver18.getMatch((java.lang.Object) 'a');
        boolean boolean21 = hashSetTestDriver18.isEmpty();
        boolean boolean23 = hashSetTestDriver18.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver24 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj26 = hashSetTestDriver24.getMatch((java.lang.Object) 'a');
        java.lang.Object obj27 = hashSetTestDriver18.getMatch((java.lang.Object) hashSetTestDriver24);
        java.lang.Object obj28 = hashSetTestDriver11.getMatch((java.lang.Object) hashSetTestDriver18);
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj31 = hashSetTestDriver29.getMatch((java.lang.Object) 'a');
        int int32 = hashSetTestDriver29.size();
        boolean boolean33 = hashSetTestDriver29.isEmpty();
        boolean boolean34 = hashSetTestDriver18.equals_CUT((java.lang.Object) hashSetTestDriver29);
        java.lang.Object obj35 = hashSetTestDriver0.getMatch((java.lang.Object) boolean34);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test053");
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
        boolean boolean23 = hashSetTestDriver18.remove((java.lang.Object) (short) 10);
        hashSetTestDriver18.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver25 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj27 = hashSetTestDriver25.getMatch((java.lang.Object) 'a');
        boolean boolean28 = hashSetTestDriver25.isEmpty();
        boolean boolean30 = hashSetTestDriver25.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver31 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj33 = hashSetTestDriver31.getMatch((java.lang.Object) 'a');
        java.lang.Object obj34 = hashSetTestDriver25.getMatch((java.lang.Object) hashSetTestDriver31);
        java.lang.Object obj35 = hashSetTestDriver18.getMatch((java.lang.Object) hashSetTestDriver25);
        java.lang.Object obj36 = hashSetTestDriver7.getMatch((java.lang.Object) hashSetTestDriver18);
        int int37 = hashSetTestDriver7.size();
        experiment.util.HashSetTestDriver hashSetTestDriver38 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj40 = hashSetTestDriver38.getMatch((java.lang.Object) 'a');
        int int41 = hashSetTestDriver38.size();
        boolean boolean43 = hashSetTestDriver38.remove((java.lang.Object) (short) 10);
        hashSetTestDriver38.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver45 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj47 = hashSetTestDriver45.getMatch((java.lang.Object) 'a');
        boolean boolean48 = hashSetTestDriver45.isEmpty();
        boolean boolean50 = hashSetTestDriver45.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver51 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj53 = hashSetTestDriver51.getMatch((java.lang.Object) 'a');
        java.lang.Object obj54 = hashSetTestDriver45.getMatch((java.lang.Object) hashSetTestDriver51);
        java.lang.Object obj55 = hashSetTestDriver38.getMatch((java.lang.Object) hashSetTestDriver45);
        experiment.util.HashSetTestDriver hashSetTestDriver56 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj58 = hashSetTestDriver56.getMatch((java.lang.Object) 'a');
        int int59 = hashSetTestDriver56.size();
        boolean boolean60 = hashSetTestDriver56.isEmpty();
        boolean boolean61 = hashSetTestDriver45.equals_CUT((java.lang.Object) hashSetTestDriver56);
        experiment.util.HashSetTestDriver hashSetTestDriver62 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj64 = hashSetTestDriver62.getMatch((java.lang.Object) 'a');
        boolean boolean65 = hashSetTestDriver62.isEmpty();
        hashSetTestDriver62.clear();
        java.lang.Object obj68 = hashSetTestDriver62.getMatch((java.lang.Object) (short) 10);
        boolean boolean70 = hashSetTestDriver62.add((java.lang.Object) (short) 0);
        boolean boolean71 = hashSetTestDriver45.remove((java.lang.Object) hashSetTestDriver62);
        boolean boolean72 = hashSetTestDriver7.remove((java.lang.Object) boolean71);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test054");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean7 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        boolean boolean8 = hashSetTestDriver0.isEmpty();
        boolean boolean9 = hashSetTestDriver0.isEmpty();
        boolean boolean10 = hashSetTestDriver0.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj13 = hashSetTestDriver11.getMatch((java.lang.Object) 'a');
        boolean boolean14 = hashSetTestDriver11.isEmpty();
        hashSetTestDriver11.clear();
        hashSetTestDriver11.clear();
        boolean boolean17 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver11);
        java.lang.Object[] objArray18 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass19 = objArray18.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[10.0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test055");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        int int1 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver2 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj4 = hashSetTestDriver2.getMatch((java.lang.Object) 'a');
        boolean boolean5 = hashSetTestDriver2.isEmpty();
        hashSetTestDriver2.clear();
        java.lang.Object obj8 = hashSetTestDriver2.getMatch((java.lang.Object) (short) 10);
        boolean boolean10 = hashSetTestDriver2.add((java.lang.Object) (short) 0);
        boolean boolean11 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver2);
        java.lang.Object[] objArray12 = hashSetTestDriver0.toArray();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(objArray12);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test056");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj6 = hashSetTestDriver4.getMatch((java.lang.Object) 'a');
        int int7 = hashSetTestDriver4.size();
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) int7);
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
        boolean boolean27 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver9);
        int int28 = hashSetTestDriver9.size();
        java.lang.Object[] objArray29 = hashSetTestDriver9.toArray();
        experiment.util.HashSetTestDriver hashSetTestDriver30 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj32 = hashSetTestDriver30.getMatch((java.lang.Object) 'a');
        boolean boolean33 = hashSetTestDriver30.isEmpty();
        boolean boolean35 = hashSetTestDriver30.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean37 = hashSetTestDriver30.add((java.lang.Object) 10.0d);
        boolean boolean38 = hashSetTestDriver30.isEmpty();
        boolean boolean39 = hashSetTestDriver30.isEmpty();
        java.lang.Class<?> wildcardClass40 = hashSetTestDriver30.getClass();
        boolean boolean41 = hashSetTestDriver9.contains((java.lang.Object) wildcardClass40);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[]");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test057");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj6 = hashSetTestDriver4.getMatch((java.lang.Object) 'a');
        int int7 = hashSetTestDriver4.size();
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) int7);
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
        boolean boolean27 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver9);
        boolean boolean29 = hashSetTestDriver0.equals_CUT((java.lang.Object) (byte) 10);
        boolean boolean30 = hashSetTestDriver0.isEmpty();
        boolean boolean31 = hashSetTestDriver0.isEmpty();
        int int32 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test058");
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
        experiment.util.HashSetTestDriver hashSetTestDriver16 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj18 = hashSetTestDriver16.getMatch((java.lang.Object) 'a');
        int int19 = hashSetTestDriver16.size();
        boolean boolean21 = hashSetTestDriver16.remove((java.lang.Object) (short) 10);
        hashSetTestDriver16.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver23 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj25 = hashSetTestDriver23.getMatch((java.lang.Object) 'a');
        boolean boolean26 = hashSetTestDriver23.isEmpty();
        boolean boolean28 = hashSetTestDriver23.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver29 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj31 = hashSetTestDriver29.getMatch((java.lang.Object) 'a');
        java.lang.Object obj32 = hashSetTestDriver23.getMatch((java.lang.Object) hashSetTestDriver29);
        java.lang.Object obj33 = hashSetTestDriver16.getMatch((java.lang.Object) hashSetTestDriver23);
        experiment.util.HashSetTestDriver hashSetTestDriver34 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj36 = hashSetTestDriver34.getMatch((java.lang.Object) 'a');
        boolean boolean37 = hashSetTestDriver34.isEmpty();
        hashSetTestDriver34.clear();
        boolean boolean39 = hashSetTestDriver34.isEmpty();
        java.lang.Object obj40 = hashSetTestDriver16.getMatch((java.lang.Object) hashSetTestDriver34);
        java.lang.Object[] objArray41 = hashSetTestDriver16.toArray();
        boolean boolean42 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver16);
        boolean boolean44 = hashSetTestDriver0.remove((java.lang.Object) (short) 0);
        experiment.util.HashSetTestDriver hashSetTestDriver45 = new experiment.util.HashSetTestDriver();
        boolean boolean47 = hashSetTestDriver45.remove((java.lang.Object) (-1.0f));
        boolean boolean49 = hashSetTestDriver45.contains((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass50 = hashSetTestDriver45.getClass();
        java.lang.Object obj51 = hashSetTestDriver0.getMatch((java.lang.Object) wildcardClass50);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test059");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj6 = hashSetTestDriver4.getMatch((java.lang.Object) 'a');
        int int7 = hashSetTestDriver4.size();
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) int7);
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
        boolean boolean27 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver9);
        java.lang.Class<?> wildcardClass28 = hashSetTestDriver0.getClass();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test060");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj6 = hashSetTestDriver4.getMatch((java.lang.Object) 'a');
        int int7 = hashSetTestDriver4.size();
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) int7);
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
        boolean boolean27 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver9);
        experiment.util.HashSetTestDriver hashSetTestDriver28 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj30 = hashSetTestDriver28.getMatch((java.lang.Object) 'a');
        boolean boolean31 = hashSetTestDriver28.isEmpty();
        boolean boolean33 = hashSetTestDriver28.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean35 = hashSetTestDriver28.add((java.lang.Object) 10.0d);
        boolean boolean36 = hashSetTestDriver28.isEmpty();
        boolean boolean37 = hashSetTestDriver28.isEmpty();
        boolean boolean38 = hashSetTestDriver28.isEmpty();
        experiment.util.HashSetTestDriver hashSetTestDriver39 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj41 = hashSetTestDriver39.getMatch((java.lang.Object) 'a');
        boolean boolean42 = hashSetTestDriver39.isEmpty();
        hashSetTestDriver39.clear();
        hashSetTestDriver39.clear();
        boolean boolean45 = hashSetTestDriver28.equals_CUT((java.lang.Object) hashSetTestDriver39);
        java.lang.Object[] objArray46 = hashSetTestDriver28.toArray();
        boolean boolean47 = hashSetTestDriver0.remove((java.lang.Object) hashSetTestDriver28);
        experiment.util.HashSetTestDriver hashSetTestDriver48 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj50 = hashSetTestDriver48.getMatch((java.lang.Object) 'a');
        int int51 = hashSetTestDriver48.size();
        boolean boolean53 = hashSetTestDriver48.remove((java.lang.Object) (short) 10);
        hashSetTestDriver48.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver55 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj57 = hashSetTestDriver55.getMatch((java.lang.Object) 'a');
        boolean boolean58 = hashSetTestDriver55.isEmpty();
        boolean boolean60 = hashSetTestDriver55.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver61 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj63 = hashSetTestDriver61.getMatch((java.lang.Object) 'a');
        java.lang.Object obj64 = hashSetTestDriver55.getMatch((java.lang.Object) hashSetTestDriver61);
        java.lang.Object obj65 = hashSetTestDriver48.getMatch((java.lang.Object) hashSetTestDriver55);
        experiment.util.HashSetTestDriver hashSetTestDriver66 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj68 = hashSetTestDriver66.getMatch((java.lang.Object) 'a');
        int int69 = hashSetTestDriver66.size();
        boolean boolean71 = hashSetTestDriver66.remove((java.lang.Object) (short) 10);
        hashSetTestDriver66.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver73 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj75 = hashSetTestDriver73.getMatch((java.lang.Object) 'a');
        boolean boolean76 = hashSetTestDriver73.isEmpty();
        boolean boolean78 = hashSetTestDriver73.equals_CUT((java.lang.Object) 100.0d);
        experiment.util.HashSetTestDriver hashSetTestDriver79 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj81 = hashSetTestDriver79.getMatch((java.lang.Object) 'a');
        java.lang.Object obj82 = hashSetTestDriver73.getMatch((java.lang.Object) hashSetTestDriver79);
        java.lang.Object obj83 = hashSetTestDriver66.getMatch((java.lang.Object) hashSetTestDriver73);
        java.lang.Object obj84 = hashSetTestDriver55.getMatch((java.lang.Object) hashSetTestDriver66);
        experiment.util.HashSetTestDriver hashSetTestDriver85 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj87 = hashSetTestDriver85.getMatch((java.lang.Object) 'a');
        int int88 = hashSetTestDriver85.size();
        experiment.util.Iterator iterator89 = hashSetTestDriver85.iterator();
        boolean boolean90 = hashSetTestDriver66.add((java.lang.Object) hashSetTestDriver85);
        boolean boolean91 = hashSetTestDriver0.add((java.lang.Object) boolean90);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray46), "[10.0]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertNotNull(iterator89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test061");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean7 = hashSetTestDriver0.add((java.lang.Object) 10.0d);
        boolean boolean8 = hashSetTestDriver0.isEmpty();
        int int9 = hashSetTestDriver0.size();
        hashSetTestDriver0.clear();
        experiment.util.HashSetTestDriver hashSetTestDriver11 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj13 = hashSetTestDriver11.getMatch((java.lang.Object) 'a');
        boolean boolean14 = hashSetTestDriver11.isEmpty();
        boolean boolean16 = hashSetTestDriver11.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean18 = hashSetTestDriver11.add((java.lang.Object) 10.0d);
        boolean boolean19 = hashSetTestDriver11.isEmpty();
        int int20 = hashSetTestDriver11.size();
        boolean boolean21 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver11);
        experiment.util.HashSetTestDriver hashSetTestDriver22 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj24 = hashSetTestDriver22.getMatch((java.lang.Object) 'a');
        boolean boolean25 = hashSetTestDriver22.isEmpty();
        boolean boolean27 = hashSetTestDriver22.equals_CUT((java.lang.Object) 100.0d);
        boolean boolean29 = hashSetTestDriver22.add((java.lang.Object) 10.0d);
        boolean boolean30 = hashSetTestDriver22.isEmpty();
        boolean boolean31 = hashSetTestDriver0.add((java.lang.Object) hashSetTestDriver22);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test062");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        boolean boolean3 = hashSetTestDriver0.isEmpty();
        boolean boolean5 = hashSetTestDriver0.equals_CUT((java.lang.Object) 100.0d);
        hashSetTestDriver0.clear();
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test063");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        boolean boolean2 = hashSetTestDriver0.contains((java.lang.Object) (byte) 100);
        java.lang.Object[] objArray3 = hashSetTestDriver0.toArray();
        java.lang.Class<?> wildcardClass4 = objArray3.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_HashSetTest_1321793073_1024_0.test064");
        experiment.util.HashSetTestDriver hashSetTestDriver0 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj2 = hashSetTestDriver0.getMatch((java.lang.Object) 'a');
        int int3 = hashSetTestDriver0.size();
        experiment.util.HashSetTestDriver hashSetTestDriver4 = new experiment.util.HashSetTestDriver();
        java.lang.Object obj6 = hashSetTestDriver4.getMatch((java.lang.Object) 'a');
        int int7 = hashSetTestDriver4.size();
        boolean boolean8 = hashSetTestDriver0.remove((java.lang.Object) int7);
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
        boolean boolean24 = hashSetTestDriver0.equals_CUT((java.lang.Object) hashSetTestDriver9);
        org.junit.Assert.assertNull(obj2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

}
