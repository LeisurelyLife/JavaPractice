package bean;

/**
 * Created by Rt on 2018/8/17.
 */
public class NutritionFactoty {

    private final int a;
    private final int b;

    public static class Builder {
        private final int a;
        private final int b;

        public Builder(int aa, int bb) {
            this.a = aa;
            this.b = bb;
        }

        public NutritionFactoty build() {
            return new NutritionFactoty(this);
        }
    }

    private NutritionFactoty(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
    }

    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }
}

class Main {
    public static void main(String[] args) {
        NutritionFactoty factoty = new NutritionFactoty.Builder(1, 2).build();
        System.out.println(factoty.getA());
    }
}
