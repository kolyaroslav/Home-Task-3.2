import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@SaveToAnnotation(fileParam1 = "G:\\Programmin\\Module 3 Home task\\HomeTask3.2.txt")
public class Container {
private final String text = "My Home task 3.2 text to file";

    public String getText() {
        return text;
    }

    @SaveAnnotation
    public void save() throws IOException{
        var fileForWriter = Container.class.getAnnotation(SaveToAnnotation.class).fileParam1();

                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileForWriter))){
                    bufferedWriter.write(text);
                }
    }
@Override
    public String toString() {
        return "Container{" + "text=" + text + '\'' + '}';
    }


}

