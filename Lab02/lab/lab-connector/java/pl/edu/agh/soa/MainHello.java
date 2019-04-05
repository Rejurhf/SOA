package pl.edu.agh.soa;

public class MainHello {
    public static void main(String[] args){
        HelloWorldService service = new HelloWorldService();
        HelloWorld helloWorld = service.getHelloWorldPort();

        System.out.println(helloWorld.hello("test"));
    }
}
