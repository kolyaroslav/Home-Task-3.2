import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args)throws InvocationTargetException, InstantiationException, IllegalAccessException {
        SaverClass serverClass = new SaverClass();
        SaverClass.saveTextToFile(Container.class);
    }
}
