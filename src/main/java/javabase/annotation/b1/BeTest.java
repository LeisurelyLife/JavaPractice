package javabase.annotation.b1;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/03/04 9:26
 * Editored:
 */
public class BeTest {

    @Operation(name = "ruanting", age = 23)
    public void ruanting() {
        System.out.println("ruanting is 23 years old");
    }

    @Operation(name = "saonan", age = 23)
    public void saonan() {
        System.out.println("saonan is 23 years old");
    }

}
