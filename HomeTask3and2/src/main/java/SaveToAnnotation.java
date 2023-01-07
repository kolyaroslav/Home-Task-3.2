import java.lang.annotation.*;


@Inherited
    @Target(value = {ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
    @Retention(value = RetentionPolicy.RUNTIME)
public @interface SaveToAnnotation {
    String fileParam1();

}
