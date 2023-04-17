package experiment.util.test;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_ArrayListTest_379375655_128_s {

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
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test001");
        experiment.util.Collection collection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver(collection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test002");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = arrayListTestDriver0.set((int) ' ', (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test003");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayListTestDriver0.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test004");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = arrayListTestDriver0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test005");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.set((-1), (java.lang.Object) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test006");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator10 = arrayListTestDriver4.listIterator((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test007");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = arrayListTestDriver0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test008");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = arrayListTestDriver0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test009");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test010");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) '#');
        java.lang.Class<?> wildcardClass5 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test011");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass2 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test012");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.get((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test013");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.add((java.lang.Object) (-1.0d));
        boolean boolean7 = arrayListTestDriver3.add((java.lang.Object) arrayListTestDriver4);
        java.lang.Object obj10 = arrayListTestDriver3.set(0, (java.lang.Object) (-1.0f));
        boolean boolean11 = arrayListTestDriver0.contains(obj10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayListTestDriver0.remove((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test014");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        java.lang.Object obj7 = arrayListTestDriver0.set(0, (java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test015");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test016");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator2 = arrayListTestDriver0.iterator();
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test017");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        int int5 = arrayListTestDriver0.size();
        int int6 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator11 = arrayListTestDriver8.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator15 = arrayListTestDriver12.iterator();
        boolean boolean16 = arrayListTestDriver8.add((java.lang.Object) arrayListTestDriver12);
        arrayListTestDriver12.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = arrayListTestDriver0.set((int) (byte) -1, (java.lang.Object) arrayListTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test018");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayListTestDriver0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test019");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayListTestDriver0.set((int) (short) -1, (java.lang.Object) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test020");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        java.lang.Object obj6 = arrayListTestDriver0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayListTestDriver0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test021");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = arrayListTestDriver0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test022");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator2 = arrayListTestDriver0.iterator();
        boolean boolean3 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        int int6 = arrayListTestDriver5.size();
        arrayListTestDriver5.clear();
        java.lang.Class<?> wildcardClass8 = arrayListTestDriver5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.set((int) (byte) 0, (java.lang.Object) arrayListTestDriver5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test023");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test024");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        java.lang.Object obj7 = arrayListTestDriver0.set(0, (java.lang.Object) (-1.0f));
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator9 = arrayListTestDriver0.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test025");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        int int11 = arrayListTestDriver10.size();
        arrayListTestDriver10.clear();
        boolean boolean13 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = arrayListTestDriver10.set(0, (java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test026");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator12 = arrayListTestDriver9.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver13.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator16 = arrayListTestDriver13.iterator();
        boolean boolean17 = arrayListTestDriver9.add((java.lang.Object) arrayListTestDriver13);
        boolean boolean18 = arrayListTestDriver0.add((java.lang.Object) boolean17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = arrayListTestDriver0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test027");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver4.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver4.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test028");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        java.lang.Class<?> wildcardClass2 = iterator1.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test029");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        experiment.util.ListIterator listIterator4 = arrayListTestDriver0.listIterator((int) (byte) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        boolean boolean8 = arrayListTestDriver6.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator9 = arrayListTestDriver6.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = arrayListTestDriver0.set(0, (java.lang.Object) arrayListTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(listIterator4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test030");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        java.lang.Class<?> wildcardClass9 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test031");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        int int3 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator8 = arrayListTestDriver4.iterator();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        java.lang.Object obj10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = arrayListTestDriver4.add(obj10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test032");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        int int5 = arrayListTestDriver1.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator7 = arrayListTestDriver1.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test033");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object[] objArray3 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = arrayListTestDriver0.set((int) (short) 0, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test034");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        int int3 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = arrayListTestDriver0.listIterator((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test035");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        int int3 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator8 = arrayListTestDriver4.iterator();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator10 = arrayListTestDriver4.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver13.add((java.lang.Object) (-1.0d));
        boolean boolean16 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver13);
        boolean boolean18 = arrayListTestDriver12.add((java.lang.Object) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj19 = arrayListTestDriver4.set((int) (byte) 10, (java.lang.Object) arrayListTestDriver12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test036");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator9 = arrayListTestDriver4.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator12 = arrayListTestDriver11.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayListTestDriver4.set(100, (java.lang.Object) arrayListTestDriver11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test037");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.add((java.lang.Object) (-1.0d));
        boolean boolean7 = arrayListTestDriver3.add((java.lang.Object) arrayListTestDriver4);
        java.lang.Object obj10 = arrayListTestDriver3.set(0, (java.lang.Object) (-1.0f));
        boolean boolean11 = arrayListTestDriver0.contains(obj10);
        java.lang.Object[] objArray12 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator14 = arrayListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test038");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) '#');
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        java.lang.Class<?> wildcardClass7 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test039");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayListTestDriver0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test040");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        java.lang.Object obj6 = arrayListTestDriver0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator8 = arrayListTestDriver0.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test041");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 'a');
        boolean boolean7 = arrayListTestDriver0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = arrayListTestDriver0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test042");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        int int3 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator8 = arrayListTestDriver4.iterator();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver4.get((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test043");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        int int5 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.add((java.lang.Object) (-1.0d));
        boolean boolean10 = arrayListTestDriver6.add((java.lang.Object) arrayListTestDriver7);
        int int11 = arrayListTestDriver7.size();
        boolean boolean12 = arrayListTestDriver0.add((java.lang.Object) int11);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator14 = arrayListTestDriver0.listIterator((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test044");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.set((int) 'a', (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test045");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.add((java.lang.Object) (-1.0d));
        boolean boolean7 = arrayListTestDriver3.add((java.lang.Object) arrayListTestDriver4);
        java.lang.Object obj10 = arrayListTestDriver3.set(0, (java.lang.Object) (-1.0f));
        boolean boolean11 = arrayListTestDriver0.contains(obj10);
        boolean boolean13 = arrayListTestDriver0.remove((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = arrayListTestDriver0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test046");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator10 = arrayListTestDriver9.iterator();
        boolean boolean11 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver9);
        java.lang.Class<?> wildcardClass12 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test047");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        java.lang.Object obj6 = arrayListTestDriver0.remove(0);
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator8 = arrayListTestDriver7.iterator();
        int int9 = arrayListTestDriver7.size();
        boolean boolean10 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver7);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator12 = arrayListTestDriver0.listIterator((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test048");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator5 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator6 = arrayListTestDriver4.iterator();
        boolean boolean7 = arrayListTestDriver0.equals_CUT((java.lang.Object) iterator6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test049");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver1.set((int) (byte) -1, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test050");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        int int3 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator8 = arrayListTestDriver4.iterator();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator10 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator11 = arrayListTestDriver4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayListTestDriver4.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test051");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        int int11 = arrayListTestDriver10.size();
        arrayListTestDriver10.clear();
        boolean boolean13 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver10);
        int int14 = arrayListTestDriver0.size();
        experiment.util.Iterator iterator15 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator17 = arrayListTestDriver0.listIterator((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test052");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        int int5 = arrayListTestDriver0.size();
        int int6 = arrayListTestDriver0.size();
        int int7 = arrayListTestDriver0.size();
        java.lang.Object obj9 = arrayListTestDriver0.remove((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test053");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        java.lang.Object obj6 = arrayListTestDriver0.remove(0);
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator8 = arrayListTestDriver7.iterator();
        int int9 = arrayListTestDriver7.size();
        boolean boolean10 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver7);
        int int11 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator13 = arrayListTestDriver0.listIterator((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test054");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator9 = arrayListTestDriver4.iterator();
        java.lang.Object[] objArray10 = arrayListTestDriver4.toArray();
        int int11 = arrayListTestDriver4.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator13 = arrayListTestDriver4.listIterator(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test055");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) '#');
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray8 = arrayListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass9 = objArray8.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test056");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object[] objArray8 = arrayListTestDriver5.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.add((java.lang.Object) (-1.0d));
        boolean boolean13 = arrayListTestDriver9.add((java.lang.Object) arrayListTestDriver10);
        boolean boolean15 = arrayListTestDriver9.add((java.lang.Object) 'a');
        boolean boolean16 = arrayListTestDriver9.isEmpty();
        boolean boolean17 = arrayListTestDriver5.contains((java.lang.Object) arrayListTestDriver9);
        boolean boolean18 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver5);
        java.lang.Class<?> wildcardClass19 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test057");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        java.lang.Object[] objArray10 = arrayListTestDriver0.toArray();
        boolean boolean12 = arrayListTestDriver0.add((java.lang.Object) (byte) 100);
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = arrayListTestDriver0.add(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test058");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        int int5 = arrayListTestDriver0.size();
        int int6 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.add((java.lang.Object) (-1.0d));
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.add((java.lang.Object) (-1.0d));
        boolean boolean15 = arrayListTestDriver11.add((java.lang.Object) arrayListTestDriver12);
        java.lang.Object obj18 = arrayListTestDriver11.set(0, (java.lang.Object) (-1.0f));
        boolean boolean19 = arrayListTestDriver8.contains(obj18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = arrayListTestDriver0.set((int) (byte) 1, (java.lang.Object) boolean19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test059");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        boolean boolean10 = arrayListTestDriver0.isEmpty();
        java.lang.Object[] objArray11 = arrayListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass12 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test060");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        boolean boolean10 = arrayListTestDriver0.isEmpty();
        java.lang.Object[] objArray11 = arrayListTestDriver0.toArray();
        java.lang.Object obj12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = arrayListTestDriver0.add(obj12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test061");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.add((java.lang.Object) (-1.0d));
        boolean boolean7 = arrayListTestDriver3.add((java.lang.Object) arrayListTestDriver4);
        java.lang.Object obj10 = arrayListTestDriver3.set(0, (java.lang.Object) (-1.0f));
        boolean boolean11 = arrayListTestDriver0.contains(obj10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = arrayListTestDriver0.set((int) (byte) 1, (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test062");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator10 = arrayListTestDriver9.iterator();
        boolean boolean11 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver9);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator15 = arrayListTestDriver12.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        boolean boolean18 = arrayListTestDriver16.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator19 = arrayListTestDriver16.iterator();
        boolean boolean20 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver16);
        arrayListTestDriver16.clear();
        int int22 = arrayListTestDriver16.size();
        boolean boolean23 = arrayListTestDriver9.add((java.lang.Object) arrayListTestDriver16);
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        boolean boolean26 = arrayListTestDriver24.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator27 = arrayListTestDriver24.iterator();
        experiment.util.Iterator iterator28 = arrayListTestDriver24.iterator();
        boolean boolean29 = arrayListTestDriver16.remove((java.lang.Object) iterator28);
        experiment.util.ArrayListTestDriver arrayListTestDriver31 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator32 = arrayListTestDriver31.iterator();
        int int33 = arrayListTestDriver31.size();
        int int34 = arrayListTestDriver31.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver35 = new experiment.util.ArrayListTestDriver();
        boolean boolean37 = arrayListTestDriver35.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator38 = arrayListTestDriver35.iterator();
        experiment.util.Iterator iterator39 = arrayListTestDriver35.iterator();
        boolean boolean40 = arrayListTestDriver31.add((java.lang.Object) arrayListTestDriver35);
        boolean boolean41 = arrayListTestDriver31.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj42 = arrayListTestDriver16.set(0, (java.lang.Object) boolean41);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test063");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        int int5 = arrayListTestDriver0.size();
        int int6 = arrayListTestDriver0.size();
        int int7 = arrayListTestDriver0.size();
        java.lang.Object obj9 = arrayListTestDriver0.remove((int) (byte) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator11 = arrayListTestDriver10.iterator();
        int int12 = arrayListTestDriver10.size();
        int int13 = arrayListTestDriver10.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator17 = arrayListTestDriver14.iterator();
        experiment.util.Iterator iterator18 = arrayListTestDriver14.iterator();
        boolean boolean19 = arrayListTestDriver10.add((java.lang.Object) arrayListTestDriver14);
        boolean boolean21 = arrayListTestDriver14.add((java.lang.Object) 100);
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        boolean boolean24 = arrayListTestDriver22.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator25 = arrayListTestDriver22.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        boolean boolean28 = arrayListTestDriver26.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator29 = arrayListTestDriver26.iterator();
        boolean boolean30 = arrayListTestDriver22.add((java.lang.Object) arrayListTestDriver26);
        arrayListTestDriver26.clear();
        boolean boolean32 = arrayListTestDriver14.add((java.lang.Object) arrayListTestDriver26);
        boolean boolean33 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver14);
        experiment.util.Iterator iterator34 = arrayListTestDriver14.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(iterator34);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test064");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.add((java.lang.Object) (-1.0d));
        boolean boolean8 = arrayListTestDriver4.add((java.lang.Object) arrayListTestDriver5);
        int int9 = arrayListTestDriver4.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean13 = arrayListTestDriver11.add((java.lang.Object) (-1.0d));
        boolean boolean14 = arrayListTestDriver10.add((java.lang.Object) arrayListTestDriver11);
        int int15 = arrayListTestDriver11.size();
        boolean boolean16 = arrayListTestDriver4.add((java.lang.Object) int15);
        boolean boolean17 = arrayListTestDriver0.contains((java.lang.Object) boolean16);
        java.lang.Object obj18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = arrayListTestDriver0.contains(obj18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test065");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        int int3 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator8 = arrayListTestDriver4.iterator();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        boolean boolean10 = arrayListTestDriver0.isEmpty();
        int int11 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver13.add((java.lang.Object) (-1.0d));
        boolean boolean16 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver13);
        boolean boolean17 = arrayListTestDriver12.isEmpty();
        boolean boolean18 = arrayListTestDriver0.remove((java.lang.Object) boolean17);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator20 = arrayListTestDriver0.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test066");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) '#');
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray8 = arrayListTestDriver0.toArray();
        experiment.util.ListIterator listIterator10 = arrayListTestDriver0.listIterator(0);
        java.lang.Object[] objArray11 = arrayListTestDriver0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayListTestDriver0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(listIterator10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test067");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) '#');
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray8 = arrayListTestDriver0.toArray();
        int int9 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator11 = arrayListTestDriver0.listIterator(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test068");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        arrayListTestDriver0.clear();
        int int3 = arrayListTestDriver0.size();
        java.lang.Class<?> wildcardClass4 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test069");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        boolean boolean10 = arrayListTestDriver0.isEmpty();
        int int11 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayListTestDriver0.get((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test070");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        int int3 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator8 = arrayListTestDriver4.iterator();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator10 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator11 = arrayListTestDriver4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj14 = arrayListTestDriver4.set((int) (short) 1, (java.lang.Object) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test071");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        int int11 = arrayListTestDriver10.size();
        arrayListTestDriver10.clear();
        boolean boolean13 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver10);
        java.lang.Class<?> wildcardClass14 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test072");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        int int3 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator8 = arrayListTestDriver4.iterator();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean13 = arrayListTestDriver11.add((java.lang.Object) (-1.0d));
        boolean boolean14 = arrayListTestDriver10.add((java.lang.Object) arrayListTestDriver11);
        int int15 = arrayListTestDriver10.size();
        boolean boolean16 = arrayListTestDriver4.add((java.lang.Object) arrayListTestDriver10);
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        boolean boolean20 = arrayListTestDriver18.add((java.lang.Object) (-1.0d));
        boolean boolean21 = arrayListTestDriver17.add((java.lang.Object) arrayListTestDriver18);
        experiment.util.Iterator iterator22 = arrayListTestDriver18.iterator();
        boolean boolean23 = arrayListTestDriver18.isEmpty();
        boolean boolean24 = arrayListTestDriver4.equals_CUT((java.lang.Object) arrayListTestDriver18);
        boolean boolean26 = arrayListTestDriver4.remove((java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj28 = arrayListTestDriver4.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test073");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.add((java.lang.Object) (-1.0d));
        boolean boolean7 = arrayListTestDriver3.add((java.lang.Object) arrayListTestDriver4);
        boolean boolean8 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver4);
        boolean boolean9 = arrayListTestDriver0.isEmpty();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test074");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        experiment.util.ListIterator listIterator4 = arrayListTestDriver0.listIterator((int) (byte) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(listIterator4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test075");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        java.lang.Object obj10 = arrayListTestDriver0.get(0);
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test076");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object[] objArray8 = arrayListTestDriver5.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.add((java.lang.Object) (-1.0d));
        boolean boolean13 = arrayListTestDriver9.add((java.lang.Object) arrayListTestDriver10);
        boolean boolean15 = arrayListTestDriver9.add((java.lang.Object) 'a');
        boolean boolean16 = arrayListTestDriver9.isEmpty();
        boolean boolean17 = arrayListTestDriver5.contains((java.lang.Object) arrayListTestDriver9);
        boolean boolean18 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver5);
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        boolean boolean22 = arrayListTestDriver20.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator23 = arrayListTestDriver20.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        boolean boolean26 = arrayListTestDriver24.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator27 = arrayListTestDriver24.iterator();
        boolean boolean28 = arrayListTestDriver20.add((java.lang.Object) arrayListTestDriver24);
        arrayListTestDriver20.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        int int31 = arrayListTestDriver30.size();
        arrayListTestDriver30.clear();
        boolean boolean33 = arrayListTestDriver20.remove((java.lang.Object) arrayListTestDriver30);
        int int34 = arrayListTestDriver20.size();
        experiment.util.Iterator iterator35 = arrayListTestDriver20.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = arrayListTestDriver5.set(0, (java.lang.Object) arrayListTestDriver20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(iterator35);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test077");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayListTestDriver0.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test078");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        int int3 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator8 = arrayListTestDriver4.iterator();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator10 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator11 = arrayListTestDriver4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = arrayListTestDriver4.remove(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test079");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        boolean boolean8 = arrayListTestDriver6.add((java.lang.Object) (-1.0d));
        boolean boolean9 = arrayListTestDriver5.add((java.lang.Object) arrayListTestDriver6);
        int int10 = arrayListTestDriver5.size();
        arrayListTestDriver5.clear();
        boolean boolean12 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver5);
        experiment.util.ListIterator listIterator14 = arrayListTestDriver0.listIterator((int) (byte) 0);
        experiment.util.Iterator iterator15 = arrayListTestDriver0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(listIterator14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test080");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        int int5 = arrayListTestDriver0.size();
        int int6 = arrayListTestDriver0.size();
        int int7 = arrayListTestDriver0.size();
        java.lang.Object obj9 = arrayListTestDriver0.remove((int) (byte) 0);
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator11 = arrayListTestDriver10.iterator();
        int int12 = arrayListTestDriver10.size();
        int int13 = arrayListTestDriver10.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator17 = arrayListTestDriver14.iterator();
        experiment.util.Iterator iterator18 = arrayListTestDriver14.iterator();
        boolean boolean19 = arrayListTestDriver10.add((java.lang.Object) arrayListTestDriver14);
        boolean boolean21 = arrayListTestDriver14.add((java.lang.Object) 100);
        experiment.util.ArrayListTestDriver arrayListTestDriver22 = new experiment.util.ArrayListTestDriver();
        boolean boolean24 = arrayListTestDriver22.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator25 = arrayListTestDriver22.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        boolean boolean28 = arrayListTestDriver26.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator29 = arrayListTestDriver26.iterator();
        boolean boolean30 = arrayListTestDriver22.add((java.lang.Object) arrayListTestDriver26);
        arrayListTestDriver26.clear();
        boolean boolean32 = arrayListTestDriver14.add((java.lang.Object) arrayListTestDriver26);
        boolean boolean33 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver14);
        java.lang.Class<?> wildcardClass34 = arrayListTestDriver14.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test081");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator12 = arrayListTestDriver9.iterator();
        experiment.util.Iterator iterator13 = arrayListTestDriver9.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = arrayListTestDriver14.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.add((java.lang.Object) (-1.0d));
        boolean boolean22 = arrayListTestDriver18.add((java.lang.Object) arrayListTestDriver19);
        boolean boolean24 = arrayListTestDriver18.add((java.lang.Object) 'a');
        boolean boolean25 = arrayListTestDriver18.isEmpty();
        boolean boolean26 = arrayListTestDriver14.contains((java.lang.Object) arrayListTestDriver18);
        boolean boolean27 = arrayListTestDriver9.add((java.lang.Object) arrayListTestDriver14);
        boolean boolean28 = arrayListTestDriver4.add((java.lang.Object) arrayListTestDriver14);
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        boolean boolean32 = arrayListTestDriver30.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator33 = arrayListTestDriver30.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        boolean boolean36 = arrayListTestDriver34.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator37 = arrayListTestDriver34.iterator();
        boolean boolean38 = arrayListTestDriver30.add((java.lang.Object) arrayListTestDriver34);
        arrayListTestDriver30.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver40 = new experiment.util.ArrayListTestDriver();
        int int41 = arrayListTestDriver40.size();
        arrayListTestDriver40.clear();
        boolean boolean43 = arrayListTestDriver30.remove((java.lang.Object) arrayListTestDriver40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = arrayListTestDriver14.set((int) (byte) 1, (java.lang.Object) arrayListTestDriver40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test082");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        experiment.util.Iterator iterator5 = arrayListTestDriver1.iterator();
        boolean boolean6 = arrayListTestDriver1.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator10 = arrayListTestDriver7.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean13 = arrayListTestDriver11.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator14 = arrayListTestDriver11.iterator();
        boolean boolean15 = arrayListTestDriver7.add((java.lang.Object) arrayListTestDriver11);
        arrayListTestDriver11.clear();
        boolean boolean17 = arrayListTestDriver1.remove((java.lang.Object) arrayListTestDriver11);
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator20 = arrayListTestDriver19.iterator();
        int int21 = arrayListTestDriver19.size();
        boolean boolean23 = arrayListTestDriver19.contains((java.lang.Object) '#');
        java.lang.Object[] objArray24 = arrayListTestDriver19.toArray();
        boolean boolean26 = arrayListTestDriver19.remove((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray27 = arrayListTestDriver19.toArray();
        experiment.util.ListIterator listIterator29 = arrayListTestDriver19.listIterator(0);
        java.lang.Object[] objArray30 = arrayListTestDriver19.toArray();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = arrayListTestDriver11.set((int) '4', (java.lang.Object) objArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(listIterator29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test083");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.contains((java.lang.Object) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator4 = arrayListTestDriver0.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test084");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver2 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver3 = new experiment.util.ArrayListTestDriver();
        boolean boolean5 = arrayListTestDriver3.add((java.lang.Object) (-1.0d));
        boolean boolean6 = arrayListTestDriver2.add((java.lang.Object) arrayListTestDriver3);
        boolean boolean8 = arrayListTestDriver2.add((java.lang.Object) 'a');
        boolean boolean9 = arrayListTestDriver2.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator13 = arrayListTestDriver10.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator17 = arrayListTestDriver14.iterator();
        boolean boolean18 = arrayListTestDriver10.add((java.lang.Object) arrayListTestDriver14);
        arrayListTestDriver10.clear();
        experiment.util.Iterator iterator20 = arrayListTestDriver10.iterator();
        boolean boolean21 = arrayListTestDriver2.contains((java.lang.Object) iterator20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = arrayListTestDriver0.set((int) ' ', (java.lang.Object) arrayListTestDriver2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test085");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object[] objArray8 = arrayListTestDriver5.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.add((java.lang.Object) (-1.0d));
        boolean boolean13 = arrayListTestDriver9.add((java.lang.Object) arrayListTestDriver10);
        boolean boolean15 = arrayListTestDriver9.add((java.lang.Object) 'a');
        boolean boolean16 = arrayListTestDriver9.isEmpty();
        boolean boolean17 = arrayListTestDriver5.contains((java.lang.Object) arrayListTestDriver9);
        boolean boolean18 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver5);
        int int19 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator21 = arrayListTestDriver20.iterator();
        int int22 = arrayListTestDriver20.size();
        int int23 = arrayListTestDriver20.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        boolean boolean26 = arrayListTestDriver24.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator27 = arrayListTestDriver24.iterator();
        experiment.util.Iterator iterator28 = arrayListTestDriver24.iterator();
        boolean boolean29 = arrayListTestDriver20.add((java.lang.Object) arrayListTestDriver24);
        boolean boolean31 = arrayListTestDriver24.add((java.lang.Object) 100);
        boolean boolean32 = arrayListTestDriver0.contains((java.lang.Object) 100);
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        boolean boolean36 = arrayListTestDriver34.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator37 = arrayListTestDriver34.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver38 = new experiment.util.ArrayListTestDriver();
        boolean boolean40 = arrayListTestDriver38.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator41 = arrayListTestDriver38.iterator();
        boolean boolean42 = arrayListTestDriver34.add((java.lang.Object) arrayListTestDriver38);
        arrayListTestDriver34.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj44 = arrayListTestDriver0.set((int) (short) 10, (java.lang.Object) arrayListTestDriver34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(iterator41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test086");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator12 = arrayListTestDriver9.iterator();
        experiment.util.Iterator iterator13 = arrayListTestDriver9.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = arrayListTestDriver14.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.add((java.lang.Object) (-1.0d));
        boolean boolean22 = arrayListTestDriver18.add((java.lang.Object) arrayListTestDriver19);
        boolean boolean24 = arrayListTestDriver18.add((java.lang.Object) 'a');
        boolean boolean25 = arrayListTestDriver18.isEmpty();
        boolean boolean26 = arrayListTestDriver14.contains((java.lang.Object) arrayListTestDriver18);
        boolean boolean27 = arrayListTestDriver9.add((java.lang.Object) arrayListTestDriver14);
        boolean boolean28 = arrayListTestDriver4.add((java.lang.Object) arrayListTestDriver14);
        java.lang.Class<?> wildcardClass29 = arrayListTestDriver14.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test087");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) '#');
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        java.lang.Object[] objArray6 = arrayListTestDriver0.toArray();
        java.lang.Object obj7 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = arrayListTestDriver0.add(obj7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test088");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) '#');
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) -1);
        java.lang.Object[] objArray8 = arrayListTestDriver0.toArray();
        experiment.util.ListIterator listIterator10 = arrayListTestDriver0.listIterator(0);
        java.lang.Object[] objArray11 = arrayListTestDriver0.toArray();
        experiment.util.Iterator iterator12 = arrayListTestDriver0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(listIterator10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test089");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) '#');
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        experiment.util.Iterator iterator6 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj8 = arrayListTestDriver0.get((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test090");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object[] objArray3 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        int int5 = arrayListTestDriver4.size();
        arrayListTestDriver4.clear();
        java.lang.Class<?> wildcardClass7 = arrayListTestDriver4.getClass();
        boolean boolean8 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test091");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        int int1 = arrayListTestDriver0.size();
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayListTestDriver0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test092");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator12 = arrayListTestDriver9.iterator();
        experiment.util.Iterator iterator13 = arrayListTestDriver9.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver14 = new experiment.util.ArrayListTestDriver();
        boolean boolean16 = arrayListTestDriver14.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object[] objArray17 = arrayListTestDriver14.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver19 = new experiment.util.ArrayListTestDriver();
        boolean boolean21 = arrayListTestDriver19.add((java.lang.Object) (-1.0d));
        boolean boolean22 = arrayListTestDriver18.add((java.lang.Object) arrayListTestDriver19);
        boolean boolean24 = arrayListTestDriver18.add((java.lang.Object) 'a');
        boolean boolean25 = arrayListTestDriver18.isEmpty();
        boolean boolean26 = arrayListTestDriver14.contains((java.lang.Object) arrayListTestDriver18);
        boolean boolean27 = arrayListTestDriver9.add((java.lang.Object) arrayListTestDriver14);
        boolean boolean28 = arrayListTestDriver4.add((java.lang.Object) arrayListTestDriver14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj30 = arrayListTestDriver4.get((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test093");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        int int3 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator8 = arrayListTestDriver4.iterator();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean13 = arrayListTestDriver11.add((java.lang.Object) (-1.0d));
        boolean boolean14 = arrayListTestDriver10.add((java.lang.Object) arrayListTestDriver11);
        int int15 = arrayListTestDriver10.size();
        boolean boolean16 = arrayListTestDriver4.add((java.lang.Object) arrayListTestDriver10);
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver18 = new experiment.util.ArrayListTestDriver();
        boolean boolean20 = arrayListTestDriver18.add((java.lang.Object) (-1.0d));
        boolean boolean21 = arrayListTestDriver17.add((java.lang.Object) arrayListTestDriver18);
        experiment.util.Iterator iterator22 = arrayListTestDriver18.iterator();
        boolean boolean23 = arrayListTestDriver18.isEmpty();
        boolean boolean24 = arrayListTestDriver4.equals_CUT((java.lang.Object) arrayListTestDriver18);
        boolean boolean26 = arrayListTestDriver4.remove((java.lang.Object) 0);
        experiment.util.Iterator iterator27 = arrayListTestDriver4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj29 = arrayListTestDriver4.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator27);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test094");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 'a');
        boolean boolean7 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator11 = arrayListTestDriver8.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator15 = arrayListTestDriver12.iterator();
        boolean boolean16 = arrayListTestDriver8.add((java.lang.Object) arrayListTestDriver12);
        arrayListTestDriver8.clear();
        experiment.util.Iterator iterator18 = arrayListTestDriver8.iterator();
        boolean boolean19 = arrayListTestDriver0.contains((java.lang.Object) iterator18);
        java.lang.Object obj21 = arrayListTestDriver0.get((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = arrayListTestDriver0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 'a' + "'", obj21, 'a');
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test095");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator10 = arrayListTestDriver9.iterator();
        boolean boolean11 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver9);
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator14 = arrayListTestDriver13.iterator();
        int int15 = arrayListTestDriver13.size();
        int int16 = arrayListTestDriver13.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver17 = new experiment.util.ArrayListTestDriver();
        boolean boolean19 = arrayListTestDriver17.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator20 = arrayListTestDriver17.iterator();
        experiment.util.Iterator iterator21 = arrayListTestDriver17.iterator();
        boolean boolean22 = arrayListTestDriver13.add((java.lang.Object) arrayListTestDriver17);
        boolean boolean24 = arrayListTestDriver17.add((java.lang.Object) 100);
        experiment.util.ArrayListTestDriver arrayListTestDriver25 = new experiment.util.ArrayListTestDriver();
        boolean boolean27 = arrayListTestDriver25.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator28 = arrayListTestDriver25.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver29 = new experiment.util.ArrayListTestDriver();
        boolean boolean31 = arrayListTestDriver29.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator32 = arrayListTestDriver29.iterator();
        boolean boolean33 = arrayListTestDriver25.add((java.lang.Object) arrayListTestDriver29);
        arrayListTestDriver29.clear();
        boolean boolean35 = arrayListTestDriver17.add((java.lang.Object) arrayListTestDriver29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = arrayListTestDriver9.set(1, (java.lang.Object) arrayListTestDriver17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test096");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        int int5 = arrayListTestDriver0.size();
        int int6 = arrayListTestDriver0.size();
        int int7 = arrayListTestDriver0.size();
        java.lang.Class<?> wildcardClass8 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test097");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.set((int) '4', (java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test098");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator9 = arrayListTestDriver4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = arrayListTestDriver4.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test099");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        int int3 = arrayListTestDriver0.size();
        java.lang.Class<?> wildcardClass4 = arrayListTestDriver0.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test100");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator2 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test101");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        int int11 = arrayListTestDriver10.size();
        arrayListTestDriver10.clear();
        boolean boolean13 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver10);
        int int14 = arrayListTestDriver0.size();
        experiment.util.Iterator iterator15 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator16 = arrayListTestDriver0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test102");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        int int5 = arrayListTestDriver0.size();
        int int6 = arrayListTestDriver0.size();
        int int7 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = arrayListTestDriver0.set((int) (byte) 10, (java.lang.Object) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test103");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        int int3 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator8 = arrayListTestDriver4.iterator();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean13 = arrayListTestDriver11.add((java.lang.Object) (-1.0d));
        boolean boolean14 = arrayListTestDriver10.add((java.lang.Object) arrayListTestDriver11);
        int int15 = arrayListTestDriver10.size();
        boolean boolean16 = arrayListTestDriver4.add((java.lang.Object) arrayListTestDriver10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj18 = arrayListTestDriver4.get(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test104");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator9 = arrayListTestDriver4.iterator();
        java.lang.Object[] objArray10 = arrayListTestDriver4.toArray();
        int int11 = arrayListTestDriver4.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator13 = arrayListTestDriver4.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test105");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        experiment.util.Iterator iterator5 = arrayListTestDriver1.iterator();
        boolean boolean6 = arrayListTestDriver1.isEmpty();
        arrayListTestDriver1.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator9 = arrayListTestDriver1.listIterator((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test106");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        experiment.util.ListIterator listIterator4 = arrayListTestDriver0.listIterator((int) (byte) 0);
        experiment.util.Iterator iterator5 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj7 = arrayListTestDriver0.remove((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(listIterator4);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test107");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        int int3 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator8 = arrayListTestDriver4.iterator();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        boolean boolean11 = arrayListTestDriver4.add((java.lang.Object) 100);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator15 = arrayListTestDriver12.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        boolean boolean18 = arrayListTestDriver16.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator19 = arrayListTestDriver16.iterator();
        boolean boolean20 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver16);
        arrayListTestDriver16.clear();
        boolean boolean22 = arrayListTestDriver4.add((java.lang.Object) arrayListTestDriver16);
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        int int25 = arrayListTestDriver24.size();
        boolean boolean27 = arrayListTestDriver24.contains((java.lang.Object) 1L);
        experiment.util.ArrayListTestDriver arrayListTestDriver28 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator29 = arrayListTestDriver28.iterator();
        int int30 = arrayListTestDriver28.size();
        boolean boolean32 = arrayListTestDriver28.contains((java.lang.Object) '#');
        java.lang.Object[] objArray33 = arrayListTestDriver28.toArray();
        java.lang.Object[] objArray34 = arrayListTestDriver28.toArray();
        boolean boolean35 = arrayListTestDriver24.add((java.lang.Object) arrayListTestDriver28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj36 = arrayListTestDriver16.set((int) (short) -1, (java.lang.Object) boolean35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(iterator29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test108");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator10 = arrayListTestDriver9.iterator();
        boolean boolean11 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver9);
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator15 = arrayListTestDriver12.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver16 = new experiment.util.ArrayListTestDriver();
        boolean boolean18 = arrayListTestDriver16.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator19 = arrayListTestDriver16.iterator();
        boolean boolean20 = arrayListTestDriver12.add((java.lang.Object) arrayListTestDriver16);
        arrayListTestDriver16.clear();
        int int22 = arrayListTestDriver16.size();
        boolean boolean23 = arrayListTestDriver9.add((java.lang.Object) arrayListTestDriver16);
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        boolean boolean26 = arrayListTestDriver24.add((java.lang.Object) (-1.0d));
        experiment.util.Iterator iterator27 = arrayListTestDriver24.iterator();
        experiment.util.Iterator iterator28 = arrayListTestDriver24.iterator();
        boolean boolean29 = arrayListTestDriver16.remove((java.lang.Object) iterator28);
        experiment.util.ArrayListTestDriver arrayListTestDriver30 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator31 = arrayListTestDriver30.iterator();
        int int32 = arrayListTestDriver30.size();
        int int33 = arrayListTestDriver30.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver34 = new experiment.util.ArrayListTestDriver();
        boolean boolean36 = arrayListTestDriver34.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator37 = arrayListTestDriver34.iterator();
        experiment.util.Iterator iterator38 = arrayListTestDriver34.iterator();
        boolean boolean39 = arrayListTestDriver30.add((java.lang.Object) arrayListTestDriver34);
        experiment.util.ArrayListTestDriver arrayListTestDriver40 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver41 = new experiment.util.ArrayListTestDriver();
        boolean boolean43 = arrayListTestDriver41.add((java.lang.Object) (-1.0d));
        boolean boolean44 = arrayListTestDriver40.add((java.lang.Object) arrayListTestDriver41);
        int int45 = arrayListTestDriver40.size();
        boolean boolean46 = arrayListTestDriver34.add((java.lang.Object) arrayListTestDriver40);
        experiment.util.ArrayListTestDriver arrayListTestDriver47 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver48 = new experiment.util.ArrayListTestDriver();
        boolean boolean50 = arrayListTestDriver48.add((java.lang.Object) (-1.0d));
        boolean boolean51 = arrayListTestDriver47.add((java.lang.Object) arrayListTestDriver48);
        experiment.util.Iterator iterator52 = arrayListTestDriver48.iterator();
        boolean boolean53 = arrayListTestDriver48.isEmpty();
        boolean boolean54 = arrayListTestDriver34.equals_CUT((java.lang.Object) arrayListTestDriver48);
        boolean boolean55 = arrayListTestDriver16.contains((java.lang.Object) arrayListTestDriver34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNotNull(iterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(iterator31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(iterator37);
        org.junit.Assert.assertNotNull(iterator38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(iterator52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test109");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object[] objArray8 = arrayListTestDriver5.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.add((java.lang.Object) (-1.0d));
        boolean boolean13 = arrayListTestDriver9.add((java.lang.Object) arrayListTestDriver10);
        boolean boolean15 = arrayListTestDriver9.add((java.lang.Object) 'a');
        boolean boolean16 = arrayListTestDriver9.isEmpty();
        boolean boolean17 = arrayListTestDriver5.contains((java.lang.Object) arrayListTestDriver9);
        boolean boolean18 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver5);
        int int19 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        boolean boolean22 = arrayListTestDriver20.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator23 = arrayListTestDriver20.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        boolean boolean26 = arrayListTestDriver24.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator27 = arrayListTestDriver24.iterator();
        boolean boolean28 = arrayListTestDriver20.add((java.lang.Object) arrayListTestDriver24);
        experiment.util.ArrayListTestDriver arrayListTestDriver29 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator30 = arrayListTestDriver29.iterator();
        boolean boolean31 = arrayListTestDriver20.remove((java.lang.Object) arrayListTestDriver29);
        boolean boolean32 = arrayListTestDriver0.equals_CUT((java.lang.Object) boolean31);
        experiment.util.ArrayListTestDriver arrayListTestDriver33 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator34 = arrayListTestDriver33.iterator();
        int int35 = arrayListTestDriver33.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver36 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver37 = new experiment.util.ArrayListTestDriver();
        boolean boolean39 = arrayListTestDriver37.add((java.lang.Object) (-1.0d));
        boolean boolean40 = arrayListTestDriver36.add((java.lang.Object) arrayListTestDriver37);
        boolean boolean41 = arrayListTestDriver33.remove((java.lang.Object) arrayListTestDriver37);
        arrayListTestDriver37.clear();
        boolean boolean43 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver37);
        java.lang.Class<?> wildcardClass44 = arrayListTestDriver37.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(iterator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test110");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test111");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        experiment.util.Iterator iterator5 = arrayListTestDriver1.iterator();
        boolean boolean6 = arrayListTestDriver1.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver7 = new experiment.util.ArrayListTestDriver();
        boolean boolean9 = arrayListTestDriver7.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator10 = arrayListTestDriver7.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean13 = arrayListTestDriver11.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator14 = arrayListTestDriver11.iterator();
        boolean boolean15 = arrayListTestDriver7.add((java.lang.Object) arrayListTestDriver11);
        arrayListTestDriver11.clear();
        boolean boolean17 = arrayListTestDriver1.remove((java.lang.Object) arrayListTestDriver11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = arrayListTestDriver11.set((int) '#', (java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test112");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) '#');
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        boolean boolean7 = arrayListTestDriver0.remove((java.lang.Object) (byte) -1);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator10 = arrayListTestDriver9.iterator();
        int int11 = arrayListTestDriver9.size();
        boolean boolean13 = arrayListTestDriver9.contains((java.lang.Object) '#');
        java.lang.Object[] objArray14 = arrayListTestDriver9.toArray();
        boolean boolean16 = arrayListTestDriver9.remove((java.lang.Object) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = arrayListTestDriver0.set(100, (java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test113");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator2 = arrayListTestDriver0.iterator();
        arrayListTestDriver0.clear();
        int int4 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator6 = arrayListTestDriver0.listIterator((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test114");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        arrayListTestDriver0.clear();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        int int11 = arrayListTestDriver10.size();
        arrayListTestDriver10.clear();
        boolean boolean13 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver10);
        int int14 = arrayListTestDriver0.size();
        experiment.util.Iterator iterator15 = arrayListTestDriver0.iterator();
        boolean boolean16 = arrayListTestDriver0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test115");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        int int3 = arrayListTestDriver0.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        experiment.util.Iterator iterator8 = arrayListTestDriver4.iterator();
        boolean boolean9 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.Iterator iterator10 = arrayListTestDriver4.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver11 = new experiment.util.ArrayListTestDriver();
        boolean boolean13 = arrayListTestDriver11.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator14 = arrayListTestDriver11.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver15 = new experiment.util.ArrayListTestDriver();
        boolean boolean17 = arrayListTestDriver15.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator18 = arrayListTestDriver15.iterator();
        boolean boolean19 = arrayListTestDriver11.add((java.lang.Object) arrayListTestDriver15);
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        boolean boolean22 = arrayListTestDriver20.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator23 = arrayListTestDriver20.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver24 = new experiment.util.ArrayListTestDriver();
        boolean boolean26 = arrayListTestDriver24.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator27 = arrayListTestDriver24.iterator();
        boolean boolean28 = arrayListTestDriver20.add((java.lang.Object) arrayListTestDriver24);
        boolean boolean29 = arrayListTestDriver11.add((java.lang.Object) boolean28);
        boolean boolean30 = arrayListTestDriver4.equals_CUT((java.lang.Object) arrayListTestDriver11);
        java.lang.Class<?> wildcardClass31 = arrayListTestDriver11.getClass();
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test116");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator10 = arrayListTestDriver9.iterator();
        boolean boolean11 = arrayListTestDriver0.remove((java.lang.Object) arrayListTestDriver9);
        int int12 = arrayListTestDriver0.size();
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = arrayListTestDriver0.equals_CUT(obj13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test117");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 'a');
        boolean boolean7 = arrayListTestDriver0.isEmpty();
        experiment.util.ArrayListTestDriver arrayListTestDriver8 = new experiment.util.ArrayListTestDriver();
        boolean boolean10 = arrayListTestDriver8.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator11 = arrayListTestDriver8.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver12 = new experiment.util.ArrayListTestDriver();
        boolean boolean14 = arrayListTestDriver12.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator15 = arrayListTestDriver12.iterator();
        boolean boolean16 = arrayListTestDriver8.add((java.lang.Object) arrayListTestDriver12);
        arrayListTestDriver8.clear();
        experiment.util.Iterator iterator18 = arrayListTestDriver8.iterator();
        boolean boolean19 = arrayListTestDriver0.contains((java.lang.Object) iterator18);
        java.lang.Object obj21 = arrayListTestDriver0.get((int) (short) 1);
        java.lang.Object[] objArray22 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver23 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator24 = arrayListTestDriver23.iterator();
        experiment.util.Iterator iterator25 = arrayListTestDriver23.iterator();
        java.lang.Class<?> wildcardClass26 = arrayListTestDriver23.getClass();
        boolean boolean27 = arrayListTestDriver0.add((java.lang.Object) wildcardClass26);
        java.lang.Object[] objArray28 = arrayListTestDriver0.toArray();
        java.lang.Class<?> wildcardClass29 = objArray28.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 'a' + "'", obj21, 'a');
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test118");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        java.lang.Object obj3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = arrayListTestDriver0.remove(obj3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test119");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        boolean boolean4 = arrayListTestDriver0.contains((java.lang.Object) '#');
        java.lang.Object[] objArray5 = arrayListTestDriver0.toArray();
        arrayListTestDriver0.clear();
        java.lang.Object[] objArray7 = arrayListTestDriver0.toArray();
        int int8 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator10 = arrayListTestDriver0.listIterator(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[]");
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test120");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        experiment.util.Iterator iterator5 = arrayListTestDriver1.iterator();
        java.lang.Class<?> wildcardClass6 = arrayListTestDriver1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test121");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object[] objArray3 = arrayListTestDriver0.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.add((java.lang.Object) (-1.0d));
        boolean boolean8 = arrayListTestDriver4.add((java.lang.Object) arrayListTestDriver5);
        boolean boolean10 = arrayListTestDriver4.add((java.lang.Object) 'a');
        boolean boolean11 = arrayListTestDriver4.isEmpty();
        boolean boolean12 = arrayListTestDriver0.contains((java.lang.Object) arrayListTestDriver4);
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator14 = arrayListTestDriver4.listIterator((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test122");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        int int2 = arrayListTestDriver0.size();
        int int3 = arrayListTestDriver0.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj5 = arrayListTestDriver0.get((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test123");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver5 = new experiment.util.ArrayListTestDriver();
        boolean boolean7 = arrayListTestDriver5.equals_CUT((java.lang.Object) 0.0f);
        java.lang.Object[] objArray8 = arrayListTestDriver5.toArray();
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver10 = new experiment.util.ArrayListTestDriver();
        boolean boolean12 = arrayListTestDriver10.add((java.lang.Object) (-1.0d));
        boolean boolean13 = arrayListTestDriver9.add((java.lang.Object) arrayListTestDriver10);
        boolean boolean15 = arrayListTestDriver9.add((java.lang.Object) 'a');
        boolean boolean16 = arrayListTestDriver9.isEmpty();
        boolean boolean17 = arrayListTestDriver5.contains((java.lang.Object) arrayListTestDriver9);
        boolean boolean18 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver5);
        experiment.util.Iterator iterator19 = arrayListTestDriver5.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj22 = arrayListTestDriver5.set((int) (short) 1, (java.lang.Object) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test124");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.add((java.lang.Object) (-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj4 = arrayListTestDriver0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test125");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver1 = new experiment.util.ArrayListTestDriver();
        boolean boolean3 = arrayListTestDriver1.add((java.lang.Object) (-1.0d));
        boolean boolean4 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver1);
        boolean boolean6 = arrayListTestDriver0.add((java.lang.Object) 'a');
        boolean boolean7 = arrayListTestDriver0.isEmpty();
        experiment.util.ListIterator listIterator9 = arrayListTestDriver0.listIterator(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(listIterator9);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test126");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        boolean boolean2 = arrayListTestDriver0.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator3 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver4 = new experiment.util.ArrayListTestDriver();
        boolean boolean6 = arrayListTestDriver4.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator7 = arrayListTestDriver4.iterator();
        boolean boolean8 = arrayListTestDriver0.add((java.lang.Object) arrayListTestDriver4);
        experiment.util.ArrayListTestDriver arrayListTestDriver9 = new experiment.util.ArrayListTestDriver();
        boolean boolean11 = arrayListTestDriver9.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator12 = arrayListTestDriver9.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver13 = new experiment.util.ArrayListTestDriver();
        boolean boolean15 = arrayListTestDriver13.equals_CUT((java.lang.Object) 0.0f);
        experiment.util.Iterator iterator16 = arrayListTestDriver13.iterator();
        boolean boolean17 = arrayListTestDriver9.add((java.lang.Object) arrayListTestDriver13);
        int int18 = arrayListTestDriver13.size();
        int int19 = arrayListTestDriver13.size();
        experiment.util.ArrayListTestDriver arrayListTestDriver20 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator21 = arrayListTestDriver20.iterator();
        int int22 = arrayListTestDriver20.size();
        boolean boolean24 = arrayListTestDriver20.contains((java.lang.Object) '#');
        experiment.util.ArrayListTestDriver arrayListTestDriver25 = new experiment.util.ArrayListTestDriver();
        experiment.util.ArrayListTestDriver arrayListTestDriver26 = new experiment.util.ArrayListTestDriver();
        boolean boolean28 = arrayListTestDriver26.add((java.lang.Object) (-1.0d));
        boolean boolean29 = arrayListTestDriver25.add((java.lang.Object) arrayListTestDriver26);
        int int30 = arrayListTestDriver25.size();
        arrayListTestDriver25.clear();
        boolean boolean32 = arrayListTestDriver20.remove((java.lang.Object) arrayListTestDriver25);
        experiment.util.ListIterator listIterator34 = arrayListTestDriver20.listIterator((int) (byte) 0);
        boolean boolean35 = arrayListTestDriver13.add((java.lang.Object) listIterator34);
        boolean boolean36 = arrayListTestDriver0.equals_CUT((java.lang.Object) arrayListTestDriver13);
        java.lang.Object obj37 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = arrayListTestDriver13.remove(obj37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(listIterator34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test127");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator2 = arrayListTestDriver0.iterator();
        arrayListTestDriver0.clear();
        experiment.util.Iterator iterator4 = arrayListTestDriver0.iterator();
        experiment.util.ArrayListTestDriver arrayListTestDriver6 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator7 = arrayListTestDriver6.iterator();
        int int8 = arrayListTestDriver6.size();
        boolean boolean10 = arrayListTestDriver6.contains((java.lang.Object) '#');
        java.lang.Object[] objArray11 = arrayListTestDriver6.toArray();
        arrayListTestDriver6.clear();
        boolean boolean14 = arrayListTestDriver6.add((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass15 = arrayListTestDriver6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = arrayListTestDriver0.set((int) (byte) 10, (java.lang.Object) arrayListTestDriver6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10; size 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_ArrayListTest_379375655_1024_0.test128");
        experiment.util.ArrayListTestDriver arrayListTestDriver0 = new experiment.util.ArrayListTestDriver();
        experiment.util.Iterator iterator1 = arrayListTestDriver0.iterator();
        experiment.util.Iterator iterator2 = arrayListTestDriver0.iterator();
        arrayListTestDriver0.clear();
        // The following exception was thrown during execution in test generation
        try {
            experiment.util.ListIterator listIterator5 = arrayListTestDriver0.listIterator((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: null");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator1);
        org.junit.Assert.assertNotNull(iterator2);
    }

}
