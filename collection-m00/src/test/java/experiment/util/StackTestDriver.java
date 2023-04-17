package experiment.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.github.ngoanh2n.asserts.csv.CsvComparator;
import com.github.ngoanh2n.asserts.csv.CsvComparisonOptions;
import com.github.ngoanh2n.asserts.csv.CsvComparisonResult;
import com.github.ngoanh2n.asserts.csv.CsvComparisonSource;


/**
 * Generated class that is intended to be used as test driver for class {@link Stack}.
 * Note: no concurrent test execution allowed (see creation of internal state writer)
 * 
 * @author generated code
 *
 */
public class StackTestDriver {
 
	protected static final Logger logger = Logger.getLogger(ArrayListTestDriver.class.getName());

	private static final boolean ENABLE_INTERNAL_STATE_CHECK = Boolean.getBoolean("enableInternalStateCheck");
	private static final String STATE_FILE_LOCATION = System.getProperty("stateFileLocation", "./build/internalState");

	// activeTestId and internalStateWriteCounter are used to identify logged state
	// data entries
	// human readable test identifier which is currently running (<fully qualified
	// test class>#<test method name>)
	private static String activeTestId;
	// counts number of internal state writes per test (activeTestId)
	private static int internalStateWriteCounter;

	// Note: we assume no parallel test execution!
	private static Writer writer;
    
    //class under test
    private experiment.util.Stack classUnderTest;
    //unique instanceId - set externally (timestamp and uuid)
    private String instanceId;
    //unique test execution id - set externally (timestamp and uuid)
    private String testId;
    
    
 
    public StackTestDriver() {
    	init();

        this.classUnderTest = new experiment.util.Stack();
        writeInternalState("CTOR", new String[]{});
    } 
    
    private void init() {
         //use stack trace to use calling test method as test identifier (used to name
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement = stackTraceElements[3];

        String currentTestId = stackTraceElement.getClassName()+"#"+stackTraceElement.getMethodName();
        if(!currentTestId.equals(activeTestId)) {
        	//other tests starts
        	activeTestId = currentTestId;
        	internalStateWriteCounter = 0; 
        	startInternalStateRecording(activeTestId);
        }

        this.instanceId = String.valueOf(java.time.Instant.now().toEpochMilli()+":"+java.util.UUID.randomUUID().toString());
        this.testId = System.getProperty("testId", "unknown");
    }


    public void clear() {
	    try {
          getClassUnderTest().clear();

		} finally {
			writeInternalState("clear", new String[]{getStringRepresentation()});
		}
    }

    public boolean isEmpty() {
	    try {
          return getClassUnderTest().isEmpty();

		} finally {
			writeInternalState("isEmpty", new String[]{getStringRepresentation()});
		}
    }

    public int size() {
	    try {
          return getClassUnderTest().size();

		} finally {
			writeInternalState("size", new String[]{getStringRepresentation()});
		}
    }

    public java.lang.Object peek() {
	    try {
          return getClassUnderTest().peek();

		} finally {
			writeInternalState("peek", new String[]{getStringRepresentation()});
		}
    }

    public java.lang.Object push(java.lang.Object arg0) {
	    try {
          return getClassUnderTest().push(arg0);

		} finally {
			writeInternalState("push", new String[]{getStringRepresentation(arg0.toString())});
		}
    }

    public java.lang.Object pop() {
	    try {
          return getClassUnderTest().pop();

		} finally {
			writeInternalState("pop", new String[]{getStringRepresentation()});
		}
    }

    protected experiment.util.Stack getClassUnderTest() {
        return this.classUnderTest;
    }

    private String getStringRepresentation(String... strings) {
    	StringBuffer buffer = new StringBuffer();
    	for (String string : strings) {
    		//note: csv file entry must not contain comma -> add space
			buffer.append(getSingleStringRepresentation(string)+" ");
		}
    	return buffer.toString();
    }
    
    private String getSingleStringRepresentation(Object object) {
    	//note: csv file entry must not contain comma -> replaced by underscore
	    String objectString = object.toString().replace(",", "_");
	    int index = objectString.indexOf("@");
	 
	    if(index < 0) {
	        return objectString;
	    }
	
	    return objectString.substring(0, index);
    }
 
    public static boolean matchInternalStateSnapshot() {
		if (!ENABLE_INTERNAL_STATE_CHECK)
			return true;
		if (activeTestId == null)
			return true;

		String currentFileName = activeTestId + ".csv";
		// create/overwrite file
		try {
			// new test (uses its own writer)
			File parent = new File(STATE_FILE_LOCATION);
			parent.mkdirs();
			FileWriter fileWriter = new FileWriter(new File(parent, currentFileName));
			fileWriter.write(writer.toString());
			fileWriter.close();
		} catch (IOException e) {
			// MUST not happen
			e.printStackTrace();
		}

		String baseFileName = activeTestId + "_base.csv";

 
        if(!Files.exists(Paths.get(STATE_FILE_LOCATION,baseFileName))) {
            //copy file
            Path source = Paths.get(STATE_FILE_LOCATION,currentFileName);
            Path target = Paths.get(STATE_FILE_LOCATION,baseFileName);
            try {
               Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
               return false;
            }
            return true;
        }
        
		System.out.println("Perform internal state comparison for test '" + activeTestId + "'.");

       	// use internal state methods as column names    
    
       CsvComparisonOptions options = CsvComparisonOptions
        .builder()
        .setColumns("id", "isEmpty","size","peek", "calledMethod","arguments")
        .setIdentityColumn("id")
        .build();
    
 		CsvComparisonSource<File> source = CsvComparisonSource.create(new File(STATE_FILE_LOCATION,baseFileName),
				new File(STATE_FILE_LOCATION,currentFileName));

		CsvComparisonResult result = new CsvComparator(source, options).compare();
		boolean matching = !result.hasDiff();
		
		if (!matching) {
			System.err.println("Internal state comparison failed for '" + activeTestId + "'!");
		}
		
		//setting activeTestId to null enforces recreation of writer (Note: pitest may execute the same test more than once directly one after another)
		activeTestId = null;
		return matching;
    }
 
	// intended to be called once per test
	private void startInternalStateRecording(String testId) {
		writer = new StringWriter();

    	//write header line    
    	write("id,testId,instanceId,isEmpty,size,peek,calledMethod,arguments"+"\n");
	}
	
   	private void writeInternalState(String methodName, String[] parametersAsString) {
		write(getInternalState(methodName, parametersAsString));
	}
	
    private String getInternalState(String methodName, String[] parametersAsString) {
        internalStateWriteCounter++;
        String id = activeTestId+"#"+internalStateWriteCounter;
   		List<String> state = new ArrayList<>();
   		//todo add test identifier
   		state.add(id);
   		state.add(testId);
   		state.add(instanceId);
    	try {
	   		state.add(getStringRepresentation(java.lang.Boolean.toString(getClassUnderTest().isEmpty())));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(getStringRepresentation(java.lang.Integer.toString(getClassUnderTest().size())));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
    	try {
	   		state.add(getStringRepresentation(getClassUnderTest().peek().toString()));
        } catch (Exception e) {
        	//e.printStackTrace();
        	state.add("EXC");
        }
		state.add(methodName);
		state.add(String.join("_",parametersAsString));
        return String.join(",", state) + "\n";
     }
     
     private void write(String content) {
		try {
			writer.write(content);
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    
}

