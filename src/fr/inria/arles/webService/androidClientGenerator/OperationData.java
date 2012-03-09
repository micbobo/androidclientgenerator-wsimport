
package fr.inria.arles.webService.androidClientGenerator;

/**
 *
 * @author ajay
 */
public class OperationData {

    String op;
    String operationName;
    String[][] input;
    String outputType;
    String[] exception;
    int numOfInputs,numOfExceptions;

    public OperationData(String op,String operationName, String[][] input, String outputType, String[] exception) {
        this.op = op;
        this.operationName=operationName;
        this.input = input;
        this.outputType = outputType;
        this.exception = exception;
        numOfInputs=input.length;
        numOfExceptions=exception.length;        
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public int getNumOfExceptions() {
        return numOfExceptions;
    }

    public void setNumOfExceptions(int numOfExceptions) {
        this.numOfExceptions = numOfExceptions;
    }
    
    
    public String[] getException() {
        return exception;
    }

    public void setException(String[] exception) {
        this.exception = exception;
    }
    
    public int getNumOfInputs() {
        return numOfInputs;
    }

    public void setNumOfInputs(int numOfInputs) {
        this.numOfInputs = numOfInputs;
    }

    public String[][] getInput() {
        return input;
    }

    public void setInput(String[][] input) {
        this.input = input;
    }
    
    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getOutputType() {
        return outputType;
    }

    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }

    @Override
    public String toString() {
        return this.op + this.outputType;
    }
}
