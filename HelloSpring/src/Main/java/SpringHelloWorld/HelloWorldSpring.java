package Main.java.SpringHelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by garich01 on 10/9/2014.
 * There are following two important points to note about the main program:

 First step is to create application context where we used framework API ClassPathXmlApplicationContext().
 This API loads beans configuration file and eventually based on the provided API, it takes care of creating and initializing all
 the objects ie. beans mentioned in the configuration file.

 Second step is used to get required bean using getBean() method of the created context. This method uses bean ID to return a
 generic object which finally can be casted to actual object. Once you have object, you can use this object to call
 any class method.
 */
public class HelloWorldSpring {

    public void main()
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");

        Greeter obj=(Greeter)context.getBean("helloWorld");
        obj.getMessage();


       /* Greeter gr= new Greeter();
        System.out.println(gr.sayHello());*/

    }
}
