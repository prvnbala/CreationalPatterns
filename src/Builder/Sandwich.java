package Builder;

public class Sandwich {
    public static class SandwichBuilder {
        private String bread;
        private String condiments;
        private String dressing;
        private String filling;

        public Sandwich build() {
            return new Sandwich(this);
        }

        public SandwichBuilder setBread(String bread) {
            this.bread = bread;
            return this;
        }
        public SandwichBuilder setCondiments(String condiments) {
            this.condiments = condiments;
            return this;
        }
        public SandwichBuilder setDressing(String dressing) {
            this.dressing = dressing;
            return this;
        }
        public SandwichBuilder setFilling(String filling) {
            this.filling = filling;
            return this;
        }
    }

    private Sandwich(SandwichBuilder sandwichBuilder) {
        this.bread = sandwichBuilder.bread;
        this.condiments = sandwichBuilder.condiments;
        this.dressing = sandwichBuilder.dressing;
        this.filling = sandwichBuilder.filling;
    }

    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String filling;

    public String getBread() {
        return bread;
    }
    public String getCondiments() {
        return condiments;
    }
    public String getDressing() {
        return dressing;
    }
    public String getFilling() {
        return filling;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", condiments='" + condiments + '\'' +
                ", dressing='" + dressing + '\'' +
                ", filling='" + filling + '\'' +
                '}';
    }
}
