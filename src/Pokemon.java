public class Pokemon {
    private String name, type1, type2;
    private int gen, statTotal;

    public Pokemon(String name, int gen, String type1, String type2, int statTotal) {
        this.name = name;
        this.gen = gen;
        this.type1 = type1;
        this.type2 = type2;
        this.statTotal = statTotal;
    }

    public String getName() {
        return name;
    }
    public int getGen() {
        return gen;
    }
    public String getType1() {
        return type1;
    }
    public String getType2() {
        return type2;
    }
    public int getStatTotal() {
        return statTotal;
    }
}

