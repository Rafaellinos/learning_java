package org.example;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;
import java.util.Set;

@SupportedAnnotationTypes("TableNameAnnotation")
public class TableNameAnnotationProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        // this is executed on a compilation process
        System.out.println(annotations);
        System.out.println(roundEnv);
        System.out.println("print from processsssssssssssssss");
        return false;
    }
}
