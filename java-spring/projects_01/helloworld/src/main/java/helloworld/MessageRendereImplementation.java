package helloworld;

public class MessageRendereImplementation implements MessageRenderer{
    private MessageProvider messageProvider;

    @Override
    public void render() {
        // TODO Auto-generated method stub
        if (messageProvider == null) {
            throw new RuntimeException(
                "MessageProvider Interface'ini Uygulamış Bir Sınıfın Nesnesini Göndermelisiniz:" +
                MessageRendereImplementation.class.getName()
            );
        }
        System.out.println(messageProvider.getMessage());

    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        // TODO Auto-generated method stub
        this.messageProvider = messageProvider;

    }

    @Override
    public MessageProvider getMessageProvider() {
        // TODO Auto-generated method stub
        return messageProvider;
    }

    
}
