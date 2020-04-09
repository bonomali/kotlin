// TARGET_BACKEND: JVM_IR
// WITH_RUNTIME

// FILE: Id.java
import java.util.List;
import org.jetbrains.annotations.NotNull;

class Id {
    @NotNull
    static <T> List<T> id(List<T> v) {
        return v;
    }
}

// FILE: test.kt

fun <T> problematic(ls: List<T>?): List<T> = ls?.flatMap { Id.id(ls) } ?: emptyList()

fun box() = "OK"