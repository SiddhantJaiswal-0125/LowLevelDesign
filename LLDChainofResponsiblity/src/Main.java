public class Main {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(
                new DebugLogProcessor
                        (new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.INFO, "JUST A INFO");
        logObject.log(LogProcessor.DEBUG, "DEBUGGING NEEDS HERE");
        logObject.log(LogProcessor.ERROR, "ERROR OCCURED");
    }
}