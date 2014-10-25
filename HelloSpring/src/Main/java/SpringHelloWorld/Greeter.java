package Main.java.SpringHelloWorld;

/**
 * Created by garich01 on 10/24/2014.
 */
public class Greeter {

    private String message;


        public void setMessage (String message)
        {
            this.message = message;
        }


    public void getMessage() {
        System.out.println("message: " + message);
    }



}
