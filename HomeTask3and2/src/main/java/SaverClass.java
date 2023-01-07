import com.sun.jdi.InvocationException;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SaverClass {
    public static void saveTextToFile(Class clases) throws InstantiationException, IllegalAccessException, InvocationTargetException{
        Method[] methods = clases.getDeclaredMethods();
                for (Method method : methods) {
                    var obj = clases.newInstance();
                    method.invoke(obj);
                }
    }
}
