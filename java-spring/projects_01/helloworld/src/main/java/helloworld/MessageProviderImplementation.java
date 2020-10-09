package helloworld;

public class MessageProviderImplementation implements MessageProvider{
    @Override
    public String getMessage() {
        return "Hello Spring World!";
    }
}
