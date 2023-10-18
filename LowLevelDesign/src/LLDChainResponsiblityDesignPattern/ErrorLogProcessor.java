package LLDChainResponsiblityDesignPattern;

public class ErrorLogProcessor extends  LogProcessor{
    ErrorLogProcessor(LogProcessor logProcessor)
    {
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == ERROR)
            System.err.println("ERROR: "+message);
       else
        super.log(logLevel, message);
    }
}
