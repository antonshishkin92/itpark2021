package lesson12.cornercase;

import lesson12.exception.MethodException;
import lesson12.exception.ParticularMethodException;
import lesson12.exception.UnnamedException;

public class B extends A{

    @Override
    protected void a()  throws MethodException{
//        try {
//            super.a();
//        }catch (MethodException e){
//            e.printStackTrace();
//        }

        super.a();
    }

    void b(){

    }
}
