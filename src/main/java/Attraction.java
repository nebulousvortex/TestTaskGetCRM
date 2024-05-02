class Attraction {
    String name;
    double time;
    int importance;

    Attraction(String name, double time, int importance) {
        this.name = name;
        this.time = time;
        this.importance = importance;
    }
    double getValueCoefficient() {
        return (double) importance / time;
    }
}
